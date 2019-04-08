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
public class Ejercicio88 {

    public void operacion() {
        int p;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero a elevar: ");
        int a = entrada.nextInt();
        System.out.println("Ingrese la potencia: ");
        Scanner entrada2 = new Scanner(System.in);
        int b = entrada2.nextInt();
        p = potencia(a, b);
        System.out.println("La potencia del numero" + a + " es: " + p);
    }

    public static int potencia(int a, int b) {
        int i, c = 1;
        for (i = 0; i < b; i++) {
            c = c * a;
        }
        return c;
    }
}
