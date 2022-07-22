CREATE DATABASE unistore;

USE unistore;

CREATE TABLE producto(
	id_producto CHAR(5),
	nombre VARCHAR(100),
	descripcion VARCHAR(100),
	cantidad NUMERIC(3),
	precio_oferta NUMERIC (9, 2),
	precio_unitario NUMERIC (9, 2),
	url_imagen VARCHAR(500),
	PRIMARY KEY (id_producto)
);


CREATE TABLE cliente(
	id_cliente CHAR(9),
	nombres VARCHAR(50),
	apellidos VARCHAR(50),
	direccion VARCHAR(100),
	telefono CHAR(9),
	PRIMARY KEY (id_cliente)
);

CREATE TABLE alumno(
	id_alumno CHAR(9),
	id_cliente CHAR(9),
	PRIMARY KEY (id_alumno),
	FOREIGN KEY (id_cliente) REFERENCES cliente(id_cliente)
);

CREATE TABLE pedido(
	id_pedido CHAR(5),
	fecha_pedido CHAR(8),
	fecha_entrega CHAR(8),
	id_cliente VARCHAR(9),
	id_producto VARCHAR(5),
	PRIMARY KEY (id_pedido),
	FOREIGN KEY (id_cliente) REFERENCES cliente(id_cliente),
	FOREIGN KEY (id_producto) REFERENCES producto(id_producto)
);

CREATE TABLE detalle_pedido(
	id_detalle CHAR(5),
	cantidad NUMERIC(3),
	precio_unitario NUMERIC (9, 2),
	id_producto VARCHAR(5),
	PRIMARY KEY (id_detalle),
	FOREIGN KEY (id_producto) REFERENCES producto(id_producto)
);

CREATE TABLE correo_contrasena(
	correo VARCHAR(50),
	contrasena VARCHAR(50),
	id_cliente CHAR(9),
	FOREIGN KEY (id_cliente) REFERENCES cliente(id_cliente)
);

CREATE SEQUENCE id_producto START WITH 1;

