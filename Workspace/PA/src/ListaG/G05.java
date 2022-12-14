package ListaG;

import java.util.Scanner;

public class G05 {
    public static void main(String[] args){
        /*Este programa le a idade de uma crianca e
         * devolve sua categoria no time de futebol
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a idade do jogador para exibir sua classificacao: ");
        int idade = input.nextInt();

        switch(idade){
            case 6:
            System.out.println("Dente de leite");
            break;
            case 7:
            System.out.println("Dente de leite");
            break;
            case 8:
            System.out.println("Dente de leite");
            break;
            case 9:
            System.out.println("Pre-mirim");
            break;
            case 10:
            System.out.println("Pre-mirim");
            break;
            case 11:
            System.out.println("Pre-mirim");
            break;
            case 12:
            System.out.println("Mirim");
            break;
            case 13:
            System.out.println("Mirim");
            break;
            case 14:
            System.out.println("Infantil");
            break;
            case 15:
            System.out.println("Infantil");
            break;
            case 16:
            System.out.println("Juvenil");
            break;
            case 17:
            System.out.println("Juvenil");
            break;
            case 18:
            System.out.println("Juniores");
            break;
            case 19:
            System.out.println("Juniores");
            break;
            case 20:
            System.out.println("Juniores");
            break;
            default:
            System.out.println("Esta idade nao esta na tabela.");}
    }
}
