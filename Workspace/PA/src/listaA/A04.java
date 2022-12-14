package listaA;

import java.util.Scanner;

public class A04 {

	public static void main(String[] args) {
		
		double Ra, Alt, Volu; // Raio, Altura, Volume
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o valor do raio da lata: ");
		Ra = input.nextDouble();
		System.out.print("Digite o valor da altura da lata: ");
		Alt = input.nextDouble();
		
		Volu = (3.14159*9*Ra*Ra*Alt);
		
		System.out.print("O volume da lata mede " + Volu);

	}

}
