package ListExtra;

import javax.swing.JOptionPane;

public class Tabuada{
	public static void main(String[] args){

        String resultado = "";
        int cont, aux, num;

        cont = 0;
        num = Integer.parseInt(JOptionPane.showInputDialog(null,
        "Digite o numero que deseja efetuar a tabuada","Entrada",JOptionPane.QUESTION_MESSAGE));
        
        aux = Integer.parseInt(JOptionPane.showInputDialog(null,
        "Digite o numero final para a multiplicacao da tabuada (O numero em que ela para)","Entrada",JOptionPane.QUESTION_MESSAGE));

        do{
            resultado += "A multiplicação de "+num+" x "+cont+" é "+(num * cont)+" :) \n";  
            cont++;
        }while(cont != aux);

        JOptionPane.showMessageDialog(null,resultado, "tabuada", JOptionPane.INFORMATION_MESSAGE);
    }
}