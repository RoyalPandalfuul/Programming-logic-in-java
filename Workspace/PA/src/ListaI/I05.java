package ListaI;

import javax.swing.JOptionPane;

public class I05 {
    public static void main(String[] args){
        //este programa le a media de certos alunos utilizando o for
        int n1, n2, n3, n4, i, alunos=1;
        float nf;

        alunos+= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de alunos para se calcular a nota", "Entrada",JOptionPane.INFORMATION_MESSAGE));
    
        for(i=1;i<alunos;i++){
            n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a primeira nota do "+i+"° aluno", "Entrada",JOptionPane.INFORMATION_MESSAGE));
            n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a segunda nota do "+i+"° aluno", "Entrada",JOptionPane.INFORMATION_MESSAGE));
            n3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a terceira nota do "+i+"° aluno", "Entrada",JOptionPane.INFORMATION_MESSAGE));
            n4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quarta nota do "+i+"° aluno", "Entrada",JOptionPane.INFORMATION_MESSAGE));
            nf = (n1+n2+n3+n4) /4;

            JOptionPane.showMessageDialog(null, "A media do "+i+"° aluno é: "+nf, i+"° aluno",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
