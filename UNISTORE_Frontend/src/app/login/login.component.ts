import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from "@angular/forms";
import { ApiService } from "../../ApiService";
import { Usuario } from "../../interfaces";

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

  constructor(private api: ApiService) {
  }

  ngOnInit(): void {
  }

  onLogin(form: Usuario) {
    this.api.loginByEmail(form).subscribe(data =>{
      console.log(data);
    })
  }

}
