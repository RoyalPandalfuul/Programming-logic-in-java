package ListaW;

import java.util.Scanner;

public class W01{
    public static void main(String[] args){
        // Este programa le a nota de 7 alunos e devolve a media deles
        Scanner input = new Scanner(System.in);

        double n1,n2,n3,n4,nF;
        int alunos = 1;

        while(alunos != 9){
            System.out.println("Digite a primeira nota do aluno: \n");
            n1 = input.nextDouble();
            System.out.println("Digite a segunda nota do aluno: \n");
            n2 = input.nextDouble();
            System.out.println("Digite a terceira nota do aluno: \n");
            n3 = input.nextDouble();
            System.out.println("Digite a quarta nota do aluno: \n");
            n4 = input.nextDouble();
            nF = (n1+n2+n3+n4) /4;

            System.out.println("A nota final do aluno foi: "+nF+"\n");
            System.out.println("Este foi o "+alunos+"º aluno agora vamos para o proximo aluno! \n");
            alunos = alunos + 1;
        }
    }
}