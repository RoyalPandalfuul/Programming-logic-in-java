package listaA;

import java.util.Scanner;

public class A07 {
	
	public static void main(String[] args) {
		
		double TP, VL, LU, DP; //tempo, velocidade, litros-usados, distancia-percorrida
		Scanner input = new Scanner(System.in);
		
		System.out.println("Este programa calcula a distancia e os litros usados por um carro");
		System.out.println("Que faz 12KM por litro :)");
		
		System.out.println("Digite o tempo gasto na viagem: ");
		TP = input.nextDouble();
		
		System.out.println("Digite a velocidade media durante a viagem ");
		VL = input.nextDouble();
		
		DP = (TP * VL);
		LU = (DP / 12);
		
		System.out.println("Uma viagem de: " + TP + " a uma velocidade de: " + VL);
		System.out.println("Percorreria: " + DP + " E usaria: " + LU);
		
		
		
		
	}

}
