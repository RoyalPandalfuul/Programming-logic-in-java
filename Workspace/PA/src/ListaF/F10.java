package ListaF;

import java.util.Scanner;

public class F10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        /*Este programa recebe cinco numeros inteiros
         * e devolve o maior e o menor
         */
        System.out.println("Digite o primeiro numero: ");
        int num1 = input.nextInt();
        System.out.println("Digite o segundo numero: ");
        int num2 = input.nextInt();
        System.out.println("Digite o terceiro numero: ");
        int num3 = input.nextInt();
        System.out.println("Digite o quarto numero: ");
        int num4 = input.nextInt();
        System.out.println("Digite o quinto numero: ");
        int num5 = input.nextInt();

        int maior = num1;
        int menor = num1;

        // comparacao maior
        if(num2 > maior){
            maior = num2;}
        else
        if(num3 > maior){
            maior = num3;}
        else
        if(num4 > maior){
            maior = num4;}
        else
        if(num5 > maior){
            maior = num5;}
        
        //comparacao menor
        if(num2 < menor){
            menor = num2;}
        else
        if(num3 < menor){
            menor = num3;}
        else
        if(num4 < menor){
            menor = num4;}
        else
        if(num5 < menor){
            menor = num5;}

        System.out.println("o maior numero e: "+maior+" e o menor e: "+menor);
    }
}
