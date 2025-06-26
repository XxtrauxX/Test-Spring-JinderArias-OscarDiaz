# MiTask

_ API REST utilizando Spring Boot que permite gestionar tareas y proyectos de un equipo de trabajo. La aplicación  incluye funcionalidades para crear, consultar, actualizar y eliminar tareas y proyectos, soportar roles de usuario con diferentes niveles de acceso, y manejar relaciones entre proyectos y tareas

## Comenzando 🚀

### CONTEXTO 📋


Especificaciones
Requisitos Funcionales:
Gestión de Usuarios y Roles:
Las personas pueden acceder mediante un correo y contraseña en JWT.
Los usuarios pueden tener roles de "Administrador" o "Colaborador".
Los administradores pueden gestionar proyectos y tareas, mientras que los colaboradores solo pueden gestionar sus propias tareas asignadas.
Gestión de Proyectos:
Crear, editar, consultar y eliminar proyectos.
A cada proyecto se le asignan los siguientes atributos:
ID del proyecto.
Nombre del proyecto.
Descripción.
Fecha de inicio y fin.
Estado (Activo, Finalizado, Cancelado).
Lista de usuarios asignados al proyecto (relación muchos a muchos).
Gestión de Tareas:
Crear, editar, consultar y eliminar tareas relacionadas a proyectos específicos.
Cada tarea debe tener los siguientes atributos:
ID de la tarea.
Nombre de la tarea.
Descripción.
Prioridad (Baja, Media, Alta).
Estado (Pendiente, En Progreso, Completada, Cancelada).
Fecha de vencimiento.
Usuario asignado.
Consultas Avanzadas:
Consultar todas las tareas de un usuario o proyecto específico.
Filtrar y ordenar las tareas según atributos como estado, prioridad o fecha de vencimiento.
Seguridad:
Implementar autenticación y autorización utilizando Spring Security con JWT.
Restringir el acceso a los endpoints según el rol del usuario.

### Instalación 🔧

_Una serie de ejemplos paso a paso que te dice lo que debes ejecutar para tener un entorno de desarrollo ejecutandose_

_Dí cómo será ese paso_

```
Da un ejemplo
```

_Y repite_

```
hasta finalizar
```

_Finaliza con un ejemplo de cómo obtener datos del sistema o como usarlos para una pequeña demo_

## Ejecutando las pruebas ⚙️

_Explica como ejecutar las pruebas automatizadas para este sistema_

### Analice las pruebas end-to-end 🔩

_Explica que verifican estas pruebas y por qué_

```
Da un ejemplo
```

### Y las pruebas de estilo de codificación ⌨️

_Explica que verifican estas pruebas y por qué_

```
Da un ejemplo
```

## Despliegue 📦

_Agrega notas adicionales sobre como hacer deploy_

## Construido con 🛠️

_Menciona las herramientas que utilizaste para crear tu proyecto_

* [Dropwizard](http://www.dropwizard.io/1.0.2/docs/) - El framework web usado
* [Maven](https://maven.apache.org/) - Manejador de dependencias
* [ROME](https://rometools.github.io/rome/) - Usado para generar RSS

## Contribuyendo 🖇️

Por favor lee el [CONTRIBUTING.md](https://gist.github.com/villanuevand/xxxxxx) para detalles de nuestro código de conducta, y el proceso para enviarnos pull requests.

## Wiki 📖

Puedes encontrar mucho más de cómo utilizar este proyecto en nuestra [Wiki](https://github.com/tu/proyecto/wiki)

## Versionado 📌

Usamos [SemVer](http://semver.org/) para el versionado. Para todas las versiones disponibles, mira los [tags en este repositorio](https://github.com/tu/proyecto/tags).

## Autores ✒️

_Menciona a todos aquellos que ayudaron a levantar el proyecto desde sus inicios_

* **Andrés Villanueva** - *Trabajo Inicial* - [villanuevand](https://github.com/villanuevand)
* **Fulanito Detal** - *Documentación* - [fulanitodetal](#fulanito-de-tal)

También puedes mirar la lista de todos los [contribuyentes](https://github.com/your/project/contributors) quíenes han participado en este proyecto. 

## Licencia 📄

Este proyecto está bajo la Licencia (Tu Licencia) - mira el archivo [LICENSE.md](LICENSE.md) para detalles

## Expresiones de Gratitud 🎁

* Comenta a otros sobre este proyecto 📢
* Invita una cerveza 🍺 o un café ☕ a alguien del equipo. 
* Da las gracias públicamente 🤓.
* Dona con cripto a esta dirección: `0xf253fc233333078436d111175e5a76a649890000`
* etc.


