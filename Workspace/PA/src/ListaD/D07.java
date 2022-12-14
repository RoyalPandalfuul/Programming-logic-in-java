package ListaD;

import java.util.Scanner;

public class D07 {

	public static void main(String[] args) {
		
		int N;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		N = input.nextInt();
		
		if (N < 5){
			System.out.print("O valor " + N + " e menor do que 5");
		}
		
		if (N > 5){
			if (N < 10){
				System.out.print("O valor " + N + " esta entre 5 e 10");
			}
		}
		if (N > 10){
			System.out.println("O valor " + N +" e maior que 10");
		}
	}
}
