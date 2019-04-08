/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosrepaso.Arreglos;

import java.util.Scanner;

/**
 *
 * @author tatan
 */
public class Ejercicio82 {

    public void operacion() {
        char[] arreglo;
        char[] arreglo1;
        String cadena = "";
        String cadena1 = "abcdefghijklmnopqrstuvwxyz";
        char caracter = 0;
        int cont = 0;
        System.out.println("Ingrese una frase seguida de un punto");
        Scanner entrada = new Scanner(System.in);
        cadena = entrada.nextLine();
        arreglo1 = cadena1.toCharArray();
        arreglo = cadena.toCharArray();
        for (int i = 0; i < arreglo.length - 1; i++) {
            caracter = arreglo[i];

            for (int j = 0; j < arreglo.length - 1; j++) {
                if (arreglo[j] == caracter) {
                    cont = cont + 1;
                }
            }
            System.out.println("El caracter " + arreglo[i] + " aparece " + cont);
            cont = 0;
        }
        caracter=0;
        for (int i = 0; i < arreglo1.length; i++) {
            
            cont = 0;
            for (int j = 0; j <= arreglo.length-1; j++) {
                if ((arreglo1[i] == arreglo[j])) {
                    cont = cont + 1;
                }
            }
                   
            if (cont==0){
            System.out.println("El caracter " + arreglo1[i] + " no se encuentra");
            }
        }
    }
}
