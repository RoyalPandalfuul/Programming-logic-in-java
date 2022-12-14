package ListExtra;

import java.util.Scanner;

public class E03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        /*Este programa le uma quantidade de macas a se comprar e dependendo da quantidade
         * aplica um pequeno desconto ou nao, e depois apresenta os precos como resultado
         */
        System.out.println("Digite a quantitade de macas que deseja comprar: ");
        int compradas = input.nextInt();
        
        if(compradas < 12){
            double preco = 0.30;
            double total = (preco * compradas);
            System.out.println("Voce comprara "+compradas+" macas");
            System.out.println("por R$0,30 cada, pagando "+total+" no total :}");
        }else{
            double preco = 0.25;
            double total = (preco * compradas);
            System.out.println("Voce comprara "+compradas+" macas");
            System.out.println("por R$0,25 cada, pagando "+total+" no total :}");
        }
    }
}
