package ListaD;

import java.util.Scanner;

public class D01 {

	public static void main(String[] args) {
		int V1, V2;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		V1 = input.nextInt();
		System.out.print("Digite o segundo valor: ");
		V2 = input.nextInt();
		
		if(V1 > V2){
			System.out.print(V1 + " e maior que "+ V2);}
			
		if(V1 < V2){
			System.out.print(V2 + " e maior que "+ V1);}

		if(V1 == V2){	
			System.out.print("Os valores sao iguais");}
	}
}
