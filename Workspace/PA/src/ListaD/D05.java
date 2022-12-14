package ListaD;

import java.util.Scanner;

public class D05 {

	public static void main(String[] args) {
		int A, B, C;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o valor de A: ");
		A = input.nextInt();
		System.out.print("Digite o valor de B: ");
		B = input.nextInt();
		System.out.print("Digite o valor de C: ");
		C = input.nextInt();
		
		if(A > B){
			if (B > C ){
				System.out.println("A ordem e " +A+" "+B+" "+C);
			}
			if(B < C ){
				System.out.println("A ordem e " +A+" "+C+" "+B);
			}
		}
				
		if(C > A){
			if (A > B){
				System.out.println("A ordem e " +C+" "+A+" "+B);
			}
			if(A < B){
			System.out.println("A ordem e " +C+" "+B+" "+A);
			}
		}
		if(B > A){
			if (A > C){
				System.out.println("A ordem e " +B+" "+A+" "+C);
			}
			if (A < C){
				System.out.println("A ordem e " +B+" "+C+" "+A);
			}	
		}
	}
}