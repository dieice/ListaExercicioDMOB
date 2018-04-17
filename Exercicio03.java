/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio03;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Exercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double PI;
        PI=3.14;
        double raio;
        double altura;
        double volume; 
        
        Scanner scan = new Scanner (System.in);
        System.out.println ("Raio: "); 
        raio = scan.nextDouble();
        
        System.out.println ("Altura: ");
        altura = scan.nextDouble();
        
        volume = PI * (raio*raio) * altura;
        System.out.println (" O valor do volume da lata de óleo: "+volume);
    }
}
