/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosrepaso.Simples;
import java.util.Scanner;
/**
 *
 * @author tatan
 */
public class Ejercicio22 {
         public void operacion (){
            Scanner entrada  = new Scanner (System.in);
            System.out.println("Ingrese un numero ");
            int a= entrada.nextInt(); 
            Scanner entrada2  = new Scanner (System.in);
            System.out.println("Ingrese un numero ");
            int b= entrada2.nextInt(); 
            int c=a/b;
            int d=a%b;
             System.out.println("El resultado es: "+ c + " el residuo es " + d);
     }
}
