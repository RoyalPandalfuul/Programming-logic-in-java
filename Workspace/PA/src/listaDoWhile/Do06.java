package listaDoWhile;

import javax.swing.JOptionPane;

public class Do06 {
    public static void main(String[] args) {
        //Este programa faz uma lista com pedidos com diversos lanches
        int p1 = 0,p2 = 0,p3 = 0,p4 = 0,p5 = 0,desejo,n = 0,pedido;
        String saida =" ";

        JOptionPane.showMessageDialog(null, "Ola! Este programa vai anotar seu pedido de fast food");
        desejo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de itens que deseja em seu pedido \n (ainda vai poder adicionair mais caso queira)"));
        saida = "O seu pedido é: \n";
        do{
            pedido = Integer.parseInt(JOptionPane.showInputDialog("Digite de 1 a 5 o que deseja pedir sendo: \n 1 para Bigmac \n 2 para Quarteirão \n 3 para MacChicken \n 4 para Cheddar MacMelt \n 5 para MacMax"));
            n++;
            switch(pedido){
                case 1:
                p1++;
                break;
                case 2:
                p2++;
                break;
                case 3:
                p3++;
                break;
                case 4:
                p4++;
                break;
                case 5:
                p5++;
                break;
            }
        }while(n != desejo);

        if(p1>=1){
            saida += p1+" BigMac \n";
        }
        if(p2>=1){
            saida += p2+" Quarteirão \n";
        }
        if(p3>=1){
            saida += p3+" MacChicken \n";
        }
        if(p4>=1){
            saida += p4+" Cheddar MacMelt \n";
        }
        if(p5>=1){
            saida += p5+" MacMax \n";
        }
        JOptionPane.showMessageDialog(null, saida, "Seu pedido!", 1);
    }
}