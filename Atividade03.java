/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade03;

import java.util.Scanner;

/**
 *
 * @author DIEICE
 */
public class Atividade03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float N1, N2, N3;
                
        Scanner sc = new Scanner (System.in);
        System.out.println ("Insira a nota 1: ");
        N1 = sc.nextFloat();
        System.out.println( "Insira a nota 2: ");
        N2 = sc.nextFloat();
        System.out.println(" Insira a nota 3: ");
        N3 = sc.nextFloat();
        
        if (N1>N2 && N1>N3) {
            System.out.println ("A maior nota é: " + N1);
        }else if (N2>N3 && N2>N1) {
            System.out.println ("A maior nota é: " + N2);
        }else if (N3>N1 && N3>N2) {
            System.out.println ("A maior nota é: " + N3);
        }
        
        System.out.println ("A média é:  " + ((N1+N2+N3)/3));
}
}