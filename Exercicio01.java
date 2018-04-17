/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio01;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero1;
        int numero2;
        int soma;
        int diferenca;
        int produto;
        double média;
       
        Scanner s = new Scanner(System.in);
        System.out.println("Entre com primeiro número: ");
        numero1 = s.nextInt();
        
        System.out.println ("Entre com segundo número: ");
        numero2 = s.nextInt();
        
        soma = numero1 + numero2;
        System.out.println ("A soma é: " + soma);
        
        diferenca = numero1 - numero2;
        System.out.println ("A diferença é: " + diferenca);
        
        produto = numero1 * numero2;
        System.out.println ("O produto é: " + produto);
        
        média = (numero1+numero2)/2;
        System.out.println ("A média é: "+ média);
        
    }
}
