/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosrepaso.EjerciciosSimples;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Ejercicio28 {
     public void operacion (){
            Scanner entrada  = new Scanner (System.in);
            System.out.println("Ingrese un numero ");
            int a= entrada.nextInt(); 
            switch(a){
                case 1:
                 System.out.println("Lunes ");
                break;    
                 case 2:
                 System.out.println("Martes ");
                break; 
                 case 3:
                 System.out.println("Miercoles ");
                break; 
                 case 4:
                 System.out.println("Jueves ");
                break; 
                 case 5:
                 System.out.println("Viernes ");
                break; 
                 case 6:
                 System.out.println("Sabado ");
                break; 
                 case 7:
                 System.out.println("Domingo ");
                break; 
            }
     }     
}
