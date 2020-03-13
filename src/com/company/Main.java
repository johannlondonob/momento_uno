package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, resultado;
        boolean isProducto = false;

        System.out.println("Algoritmo 5");

        System.out.print("Ingrese la primer cifra: ");
        a = scanner.nextInt();

        System.out.print("Ingrese la segunda cifra: ");
        b = scanner.nextInt();

        System.out.print("Ingrese la tercer cifra: ");
        c = scanner.nextInt();

        if (a < 0) {
            resultado = a * b * c;
            isProducto = true;
        } else {
            resultado = a + b + c;
        }

        if (isProducto) {
            System.out.print("Resultado del algoritmo 5: " + resultado + ". Los valores se multiplicaron.");
        } else {
            System.out.print("Resultado del algoritmo 5: " + resultado + ". Los valores se sumaron.");
        }
    }
}
