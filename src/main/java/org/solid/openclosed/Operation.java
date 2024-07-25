package org.solid.openclosed;

/* Esto está bien hecho porque seguimos añadiendo nuevas operaciones de implementación
    y nuestra calculadora obtiene extenciones sin modificar su actividad principal que
    es realizar calculos.
* */
public interface Operation {
    public int perform(int number1, int number2);
}
