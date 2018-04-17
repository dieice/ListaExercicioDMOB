/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerc3;
/**
 *
 * @author DIEICE
 */
public class Exerc3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num = 1;
        double soma = 0;
        for (int i = 1; i <=99; i=i+2){
            System.out.println (i + "/" + num);
            soma = soma + (i/num);
            num++;
        }
        System.out.println ("A soma é: " +soma); 
    }
        
}
  