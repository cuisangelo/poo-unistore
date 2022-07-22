import { Component, OnInit } from '@angular/core';
import {ApiService} from "../../ApiService";
import {Cliente} from "../../interfaces";

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.scss']
})
export class RegisterComponent implements OnInit {

  id_cliente: string="";
  nombres: string ="";
  apellidos: string ="";
  direccion: string ="";
  telefono: string ="";
  correo: string ="";
  contrasena: string ="";

  constructor(private api: ApiService) { }

  ngOnInit(): void {
  }

  registrar() {
    console.log(this.id_cliente);
    console.log(this.nombres);
    console.log(this.apellidos);
    console.log(this.direccion);
    console.log(this.telefono);
    console.log(this.correo);
    console.log(this.contrasena);

    const cliente:Cliente ={
      id_cliente: this.id_cliente,
      nombres: this.nombres,
      apellidos: this.apellidos,
      direccion: this.direccion,
      telefono: this.telefono,
      correo: this.correo,
      contrasena: this.contrasena,
    }

    this.api.agregarCliente(cliente).subscribe(data =>{
      console.log("dentro de api.agregarCliente ====>")
      console.log(data.nombres);
    })
  }
}
