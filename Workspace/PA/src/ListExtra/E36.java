package ListExtra;

import java.util.Scanner;
public class E36{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double comm, VendasV, porcen, corretores = 3, VendasT = 0;
        String name;

        while (corretores != 0){
            System.out.println("Digite o nome do corretor atual: \n");
            name = input.next();
            System.out.println("Digite o valor das vendas deste corretor: \n");
            VendasV = input.nextDouble();

            if (VendasV > 50000){
                porcen = 12;
                comm = (porcen/100) * VendasV;
            }else{
                if ((VendasV > 30000) && (VendasV < 50000)){
                    porcen = 9.5;
                    comm = (porcen/100) * VendasV;
                }else{
                    porcen = 7;
                    comm = (porcen/100) * VendasV;
                }
            }
            System.out.println("\n"+name+" Sua venda total foi de: "+VendasV);
            System.out.println("Com uma comissao de: "+comm+" a uma porcentagem de: "+porcen+"% \n");
            corretores = corretores - 1;
            VendasT = VendasT + VendasV;
        }
        System.out.println("Este foi o relatório de vendas de cada corretor \n");
        System.out.println("O total de vendas da empresa foi: "+VendasT);
    }
}