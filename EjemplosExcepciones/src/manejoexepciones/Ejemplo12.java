/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoexepciones;

import java.util.IllegalFormatConversionException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Ejemplo12 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese cuantas operaciones quiere realizar");
        int valor = entrada.nextInt();
        int[] resultados = new int[valor];
        int i = 0;
        int resultado = 0;
        while (i < resultados.length) {
            try {
                System.out.println("Ingrese valor 1:");
                int valor1 = entrada.nextInt(); 
                System.out.println("Ingrese valor 2:");
                int valor2 = entrada.nextInt(); 
                resultado = valor1 / valor2;
                resultados[i] = resultado;
                i = i + 1;

            } catch (InputMismatchException inputMismatchException) {

                System.out.printf("Existe un error de tipo %s\n",
                        inputMismatchException);
            } catch (ArithmeticException arithmeticException) {

                System.out.println("Lo sentimos hay un error");
                System.out.printf("De tipo %s\n", arithmeticException);

            } catch (IllegalFormatConversionException a) {
                System.out.println("Lo sentimos hay un error");
                System.out.printf("De tipo %s\n", a);
            }

        }
       

        }
    }

/*Realizar un proceso repetitivo que permita realizar la división de 
        números ingresados por teclado; el resultado de cada división debe ir 
        almacenandose en cada posición del arreglo. Considerar las excepciones
        posibles*/
