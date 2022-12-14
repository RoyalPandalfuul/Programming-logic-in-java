package ListaD;

import java.util.Scanner;

public class D09 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double SA, RA, SN, CD;
		RA = 0;
		SN = 0;
		System.out.print("Digite o codigo da funcao: ");
	    CD = input.nextDouble();
	   
	    System.out.print("Digite o valor do salario atual: ");
	    SA = input.nextDouble();
	    
	    if (CD == 1){
	    	RA = SA * 5 / 100;
	        SN = RA + SA;
	        System.out.println("e sua funcao e Operador");}

	    if (CD == 2){
	    	RA = SA * 10 / 100;
	        SN = RA + SA;
	        System.out.println("e sua funcao e Progamador");}

	    if (CD == 3){
	    	RA = SA * 15 / 100;
	        SN = RA + SA;
	        System.out.println("e sua funcao e Analista");}
	    
	    System.out.println("O salario antigo era de " + SA + " reais e agora com o reajuste de "+ RA + " reais o novo salario e de R$" + SN);   
	}
}

