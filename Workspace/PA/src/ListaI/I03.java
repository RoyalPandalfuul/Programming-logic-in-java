package ListaI;

import javax.swing.JOptionPane;

public class I03 {
    public static void main(String[] args){
        //Este programa efetua a tabuada do numero 5 ate o numero desejado
        int fim, n;
        String saida = "nah";

        fim = Integer.parseInt(JOptionPane.showInputDialog(null,
        "Digite o numero final para a tabuada do 5 (Qual numero irá parar)","Entrada",JOptionPane.QUESTION_MESSAGE));

        for(n = 0;n<=fim;n++){
            saida +=("\n 5 X "+n+" = "+(5 * n));
        }

        JOptionPane.showMessageDialog(null, saida, "Resultado :D", JOptionPane.INFORMATION_MESSAGE);
    }

}
