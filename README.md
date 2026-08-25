# Estudiante Universidad

## Descripción

Este programa en Java representa a un estudiante universitario mediante una clase llamada `estudianteUniversidad`. Permite almacenar su legajo, nombre completo y calificación final, además de consultar y modificar sus datos.

## Atributos

* `legajo`: almacena el número de legajo del estudiante.
* `nombreCompleto`: almacena el nombre completo.
* `calificacionFinal`: almacena la nota final del estudiante.

## Métodos principales

* `getCalificacionFinal()`: permite obtener la calificación final.
* `setCalificacionFinal()`: permite modificar la calificación, verificando que esté entre 0 y 10.
* `getNombreCompleto()`: permite obtener el nombre del estudiante.
* `setNombreCompleto()`: permite modificar el nombre.
* `estaAprobado()`: verifica si el estudiante aprobó. Devuelve `true` cuando la calificación es mayor o igual a 6.

## Funcionamiento

En el método `main` se crean dos estudiantes con diferentes calificaciones. Luego se muestra el nombre de cada uno y se utiliza el método `estaAprobado()` para determinar si aprobó o no.

El programa utiliza **getters y setters** para acceder y modificar los atributos de la clase de manera controlada.

## Ejemplo de ejecución

<img width="240" height="120" alt="image" src="https://github.com/user-attachments/assets/c2f58845-f626-46fc-8b6b-2df5f967680d" />
