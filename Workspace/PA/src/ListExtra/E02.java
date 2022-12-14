package ListExtra;

import java.util.Scanner;

public class E02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        /*este programa testa se a senha inserida e igual a do programa
         * caso seja ele permite o acesso, caso nao seja ele nega o acesso
         */
        System.out.println("Digite a senha para acessar o programa: ");
        int tentativa = input.nextInt();
        int senha = 1234;
        boolean entrou = false;

        while(entrou){
            if(senha == tentativa){
                System.out.println("Acesso permitido! A senha inserida esta correta >:)");
                entrou = true;
            }else{
                System.out.println("Acesso negado!");
                System.out.println("Digite novamente a senha para tentar acessar o programa: ");
                System.out.println("");
                tentativa = input.nextInt();
            }
        }
    }
}
