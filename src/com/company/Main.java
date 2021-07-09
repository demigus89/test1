package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.print("Выведи число, которое будет делится на 3 без остатка");
        /*если чичло 9,тогда метод возвращать  true;
        если чичло 25,тогда метод возвращать  false;
        если чичло 102,тогда метод возвращать  true;*/

        myMethod (9);
        myMethod (25);
        myMethod (102);

    }

    public static void myMethod(int a) {
        int b = 3;
        int d = a % b;
        if (d == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
