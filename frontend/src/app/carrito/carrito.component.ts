import { Component } from "@angular/core";
import { CartService } from "./cart.service";

@Component({
  selector: "app-carrito",
  templateUrl: "./carrito.component.html",
})
export class CarritoComponent {
  constructor(public cart: CartService) {}
}
