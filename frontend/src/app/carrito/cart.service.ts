import { Injectable } from "@angular/core";
import { Producto } from "../../interfaces";

export interface CartItem {
  producto: Producto;
  cantidad: number;
}

// Client-side demo cart (the 2022 backend never implemented one).
// Persists in localStorage so it survives reloads.
@Injectable({ providedIn: "root" })
export class CartService {
  items: CartItem[] = JSON.parse(localStorage.getItem("unistore-carrito") || "[]");

  get count(): number {
    return this.items.reduce((sum, item) => sum + item.cantidad, 0);
  }

  get total(): number {
    return this.items.reduce(
      (sum, item) => sum + item.cantidad * item.producto.precio_oferta,
      0
    );
  }

  add(producto: Producto): void {
    const existing = this.items.find(
      (item) => item.producto.id_producto === producto.id_producto
    );
    if (existing) {
      existing.cantidad++;
    } else {
      this.items.push({ producto, cantidad: 1 });
    }
    this.save();
  }

  remove(idProducto: string): void {
    this.items = this.items.filter(
      (item) => item.producto.id_producto !== idProducto
    );
    this.save();
  }

  clear(): void {
    this.items = [];
    this.save();
  }

  private save(): void {
    localStorage.setItem("unistore-carrito", JSON.stringify(this.items));
  }
}
