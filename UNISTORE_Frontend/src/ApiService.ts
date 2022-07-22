import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {Usuario, UsuarioRespuesta} from "./interfaces";
import {Observable} from "rxjs";
import {FormControl, ɵFormGroupValue, ɵTypedOrUntyped} from "@angular/forms";

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  url: string = "http://localhost:8080/login"

  constructor(private http: HttpClient) {
  }

  onLogin(form: ɵTypedOrUntyped<{ password: FormControl<string | null>; usuario: FormControl<string | null> }, ɵFormGroupValue<{ password: FormControl<string | null>; usuario: FormControl<string | null> }>, any>): Observable<UsuarioRespuesta> {
    let direccion = this.url;
    return this.http.post<UsuarioRespuesta>(direccion, form);
  }

}
