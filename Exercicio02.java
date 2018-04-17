/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio02;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Exercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double C;
        double F;
       
        Scanner sc = new Scanner (System.in);
        System.out.println ("Temperatura Centrígados: ");
        C = sc.nextDouble();
        
        System.out.println ("Temperatura Fahrenheit: ");
        F = sc.nextDouble();
        
        F = (9 * C + 160)/ 5;
        System.out.println (" A conversão é: "+ F); 
        
        
    }
}
