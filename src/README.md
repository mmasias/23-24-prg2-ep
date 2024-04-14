# ☠️ **Examen parcial de programación 2** ☠️

## Explicación del código 💻

Para iniciar el código se realizó la duda ¿como separo el problema?, luego se realizó otra ¿que necesita cada clase? y así fue como surgieron las siguiente clases y lo que hace cada una.

- ### Clase **Profesor**

  En esta clase se define el nombre y el id del catedrático (que en este caso es Manuel Masias junto con su NIE).

- ### Clase **Asignatura**

  Se define materia (o nombre de la asignatura), su abreviatura y los créditos que tiene la misma.

- ### Clase **Examen**

  Este apartado surgió con la idea, se define que es un exámen parcial, pero, ¿que pasaría si más adelante se quiere definir que sea exámen final?

- ### Clase **ProfesorSupervisor**

  En esta clase se define el nombre y el id del catedrático que supervisará el exámen (que en este caso es Loyda Alas junto con su DNI).

- ### Clase **PrimeraPregunta**

  Se definé la primera pregunta.

- ### Clase **SegundaPregunta**

  Se definé la segunda pregunta.

- ### Clase **TerceraPregunta**
  Se definé la tercera pregunta.

**Las 3 clases anteriores se que podían ser resumidas en una sola, sin embargo lo pensé a manera de que se podía cambiar de manera más fácil identificando cada pregunta.**

- ### Clase **Main**
  Apartado donde se unieron todas las clases anteriores y donde se demuestra los System.out.println.

---

---

## Errores y/o modificaciones 💢

- Cree la clase Main, para unificar todo en el código, espero que no sea un problema.

---

- Me e dado cuenta que al momento en el que estoy poniendo esto, los void no me sirven de absolutamente nada, y si los coloco solo darían error. Por ejemplo:

```
{
    public void catedratico;
    public void id;
}
```

```
{
    public void materia;
    public void abreviatura;
}
```

```
{
    public void ingresarExamen;
}
```

```
{
    public void supervisor;
    public void identificacion;
}
```

---

## Conclusiones 💬

- Los void no son tan necesarios

- Si veo que algo se repite mucho (como en el caso de las preguntas) poder buscar alguna manera en la cual se utilice solo una clase.
