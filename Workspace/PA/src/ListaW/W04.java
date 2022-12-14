package ListaW;

import java.lang.Math;

import javax.swing.JOptionPane;

public class W04 {
    public static void main(String[] args){
        // este programa calcula o indice de massa corporal usando o laço de repetição while
        // o programa se encerra caso o usuario entre com 0 na altura ou no peso, mas executa o resto do código antes de encerrar
        // usei a lib Math para arredondar o resultado float para int, o objetivo era usar um switch case envés de if's encadeados
        // porém não consegui fazer testes condicionais nele
        float peso =1, altura = 1;
        int i = 1;

        while(altura >= 1 || peso >= 1){
            peso = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso atual da "+i+"° pessoa"));
            altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura atual da "+i+"° pessoa"));

            int ideal = Math.round(peso / (altura * altura));
            i++;
            
            JOptionPane.showMessageDialog(null, "O IMC dessa pessoa é: "+ideal+" KG/m².");
            if (ideal<18){
                JOptionPane.showMessageDialog(null, "Esta pessoa está em estado de magreza!", "", 0);
            }else{
                if(ideal<25){
                    JOptionPane.showMessageDialog(null, "Esta pessoa está em um estado saudável :)", "", 0);
                }else{
                    if(ideal<30){
                        JOptionPane.showMessageDialog(null, "Esta pessoa está em estado de sobrepeso!", "", 0);
                    }else{
                        JOptionPane.showMessageDialog(null, "Esta pessoa está em estado de obesidade!", "", 0);
                    }
                }
            }
        }
    }
}
