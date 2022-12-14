package ListaVetor;

import java.util.Random;

import javax.swing.JOptionPane;

public class Challenge03 {
    public static void main(String[] args) {
        //este programa e a evolucao do segundo desafio com algumas correcoes e aperfeicoamentos
        // agora ele deve receber apenas numeros entre 0 e 60, nao receber numeros repitidos
        //nao aceitar palpites repetidos, ordenar os acertos, ter uma saida de texto aprimorada
        //e ter um melhor entendimento dos palpites
        int palpites[] = new int[6], senhas[] = new int[6], acertos[] = new int[6];
        int i, j, players, gamemode, n = 0,aux;
        String saida = "";
        Random gerador = new Random();

        players = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de jogadores que irão jogar"));
        gamemode = Integer.parseInt(JOptionPane.showInputDialog("Se quer escolher quais os numeros a serem sorteados digite 1 \n caso queira que eles sejam escolhidos aleatoriamente digite 2"));

        while(n != players){
            JOptionPane.showMessageDialog(null, "Agora é a vez do "+(n+1)+"° jogador :)");
            if(gamemode != 1){
                for(i = 0;i < (senhas.length -1);i++){
                    palpites[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a sua "+(i+1)+"° tentativa!"));
                    if(palpites[i] < 1 || palpites[i] > 60){
                        JOptionPane.showMessageDialog(null, "Digite numeros apenas entre 1 e 60!");
                        i--;
                    }
                }

                for(i = 0; i < (senhas.length - 1); i++){
                    senhas[i] = gerador.nextInt(60);
                    if(senhas[i] < 1){
                        senhas[i] = gerador.nextInt(60);
                        i--;
                    }
                }

                for(i = 0; i < (senhas.length -1);i++){
                    if(palpites[i] == senhas[i]){
                        acertos[i] = palpites[i];
                    }
                }

                for(i = 0; i < (senhas.length - 2); i++){
                    //
                    for(j = 0; j < (senhas.length -1);j++){
                        //
                        if(acertos[i] < acertos[j]){
                            aux = acertos[i];
                            acertos[j] = acertos[i];
                            acertos[i] = acertos[j];
                            saida += (" "+ acertos[j]);
                        }
                    }
                }
            }
        n++;
        }
        System.out.println(saida);
    }
}