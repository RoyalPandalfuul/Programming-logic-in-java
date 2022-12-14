package ListaD;

	import java.util.Scanner;

public class D04 {

	public static void main(String[] args) {
		double N1, N2 ;
		Scanner input = new Scanner(System.in);

		System.out.println("Digite o valor do primeiro numero: ");
		N1 = input.nextDouble();

		System.out.println("Digite o valor do segundo numero: ");
		N2 = input.nextDouble();

		if (N1 > N2){
			double N3 = N1 - N2;
			System.out.println("A diferenca de "+N1+" para "+N2+" e "+N3);}

		if (N1 < N2){
			double N3 = N2 - N1;
			System.out.println("A diferenca de "+N2+" para "+N1+" e "+N3);}
	}
}
