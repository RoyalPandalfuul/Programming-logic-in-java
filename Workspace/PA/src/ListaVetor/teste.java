package ListaVetor;

import javax.swing.JOptionPane;

public class teste {
    public static void main(String[] args) {
        String coisas[] = new String[10];

        for(int i = 0;i != 10;i++){
            coisas[i] = JOptionPane.showInputDialog("lance o texto");
            System.out.println(coisas[i]);
        }
    }
}
