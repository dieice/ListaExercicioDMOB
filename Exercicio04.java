/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio04;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Exercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        // TODO code application logic here
        
        int A;
        int B;
        int X;
        
        Scanner s = new Scanner (System.in);
        System.out.println ("Variável A: ");
        A = s.nextInt (); 
        
        System.out.println ("Varialvel B: ");
        B = s.nextInt();
        
        X=A;
        A=B;
        B=X;
        
        System.out.println ("Valor trocado de A: "+ A);
        System.out.println ("Valor trocado de B: "+ B);
                
        
                
                
        
       
    }
}
