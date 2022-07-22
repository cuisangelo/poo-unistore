import { Component, OnInit } from '@angular/core';
import {Producto} from "../../interfaces";
import {ApiService} from "../../ApiService";

@Component({
  selector: 'app-tienda',
  templateUrl: './tienda.component.html',
  styleUrls: ['./tienda.component.scss']
})
export class TiendaComponent implements OnInit {
  ngOnInit(): void {
    this.api.obtenerProducto().subscribe(data =>{
      this.lista = data.lista;
    })
  }

  producto?: Producto=undefined;
  lista:Producto[] = []
  indice: number = -1;
  constructor(private api: ApiService ) { }

  obtenerProducto(): void {
    this.producto = this.lista[this.indice];
  }
}
