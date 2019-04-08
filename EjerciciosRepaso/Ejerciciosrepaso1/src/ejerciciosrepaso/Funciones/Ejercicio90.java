/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosrepaso.Funciones;

import java.util.Scanner;

/**
 *
 * @author tatan
 */
public class Ejercicio90 {
    public void operacion(){
         Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un caracter: ");
        String a = entrada.nextLine();
        if(validar(a)==true){
             System.out.println("El caracter " + a + " es numerico " );
        }else{
        System.out.println("El caracter " + a + " no es numerico " );
        }
    }

    public static boolean validar(String a) {
        boolean c;
      try{
          Integer.parseInt(a);
          c=true;
      }catch(NumberFormatException excepcion){
          c=false;
      }
        return c;
    }
}

