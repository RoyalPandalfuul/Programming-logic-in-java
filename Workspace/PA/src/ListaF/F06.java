package ListaF;

import java.util.Scanner;

public class F06 {
    public static void main(String[] args){
        /*Este programa recebe um codigo e um salario como entrada
         * A depender do codigo ele executa um determinado reajuste no salario
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o codigo do reajuste: ");
        float codigo = input.nextFloat();
        System.out.println("Digite o salario do funcionario: ");
        float antigoS = input.nextFloat();

        if(codigo == 1){
            int percentual = 5;
            float reajuste = (antigoS / 100) * percentual;
            float novoS = antigoS + reajuste;
            System.out.println("O salario antigo era: "+antigoS+" agora com o reajuste de: "+reajuste+" ou "+percentual+"% ficara: "+novoS);
            System.out.println("Com a funcao de operador :)");}
        else
        if(codigo == 2){
            int percentual = 10;
            float reajuste = (antigoS / 100) * percentual;
            float novoS = antigoS + reajuste;
            System.out.println("O salario antigo era: "+antigoS+" agora com o reajuste de: "+reajuste+" ou "+percentual+"% ficara: "+novoS);
            System.out.println("Com a funcao de programador :)");}
        else
        if(codigo == 3){
            int percentual = 15;
            float reajuste = (antigoS / 100) * percentual;
            float novoS = antigoS + reajuste;
            System.out.println("O salario antigo era: "+antigoS+" agora com o reajuste de: "+reajuste+" ou "+percentual+"% ficara: "+novoS);
            System.out.println("Com a funcao de analista :)");}
        else
        if(codigo == 4){
            int percentual = 25;
            float reajuste = (antigoS / 100) * percentual;
            float novoS = antigoS + reajuste;
            System.out.println("O salario antigo era: "+antigoS+" agora com o reajuste de: "+reajuste+" ou "+percentual+"% ficara: "+novoS);
            System.out.println("Com a funcao de gerente :)");}
    }
}
