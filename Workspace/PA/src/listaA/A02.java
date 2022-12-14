package listaA;

import java.util.Scanner;

public class A02 {

	public static void main(String[] args) {
		
		int A, L1, L2;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o valor da base do retangulo: ");
		L1 = input.nextInt();
		System.out.print("Digite o valor da largura do retangulo: ");
		L2 = input.nextInt();
		
		A = L1 * L2;
		System.out.println("A area desse retangulo mede " + A + " metros quadrados");
	}

}
