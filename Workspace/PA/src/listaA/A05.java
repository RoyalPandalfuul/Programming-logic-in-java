package listaA;

import java.util.Scanner;

public class A05 {

	public static void main(String[] args) {
		
		double PB, DS, PV; //preco bruto, desconto, preco a vista
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Este programa calcula o preco do desconto de um produto!");
		System.out.println("Digite o preco bruto do produto: ");
		PB = input.nextDouble();
		
		DS = ((PB/100)*10);
		PV = PB - DS;
		
		System.out.println("O produto com o preco de: " + PB + " Sai por: " + PV + " a vista!");
		System.out.println("Com: " + DS + " De desconto! :)");
		
	}

}
