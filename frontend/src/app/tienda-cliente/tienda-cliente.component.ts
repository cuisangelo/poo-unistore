import { Component, OnInit } from '@angular/core';
import {Producto} from "../../interfaces";
import {ApiService} from "../../ApiService";
import {CartService} from "../carrito/cart.service";

@Component({
  selector: 'app-tienda-cliente',
  templateUrl: './tienda-cliente.component.html',
  styleUrls: ['./tienda-cliente.component.scss']
})
export class TiendaClienteComponent implements OnInit {

  producto?: Producto=undefined;
  lista:Producto[] = []
  indice: number = -1;
  constructor(private api: ApiService, public cart: CartService) { }
  ngOnInit(): void {
    this.api.obtenerProducto().subscribe(data =>{
      this.lista = data.lista;
    })
  }

  obtenerProducto(): void {
    this.producto = this.lista[this.indice];
  }
}
