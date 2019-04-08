/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosrepaso.Ciclos;

import java.util.Scanner;

/**
 *
 * @author tatan
 */
public class Ejercicio52 {

    public void operacion() {
        Scanner entrada = new Scanner(System.in);
        int b,a = 10;
        int i, suma = 0;
        for (i = 0; i < a; i++) {
            System.out.println("Ingrese 10 numeros");
             b = entrada.nextInt();
            if (b < 0) {
                suma = suma + b;
               
            }
        }
                
         System.out.println("La suma de los negativos es: " + suma);
    }
}
