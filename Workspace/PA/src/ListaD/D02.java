package ListaD;

	import java.util.Scanner;

public class D02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		int num = input.nextInt();
		
		if (num < 100){
			System.out.print(num + " e menor que 100");}

		if (num > 100){
			System.out.print(num + " e maior que 100");}

		if (num == 100){
			System.out.print(num + " e igual 100");}
	}
}
