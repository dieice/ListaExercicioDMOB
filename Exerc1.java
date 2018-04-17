/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerc1;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Exerc1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float num;
        
        Scanner s = new Scanner (System.in);
        System.out.println ("Digite 15 numeros:");
        
        float maior = 0;
        float menor = 999999999;
        
        for(int i=1; i<16; i++ ){
            num  = s.nextFloat();
            if(num>maior){
                maior = num;
            }
            if(num<menor){
                menor = num;
            }
          }
        System.out.println("o maior é: "+maior+" "+ "o menor é :"+menor);
    }
 }
