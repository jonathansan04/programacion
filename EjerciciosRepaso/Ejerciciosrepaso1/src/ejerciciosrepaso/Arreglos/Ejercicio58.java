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
public class Ejercicio58 {

    public void operacion() {
        int arr[] = new int[40];
        int i,j, k = 0;
        for (j = 0 ,i = 1; i <= 40; i++,j++) {
            if (i % 2 == 0) {
                k = k + i;
                arr[j] = i;
                System.out.println(arr[j] + "-");
            }
             
        }
        System.out.println("La suma es: " + k);
    }
}
