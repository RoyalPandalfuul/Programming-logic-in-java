package listaDoWhile;

import javax.swing.JOptionPane;

public class Do01 {
    public static void main(String[] args) {
        //este programa calcula  o salario de funcionarios dependendo de sua hora trabalhada, valor da hora
        // e adiciona um bonus por certos dependentes
        float valorHora, Horaworked, valorBruto, valorLiquido;
        int func,dependente, n = 0;

        func = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de funcionarios que deseja consultar"));

        do{
            valorHora = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de cada hora trabalhada"));
            Horaworked = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade de horas que este funcionario trabalhou neste mes"));
            dependente = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de dependentes que este "+(n+1)+"° funcionario tem."));
            valorBruto = valorHora * Horaworked;
            valorLiquido = (dependente * 300) + valorBruto;
            JOptionPane.showMessageDialog(null, "este "+(n+1)+"° funcionario tem: \n como salario bruto: "+valorBruto+"\n e por ter "+dependente+" dependentes \n fica com um total de : "+valorLiquido+" \n sendo R$300 de bonus por dependente", "seu salario! :(", 2);
            n++;
        }while(n != func);
    }
}