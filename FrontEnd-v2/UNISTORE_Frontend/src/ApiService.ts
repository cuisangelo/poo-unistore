import {Injectable} from "@angular/core";
import {HttpClient, HttpHeaders} from "@angular/common/http";

import {catchError, Observable, retry, throwError} from "rxjs";
import {Cliente, RespuestaCliente, RespuestaProducto, UsuarioRegister, UsuarioRespuesta} from "./interfaces";

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  httpOptions = {headers: new HttpHeaders({'Content-Type': 'application/json;charset=utf-8'})};

  errorHandl(error: any) {
    let errorMessage = '';
    if (error.error instanceof ErrorEvent) {
      errorMessage = error.error.message;
    } else {
      errorMessage = `Error Code: ${error.status}\nMessage: ${error.message}`;
    }
    console.log(errorMessage);
    return throwError(errorMessage);
  }

  constructor(private http: HttpClient) {
  }

  obtenerProducto(): Observable<RespuestaProducto> {
    return this.http.post<RespuestaProducto>('http://localhost:8080/obtener-productos', null, this.httpOptions)
      .pipe(
        retry(1),
        catchError(this.errorHandl)
      );
  }

  ObtenerClientePerfil(): Observable<RespuestaCliente> {
    return this.http.post<RespuestaCliente>('http://localhost:8080/obtener-cliente-perfil', null, this.httpOptions)
      .pipe(
        retry(1),
        catchError(this.errorHandl)
      );
  }

  agregarCliente(data: Cliente): Observable<Cliente> {
    return this.http.post<Cliente>('http://localhost:8080/agregar-cliente', data, this.httpOptions)
      .pipe(
        retry(1),
        catchError(this.errorHandl)
      );
  }

  registerByEmail(form: UsuarioRegister): Observable<UsuarioRespuesta> {
    return this.http.post<UsuarioRespuesta>('http://localhost:8080/registerByEmail', form, this.httpOptions)
      .pipe(
        retry(1),
        catchError(this.errorHandl)
      );
  }

  loginByEmail(form: UsuarioRegister): Observable<string> {
    return this.http.post<string>('http://localhost:8080/loginByEmail', form, this.httpOptions)
      .pipe(
        retry(1),
        catchError(this.errorHandl)
      );
  }

  getUserData(form: UsuarioRegister): Observable<UsuarioRespuesta> {
    return this.http.post<UsuarioRespuesta>('http://localhost:8080/registerByEmail', form, this.httpOptions)
      .pipe(
        retry(1),
        catchError(this.errorHandl)
      );
  }

}
