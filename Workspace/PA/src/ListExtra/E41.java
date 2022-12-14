package ListExtra;

import java.util.Scanner;

public class E41 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double TotalS, cars, anualS, minimoS, comm, vendas, porcen; //salario total, quantidade de carros,
        // salario minimo no ano, salario minimo recebido, comissão, vendas lucradas pelos carros e porcentagem.

        System.out.println("Digite o valor do salario minimo: \n");
        anualS = input.nextDouble();
        System.out.println("\n Digite a quantidade de carros vendidos: \n");
        cars = input.nextDouble();

        minimoS = anualS * 2;
        vendas = cars * 50;
        porcen = (vendas/100) * 5;
        comm = vendas + porcen;
        TotalS = comm + minimoS;

        System.out.println("O seu salário atual é: "+TotalS+" sendo "+minimoS+" de salario padrao");
        System.out.println(comm+" De lucro pelas vendas dos "+cars+" carros sendo "+vendas+"R$ pelos carros");
        System.out.println("E "+porcen+" de 5% de bonus");
    }
}
