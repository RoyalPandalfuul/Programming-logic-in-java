package ListaD;

import java.util.Scanner;

public class D08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double n1,n2,n3;
		
		System.out.print("Digit o valor do primeiro numero: ");
		n1 = input.nextDouble();
		System.out.print("Digit o valor do segundo numero: ");
		n2 = input.nextDouble();
		
		if (n1 > n2){
			n3 = n1 / n2;
			System.out.print("A divisao de " + n1 + " Por " + n2 + " e " + n3);}
		
		if (n1 < n2){
			n3 = n2 / n1;
			System.out.print("A divisao de " + n2 + " Por " + n1 + " e " + n3);}
	}
}
