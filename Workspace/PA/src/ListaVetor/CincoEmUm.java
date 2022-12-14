package ListaVetor;

import javax.swing.JOptionPane;

public class CincoEmUm {
    public static void main(String[] args){
        int i;
        int nums1[] = new int[5];
        int nums2[] = new int[5];
        int nums3[] = new int[5];
        int nums4[] = new int[5];
        int nums5[] = new int[10];
        String parte1 = "", parte2 = "";

        for(i = 0;i < 5;i++){
            nums1[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(i+1)+"° numero do primeiro vetor"));
        }

        for(i = 0;i < 5;i++){
            nums2[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(i+1)+"° numero do segundo vetor"));
        }

        for(i = 0;i < 5;i++){
            nums3[i] = nums1[i] + nums2[i];
            nums4[i] = nums1[i] * nums2[i];
            nums5[i] = nums1[i];
            nums5[i+5] = nums2[i];
            parte1 += "A soma de "+nums1[i]+" + "+nums2[i]+" é "+nums3[i];
            parte1 += " || A multiplicação de "+nums1[i]+" por "+nums2[i]+" é "+nums4[i]+"\n";
        }
        JOptionPane.showMessageDialog(null, parte1);
        
        for(i = 0; i < 10; i++){
            parte2 += "O ultimo vetor tem na "+(i+1)+"° posição o numero: "+nums5[i]+"\n";
        } 
        JOptionPane.showMessageDialog(null, parte2);
    }
}