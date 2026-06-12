import { Component, OnInit } from '@angular/core';
import {Cliente, Producto} from "../../interfaces";
import {ApiService} from "../../ApiService";
import {ActivatedRoute} from "@angular/router";

@Component({
  selector: 'app-perfil',
  templateUrl: './perfil.component.html',
  styleUrls: ['./perfil.component.scss']
})
export class PerfilComponent implements OnInit {

  cliente?: Cliente = undefined;
  listaCliente: Cliente[] = []
  indice: number = -1;

  constructor(private api: ApiService, private activatedRoute: ActivatedRoute) {
  }

  ngOnInit(): void {
    this.indice = Number(this.activatedRoute.snapshot.paramMap.get('id'));
    console.log(this.indice);

    this.api.ObtenerClientePerfil().subscribe(data => {
      this.listaCliente = data.listaCliente;
      this.cliente = this.listaCliente[this.indice];
    })
  }

  ObtenerClientePerfil(): void {
    this.cliente = this.listaCliente[this.indice];
  }
}
