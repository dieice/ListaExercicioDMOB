/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade04;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Atividade04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic here
        
        int valor[] = new int[3];
        char codigo;
        Scanner s = new Scanner (System.in);
        
        System.out.println("Digite o valor 1: ");
        valor[0] = s.nextInt ();
        System.out.println ("Digite o valor 2: ");
        valor[1] = s.nextInt();
        System.out.println("Digite o valor 3: ");
        valor[2] = s.nextInt();
        
        s = new Scanner (System.in);
        System.out.println ("Digite c para CRESCENTE ou d para DECRESCENTE");
        codigo = s.next().charAt(0);
        
        Arrays.sort(valor);
        if(codigo == 'c'){
        System.out.println(Arrays.toString(valor));
        }else if(codigo == 'd'){
            System.out.println(valor[2] + ", " + valor[1] + ", " + valor[0]);
        }else{
            System.out.println("Letra Invalida!");
        }
             
}
}