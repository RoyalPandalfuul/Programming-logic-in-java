package ListaD;

import java.util.Scanner;

public class D03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o codigo do departamento: ");
		int Cod = input.nextInt();
		
		if (Cod < 1){
			System.out.print("Codigo invalido");}

		if (Cod > 4){	
			System.out.print("Codigo invalido");}

		if (Cod == 1){
			System.out.print("Seu departamento e Expedicao");}

		if (Cod == 2){
			System.out.print("Seu departamento e Recursos Humanos");}

		if (Cod == 3){
			System.out.print("Seu departamento e Logistica");}

		if (Cod == 4){
			System.out.print("Seu departamento e Contabilidade");}
	}
}
