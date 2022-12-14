package ListExtra;

import java.util.Scanner;
public class E04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        /*Este programa calcula a altura ideal 
        * com condicoes diferentes para homens e mulheres
        */
        System.out.println("Ola! Este programa vai calcular seu peso ideal");
        System.out.println("Digite '1' para o sexo masculino");
        System.out.println("Digite '2' para o sexo feminino");
        System.out.println("");
        int genero = input.nextInt();
        
        System.out.println("Agora digite a sua altura: ");
        double altura = input.nextDouble();
        double saida;

        if (genero == 1){
            saida = ((72.7 * altura) - 58);
        }else{
            saida = ((62.1 * altura) - 44.7);
        }

        System.out.println("para a altura de "+altura+" o peso ideal e "+saida+"KG");
    }
}
