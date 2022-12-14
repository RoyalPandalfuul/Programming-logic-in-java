package listaDoWhile;

import javax.swing.JOptionPane;

public class Do05 {
    public static void main(String[] args) {
        // este programa le a quantidade de peixes que uma quantia de pescadores pegou 
        // e taxa uma multa com um pequeno calculo do sobre peso.
        int n = 0, person, multaKg;
        float multa, personKg;

        person = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de pescadores a serem consultados: "));
        multaKg = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade em KG que podera ser aplicada uma multa", "50"));

        do{
            personKg = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade em KG que o "+(n+1)+"º pescador pegou"));
            multa = (personKg - multaKg) * 4;
            JOptionPane.showMessageDialog(null, "A multa a ser paga pelo "+(n+1)+"º pescador é de: "+multa+"R$");
            n++;
        }while(n != person);

    }
}
