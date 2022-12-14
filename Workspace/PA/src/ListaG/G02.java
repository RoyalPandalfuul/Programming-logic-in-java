package ListaG;

import java.util.Scanner;

public class G02 {
    public static void main(String[] args){
        /*Este programa recebe um codigo de departamento na entrada
         * e devolve o departamento em extenso na saida
         */
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o codigo do departamento para se ter o nome extenso dele: ");
        int num = input.nextInt();

        switch(num){
            case 10:
            System.out.println("Expedicao");
            break;
            case 20:
            System.out.println("Recursos humanos");
            break;
            case 30:
            System.out.println("Logistica");
            break;
            case 40:
            System.out.println("Contabilidade");
            break;
            case 50:
            System.out.println("Departamento pessoal");
            break;
            case 60:
            System.out.println("Informatica");
            break;
            default:
            System.out.println("Digite um codigo de departamento valido!");
        }
    }
}
