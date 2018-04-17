/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerc06;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author DIEICE
 */
public class Exerc06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float v1, v2, v3, soma, produto, media;

        do {
            System.out.println("Digite um conjunto com 3 valores: ");
            Scanner s = new Scanner(System.in);
            v1 = s.nextInt();
            v2 = s.nextInt();
            v3 = s.nextInt();

            soma = v1 + v2 + v3;
            produto = v1 * v2 * v3;
            media = (v1 + v2 + v3) / 3;

        } while (v1 > v2 && v2 > v3 && v1 > v3);

        System.out.println("A soma: " + soma);
        System.out.println("O produto: " + produto);
        System.out.println("A media: " + media);
    }
}

