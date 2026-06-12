import { Component, OnInit } from '@angular/core';
import { ApiService } from "../../ApiService";
import { UsuarioRespuesta } from "../../interfaces";
import { FormControl, FormGroup, Validators } from "@angular/forms";
import { Router } from "@angular/router";

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.scss']
})
export class RegisterComponent implements OnInit {

  registerForm = new FormGroup({
    nombres: new FormControl('', Validators.required),
    apellidos: new FormControl('', Validators.required),
    direccion: new FormControl('', Validators.required),
    telefono: new FormControl('', Validators.required),
    correo: new FormControl('', Validators.required),
    contrasena: new FormControl('', Validators.required),
  })

  constructor(private api: ApiService, private router: Router) { }

  errorStatus: boolean = false;
  errorMsg: any = "";

  ngOnInit(): void {
  }

  registerByEmail(form: any) {
    this.api.registerByEmail(form).subscribe(data =>{
      let usuarioRespuesta: UsuarioRespuesta = data;
      if(usuarioRespuesta.status == "ok") {
        localStorage.setItem("token", usuarioRespuesta.response.token)
        this.router.navigate(['tienda']);
      }
      else {
        this.errorStatus = true;
        this.errorMsg = usuarioRespuesta.response.errorMsg;
      }
    })
  }

  loginByEmail(form: any) {
    this.api.loginByEmail(form).subscribe(data =>{
      let usuarioRespuesta: UsuarioRespuesta = data;
      if(usuarioRespuesta.status == "ok") {
        localStorage.setItem("token", usuarioRespuesta.response.token)
        this.router.navigate(['perfil']);
      }
      else {
        this.errorStatus = true;
        this.errorMsg = usuarioRespuesta.response.errorMsg;
      }
    })
  }

}
