package ListaD;

import java.util.Scanner;

public class D06 {

	public static void main(String[] args) {

		int n;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um numero natural de 0 a 10 para ter sua escrita em extenso: ");
		n = input.nextInt();
		
		if (n == 0){
		System.out.print(n + " - Zero");}
		
		if (n == 1){
		System.out.print(n + " - Um");}
		
		if (n == 2){
		System.out.print(n + " - Dois");}
		
		if (n == 3){
		System.out.print(n + " - Tres");}
		
		if (n == 4){
		System.out.print(n + " - Quatro");}
		
		if (n == 5){
		System.out.print(n + " - Cinco");}

		if (n == 6){
		System.out.print(n + " - Seis");}
		
		if (n == 7){
		System.out.print(n + " - Sete");}

		if (n == 8){
		System.out.print(n + " - Oito");}

		if (n == 9){
		System.out.print(n + " - Nove");}

		if (n == 10){
		System.out.print(n + " - Dez");}
	}	
}
