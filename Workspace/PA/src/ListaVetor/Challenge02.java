package ListaVetor;

import javax.swing.JOptionPane;

import java.util.Random;

public class Challenge02 {
    public static void main(String[] args){
        // Este programa pega 6 entradas de numeros por jogador e as compara com 6 numeros aleatorios por vez
        // caso acerte mostra um resultado, caso erre mostra outro :D
        int senhas[] = new int[6], tentativas[] = new int[6];
        int gameMode, i, n = 0, players;
        Random gerador = new Random();
        String saida = "";

        players = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de jogadores que irão jogar \n cada um terá 6 tentativas. "));
        gameMode = Integer.parseInt(JOptionPane.showInputDialog("Se quer ditar os números como administrador digite 1 \n caso queira que os números do jogo sejam aleatórios digite 2"));
        for(i = 0;i < 6;i++){
            senhas[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a "+(i+1)+"° senha:"));
        }
        JOptionPane.showMessageDialog(null, "Agora todas as senhas foram definidas! vamos para o jogo!");

        
        while(n != players){    
            if(gameMode == 2){ //random
                JOptionPane.showMessageDialog(null, "Vamos para o "+(n+1)+"° jogador :)");            
                for(i = 0;i < 6;i++){
                    senhas[i] = gerador.nextInt(60);
                    tentativas[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a sua "+(i+1)+"° tentativa!"));
                    if(tentativas[i] == senhas[i]){
                        saida += "Voce acertou sua "+(i+1)+"° tentativa! com o número: "+senhas[i]+"\n";
                    }else{
                        saida += "Voce errou sua "+(i+1)+"° tentativa :( era: "+senhas[i]+" e voce chutou: "+tentativas[i]+"\n";
                    }
                }
                n++;
                JOptionPane.showMessageDialog(null, saida);
                saida = "";
            }else{ //nom random
                for(i = 0;i < 6;i++){
                    tentativas[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a sua "+(i+1)+"° tentativa!"));
                    if(tentativas[i] == senhas[i]){
                        saida += "Voce acertou sua "+(i+1)+"° tentativa! com o número: "+senhas[i]+"\n";
                    }else{
                        saida += "Voce errou sua "+(i+1)+"° tentativa :( era: "+senhas[i]+" e voce chutou: "+tentativas[i]+"\n";
                    }
                }
                n++;
                JOptionPane.showMessageDialog(null, saida);
                saida = "";
            }
        }
    }
}