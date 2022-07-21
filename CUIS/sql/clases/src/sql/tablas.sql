CREATE DATABASE unistore;

USE unistore;

CREATE TABLE producto(
	id_objeto VARCHAR(5),
	descripcion VARCHAR(100),
	cantidad NUMERIC(3),
	precio_unitario NUMERIC (9, 2),
	PRIMARY KEY (id_objeto)
);

CREATE TABLE cliente(
	id_cliente VARCHAR(9),
	nombres VARCHAR(50),
	apellidos VARCHAR(50),
	direccion VARCHAR(100),
	telefono VARCHAR(9),
	PRIMARY KEY (id_cliente)
);

CREATE TABLE alumno(
	id_alumno VARCHAR(9),
	nombres VARCHAR(50),
	apellidos VARCHAR(50),
	direccion VARCHAR(100),
	telefono VARCHAR(9),
	PRIMARY KEY (id_alumno)
);

CREATE TABLE pedido(
	id_pedido VARCHAR(5),
	fecha_pedido VARCHAR(8),
	fecha_entrega VARCHAR(8),
	id_cliente VARCHAR(9),
	PRIMARY KEY (id_pedido),
	FOREIGN KEY (id_cliente) REFERENCES cliente(id_cliente)
);

CREATE TABLE detalle_pedido(
	id_detalle VARCHAR(5),
	cantidad NUMERIC(3),
	precio_unitario NUMERIC (9, 2),
	id_objeto VARCHAR(5),
	PRIMARY KEY (id_detalle),
	FOREIGN KEY (id_objeto) REFERENCES producto(id_objeto)
);

CREATE TABLE usuario_contrasena(
	usuario VARCHAR(50),
	contrasena VARCHAR(50),
	id_cliente VARCHAR(9),
	FOREIGN KEY (id_cliente) REFERENCES cliente(id_cliente)
);

CREATE SEQUENCE id_objeto START WITH 1;

INSERT INTO producto VALUES (NEXTVAL(id_objeto), 'Mouse pad', 5, 22.00);
INSERT INTO producto VALUES (NEXTVAL(id_objeto), 'Morral', 5, 30.00);
INSERT INTO producto VALUES (NEXTVAL(id_objeto), 'Lapiceros con fundas', 5, 10.00);
INSERT INTO producto VALUES (NEXTVAL(id_objeto), 'Polo UNI 1876', 5, 22.00);
INSERT INTO producto VALUES (NEXTVAL(id_objeto), 'Stickers UNI', 5, 2.00);
INSERT INTO producto VALUES (NEXTVAL(id_objeto), 'Polo bicolor', 5, 25.00);
INSERT INTO producto VALUES (NEXTVAL(id_objeto), 'Bolsa de papel', 5, 4.50);
INSERT INTO producto VALUES (NEXTVAL(id_objeto), 'Toalla', 5, 25.00);
INSERT INTO producto VALUES (NEXTVAL(id_objeto), 'Bandera de escritorio', 5, 40.00);
INSERT INTO producto VALUES (NEXTVAL(id_objeto), 'Mochila y morral', 5, 45.00);

SELECT * FROM producto;

SELECT * FROM cliente;

SELECT * FROM usuario_contrasena;