import {Injectable} from "@angular/core";
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Cliente, RespuestaProducto, Usuario, UsuarioRespuesta} from "./interfaces";
import {catchError, Observable, retry, throwError} from "rxjs";
import {FormControl, ɵFormGroupValue, ɵTypedOrUntyped} from "@angular/forms";

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  httpOptions = {headers: new HttpHeaders({'Content-Type': 'application/json;charset=utf-8'})};

  errorHandl(error:any) {
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
  agregarCliente(data: Cliente): Observable<Cliente> {
    return this.http.post<Cliente>('http://localhost:8080/agregar-cliente', data, this.httpOptions)
      .pipe(
        retry(1),
        catchError(this.errorHandl)
      );
  }

  loginByEmail(data: Usuario): Observable<UsuarioRespuesta> {
    return this.http.post<UsuarioRespuesta>('http://localhost:8080/loginByEmail', data, this.httpOptions)
      .pipe(
        retry(1),
        catchError(this.errorHandl)
      );
  }

  registerByEmail(data: Usuario): Observable<UsuarioRespuesta> {
    return this.http.post<UsuarioRespuesta>('http://localhost:8080/registerByEmail', data, this.httpOptions)
      .pipe(
        retry(1),
        catchError(this.errorHandl)
      );
  }

}
