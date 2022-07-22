CREATE DATABASE unistore;

USE unistore;

CREATE TABLE producto(
	id_producto VARCHAR(5),
	nombre VARCHAR(100),
	descripcion VARCHAR(100),
	cantidad NUMERIC(3),
	precio_unitario NUMERIC (9, 2),
	precio_oferta NUMERIC (9, 2),
	url_imagen VARCHAR(500),
	PRIMARY KEY (id_producto)
);


CREATE TABLE cliente(
	id_cliente VARCHAR(9),
	nombres VARCHAR(50),
	apellidos VARCHAR(50),
	direccion VARCHAR(100),
	telefono CHAR(9),
	correo VARCHAR(50),
	contrasena VARCHAR(50),
	PRIMARY KEY (id_cliente)
);

CREATE TABLE alumno(
	id_alumno VARCHAR(9),
	id_cliente VARCHAR(9),
	PRIMARY KEY (id_alumno),
	FOREIGN KEY (id_cliente) REFERENCES cliente(id_cliente)
);

CREATE TABLE pedido(
	id_pedido VARCHAR(5),
	fecha_pedido VARCHAR(8),
	fecha_entrega VARCHAR(8),
	id_cliente VARCHAR(9),
	id_producto VARCHAR(5),
	PRIMARY KEY (id_pedido),
	FOREIGN KEY (id_cliente) REFERENCES cliente(id_cliente),
	FOREIGN KEY (id_producto) REFERENCES producto(id_producto)
);

CREATE TABLE detalle_pedido(
	id_detalle VARCHAR(5),
	cantidad NUMERIC(3),
	precio_unitario NUMERIC (9, 2),
	id_producto VARCHAR(5),
	PRIMARY KEY (id_detalle),
	FOREIGN KEY (id_producto) REFERENCES producto(id_producto)
);


CREATE SEQUENCE id_producto START WITH 1;

INSERT INTO producto VALUES (NEXTVAL(id_producto), 'Mouse pad UNI','Mouse pad', 5, 22.00, precio_unitario*1.3,'https://i.postimg.cc/DwpgVsnN/pic20.jpg' );
INSERT INTO producto VALUES (NEXTVAL(id_producto), 'Morral UNI','Morral', 5, 30.00,precio_unitario*1.3,'https://i.postimg.cc/028dbZN3/pic7.jpg');
INSERT INTO producto VALUES (NEXTVAL(id_producto), 'Lapiceros UNI','Lapiceros con fundas', 5, 10.00,precio_unitario*1.3,'https://i.postimg.cc/N0158qJx/pic10.jpg');
INSERT INTO producto VALUES (NEXTVAL(id_producto), 'Polo UNI 1876','Polo UNI 1876', 5, 22.00,precio_unitario*1.3,'https://i.postimg.cc/MTpqnhhH/pic2.jpg');
INSERT INTO producto VALUES (NEXTVAL(id_producto), 'Stickers UNI','Stickers UNI', 5, 2.00,precio_unitario*1.3,'https://i.postimg.cc/hvHB3hhQ/pic15.jpg');
INSERT INTO producto VALUES (NEXTVAL(id_producto),'Polo bicolor UNI','Polo bicolor', 5, 25.00,precio_unitario*1.3,'https://i.postimg.cc/26gkg0K5/pic3.jpg');
INSERT INTO producto VALUES (NEXTVAL(id_producto), 'Bolsa de papel UNI','Bolsa de papel', 5, 4.50,precio_unitario*1.3,'https://i.postimg.cc/7Yn4NPwh/pic9.jpg');
INSERT INTO producto VALUES (NEXTVAL(id_producto), 'Toalla UNI','Toalla', 5, 25.00,precio_unitario*1.3,'https://i.postimg.cc/BnhGdh8G/pic25.jpg');
INSERT INTO producto VALUES (NEXTVAL(id_producto), 'Bandera de escritorio','Bandera de escritorio', 5, 40.00,precio_unitario*1.3,'https://i.postimg.cc/vHg91js0/pic21.jpg');
INSERT INTO producto VALUES (NEXTVAL(id_producto), 'Mochila UNI','Mochila', 5, 45.00,precio_unitario*1.3,'https://i.postimg.cc/y88MXFLp/pic8.jpg');

SELECT cl.id_cliente, cl.nombres, cl.apellidos FROM cliente cl;
CREATE SEQUENCE id_cliente START WITH 1;

INSERT INTO cliente VALUES (NEXTVAL(id_cliente), 'Luis', 'Rodriguez', 'Lima', '333333331','prueba@gmai.com','del1al8');
INSERT INTO cliente VALUES (NEXTVAL(id_cliente), 'Sergio', 'Yupanqui', 'Lima', '333333332','prueba@gmai.com','del1al8');
INSERT INTO cliente VALUES (NEXTVAL(id_cliente), 'Nestor', 'Audante', 'Lima', '333333333','prueba@gmai.com','del1al8');
INSERT INTO cliente VALUES (NEXTVAL(id_cliente), 'Daniel', 'Zanabria', 'Lima', '333333334','prueba@gmai.com','del1al8');
INSERT INTO cliente VALUES (NEXTVAL(id_cliente), 'Jesus', 'Quispe', 'Lima',  '333333335','prueba@gmai.com','del1al8');
INSERT INTO cliente VALUES (NEXTVAL(id_cliente), 'Javier', 'Canchano', 'Lima',  '333333336','prueba@gmai.com','del1al8');


INSERT INTO cliente VALUES VALUES	(NEXTVAL(id_cliente),'Cliente 1', 'Apellido 1','Su casa', '333333336','prueba@gmai.com','del1al8');

CREATE SEQUENCE id_alumno START WITH 1;

INSERT INTO alumno VALUES(NEXTVAL(id_alumno), 1);
INSERT INTO alumno VALUES(NEXTVAL(id_alumno), 2);
INSERT INTO alumno VALUES(NEXTVAL(id_alumno), 4);
INSERT INTO alumno VALUES(NEXTVAL(id_alumno), 5);

SELECT al.id_alumno, cl.id_cliente, cl.nombres, cl.apellidos, direccion , telefono ,correo cc.correo, cc.contrasena FROM alumno al
INNER JOIN cliente cl ON (al.id_cliente = cl.id_cliente);cliente
