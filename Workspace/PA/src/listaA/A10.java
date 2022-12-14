package listaA;

import java.util.Scanner;

public class A10 {


	public static void main(String[] args) {
		int a,b,c;
		Scanner leia = new Scanner(System.in);
		System.out.println("lanca o numero de A ai: "); //Escreva 
		a = leia.nextInt(); // Leia
		System.out.println("lanca o numero de B ai: "); // Escreva
		b = leia.nextInt(); // Leia
		
		c = a;
		a = b;
		b = c;
		
		System.out.println("O valor de A agora e " + a + " E o valor de B agora e " + b);
		
	}

}
