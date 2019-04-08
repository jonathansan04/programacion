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
public class Ejercicio46 {
   public void operacion(){
       Scanner entrada = new  Scanner (System.in);
       System.out.println("Ingrese la cantidad de numeros que desea ingresar: ");
       int a = entrada.nextInt();
       int i,suma=0;
       for (i=0;i<a;i++){
               System.out.println("Ingrese un numero");
               int b = entrada.nextInt();
               suma=suma+b;
   }
       float c=suma/a;
       System.out.println("La media de los numeros es: " + c);
       
   }

}
