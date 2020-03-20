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

        int d;
        double cuadrado = 0, raizCuadrada = 0;

        System.out.println("Algoritmo 6");
        System.out.print("Ingrese un número: ");
        d = scanner.nextInt();

        if (d <= 0) {
            System.out.println("Error.");
            System.out.println("Se termina la ejecución.");
        } else {
            cuadrado = Math.pow(d, 2);
            raizCuadrada = Math.sqrt(d);
        }

        System.out.println("Del número: " + d + " su cuadrado es: " + cuadrado + " y su raíz: " + raizCuadrada + ".");

        System.out.println("Algoritmo 7");
        int contadorNinias = 0, contadorNinios = 0, contadorPoblacion = 0;
        double porcentajeNinias, porcentajeNinios;
        boolean ok = true;

        while (ok) {
            contadorPoblacion++;
            try {
                System.out.print("Ingresa '1' si es niño o '2' si es niña: ");
                int genero = scanner.nextInt();

                if (genero == 2) {
                    contadorNinias++;
                } else {
                    contadorNinios++;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.print("¿Continuar la encuesta? \n Presione 1, para seguir; cualquier tecla para detener: ");
            int seguir = scanner.nextInt();
            ok = seguir == 1;
        }

        porcentajeNinias = ((float) contadorNinias / (float) contadorPoblacion) * 100;
        porcentajeNinios = ((float) contadorNinios / (float) contadorPoblacion) * 100;
        System.out.println("Porcentaje niñas: " + porcentajeNinias + "%\nPorcentaje niños: " + porcentajeNinios + "%");

        System.out.println("Algoritmo 8");
        String nombreMes = "";
        double importe = 0.0f, cantidadCobrar = 0.0f;
        System.out.print("Ingrese el nombre del mes: ");
        nombreMes = scanner.next();
        System.out.print("Ingrese el importe: ");
        importe = scanner.nextDouble();

        switch (nombreMes.toLowerCase()) {
            case "octubre":
                cantidadCobrar = importe - (importe * 0.15);
                break;
            default:
                cantidadCobrar = importe * 1;
                break;
        }
        System.out.println("Cobrar: " + cantidadCobrar);
        scanner.close();
    }
}
