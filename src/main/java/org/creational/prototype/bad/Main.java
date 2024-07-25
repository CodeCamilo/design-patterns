package org.creational.prototype.bad;

public class Main {
    /*No se va a poder copiar porque rollNumber es un número que es privado, se necesita saber
    * cuántos atributos tiene y en un ejemplo en el que toque hacer muchisimas copias
    * es un poco complicado. */

    public static void main(String[] args) {
        Student obj = new Student("Camilo",26,9885);

        Student objClone = new Student();
        objClone.name = obj.name;
        objClone.age = obj.age;
        //objClone.rollNumber = obj.rollNumber;
    }
}
