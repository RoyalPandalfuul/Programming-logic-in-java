package ListaI;

import javax.swing.JOptionPane;

public class I04 {
    public static void main(String[] args){
        //Este programa le um numero e apresenta o resultado da tabuada dele
        
        String resultado = "";
        int cont = 0, aux, num;

        num = Integer.parseInt(JOptionPane.showInputDialog(null,
        "Digite o numero que deseja efetuar a tabuada","Entrada",JOptionPane.QUESTION_MESSAGE));
        
        aux = Integer.parseInt(JOptionPane.showInputDialog(null,
        "Digite o numero final para a tabuada (O numero em que ela para)","Entrada",JOptionPane.QUESTION_MESSAGE));

        for(cont=0;cont<=aux;cont++){
            resultado += "A multiplicação de "+num+" x "+cont+" é "+(num * cont)+" :) \n";  
        }

        JOptionPane.showMessageDialog(null,resultado, "tabuada", JOptionPane.INFORMATION_MESSAGE);
    }
}
