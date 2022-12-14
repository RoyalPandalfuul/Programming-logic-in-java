package ListaF;

import java.util.Scanner;

public class F09 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        /* este programa testa se o numero de entrada e divisivel
         * por 4, 5 e pelos dois tambem, um belo FizzBuzz :D
         */
        
        System.out.println("Digite o valor a ser testado: ");
        int num = input.nextInt();

        if(num % 5 == 0){
            System.out.println("Este numero e divisivel por 5 :)");
            if(num % 4 == 0){
                System.out.println("Este numero e divisivel tambem por 4 '^'");
            }else{
                System.out.println("Este numero nao e divisivel por 4 e 5 :(");}
        }else{
            System.out.println("este numero nao e divisel por 4 e nem por 5 ->-");}
    }
}
