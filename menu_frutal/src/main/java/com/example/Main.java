package com.example;

import java.util.Scanner;

public class Main {

    public static int valorFinal = 0; //variable global

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valorFresa = 5000;    //variables locales
        int valorBanano = 2000;
        int valorManzana = 5000;
        int valorMango = 4000;
        int valorPera = 3000;

        System.out.println("Bienvenido a la tienda frutal");
        System.out.println("Recuerda que las compras son de 1 libra por tipo de fruta");

        int opcion;
        do {
            // Mostrar menú de opciones
            System.out.println("Seleccione las frutas que deseas comprar:");
            System.out.println("1. Fresa $5000");
            System.out.println("2. Banano $2000");
            System.out.println("3. Manzana $5000");
            System.out.println("4. Mango $4000");
            System.out.println("5. Pera $3000");
            System.out.println("0. Salir");

            // Leer la opción del usuario
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    calcularValorFinal("fresa", valorFresa);
                    break;
                case 2:
                    calcularValorFinal("banano", valorBanano);
                    break;
                case 3:
                    calcularValorFinal("manzana", valorManzana);
                    break;
                case 4:
                    calcularValorFinal("mango", valorMango);
                    break;
                case 5:
                    calcularValorFinal("pera", valorPera);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 0); //Mientras la opción sea diferente de 0, itera el ciclo
    }

    private static void calcularValorFinal(String nombreFruta, int valorFruta) {
        System.out.println("Agregaste 1 libra de " + nombreFruta);
        valorFinal = valorFinal + valorFruta;
        System.out.println("Valor a pagar: " + valorFinal);
    }

}