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
public class Ejercicio70 {

    public void operacion() {
        int i, j;
        int matriz[][] = {{2, 9, 11, 0}, {1, 12, 4, 0}, {21, 17, 8, 0}, {2, 39, 5, 0}, {0, 0, 0, 0}};
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " - ");
            }
            System.out.println("");
        }
        for (i = 0; i < 4; i++) {
            int sumaf = 0;
            for (j = 0; j < 3; j++) {
                sumaf = sumaf + matriz[i][j];
            }
            matriz[i][j] = sumaf;
        }
        for (j = 0; j < 3; j++) {
            int sumac = 0;
            for (i = 0; i < 4; i++) {
                sumac = sumac + matriz[i][j];
            }
            matriz[i][j] = sumac;
        }
        int sumae = 0;
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 4; j++) {
                sumae = sumae + matriz[i][j];
            }
        }
        matriz[i - 1][j - 1] = sumae;
        System.out.println("SUMAF" + sumae + " i" + i + "j" + j);
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " - ");
            }
            System.out.println("");
        }
    }
}
