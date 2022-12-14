package ListaF;

import java.util.Scanner;

public class F03 {
    public static void main(String[] args) {
        /* Este programa le as notas ade um aluno 
         * e informa caso ele tenha sido aprovado com a media sendo 5
         */
        Scanner input = new Scanner(System.in);        
        float nota1, nota2, nota3, nota4, mediaF;

        System.out.println("Digite a primeira nota: ");
        nota1 = input.nextFloat();
        System.out.println("Digite a segunda nota: ");
        nota2 = input.nextFloat();
        System.out.println("Digite a terceira nota: ");
        nota3 = input.nextFloat();
        System.out.println("Digite a quarta nota: ");
        nota4 = input.nextFloat();
        
        mediaF = (nota1 + nota2 + nota3 + nota4) / 4;
        
        if(mediaF >= 5){
            System.out.println("Parabens! Este aluno foi aprovado com "+mediaF+"!");}
        else
            System.out.println("Epa este aluno teve: "+mediaF+" Como media, ele nao conseguiu a nota minima de 5.");
    }    
}
