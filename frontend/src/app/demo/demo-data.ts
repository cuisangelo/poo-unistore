import { Cliente, Producto } from "../../interfaces";

// Static dataset for demo mode. Shapes mirror the 2022 Spring Boot API
// responses so the legacy components render unchanged.

export const PRODUCTOS: Producto[] = [
  {
    id_producto: "P0001",
    nombre: "Polo letras UNI",
    descripcion: "Polo blanco de algodón con estampado lateral de las letras UNI.",
    cantidad: 12,
    precio_unitario: 25,
    precio_oferta: 20,
    url_imagen: "assets/imagenes/pic1.jpg",
  },
  {
    id_producto: "P0002",
    nombre: "Polo UNI 1876",
    descripcion: "Polo granate con estampado conmemorativo UNI 1876 al pecho.",
    cantidad: 30,
    precio_unitario: 28,
    precio_oferta: 22,
    url_imagen: "assets/imagenes/pic2.jpg",
  },
  {
    id_producto: "P0003",
    nombre: "Polo bicolor UNI",
    descripcion: "Polo blanco con mangas granate y logo UNI bordado al pecho.",
    cantidad: 45,
    precio_unitario: 30,
    precio_oferta: 25,
    url_imagen: "assets/imagenes/pic3.jpg",
  },
  {
    id_producto: "P0004",
    nombre: "Polo estampado posterior",
    descripcion: "Polo granate con logo bordado al pecho y estampado UNI en la espalda.",
    cantidad: 60,
    precio_unitario: 25,
    precio_oferta: 20,
    url_imagen: "assets/imagenes/pic4.jpg",
  },
  {
    id_producto: "P0005",
    nombre: "Polo piqué tipo camisero",
    descripcion: "Polo piqué 24/1 de cuello camisero, blanco, con escudo UNI bordado.",
    cantidad: 25,
    precio_unitario: 38,
    precio_oferta: 30,
    url_imagen: "assets/imagenes/pic5.jpg",
  },
  {
    id_producto: "P0006",
    nombre: "Polo piqué tipo camisero (dama)",
    descripcion: "Versión entallada para dama en piqué 24/1, con escudo UNI bordado.",
    cantidad: 18,
    precio_unitario: 38,
    precio_oferta: 30,
    url_imagen: "assets/imagenes/pic6.jpg",
  },
  {
    id_producto: "P0007",
    nombre: "Morral porta laptop UNI",
    descripcion: "Morral negro resistente con compartimento porta laptop y escudo UNI bordado.",
    cantidad: 80,
    precio_unitario: 38,
    precio_oferta: 30,
    url_imagen: "assets/imagenes/pic7.jpg",
  },
  {
    id_producto: "P0008",
    nombre: "Mochila de lona porta laptop",
    descripcion: "Mochila de lona negra con porta laptop acolchado y escudo UNI bordado.",
    cantidad: 100,
    precio_unitario: 55,
    precio_oferta: 45,
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
