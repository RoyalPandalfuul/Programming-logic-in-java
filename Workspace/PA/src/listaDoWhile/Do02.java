package listaDoWhile;

import javax.swing.JOptionPane;

public class Do02 {
    public static void main(String[] args){
        // Este programa le a altura e base de uma dada quantitade de triangulos e mostra o resultado :)

        int quantidade = Integer.parseInt(JOptionPane.showInputDialog(null,
        "Digite a quantitade de triagulos a se calcular","quantidade"));
        
        int num = 1;

        do{
            float base = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o tamanho da base do "+num+"° triangulo",
            "Base", JOptionPane.INFORMATION_MESSAGE));

            float altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o tamanho da altura do "+num+"° triangulo",
            "Altura", JOptionPane.INFORMATION_MESSAGE));

            float resultado = base * altura / 2;

            JOptionPane.showMessageDialog(null, "a area do "+num+"° triangulo é "+resultado+" :)",
            "Resultado :D",JOptionPane.INFORMATION_MESSAGE);
            num++;
        }while(quantidade > num);
    }
}
