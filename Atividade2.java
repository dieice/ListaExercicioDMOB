/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade2;

import java.util.Scanner;

/**
 *
 * @author DIEICE
 */
public class Atividade2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float lado1, lado2, lado3;
                      
        Scanner s = new Scanner (System.in);
        System.out.println ("Informe o lado 1: ");
        lado1 = s.nextFloat();
        System.out.println ("Informe o lado 2: ");
        lado2 = s.nextFloat();
        System.out.println ("Informe o lado 3: ");
        lado3 = s.nextFloat();
        
        if (lado1 + lado2 > lado3 || lado2 + lado3 > lado1 || lado3 + lado1 > lado2) {
                             
           if (lado1 == lado2 && lado2 != lado3 || lado2 == lado3 && lado3 != lado1 || lado1 == lado3 && lado3 != lado2){
           System.out.println ("O triangulo é isosceles");
               }else if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
           System.out.println ("O triangulo é escaleno");
               }else if (lado1 == lado2 && lado2 == lado3 && lado1==lado3) {
           System.out.println ("O triangulo é equilatero");
               }
              }
        else {
             System.out.println (" Não é triangulo!");
         }
    
    }
    
}
