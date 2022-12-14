package ListaI;

import javax.swing.JOptionPane;

public class I07 {
    public static void main(String[] bolo){
        // este programa calcula a media da idade de cdeterminado numero de alunos

        int alunos, idade, i,totalIdade =0;

        alunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos"));

        for(i=1;i<=alunos;i++){
            
            idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade do "+i+"° Aluno"));
            totalIdade+= idade;
        }
        JOptionPane.showMessageDialog(null, "A media da idade dos "+alunos+" alunos e: "+(totalIdade /i), "Heh",JOptionPane.INFORMATION_MESSAGE);
    }
}
