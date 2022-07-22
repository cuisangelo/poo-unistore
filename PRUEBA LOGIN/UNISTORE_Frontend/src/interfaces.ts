export interface Usuario {
  usuario: string;
  password: string;
}

export interface UsuarioRespuesta {
  status: string;
  response: any;
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
export interface Cliente{
  id_cliente:string;
  nombres:string;
  apellidos:string;
  direccion: string;
  telefono: string;
  correo:string;
  contrasena:string;
}
