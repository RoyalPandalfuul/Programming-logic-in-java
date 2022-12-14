package ListaF;

import java.util.Scanner;

public class F07 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        /*Este programa le tres numeros representando os lados de um triangulo
         * e calcula qual tipo de triangulo ele se enquadra
         */
        System.out.println("Digite o lado X do triangulo: ");
        float x = input.nextFloat();
        System.out.println("");
        System.out.println("Digite o lado Y do triangulo: ");
        float y = input.nextFloat();
        System.out.println("");
        System.out.println("Digite o lado Z do triangulo: ");
        float z = input.nextFloat();
        System.out.println("");
        //TODO Buah 
        if(x == y){
            System.out.println("Vamos ver");
            if(y == z){
                System.out.println("Este triangulo e equilatero! :)");
            }else{
                System.out.println("Este triangulo e apenas isoceles '>'");}
        }else{

        if(x == z){
            System.out.println("Vamos ver");
            if(y == z){
                System.out.println("Este triangulo e equilatero! :)");
            }else{
                System.out.println("Este triangulo e apenas isoceles '>'");}
        }else{

        if(z == y){
            System.out.println("Vamos ver");
            if(y == x){
                System.out.println("Este triangulo e equilatero! :)");
            }else{
                System.out.println("Este triangulo e apenas isoceles '>'");}
        }else{
            System.out.println("Este triangulo e escaleno");
        }}}
    }
}
