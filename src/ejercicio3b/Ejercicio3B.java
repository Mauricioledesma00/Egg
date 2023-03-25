/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3b;

import java.util.Scanner;

/**
 *
 * @author Ntbk_01
 */
public class Ejercicio3B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String Mauri; 
        double euros;
        int opcion; 
        System.out.println("---------------");
        System.out.println("***MENU***");
        System.out.println("Que tipo de divisa desea saber?");
        System.out.println("1- LIBRAS");
        System.out.println("2- DOLARES");
        System.out.println("3- YENES");
        opcion = leer.nextInt();
        
        System.out.println("Ingrese la cantidad de Euros");
        switch(opcion){
          
            case 1: cambio(leer.nextInt());
            break;
            case 2: cambio1(leer.nextInt());
            break;
            case 3: cambio2(leer.nextInt());
            break;
        }
        

    }

    public static void cambio(double euros) {
        System.out.println("El valor del cambio es: ");
        double libras = 0.86;
        System.out.println(euros + " euros equivale a: " + (libras * euros) + " LIBRAS.");
        
        
    }
    public static void cambio1(double euros){
        double dolares = 1.28611;
        System.out.println("El valor del cambio es: ");
        System.out.println(euros + " euros equivale a: " + (dolares * euros) + " DOLARES.");
    }
    public static void cambio2(double euros){
        double yenes = 129.852;
        System.out.println("El valor del cambio es: ");
        System.out.println(euros + " euros equivale a: " + (yenes * euros) + " YENES.");
    }
}
