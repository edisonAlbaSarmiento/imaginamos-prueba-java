INSERT INTO login (usuario, contrasena) VALUES ('admin', 'admin');
INSERT INTO login (usuario, contrasena) VALUES ('edison', 'edison01');
INSERT INTO cliente (correo,documento, edad, nombres, id_login) VALUES ('admin@admin.com.co', '999807080', '72', 'angie orguela', '2');
INSERT INTO cliente (correo,documento, edad, nombres, id_login) VALUES ('edison.alba@imginamos.com.co', '123456789', '22', 'edison alba', '1');
INSERT INTO producto (codigo_barras, descripcion, nombre, precio) VALUES ('xxxx1234', 'xxxxxxx', 'zapato', '30000');
INSERT INTO tienda (direccion, horario, nombre) VALUES ('calle 123', 'lunes a viernes ', 'Edison Store');
INSERT INTO compra (total_compra, id_cliente) VALUES ('13', '2');
INSERT INTO detalle_producto_tienda (id_producto, id_tienda) VALUES ('1', '1');
INSERT INTO detallecompra (cantidad_producto_cliente, id_compra, id_producto) VALUES ('1', '1', '1');