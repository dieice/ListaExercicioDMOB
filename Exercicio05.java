/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio05;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Exercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num;
        int resultado;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println ("digite um número: ");
        num = sc.nextInt();
        
        resultado = num * num;
        System.out.println ("O quadrado deste número é: "+resultado);
    }
}
