package ListExtra;

import java.util.Scanner;

public class E40 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double porcasQ, parafusosQ, arruelasQ, porcasP, parafusosP, arruelasP;
        double TotalFinal, porcasT, parafusosT, arruelasT;
        double porcasD, parafusosD, arruelasD;
        //T = total, Q = quantidade, P = preco.

        System.out.println("Digite o preco dos parafusos: \n");
        parafusosP = input.nextDouble();
        System.out.println("Digite o preco das porcas: \n");
        porcasP = input.nextDouble();
        System.out.println("Digite o preco das arruelas: \n");
        arruelasP = input.nextDouble();
    
        System.out.println("Digite a quantidade de parafusos comprados: \n");
        parafusosQ = input.nextDouble();
        System.out.println("Digite a quantidade de porcas compradas: \n");
        porcasQ = input.nextDouble();
        System.out.println("Digite a quantidade de arruelas compradas: \n");
        arruelasQ = input.nextDouble();
    
        
        porcasD = ((porcasP * porcasQ)*10) / 100;
        parafusosD = ((parafusosP * parafusosQ)*20) / 100;
        arruelasD = ((arruelasP * arruelasQ)*30) / 100;

        porcasT = porcasD + (porcasP * porcasQ);
        parafusosT = parafusosD + (parafusosP * parafusosQ);
        arruelasT = arruelasD + (arruelasP * arruelasQ);

        TotalFinal = porcasT + parafusosT + arruelasT;

        System.out.println("Seu pedido final sai com: \n"+porcasQ+" porcas ao preco total de: "+porcasT+"R$ sendo:"+porcasD+"R$ de desconto. \n"+parafusosQ+" parafusos ao preco total de: "+
        parafusosT+"R$ sendo:"+parafusosD+"R$ de desconto. \n"+arruelasQ+" arruelas ao preco total de: "+arruelasT+"R$ sendo:"+arruelasD+"R$ de desconto. \n e com o preço final de:"+TotalFinal);
    }
}
