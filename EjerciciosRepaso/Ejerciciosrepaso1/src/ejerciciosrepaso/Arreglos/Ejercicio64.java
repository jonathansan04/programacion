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
public class Ejercicio64 {

    public void operacion() {
        int i, j,num = 0,j1=0,i1 = 0;
        int matriz[][] = {{32, 56, 50}, {49, 99, 12}, {78, 57, 89}};
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " - ");
            }
            System.out.println("");
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
               
                if (num < matriz[i][j]) {
                  i1=i;
                  j1=j;
                  num=matriz[i][j];
                }
            }
        }
        System.out.println("La posicion de la matriz es: " + i1 + "," + j1);
    }
}
