package exerc7;

import java.util.Scanner;

/**
 *
 * @author DIEICE
 */
public class Exerc7 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int alunos = 0;
        float maiorMedia = 0, menorMedia = 9999, media = 0, mediaFinal = 0;
        
        Scanner s = new Scanner (System.in);
        for (int i = 1; i>0; i++){
            System.out.println("Digite a media: ");
            media = s.nextFloat ();
            
            alunos = alunos + 1;
            mediaFinal = mediaFinal + media;
            
            if (media > maiorMedia){
                maiorMedia = media;
            }
            if (media < menorMedia){
                menorMedia = media;
            }
            if (media < 0){
                i = -1;
            }
        }
        mediaFinal = mediaFinal / alunos;
        
        System.out.println("A media final é: " + mediaFinal);
        System.out.println("A maior media é: " + maiorMedia);
        System.out.println("A menor media é: " + menorMedia);
    }
    
}
