import { Component, OnInit } from '@angular/core';
import {Producto} from "../../interfaces";
import {ApiService} from "../../ApiService";
import {ActivatedRoute} from "@angular/router";

@Component({
  selector: 'app-detalle-detalle',
  templateUrl: './detalle-detalle.component.html',
  styleUrls: ['./detalle-detalle.component.scss']
})
export class DetalleDetalleComponent implements OnInit {

  producto?: Producto=undefined;
  lista:Producto[] = []
  indice: number = -1;

  constructor(private api: ApiService, private activatedRoute: ActivatedRoute) { }

  ngOnInit(): void {
    this.indice = Number(this.activatedRoute.snapshot.paramMap.get('id'));
    console.log(this.indice);

    this.api.obtenerProducto().subscribe(data =>{
      this.lista = data.lista;
      this.producto = this.lista[this.indice];
    })
  }

  obtenerProducto(): void {
    this.producto = this.lista[this.indice];
  }
}

