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
public class Ejercicio76 {
     public void operacion() {
         
        int i;
         System.out.println("Ingrese una cadena de caracteres");
         Scanner entrada = new Scanner(System.in);
         String a = entrada.nextLine();
         
         String b[]= a.split(" ");
         
         for(i=0;i<b.length;i++){
             System.out.println("cadena transformada: " + b[i]);
         }
             
         System.out.println("Cadena original: " + a);
         
     }
}
