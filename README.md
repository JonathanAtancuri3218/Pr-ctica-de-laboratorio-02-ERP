# Pr-ctica-de-laboratorio-02-ERP
Informe de Prácticas de Laboratorio
Carrera: Ingeniería de Sistemas
Grupo: D Nivel: 10 Fecha: 08/06/2021
INFORME DE PRÁCTICA DE LABORATORIO / TALLERES / CENTROS DE SIMULACIÓN – PARA ESTUDIANTES
CARRERA: Ingeniería de Sistemas
ASIGNATURA: Aplicaciones Distribuidas
NRO. PRÁCTICA
3
TÍTULO PRÁCTICA: Desarrollo de una aplicación JEE basado en EJB, JSF y JPA para
el intercambio de datos en una aplicación empresarial.
OBJETIVO ALCANZADO:
Diseña y desarrolla modelos de software en diferentes niveles de abstracción y modelos de datos a nivel transaccional y analítico con entornos de desarrollo actuales.
ACTIVIDADES DESARROLLADAS
1. Crear un repositorio en GitHub con el nombre “Práctica de laboratorio 02: ERP”

Primero Creamos un repositorio con el nombre Práctica de laboratorio 02: ERP
![image](https://user-images.githubusercontent.com/49213346/121192303-6dbdb000-c832-11eb-9914-6719e67c4e00.png)
Vemos el repositorio creado y es hora de fusionar el repositorio de forma local
![image](https://user-images.githubusercontent.com/49213346/121192397-86c66100-c832-11eb-9884-edc4ca498a8e.png)

Informe de Prácticas de Laboratorio
Carrera: Ingeniería de Sistemas
Grupo: D Nivel: 10 Fecha: 08/06/2021
Creamos el README.md es el archivo que incluirá toda la información que este en este informe
![image](https://user-images.githubusercontent.com/49213346/121192436-904fc900-c832-11eb-9533-90c030bca139.png)

Inicializamos de forma local

![image](https://user-images.githubusercontent.com/49213346/121192451-9645aa00-c832-11eb-852c-b8c12b9124bf.png)

Agregamos el archivo necesario que vamos a utilizar para poder subir cambios y luego realizamos algún cambio , nos posicionamos en la rama main y fusionamos cambios y luego los subimos con git push -u origin main
![image](https://user-images.githubusercontent.com/49213346/121192501-a2316c00-c832-11eb-82c0-0b35d3811fd3.png)


Podemos ver los cambios subidos
![image](https://user-images.githubusercontent.com/49213346/121192593-b7a69600-c832-11eb-998d-b5f67ba42245.png)

2. Desarrollar una aplicación con tecnología JEE para gestionar la facturación de una distribuidora de productos para el hogar en la web.
Se pide desarrollar una aplicación JEE usando JSF, EJB y JPA. La aplicación WEB permite realizar la facturación de una distribuidora de productos para el hogar. La distribuidora cuenta con varios productos que se encuentran almacenados en diferentes bodegas ubicadas geográficamente a lo largo del país.
Diagrama entidad Relación
![image](https://user-images.githubusercontent.com/49213346/121192811-eae92500-c832-11eb-88d2-e09c2ff67a1f.png)

Fig.1. Diagrama Entidad Relación de una Distribuidora de productos
Vamos a implementar el patrón JPA + EJB +JSF, primero comenzamos configurando el pool y también el resources desde el panel de administración del servidor GlassFish, configuramos la conexión a la base de datos

![image](https://user-images.githubusercontent.com/49213346/121192852-f2a8c980-c832-11eb-9ba7-94527cf8ac2f.png)


Creamos los modelo que vamos a persistir

![image](https://user-images.githubusercontent.com/49213346/121192961-09e7b700-c833-11eb-980d-34904e1f75b5.png)

Luego de ello, veamos las carpetas creadas en el proyecto, empecemos con la carpeta controlador y los archivos creados dentro de este. Todos los archivos generados son los Bean de las clases para que la base de datos pueda interactuar con la vista:

![image](https://user-images.githubusercontent.com/49213346/121192985-110ec500-c833-11eb-9814-e8f371a9fdd1.png)

Luego, dentro de la carpeta ejb, se muestran los archivos que se están la la siguiente imagen. Las clases facade son las encargadas de hacer la persistencia entre la base de datos y el controlador.
![image](https://user-images.githubusercontent.com/49213346/121193026-1bc95a00-c833-11eb-9c42-220850bb018e.png)

Y por ultimo creamos las vistas

![image](https://user-images.githubusercontent.com/49213346/121193051-2126a480-c833-11eb-81f0-d35a2bad2af0.png)


Podemos observar que tenemos en diferentes carpetas la parte privada que es del usuario admin y el empleado y la parte publica lo que seria el index.xhtml y el 404error.xhtml
![image](https://user-images.githubusercontent.com/49213346/121193108-2be13980-c833-11eb-9384-7e77f4b6b6ff.png)

Para el manejo de los roles de uso el siguiente código :

![image](https://user-images.githubusercontent.com/49213346/121193154-356aa180-c833-11eb-97e4-c548cb5656b1.png)


3. Realizar varios commits en la herramienta GitHub que demuestren el desarrollo de la aplicación.
Vamos a inicializar de forma local nuestros cambios

![image](https://user-images.githubusercontent.com/49213346/121193179-3c91af80-c833-11eb-9581-455559f45604.png)
![image](https://user-images.githubusercontent.com/49213346/121193196-40bdcd00-c833-11eb-9c09-972bdcde0fe8.png)


4. Implementar el README del repositorio del proyecto con la misma información del informe de la práctica
![image](https://user-images.githubusercontent.com/49213346/121193303-57fcba80-c833-11eb-9405-849f9fd6c880.png)


url repositorio :
https://github.com/JonathanAtancuri3218/Pr-ctica-de-laboratorio-02-ERP
RESULTADO(S) OBTENIDO(S):
Vemos el index de la pagina y visualizamos el catalogo de los productos

![image](https://user-images.githubusercontent.com/49213346/121193339-6054f580-c833-11eb-889f-0052aa1f081a.png)

Podemos observar nuestro Login

![image](https://user-images.githubusercontent.com/49213346/121193358-65b24000-c833-11eb-90de-b39940e3bbc4.png)



Vemos el dashboard del usuario admin

![image](https://user-images.githubusercontent.com/49213346/121193395-6ba82100-c833-11eb-9b9d-526a0176ef60.png)

El usuario admin puede Gestionar bodegas (consulta de inventario general)

![image](https://user-images.githubusercontent.com/49213346/121193416-706cd500-c833-11eb-8288-dfd8fb0ee41c.png)

El usuario admin puede Gestionar productos (aumentar stock por bodega)

![image](https://user-images.githubusercontent.com/49213346/121193432-75318900-c833-11eb-9925-143a2ba323ba.png)
![image](https://user-images.githubusercontent.com/49213346/121193443-79f63d00-c833-11eb-8938-0ffddccd66d6.png)
![image](https://user-images.githubusercontent.com/49213346/121193471-7ebaf100-c833-11eb-9d64-5d718d37ff68.png)



Ahora vamos a iniciar sesión como empleado, el usuario empleado puede Gestionar clientes y Gestionar las Facturas por lo tanto en cuando se facture algún producto el stock disminuye del inventario
![image](https://user-images.githubusercontent.com/49213346/121193543-8bd7e000-c833-11eb-81b9-679ef48cc099.png)


También el usuario empleado puede buscar la factura por el numero de cedula del cliente
![image](https://user-images.githubusercontent.com/49213346/121193595-94c8b180-c833-11eb-95d9-f34cc86f799b.png)

CONCLUSIONES:
• Podemos concluir que el modelo de negocio que maneja esta aplicación , se utiliza mucho en las aplicaciones empresarial en la actualidad y sirve de mucho ya que es una aplicación muy robusta y también puede llegar a ser muy escalable.
RECOMENDACIONES:
• Saber sobre EJB , JPA Y JSF
• Saber usar jpql y la sesión de los beans
• Saber sobre conocimientos de programación en arquitectura JEE
Nombre de estudiante: Jonathan Atancuri , Ricardo Chuqui
Firma del estudiante:
