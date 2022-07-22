import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {ApiService} from "../../ApiService";
import {Usuario, UsuarioRespuesta} from "../../interfaces";
import {Router} from "@angular/router";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {

  loginForm = new FormGroup({
    usuario: new FormControl('', Validators.required),
    password: new FormControl('', Validators.required)
  })

  constructor(private api: ApiService, private router: Router) { }

  errorStatus: boolean = false;
  errorMsg: any = "";

  ngOnInit(): void {
  }

  onLogin(form: Usuario) {
    this.api.loginByEmail(form).subscribe(data =>{
      let dataResponse: UsuarioRespuesta = data;
      if(dataResponse.status == "ok") {
        localStorage.setItem("token", dataResponse.response.token);
        this.router.navigate(['tienda']);
      }
      else {
        this.errorStatus = true;
        this.errorMsg = dataResponse.response.errorMsg;
      }
    })
  }

}
