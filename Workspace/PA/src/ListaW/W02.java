package ListaW;

import java.util.Scanner;

public class W02 {
    // este programa vai ler a altura e o sexo de 15 pessoas e ira dizer qual o peso idal para cada.
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int pessoa = 1;

        while(pessoa != 16){
            System.out.println("Agora vamos para a "+pessoa+"º pessoa! \n");
            System.out.println("Vamos ver a altura da "+pessoa+"º pessoa, primeiro escolha o genero dela! \n");
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

            System.out.println("para a altura de "+altura+" o peso ideal e "+saida+"KG \n");
            pessoa = pessoa + 1;
        }
    }
}
