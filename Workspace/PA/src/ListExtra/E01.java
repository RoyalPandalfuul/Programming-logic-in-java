package ListExtra;

import java.util.Scanner;
public class E01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        /*Este programa le o ano de nascimento do usuario
         * e analisa se ele pode ou não votar este ano
         */
        System.out.println("Digite o seu ano de nascimento: ");
        int data = input.nextInt();
        System.out.println("Digite o ano em que voce esta neste momento: ");
        int ano = input.nextInt();

        if (data < 2006){
            System.out.println("Voce tem agora "+(ano-data)+" anos e com essa idade pela lei Brasileira voce ja pode votar! :)");
        }else{
            System.out.println("Ops! Agora voce tem "+(ano-data)+" anos, voce precisa ter ao menos 16 anos para votar no Brasil!");
        }
    }
}
