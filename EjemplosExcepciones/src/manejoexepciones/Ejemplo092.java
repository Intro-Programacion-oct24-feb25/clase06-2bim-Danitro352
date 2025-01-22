/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoexepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo092 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        String cadena = "";
       while(bandera){
        try {
            System.out.println("Ingrese el nombre de un pais ");
            String valor1 = entrada.nextLine();
            
            char vocal = valor1.toLowerCase().charAt(0);
            String letra = String.valueOf(vocal);
            if (valor1.equals ("a")|| valor1.equals ("e")||valor1.equals ("i")
                    ||valor1.equals ("o")||valor1.equals ("u")){
               throw new Exception("Ingrese un pais con consonante");
               
           
            
               
        }
            cadena = cadena + valor1;
            bandera = false;
       
        } catch (ArithmeticException e) {
            System.out.printf("(ArithmeticException) Ocurrió una "
                    + "excepción %s\n", e);
        } catch (InputMismatchException e) {
            System.out.printf("(InputMismatchException) Ocurrió una "
                    + "excepción %s\n", e);
        } catch (Exception e) {
            System.out.printf("Ocurrió una excepción %s\n", e);
        }
        }
       System.out.println(cadena);
    }
}
