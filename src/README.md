# Registro de cambios para la Aplicación de Examen

## Resumen
Este documento detalla las modificaciones realizadas en las clases `Exam`, `Professor` y `Main` de nuestra Aplicación de Examen. Los cambios reflejan el proceso de desarrollo iterativo y buscan mejorar la funcionalidad, el diseño y adherirse a las mejores prácticas.

## Clase `Exam`
### Modificaciones
- **Adición del Atributo `Professor`:**
  - Introducción de un nuevo atributo privado de tipo `Professor`. Esto asigna la responsabilidad de supervisar el examen al objeto `Exam`, vinculándolo a un profesor específico.
  - El constructor se ha modificado para aceptar un objeto `Professor` como segundo parámetro, reflejando la nueva relación entre las clases `Exam` y `Professor`.

### Características Eliminadas
- **Tipo de Arreglo `Question`:**
  - El tipo de retorno del método `add` se ha cambiado de `Question[]` a `void`, ya que el método no devuelve ningún valor, sino que añade una pregunta al examen.

## Clase `Professor`
### Modificaciones
- **Asociación con `Subject`:**
  - Añadido un atributo privado de tipo `Subject` que permite asociar un `Professor` con una materia específica.
  - El método `assign` ahora asigna efectivamente un `Subject` al `Professor`, actualizando el atributo `subject`.
  - Implementación del método `getSubject` para obtener la materia asociada al profesor.

## Clase `Main`
### Modificaciones
- **Instanciación y Llamadas a Métodos:**
  - Se ha modificado la instanciación de los objetos `Professor` y `Subject` para estar en concordancia con los cambios en las firmas de los constructores y el uso de los métodos.
  - Se refleja el uso actualizado del método `assign` de la clase `Professor` para asociar una materia con un profesor.

### Nota
- Los cambios reflejados en el último commit que involucran nombres de variables y comentarios son mejoras menores que no afectan la funcionalidad de la aplicación, pero mejoran la legibilidad y mantenibilidad del código.
