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
    id_cliente: new FormControl('', Validators.required),
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
      let dataResponse: UsuarioRespuesta = data;
      if(dataResponse.status == "ok") {
        localStorage.setItem("token", dataResponse.response.token)
        this.router.navigate(['tienda']);
      }
      else {
        this.errorStatus = true;
        this.errorMsg = dataResponse.response.errorMsg;
      }
    })
  }

}
