CREATE DATABASE unistore;

USE unistore;

CREATE TABLE producto(
	id_producto VARCHAR(5),
	descripcion VARCHAR(100),
	cantidad NUMERIC(3),
	precio_unitario NUMERIC (9, 2),
	PRIMARY KEY (id_producto)
);

CREATE TABLE cliente(
	id_cliente VARCHAR(9),
	nombres VARCHAR(50),
	apellidos VARCHAR(50),
	direccion VARCHAR(100),
	telefono CHAR(9),
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

CREATE TABLE correo_contrasena(
	correo VARCHAR(50),
	contrasena VARCHAR(50),
	id_cliente VARCHAR(9),
	FOREIGN KEY (id_cliente) REFERENCES cliente(id_cliente)
);

CREATE SEQUENCE id_producto START WITH 1;

INSERT INTO producto VALUES (NEXTVAL(id_producto), 'Mouse pad', 5, 22.00);
INSERT INTO producto VALUES (NEXTVAL(id_producto), 'Morral', 5, 30.00);
INSERT INTO producto VALUES (NEXTVAL(id_producto), 'Lapiceros con fundas', 5, 10.00);
INSERT INTO producto VALUES (NEXTVAL(id_producto), 'Polo UNI 1876', 5, 22.00);
INSERT INTO producto VALUES (NEXTVAL(id_producto), 'Stickers UNI', 5, 2.00);
INSERT INTO producto VALUES (NEXTVAL(id_producto), 'Polo bicolor', 5, 25.00);
INSERT INTO producto VALUES (NEXTVAL(id_producto), 'Bolsa de papel', 5, 4.50);
INSERT INTO producto VALUES (NEXTVAL(id_producto), 'Toalla', 5, 25.00);
INSERT INTO producto VALUES (NEXTVAL(id_producto), 'Bandera de escritorio', 5, 40.00);
INSERT INTO producto VALUES (NEXTVAL(id_producto), 'Mochila y morral', 5, 45.00);

SELECT * FROM producto;

CREATE SEQUENCE id_cliente START WITH 1;

INSERT INTO cliente VALUES (NEXTVAL(id_cliente), 'Luis', 'Rodriguez', 'Lima', '333333331');
INSERT INTO cliente VALUES (NEXTVAL(id_cliente), 'Sergio', 'Yupanqui', 'Lima', '333333332');
INSERT INTO cliente VALUES (NEXTVAL(id_cliente), 'Nestor', 'Audante', 'Lima', '333333333');
INSERT INTO cliente VALUES (NEXTVAL(id_cliente), 'Daniel', 'Zanabria', 'Lima', '333333334');
INSERT INTO cliente VALUES (NEXTVAL(id_cliente), 'Jesus', 'Quispe', 'Lima',  '333333335');
INSERT INTO cliente VALUES (NEXTVAL(id_cliente), 'Javier', 'Canchano', 'Lima',  '333333336');

SELECT cl.id_cliente, cl.nombres, cl.apellidos FROM cliente cl;

CREATE SEQUENCE id_alumno START WITH 1;

INSERT INTO alumno VALUES(NEXTVAL(id_alumno), 1);
INSERT INTO alumno VALUES(NEXTVAL(id_alumno), 2);
INSERT INTO alumno VALUES(NEXTVAL(id_alumno), 4);
INSERT INTO alumno VALUES(NEXTVAL(id_alumno), 5);

SELECT al.id_alumno, cl.id_cliente, cl.nombres, cl.apellidos FROM alumno al
INNER JOIN cliente cl ON (al.id_cliente = cl.id_cliente);