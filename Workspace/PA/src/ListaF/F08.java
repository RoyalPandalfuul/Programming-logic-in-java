package ListaF;

import java.util.Scanner;

public class F08 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        /* digite tres numeros e este programa ira devolver eles em ordem crescente */
        System.out.println("Digite o valor de A: ");
        int a = input.nextInt();
        System.out.println("Digite o valor de B: ");
        int b = input.nextInt();
        System.out.println("Digite o valor de C: ");
        int c = input.nextInt();

        int maior = a;
        // comparacao maior
        if(b > maior){
            maior = b;
        }else{
            if(c > maior){
                maior = c;
            }
        }

        if(maior == a){
            if(b>c){
                System.out.println("a ordem e "+c+" "+b+" "+a);
            }else{
                System.out.println("a ordem e "+b+" "+c+" "+a);
            }
        }else{

            if(maior == b){
                if(a>c){
                    System.out.println("a ordem e "+c+" "+a+" "+b);
                }else{
                    System.out.println("a ordem e "+b+" "+c+" "+b);
                }
            }else{

                if(maior == c){
                    if(b>a){
                        System.out.println("a ordem e "+a+" "+b+" "+c);
                    }else{
                        System.out.println("a ordem e "+b+" "+a+" "+c);
                    }
                }}}

/*         if(a > b){
            if(b < c){
                System.out.println("a ordem crescente e "+a+" "+b+" "+c);
            }else{
                System.out.println("a ordem crescente e "+a+" "+c+" "+b);
            }}
        
        if(b > a){
            if(a < c){
                System.out.println("a ordem crescente e "+b+" "+a+" "+c);
            }else{
                System.out.println("a ordem crescente e "+b+" "+c+" "+a);
            }}
        
        if(c > a){
            if(a < b){
                System.out.println("a ordem crescente e "+c+" "+a+" "+b);
            }else{
                System.out.println("a ordem crescente e "+c+" "+b+" "+a);
            }}
 */
    }
}
