package listaA;

import java.util.Scanner;

public class A01 {

	public static void main(String[] args) {
		

		double  N1, N2, N3, N4, MF; //1 nota, 2 nota, 3 nota, 4 nota e media final
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o valor da primeira nota"); //Escreva
		N1 = input.nextDouble(); //Leia nota 1
		
		System.out.println("Digite o valor da segunda nota"); //Escreva
		N2 = input.nextDouble(); //Leia nota 2
		
		System.out.println("Digite o valor da terceira nota"); //Escreva
		N3 = input.nextDouble(); //Leia Nota 3
		
		System.out.println("Digite o valor da quarta nota"); //Escreva
		N4 = input.nextDouble(); //Leia nota 4
		
		MF = ((N1 + N2 + N3 + N4) / 4); //calculo da soma
		
		System.out.println("A média final é " + MF); //print do resultado final :)
		
	}

}
