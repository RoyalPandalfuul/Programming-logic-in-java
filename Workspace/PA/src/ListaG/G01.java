package ListaG;

import java.util.Scanner;

public class G01{
    public static void main(String[] args){
        /*este programa recebe um codigo de erro
         * e retorna uma mensagem referente ao erro ocorrido
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o codigo do erro para receber a mensagem dele: ");
        int num = input.nextInt();

        switch(num){
            case 1:
            System.out.println("Identificador invalido");
            break;
            case 2:
            System.out.println("Esperando numero inteiro");
            break;
            case 3:
            System.out.println("Tipo de dado indefinido");
            break;
            case 4:
            System.out.println("Parametro incorreto");
            break;
            case 5:
            System.out.println("Memoria insuficiente");
            break;
            default:
            System.out.println("Digite um codigo de erro valido!");
        }
    }
}