/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerc9;

import java.util.Scanner;

/**
 *
 * @author DIEICE
 */
public class Exerc9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, numDivisor = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("Digite um n: ");
        n = s.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n%i == 0) 
                numDivisor++;
            }
            if (numDivisor == 2) {
                System.out.println("O numero é primo");
            }
            else {
                System.out.println("O numero não � primo");
            }
        }
    }

