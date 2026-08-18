import java.util.Scanner;

public class Soma {

    public static void main(String[]args){

        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Programa soma");
        System.out.println("Digite o primeiro numero");
        int numeroUm = entradaDados.nextInt();
        System.out.println("Digite o segundo numero");
        int numeroDois = entradaDados.nextInt();
        int soma = numeroUm + numeroDois;
        System.out.println("A soma dos numeros " + numeroUm + " + " + numeroDois + " é " + soma);
    }
}
