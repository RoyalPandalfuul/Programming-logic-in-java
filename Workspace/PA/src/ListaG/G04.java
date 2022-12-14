package ListaG;

import java.util.Scanner;

public class G04 {
        public static void main(String[] args){
        /*Este programa recebe um codigo de percentual como entrada
        * e executa um reajuste de salario de acordo com o percentual do codigo
        * alem de mostrar a funcao do funcionario 
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o codigo do percentual para executar o reajuste: ");
        int num = input.nextInt();

        System.out.println("Digite o salario a ser alterado");
        float antigoS = input.nextFloat();

        int percentual = 0;
        String funcao = "";

        switch(num){
            case 1:
            percentual = 5;
            funcao = "Operador";
            break;
            case 2:
            percentual = 10;
            funcao = "Programador";
            break;
            case 3:
            percentual = 15;
            funcao = "Analista";
            break;
            case 4:
            percentual = 25;
            funcao = "Gerente";
            break;
            default:
            System.out.println("Digite um codigo valido!");}

            float reajuste = (antigoS / 100) * percentual;
            float novoS = antigoS + reajuste;
            System.out.println("O salario antigo era: "+antigoS+" agora com o reajuste de: "+reajuste+" ou "+percentual+"% ficara: "+novoS+" Com a funcao de "+funcao); 

    }
}
