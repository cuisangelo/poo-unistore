import { Component, OnInit } from '@angular/core';
import {Producto} from "../../interfaces";
import {ActivatedRoute} from "@angular/router";
import {ApiService} from "../../ApiService";
import {CartService} from "../carrito/cart.service";

@Component({
  selector: 'app-detalle',
  templateUrl: './detalle.component.html',
  styleUrls: ['./detalle.component.scss']
})
export class DetalleComponent implements OnInit {

  producto?: Producto=undefined;
  lista:Producto[] = []
  indice: number = -1;

  constructor(private api: ApiService, private activatedRoute: ActivatedRoute, public cart: CartService) { }

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
