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
![image](https://user-images.githubusercontent.com/49213346/121192303-6dbdb000-c832-11eb-9914-6719e67c4e00.png)
Primero Creamos un repositorio con el nombre Práctica de laboratorio 02: ERP
Vemos el repositorio creado y es hora de fusionar el repositorio de forma local
Informe de Prácticas de Laboratorio
Carrera: Ingeniería de Sistemas
Grupo: D Nivel: 10 Fecha: 08/06/2021
Creamos el README.md es el archivo que incluirá toda la información que este en este informe
Inicializamos de forma local
Agregamos el archivo necesario que vamos a utilizar para poder subir cambios y luego realizamos algún cambio , nos posicionamos en la rama main y fusionamos cambios y luego los subimos con git push -u origin main
Informe de Prácticas de Laboratorio
Carrera: Ingeniería de Sistemas
Grupo: D Nivel: 10 Fecha: 08/06/2021
Podemos ver los cambios subidos
2. Desarrollar una aplicación con tecnología JEE para gestionar la facturación de una distribuidora de productos para el hogar en la web.
Se pide desarrollar una aplicación JEE usando JSF, EJB y JPA. La aplicación WEB permite realizar la facturación de una distribuidora de productos para el hogar. La distribuidora cuenta con varios productos que se encuentran almacenados en diferentes bodegas ubicadas geográficamente a lo largo del país.
Diagrama entidad Relación
Informe de Prácticas de Laboratorio
Carrera: Ingeniería de Sistemas
Grupo: D Nivel: 10 Fecha: 08/06/2021
Fig.1. Diagrama Entidad Relación de una Distribuidora de productos
Vamos a implementar el patrón JPA + EJB +JSF, primero comenzamos configurando el pool y también el resources desde el panel de administración del servidor GlassFish, configuramos la conexión a la base de datos
Informe de Prácticas de Laboratorio
Carrera: Ingeniería de Sistemas
Grupo: D Nivel: 10 Fecha: 08/06/2021
Creamos los modelo que vamos a persistir
Luego de ello, veamos las carpetas creadas en el proyecto, empecemos con la carpeta controlador y los archivos creados dentro de este. Todos los archivos generados son los Bean de las clases para que la base de datos pueda interactuar con la vista:
Luego, dentro de la carpeta ejb, se muestran los archivos que se están la la siguiente imagen. Las clases facade son las encargadas de hacer la persistencia entre la base de datos y el controlador.
Informe de Prácticas de Laboratorio
Carrera: Ingeniería de Sistemas
Grupo: D Nivel: 10 Fecha: 08/06/2021
Y por ultimo creamos las vistas
Podemos observar que tenemos en diferentes carpetas la parte privada que es del usuario admin y el empleado y la parte publica lo que seria el index.xhtml y el 404error.xhtml
Informe de Prácticas de Laboratorio
Carrera: Ingeniería de Sistemas
Grupo: D Nivel: 10 Fecha: 08/06/2021
Para el manejo de los roles de uso el siguiente código :
Informe de Prácticas de Laboratorio
Carrera: Ingeniería de Sistemas
Grupo: D Nivel: 10 Fecha: 08/06/2021
3. Realizar varios commits en la herramienta GitHub que demuestren el desarrollo de la aplicación.
Vamos a inicializar de forma local nuestros cambios
Informe de Prácticas de Laboratorio
Carrera: Ingeniería de Sistemas
Grupo: D Nivel: 10 Fecha: 08/06/2021
Informe de Prácticas de Laboratorio
Carrera: Ingeniería de Sistemas
Grupo: D Nivel: 10 Fecha: 08/06/2021
4. Implementar el README del repositorio del proyecto con la misma información del informe de la práctica
url repositorio :
https://github.com/JonathanAtancuri3218/Pr-ctica-de-laboratorio-02-ERP
RESULTADO(S) OBTENIDO(S):
Vemos el index de la pagina y visualizamos el catalogo de los productos
Podemos observar nuestro Login
Informe de Prácticas de Laboratorio
Carrera: Ingeniería de Sistemas
Grupo: D Nivel: 10 Fecha: 08/06/2021
Vemos el dashboard del usuario admin
El usuario admin puede Gestionar bodegas (consulta de inventario general)
El usuario admin puede Gestionar productos (aumentar stock por bodega)
Informe de Prácticas de Laboratorio
Carrera: Ingeniería de Sistemas
Grupo: D Nivel: 10 Fecha: 08/06/2021
Ahora vamos a iniciar sesión como empleado, el usuario empleado puede Gestionar clientes y Gestionar las Facturas por lo tanto en cuando se facture algún producto el stock disminuye del inventario
También el usuario empleado puede buscar la factura por el numero de cedula del cliente
Informe de Prácticas de Laboratorio
Carrera: Ingeniería de Sistemas
Grupo: D Nivel: 10 Fecha: 08/06/2021
CONCLUSIONES:
• Podemos concluir que el modelo de negocio que maneja esta aplicación , se utiliza mucho en las aplicaciones empresarial en la actualidad y sirve de mucho ya que es una aplicación muy robusta y también puede llegar a ser muy escalable.
RECOMENDACIONES:
• Saber sobre EJB , JPA Y JSF
• Saber usar jpql y la sesión de los beans
• Saber sobre conocimientos de programación en arquitectura JEE
Nombre de estudiante: Jonathan Atancuri , Ricardo Chuqui
Firma del estudiante:
