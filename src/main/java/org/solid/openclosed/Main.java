package org.solid.openclosed;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int result = calculator.calculateNumber(10,5, new SubstractOperation());
        int result2 = calculator.calculateNumber(10,5, new AddOperation());
        System.out.println(result);
        System.out.println(result2);
    }
}
