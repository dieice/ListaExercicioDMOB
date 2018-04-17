/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerc5;

import java.util.Scanner;

/**
 *
 * @author DIEICE
 */
public class Exerc5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int num;
        int par = 0, impar = 0, soma = 0;
        
        while (soma <=1000){
        Scanner s = new Scanner (System.in);
        num = s.nextInt();
        
        soma = soma + num;
        
        if (num%2==0){
            par = par + num;
           } else impar = impar + num;     
        }
       System.out.println ("A soma dos pares:"+ par);
       System.out.println ("A soma dos impares: "+ impar);
    }        
}
