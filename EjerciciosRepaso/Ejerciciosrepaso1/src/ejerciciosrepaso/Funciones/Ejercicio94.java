/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosrepaso.Funciones;

import java.util.Scanner;

/**
 *
 * @author tatan
 */
public class Ejercicio94 {

    public void operacion() {
        int d;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un  numero del 1-12 : ");
        int a = entrada.nextInt();
        d = dia(a);
        System.out.println("El mes tiene " + d + " dias.");
    }

    public static int dia(int a) {
        int c = 1;
        switch (a) {
            case 1:
                c = 31;
                break;
            case 2:
                c = 28;
                break;
            case 3:
                c = 31;
                break;
            case 4:
                c = 30;
                break;
            case 5:
                c = 31;
                break;
            case 6:
                c = 30;
                break;
            case 7:
                c = 31;
                break;
            case 8:
                c = 31;
                break;
            case 9:
                c = 30;
                break;
            case 10:
                c = 31;
                break;
            case 11:
                c = 30;
                break;
            case 12:
                c = 31;
                break;

        }

        return c;
    }
}
