import { Cliente, Producto } from "../../interfaces";

// Static dataset for demo mode. Shapes mirror the 2022 Spring Boot API
// responses so the legacy components render unchanged.

export const PRODUCTOS: Producto[] = [
  {
    id_producto: "P0001",
    nombre: "Laptop Lenovo IdeaPad 3",
    descripcion: "Ryzen 5, 8 GB RAM, 512 GB SSD — ideal para clases",
    cantidad: 12,
    precio_unitario: 2499,
    precio_oferta: 2199,
    url_imagen: "assets/imagenes/pic1.jpg",
  },
  {
    id_producto: "P0002",
    nombre: "Audífonos Sony WH-CH520",
    descripcion: "Bluetooth, 50 horas de batería",
    cantidad: 30,
    precio_unitario: 199,
    precio_oferta: 149,
    url_imagen: "assets/imagenes/pic2.jpg",
  },
  {
    id_producto: "P0003",
    nombre: "Mochila UNI Store",
    descripcion: "Impermeable, compartimento para laptop de 15.6''",
    cantidad: 45,
    precio_unitario: 89,
    precio_oferta: 69,
    url_imagen: "assets/imagenes/pic3.jpg",
  },
  {
    id_producto: "P0004",
    nombre: "Mouse Logitech M190",
    descripcion: "Inalámbrico, tamaño completo",
    cantidad: 60,
    precio_unitario: 49,
    precio_oferta: 39,
    url_imagen: "assets/imagenes/pic4.jpg",
  },
  {
    id_producto: "P0005",
    nombre: "Teclado mecánico Redragon Kumara",
    descripcion: "Switches red, retroiluminado RGB",
    cantidad: 25,
    precio_unitario: 159,
    precio_oferta: 129,
    url_imagen: "assets/imagenes/pic5.jpg",
  },
  {
    id_producto: "P0006",
    nombre: "Monitor LG 24'' IPS",
    descripcion: "Full HD, 75 Hz, FreeSync",
    cantidad: 18,
    precio_unitario: 549,
    precio_oferta: 499,
    url_imagen: "assets/imagenes/pic6.jpg",
  },
  {
    id_producto: "P0007",
    nombre: "Calculadora Casio fx-991LA X",
    descripcion: "Científica, 553 funciones — la clásica de ingeniería",
    cantidad: 80,
    precio_unitario: 99,
    precio_oferta: 85,
    url_imagen: "assets/imagenes/pic7.jpg",
  },
  {
    id_producto: "P0008",
    nombre: "Cuaderno cuadriculado A4 x5",
    descripcion: "Pack de 5 cuadernos de 100 hojas",
    cantidad: 100,
    precio_unitario: 35,
    precio_oferta: 28,
    url_imagen: "assets/imagenes/pic8.jpg",
  },
];

export const CLIENTES: Cliente[] = [
  {
    id_cliente: "C0001",
    nombres: "Luis Angelo",
    apellidos: "Rodríguez Pérez",
    direccion: "Av. Túpac Amaru 210, Rímac",
    telefono: "987654321",
    correo: "demo@unistore.pe",
    contrasena: "********",
  },
];

export const LOGIN_OK = {
  status: "ok",
  response: { token: "demo-token-2022" },
};
