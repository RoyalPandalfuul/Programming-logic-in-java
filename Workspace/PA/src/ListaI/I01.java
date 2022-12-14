package ListaI;

import javax.swing.JOptionPane;

public class I01 {
    public static void main(String[] args){
        
        //este programa mostra numeros de 0 a 100 e de 100 a 0 utilizando um laço de repetição com váriavel de controle
        System.out.println("Alo?");

        int num = 0, control = 0;
        String saida = "";

        for(num=0;num<101;num++){
            saida+=" "+num+"";
            control++;
            if (control==10){
                saida+="\n";
                control=0;
            }
        }

        for(num=99;num>-1;num--){
            saida+=" "+num+"";
            control++;
            if (control==10){
                saida+="\n";
                control=0;
            }
        }   
        JOptionPane.showMessageDialog(null, saida, "numeração completa!", num);
    }
}
