/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerc2;

import java.util.Scanner;

/**
 *
 * @author DIEICE
 */
public class Exerc2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
        Scanner s = new Scanner (System.in);
    
        for (int n = 0; n <= 9; n++){           
            for (int y = 1; y <=10; y++){
            System.out.println (n + "x" +y+ "=" +n*y);
                }
         }
     }
  }
    

