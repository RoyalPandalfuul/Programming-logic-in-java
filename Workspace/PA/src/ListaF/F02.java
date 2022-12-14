package ListaF;

import java.util.Scanner;

public class F02 {

    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        /*Este programa pega a idade dos jogadores
         * e devolve a sua classificacao
        */

        System.out.println("Digite a sua idade: ");
        System.out.println("");
        num = input.nextInt();
        System.out.println("");
        
        if (num >= 6){
            if (num <= 8)
                System.out.println("Este jogador e Dente-de-Leite");}
        
         if (num >= 9){
            if (num <= 11)
                System.out.println("Este jogador e Pre-Mirim");}
        
        if (num >= 12){
            if (num <= 13)
                System.out.println("Este jogador e Mirim");}
        
         if (num >= 14){
            if (num <= 15)
                System.out.println("Este jogador e Infantil");}
        
         if (num >= 16){
            if (num <= 17)
                System.out.println("Este jogador e Juvenil");}
        
         if (num >= 18){
            if (num <= 20)
                System.out.println("Este jogador e Junior");}
        
        else if (num < 6)
            System.out.println("Este jogador nao tem a idade minima para jogar.");
    }
}
