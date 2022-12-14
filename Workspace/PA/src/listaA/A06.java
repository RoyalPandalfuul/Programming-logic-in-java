package listaA;

import java.util.Scanner;

public class A06 {

	public static void main(String[] args) {
		
		double HT, VH, PD, SB, TD, SL; 
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de horas trabalhadas no mes: ");
		HT = input.nextDouble();
		System.out.print("Digite o valor por horas trabalhada: ");
		VH = input.nextDouble();
		System.out.print("Digite o valor do percentual de desconto: ");
		PD = input.nextDouble();
		
		SB = HT * VH;
		TD = (PD/100) * SB;
		SL = SB - TD;
		
		System.out.println("O salario bruto e " + SB);
		System.out.println("O total de desconto e " + TD);
		System.out.println("O salario liquido e " + SL);
		
				
			
		
		
	}

}
