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
public class Ejercicio10 {
     public void operacion (){
            Scanner entrada  = new Scanner (System.in);
            System.out.println("Ingrese el tiempo ");
            int a= entrada.nextInt(); 
            Scanner entrada2  = new Scanner (System.in);
            System.out.println("Ingrese la distacia ");
            int b= entrada2.nextInt(); 
            float c=a/60;
            float d=b*1000;
            float vel=d/c;
            System.out.println("La velocidad del proyectil es: " + vel);
            
        }
}
