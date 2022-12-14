package listaA;

import java.util.Scanner;

public class A03 {

	public static void main(String[] args) {
		
		double C, F;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o valor em graus centigrados: ");
		C = input.nextDouble();
		
		F = (((9*C) + 160) /5);
		
		System.out.println("A temperatura em Fahrenreit e: "+F);

	}

}
