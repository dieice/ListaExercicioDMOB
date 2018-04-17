/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade05;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Atividade05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int N1, N2, N3;
        
        System.out.println ("Escolha uma opção:");
        
        System.out.println ("1 - média");
        System.out.println ("2 - soma");
        System.out.println ("3 - multiplicação");
        System.out.println ("Digite a opcao desejada: ");
        
        Scanner s = new Scanner(System.in);
        
        int opcao = s.nextInt();
        
        switch (opcao) {
            case 1:
                System.out.println("Digite 3 números: ");
                N1 = s.nextInt();
                N2 = s.nextInt();
                N3 = s.nextInt(); 
                float media = (N1+N2+N3)/3;
                System.out.println(media);
                break;
            case 2:
                System.out.println("Digite 3 números: ");
                N1 = s.nextInt();
                N2 = s.nextInt();
                N3 = s.nextInt();
                int soma = (N1+N2+N3);
                System.out.println (soma);
                break;
                
            case 3:
                System.out.println("Digite 3 números: ");
                N1 = s.nextInt();
                N2 = s.nextInt();
                N3 = s.nextInt();
                int multiplicação = (N1*N2*N3);
                System.out.println (multiplicação);
                break;
                
            default:
                System.out.println("Opção incorreta!!");
                
                                               
                }
    } 
}
