# README.MD
Una forma sencilla de almacenar datos en SharedPreferences en JavaAndroid.

## Contenido
El proyecto consta de solo un archivo java el cual puedes descargar o simplemente copiar el código para su uso.

## Como usar
Despúes de tener el código en tú proyecto, debes importar la ruta del archivo en el cual lo guardaste o simplemente dejar que android studio lo haga por ti.

Para almacenar datos puedes ejecutar la siguiente instrucción:
```bash
 Local.setData("contenedor", contexto , "nombre_clave", valor);
```
La estructura comienza con "Local.setData", éste método lo podrás observar en el código ofrecido, como puedes apreciar, recibe una serie de parámetros, primero es el nombre del contenedor de los datos, éste puede ser algo general como "login" o "configuraciones", en general es para identificar a que corresponde el valor almacenado. Posteriormente se entrega el contexto el cúal lo puedes obtener desde la instrucción "getApplicationContext()" o "getContext()", eso dependerá de donde utilices la instrucción. Finalmente se debe enviar el nombre clave del dato para almacenar y el valor de éste.

Para obtener el valor almacenado, se ejecuta una instrucción similar:
```bash
 Local.getData("contenedor", contexto , "nombre_clave");
```
La diferencia es que ahora se ejecuta la instrucción "getData" y solo enviamos como parámetro el nombre del contenedor, el contexto y el nombre clave del valor almacenado, ésto nos retornará un valor en string.

