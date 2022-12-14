package listaDoWhile;

import javax.swing.JOptionPane;

public class Do03 {
    public static void main(String[] args){
        // este programa calcula se o individuo e maior de idade ou nao. recebendo sua data de nascimento

        int pessoas = Integer.parseInt(JOptionPane.showInputDialog(null,
        "Digite o numero de pessoas a serem consultadas","pessoas"));
        
        int ano = Integer.parseInt(JOptionPane.showInputDialog(null,
        "Digite o ano atual da consulta","ano"));

        int num = 0;

        do{
            int idade = Integer.parseInt(JOptionPane.showInputDialog(null,
            "Digite o ano de nascimento da "+(num+1)+"° pessoa a ser consultada","nascimento"));
            if((ano - idade) >= 18){
                JOptionPane.showMessageDialog(null, "Esta pessoa já alcancou a maior idade!");
            }else{
                JOptionPane.showMessageDialog(null, "Esta pessoa ainda nao alcancou a maior idade :^(");
            }
            num++;
        }while(num != pessoas);
    }
}