INSERT INTO producto VALUES (NEXTVAL(id_producto), 'Mouse pad UNI','Mouse pad', 5, 22.00, precio_oferta*1.3,'https://i.postimg.cc/DwpgVsnN/pic20.jpg' );
INSERT INTO producto VALUES (NEXTVAL(id_producto), 'Morral UNI','Morral', 5, 30.00,precio_oferta*1.3,'https://i.postimg.cc/028dbZN3/pic7.jpg');
INSERT INTO producto VALUES (NEXTVAL(id_producto), 'Lapiceros UNI','Lapiceros con fundas', 5, 10.00,precio_oferta*1.3,'https://i.postimg.cc/N0158qJx/pic10.jpg');
INSERT INTO producto VALUES (NEXTVAL(id_producto), 'Polo UNI 1876','Polo UNI 1876', 5, 22.00,precio_oferta*1.3,'https://i.postimg.cc/MTpqnhhH/pic2.jpg');
INSERT INTO producto VALUES (NEXTVAL(id_producto), 'Stickers del logo de la UNI','Stickers del logo de la UNI.Adhesivo interno/externo', 5, 2.00,precio_oferta*1.3,'https://i.postimg.cc/hvHB3hhQ/pic15.jpg');
INSERT INTO producto VALUES (NEXTVAL(id_producto), 'Polo bicolor UNI','Polo bicolor', 5, 25.00,precio_oferta*1.3,'https://i.postimg.cc/26gkg0K5/pic3.jpg');
INSERT INTO producto VALUES (NEXTVAL(id_producto), 'Bolsa de papel UNI','Bolsa de papel', 5, 4.50,precio_oferta*1.3,'https://i.postimg.cc/7Yn4NPwh/pic9.jpg');
INSERT INTO producto VALUES (NEXTVAL(id_producto), 'Toalla UNI','Toalla', 5, 25.00,precio_oferta*1.3,'https://i.postimg.cc/BnhGdh8G/pic25.jpg');
INSERT INTO producto VALUES (NEXTVAL(id_producto), 'Bandera de escritorio','Bandera de escritorio', 5, 40.00,precio_oferta*1.3,'https://i.postimg.cc/vHg91js0/pic21.jpg');
INSERT INTO producto VALUES (NEXTVAL(id_producto), 'Polo Letras UNI','Color blanco con estampado lateral', 5, 20.00,precio_oferta*1.3,'https://i.postimg.cc/Bncfr6Zz/check1.jpg');
INSERT INTO producto VALUES (NEXTVAL(id_producto), 'Polo Estampado posterior UNI','Polo Estampado Posterior', 5, 20.00,precio_oferta*1.3,'https://i.postimg.cc/yYhVHnvn/check4.jpg');
INSERT INTO producto VALUES (NEXTVAL(id_producto), 'Polo Piqué UNI','24/1 tipo camisero', 5, 30.00,precio_oferta*1.3,'https://i.postimg.cc/k5HCcHgM/Check6.jpg');
INSERT INTO producto VALUES (NEXTVAL(id_producto), 'Mochila de Lona UNI','Mochila de Lona para Laptop', 5, 45.00,precio_oferta*1.3,'https://i.postimg.cc/9fRKWQcV/Check7.jpg');
INSERT INTO producto VALUES (NEXTVAL(id_producto), 'Llavero de cuero UNI','Llavero de cuero con argolla niqueada', 5, 8.00,precio_oferta*1.3,'https://i.postimg.cc/vHYK4zG0/pic11.jpg');
INSERT INTO producto VALUES (NEXTVAL(id_producto), 'Llavero metalico UNI','Llavero metálico con pantografía', 5, 10.00,precio_oferta*1.3,'https://i.postimg.cc/j2sMJxYD/pic12.jpg');
INSERT INTO producto VALUES (NEXTVAL(id_producto), 'Sticker "yo amo a la uni"','Sticker yo amo a la uni', 5, 2.00,precio_oferta*1.3,'https://i.postimg.cc/W1QSw6PL/pic14.jpg');
INSERT INTO producto VALUES (NEXTVAL(id_producto), 'Llavero microporoso UNI','Llave microporoso con el logo de la UNI', 5, 3.00,precio_oferta*1.3,'https://i.postimg.cc/d318YLKj/pic13.jpg');
INSERT INTO producto VALUES (NEXTVAL(id_producto), 'Imantado ovalado UNI','Imantado ovalado de vinil troquelado logo UNI', 5, 5.00,precio_oferta*1.3,'https://i.postimg.cc/KjRgWwn9/pic16.jpg');
INSERT INTO producto VALUES (NEXTVAL(id_producto), 'Imantado rectangular 1 UNI','Imantado rectangular resinado con logo UNI', 5, 8.00,precio_oferta*1.3,'https://i.postimg.cc/YSML7h6L/pic17.jpg');
INSERT INTO producto VALUES (NEXTVAL(id_producto), 'Imantado rectangular 2 UNI','Imantado rectangular en vinil plano - Pabellón central UNI', 5, 4.00,precio_oferta*1.3,'https://i.postimg.cc/qRZN2w92/pic18.jpg');
INSERT INTO producto VALUES (NEXTVAL(id_producto), 'PN logo UNI','PN logo UNI con baño en oro', 5, 10.00,precio_oferta*1.3,'https://i.postimg.cc/25kyJgY4/pic19.jpg');
INSERT INTO producto VALUES (NEXTVAL(id_producto), 'Moneda giratoria UNI','Moneda giratoria con estuche de pana', 5, 160.00,precio_oferta*1.3,'https://i.postimg.cc/j5C5qNL2/pic22.jpg	');
INSERT INTO producto VALUES (NEXTVAL(id_producto), 'Corta papel UNI','Corta papel con mango de madera y estuche de pana', 5, 50.00,precio_oferta*1.3,'https://i.postimg.cc/L518LpkM/pic23.jpg');
INSERT INTO producto VALUES (NEXTVAL(id_producto), 'Taza 100CC express UNI','Taza 100CC express UNI con plato blanco', 5, 12.00,precio_oferta*1.3,'https://i.postimg.cc/VspgjPQZ/pic24.jpg');

SELECT * FROM producto;

producto
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

<<<<<<< HEAD
SELECT al.id_alumno, cl.id_cliente, cl.nombres, cl.apellidos FROM alumno al
INNER JOIN cliente cl ON (al.id_cliente = cl.id_cliente);

INSERT INTO correo_contrasena VALUES('jesus.quispe.d@uni.pe', 'POO221', 5);

SELECT cc.correo, cc.contrasena FROM correo_contrasena cc;
=======
SELECT al.id_alumno, cl.id_cliente, cl.nombres, cl.apellidos, direccion , telefono ,correo cc.correo, cc.contrasena FROM alumno al
INNER JOIN cliente cl ON (al.id_cliente = cl.id_cliente);cliente

>>>>>>> 26652ff373413f89ec6c810d242df0b4757c06cb
