export interface Usuario {
  usuario: string;
  contrasena: string;
}

export interface UsuarioRespuesta {
  status: string;
  response: string;
}
export interface Producto{
  id_producto:string;
  nombre:string;
  descripcion:string;
  cantidad: number;
  precio_unitario: number;
  precio_oferta:number;
  url_imagen:string;
}
export interface RespuestaProducto{
  lista: Producto[];
}
