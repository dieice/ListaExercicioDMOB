/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerc8;

import java.util.Scanner;

/**
 *
 * @author DIEICE
 */
public class Exerc8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int n;
    
    Scanner s = new Scanner (System.in);
    System.out.println("Digite um n: ");
    n = s.nextInt();
    
    for (int i =0; i<n; i++){
        if(i%2==0){
            System.out.println("Numeros pares " + i);
        }
    }
    for (int j =0; j<n; j++){
        if (j%2!=0){
            System.out.println ("Numeros impares " + j);
        }
    }    
    }
   
}
