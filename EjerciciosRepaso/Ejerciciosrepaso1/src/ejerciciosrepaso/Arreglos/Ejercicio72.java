/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosrepaso.Arreglos;

/**
 *
 * @author tatan
 */
public class Ejercicio72 {

    public void operacion() {
        int cont = 0;
        int j, r;
        int arr[] = new int[50];
        int i;
        arr[cont] = 1;
        arr[cont + 1] = 2;
        cont = cont + 2;
        for (j = 3; j <= 100; j++) {
            int a = 0;
            for (i = 1; i <= j; i++) {
                r = j % i;
                if (r == 0) {
                    a++;
                }

            }
            if (a == 2) {
                arr[cont] = j;
                cont = cont + 1;
                //System.out.println("I" + i);
            }
        }
        for (i = 0; i < arr.length; i++) {
            // arr[cont1]=cont1;
            System.out.println("La matriz con numeros primos es: " + arr[i]);
        }
    }
}
