package ListaF;

import java.util.Scanner;

public class F01 {

	public static void main(String[] args) {
        
        int num ;
        Scanner input = new Scanner(System.in) ;
        /* Este programa testa recebe um codigo como entrada
         * checa o departamento em que o codigo pertence
         *  e mostra o resultado na saida 
         */ 
        System.out.println("Digite o seu código: ");
        num = input.nextInt();
        System.out.println("");

        if(num == 10)
            System.out.println("Seu departamento e contabilidade.");
        else

        if(num == 12)
            System.out.println("Seu departamento e Almoxarifado.");
        else

        if(num == 14)
            System.out.println("Seu deparmaneto e Informatica.");
        else
            System.out.println("Este codigo nao esta na empresa.");
    }
}