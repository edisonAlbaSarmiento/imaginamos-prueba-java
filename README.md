Paso Para ejecutar el proyecto 

1. Clonar el repositorio
2. Crear la bases de datos en mysql con nombre dbprueba y ejecutar el script bases de datos 
3. Instalar o abrir Postman
4. Realizar las peticiones con las siguientes urls:

http://localhost:8080/api/logueo/

realizar el siguiente JSON para validar el logueo
[
   {
    "usuario": "admin",
    "contrasena": "admin"
    }
]

http://localhost:8080/api/logins/

http://localhost:8080/api/clientes/

http://localhost:8080/api/productos/

http://localhost:8080/api/tiendas/

http://localhost:8080/api/detallecompras/

http://localhost:8080/api/detalleproductotiendas/

Informacion adicional:
los campos  de cliente como correo y identificacion se identificaron como unicos en la entidad

