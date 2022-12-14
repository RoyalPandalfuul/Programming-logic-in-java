package ListaW;

import java.util.Scanner;

public class W03 {
    public static void main(String[] args){
        // Este programa testa se sua entrada é igual a senha, caso seja ele permite o acesso.
        // Casso contrario ele encerra o programa com acesso negado.
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a senha para acessar o programa: ");
        String entrada = input.next();
        String senha = "asdfg";
        int tentativas = 3;

        while(tentativas > 1){
            if(senha == entrada){
                System.out.println("Acesso permitido! A senha inserida esta correta >:)");
                tentativas = -5;
            }else{
                tentativas = tentativas -1;
                System.out.println("Acesso negado!");
                System.out.println("Te restam "+tentativas+" tentativas, cuidado com oq digita! ");
                System.out.println("Digite novamente a senha para tentar acessar o programa: \n");
                entrada = input.next();
            }
        }
        if(tentativas != -5){
            System.out.println("Ops! voce ficou sem tentativas e o programa vai se encerrar agora ;)");
        }
    }
}
