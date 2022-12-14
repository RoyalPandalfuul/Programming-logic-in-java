package ListaF;

import java.util.Scanner;

public class F04 {
    public static void main(String[] args){
        /* Este programa le as notas ade um determinado aluno 
         * e informa caso ele tenha sido aprovado com a media sendo maior que 7
         *  caso a media seja menor que 7 ele recebe mais uma nota para 
         * aplicar uma nova media e informar o resultado
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        float nota1 = input.nextFloat();
        System.out.println("Digite a segunda nota: ");
        float nota2 = input.nextFloat();
        System.out.println("Digite a terceira nota: ");
        float nota3 = input.nextFloat();
        System.out.println("Digite a quarta nota: ");
        float nota4 = input.nextFloat();

        float mediaF = (nota1+nota2+nota3+nota4) / 4;

        if(mediaF >= 7){
            System.out.println("Parabens! Este aluno foi aprovado com "+mediaF+"!");}
        else
            System.out.println("Epa este aluno teve: "+mediaF+" Como media, ele nao conseguiu a nota minima de 7.");
            System.out.println("");
            System.out.println("Digite uma nova nota para ajudar na media desse aluno: ");
            System.out.println("");
            float nota5 = input.nextFloat();
            mediaF = (nota1+nota2+nota3+nota4+nota5) / 5;

        if(mediaF >=7)
            System.out.println("Parabens! Este aluno foi aprovado com o reforco e sua media sendo "+mediaF+"!");
        else
            System.out.println("Este aluno nao foi aprovado com o reforco e sua media sendo: " + mediaF + " E a minima sendo 7.");
    }
}
