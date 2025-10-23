# Descripción

Proyecto_automatizacion es un programa creado en Java y Selenium para automatizar pruebas.

## Instalación

Descargar e instalar:
- [JDK 25](https://download.oracle.com/java/25/latest/jdk-25_windows-x64_bin.exe)
- [Navegador Google Chrome](https://www.google.com/intl/es_es/chrome/)

Dar de alta las variables de entorno de Java:
[Guía Java Variables de entorno Windows](https://aprenderaprogramar.com/attachments/article/389/CU00610B%20configurar%20java%20en%20windows%20variables%20entorno%20java_home%20y%20path.pdf)

Realizado lo anterior, dirigirse a la carpeta donde este el archivo Proyecto_automatizacion.jar

Abrir cmd en la ruta de la carpeta: Dar clic derecho en una zona libre de la carpeta y seleccionar Abrir en Terminal

En la terminal escribir el siguiente comando para ejecutar el programa:

```bash
java -jar Proyecto_automatizacion.jar
```
El programa se ejecutara, abrirá el navegador Chrome y realizara los siguientes pasos:

	-Abrirá el navegador Chrome e ingresara a la pagina www.mercadolibre.com 
	-Seleccionara el país México
	-Buscará el producto por el termino “playstation 5”  
	-Filtrara los resultados por “Nuevos”  
	-Ordenara los resultados de “mayor a “menor precio”  
	-Obtendrá los nombres y el precio de los primeros 5 productos   
	-Imprimirá los nombres y los precios en consola 

El navegador se cerrara y en la terminal se mostrará el siguiente resultado:

## Resultado en terminal

```bash
 Nombre: Consola Sony Playstation 5 Digital Edición 30º Aniversario 1 Tb Gris Gris
  Precio: $34,999
-----------------------------
  Nombre: Playstation 5 Slim Edition 30 Aniversario Mando Dualsense Gris
  Precio: $24,000
-----------------------------
  Nombre: Sony Playstation 5 Slim Digital 1tb Edición 30 Aniversario + Unidad Lectora De Discos Para Ps5.
  Precio: $21,702
-----------------------------
  Nombre: Playstation 5 Pro Playstation 5 Pro Sony 2024
  Precio: $20,000
-----------------------------
  Nombre: Consola Sony Playstation 5 Digital Edición 30º Aniversario 1 Tb Gris
  Precio: $19,223
-----------------------------
```
