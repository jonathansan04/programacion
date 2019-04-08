/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosrepaso1;

import ejerciciosrepaso.Condicionales.*;
import ejerciciosrepaso.Ciclos.*;
import ejerciciosrepaso.Arreglos.*;
import ejerciciosrepaso.Funciones.*;
import ejerciciosrepaso.Simples.*;
import java.util.Scanner;

/**
 *
 * @author tatan
 */
public class Ejerciciosrepaso1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el ejercicio que desea abrir ");
        int a = entrada.nextInt();
        switch (a) {
            case 4:
        System.out.println("Operacion dos numeros: ");
        Ejercicio04 ej04 = new Ejercicio04();
        ej04.operacion();
        break;
            case 10:
        System.out.println("Velocidad de un proyectil: ");
        Ejercicio10 ej10 = new Ejercicio10();
        ej10.operacion();
        break;
            case 16:
        System.out.println("Hipotenusa de un triangulo: ");
        Ejercicio16 ej16 = new Ejercicio16();
        ej16.operacion();
        break;
            case 22:
        System.out.println("Division y residuo: ");
        Ejercicio22 ej22 = new Ejercicio22();
        ej22.operacion();
         break;
            case 28:
        System.out.println("Dia de la semana: ");
        Ejercicio28 ej28 = new Ejercicio28();
        ej28.operacion();
         break;
            case 34:
        System.out.println("Numeros 1-10 do/while: ");
        Ejercicio34 ej34 = new Ejercicio34();
        ej34.operacion();
         break;
          case 40:
        System.out.println("Desea continuar: ");
        Ejercicio40 ej40 = new Ejercicio40();
        ej40.operacion();
         break;
            case 46:
        System.out.println("Media de n numeros");
        Ejercicio46 ej46 = new Ejercicio46();
        ej46.operacion();
         break;
            case 52:
        System.out.println("Suma negativos");
        Ejercicio52 ej52 = new Ejercicio52();
        ej52.operacion();
         break;
            case 58:
        System.out.println("20 numeros pares");
        Ejercicio58 ej58 = new Ejercicio58();
        ej58.operacion();
         break;
            case 64:
        System.out.println("Numero mayor matriz");
        Ejercicio64 ej64 = new Ejercicio64();
        ej64.operacion();
         break;
            case 70:
        System.out.println("Suma matriz");
        Ejercicio70 ej70 = new Ejercicio70();
        ej70.operacion();
         break;
           case 72:
        System.out.println("Matriz primos");
        Ejercicio72 ej72 = new Ejercicio72();
        ej72.operacion();
         break;
          case 76:
        System.out.println("Cadena de caracteres, borrar espacios");
        Ejercicio76 ej76 = new Ejercicio76();
        ej76.operacion();
         break;
          case 78:
        System.out.println("Cadena de caracteres, borrar espacios");
        Ejercicio78 ej78 = new Ejercicio78();
        ej78.operacion();
         break;
          case 82:
        System.out.println("Cadena de caracteres, borrar espacios");
        Ejercicio82 ej82 = new Ejercicio82();
        ej82.operacion();
         break;
            case 88:
        System.out.println("Funcion potencia");
        Ejercicio88 ej88 = new Ejercicio88();
        ej88.operacion();
         break;
          case 90:
        System.out.println("Funcion validar caracter");
        Ejercicio90 ej90 = new Ejercicio90();
        ej90.operacion();
         break;
            case 94:
        System.out.println("Cantidad dias");
        Ejercicio94 ej94 = new Ejercicio94();
        ej94.operacion();
        }
        // TODO code application logic here
    }

}
