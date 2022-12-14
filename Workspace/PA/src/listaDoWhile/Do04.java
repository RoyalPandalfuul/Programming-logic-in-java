package listaDoWhile;

import javax.swing.JOptionPane;

public class Do04 {
    public static void main(String[] args) {
        //este programa le um numero em centimetros e mostra suas medidas em outras unidades
        float cm, m, dm, mm, aux = 0, rodadas;

        rodadas = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade de vezes que deseja medir com este programa: "));

        do{
        cm = Float.parseFloat(JOptionPane.showInputDialog("Digite a medida em centimetros a ser calculada: "));
        mm = cm * 10;
        dm = cm / 10;
        m = dm / 10;
        aux++;
        JOptionPane.showMessageDialog(null, "Com "+cm+"cm voce tera: "+mm+" milimetros. "+dm+" decimetros"+" e por final "+m+" metros.", "medidas!", 0);
        }while(aux != rodadas);
    }
}
