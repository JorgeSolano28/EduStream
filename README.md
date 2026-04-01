# EduStream - Versión Consola (80% del trabajo final)

Proyecto final Programación 2
Aplicación de consola con menú interactivo para probar las funcionalidades del sistema EduStream sobre gestion de cursos, usuarios e inscripciones.

## Contenido
- POJOS: Usuario, Profesor, Estudiante, Curso, Inscripcion
- DAOS: UsuarioDAO, CursoDAO, InscripcionDAO
- Conexion MySQL con JDBC
- Menu interactivo en main para ejecutar el programa (aún en construccón)

## Requisitos para poder correr el programa
- JDK 21 o superior
- MySQL
- Scritp .sql para poder generar la base de datos (archivo incluido en en el repositorio bajo el nombre de EduStream_db)
- Driver MySQL Connector (incluido en carpeta lib)

## Pasos paraa isar el sistema EduStream

## Paso ? - Base de datos
- 1. Ejecutar el archivo EduStream_db.sql en MySQL antes de correr el proyecto. En caso de no hacerlo dará error debido a que el programa corre sobre la manipulación de datos para el respecivo CRUD dentro de la misma
