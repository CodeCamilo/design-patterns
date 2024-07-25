package org.creational.prototype.good;

import java.util.List;

/*
* Lo mejor que podemos hacer es que crear una interfaz prototype que sea la que nos permita clonar la información
* acabo de aprender que puedo utilizar la interfaz como un tipo de dato
* */
public class Main {
    public static void main(String[] args) {
        Student2 studObj = new Student2("Camilo",26,89);

        Student2 cloneStudent = (Student2) studObj.clone();
        Student2 cloneStudent2 = (Student2) studObj.deepClone();

        //Lista de precios iniciales
        PriceList defaultList = new PriceList("Default");
        List<Product> productList =  List.of(new Product("Mouse",7),
                                             new Product("Lapicero",0.50),
                                             new Product("MousePad",40));
        defaultList.setProductList(productList);

        System.out.println("\tValores default\n" + defaultList);


        //Lista de precios VIP
        PriceList vipList = (PriceList) defaultList.clone();
        System.out.println("\tValores vip\n" + vipList);
    }
}
