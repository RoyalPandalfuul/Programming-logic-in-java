package ListaG;
import java.util.Scanner;

public class G03 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        /*Este programa recebe um codigo de percentual como entrada
         * e executa um reajuste de salario de acordo com o percentual do codigo
         */
        System.out.println("Digite o codigo do percentual para executar o reajuste: ");
        int num = input.nextInt();
        int percentual = 0;
        System.out.println("Digite o salario a ser alterado");
        float antigoS = input.nextFloat();

        switch(num){
            case 5:
            percentual = 5;
            break;
            case 15:
            percentual = 10;
            break;
            case 20:
            percentual = 15;
            break;
            case 25:
            percentual = 20;
            break;
            case 30:
            percentual = 25;
            break;
            case 35:
            percentual = 30;
            break;
            default:
            System.out.println("Digite um codigo valido!");}
 
            float reajuste = (antigoS / 100) * percentual;
            float novoS = antigoS + reajuste;
            System.out.println("O salario antigo era: "+antigoS+" agora com o reajuste de: "+reajuste+" ou "+percentual+"% ficara: "+novoS); 
    }
}
