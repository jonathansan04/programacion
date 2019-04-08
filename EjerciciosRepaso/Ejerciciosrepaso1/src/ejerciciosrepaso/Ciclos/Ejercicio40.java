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
public class Ejercicio40 {

    public void operacion() {
        Scanner entrada = new Scanner(System.in);
      String a="";
       
        do{
            System.out.println("Desea continuar s/n");
              a = entrada.nextLine();
        }while (!"n".equals(a));
    }
}
