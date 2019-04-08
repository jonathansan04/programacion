/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosrepaso.Simples;
import static java.lang.Math.sqrt;
import java.util.Scanner;
/**
 *
 * @author tatan
 */
public class Ejercicio16 {
          public void operacion (){
            Scanner entrada  = new Scanner (System.in);
            System.out.println("Ingrese la distancia del primer cateto ");
            int a= entrada.nextInt(); 
            Scanner entrada2  = new Scanner (System.in);
            System.out.println("Ingrese la distancia del segundop cateto ");
            int b= entrada2.nextInt(); 
            int c= (int)sqrt((a*a)+(b*b));
            System.out.println("La hipotenusa del triangulo es: " + c);
      }
}
