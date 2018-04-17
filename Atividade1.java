/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade1;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Atividade1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num;
        
        Scanner s = new Scanner (System.in);
        
        System.out.println ("Digite o número: ");
        num = s.nextInt();
        
        if (num%2==0) {
            System.out.println ("o número é par");
                      }
        else {
        System.out.println ("o número é impar");
             }
    
        if (num >0 ) {
            System.out.println ("positivo");
                     }
        else {
            System.out.println ("negativo");
             }
    }
}
