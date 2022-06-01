import java.util.Scanner;

//Faça um para ler 2 valores informados pelo usuário e se o segundo valor informado for ZERO, deve ser lido um novo valor, ou seja, 
//para o segundo valor não pode ser aceito o valor zero nem negativo e imprimir o resultado da divisão do primeiro valor lido pelo segundo valor lido.

public class Atv8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe um número: ");

            int valor = in.nextInt();

        System.out.println("Informe o segundo número: ");

            int valor1 = in.nextInt();

            while ( valor1 == 0) {
                System.out.println("O segundo número nao pode ser 0 ");
                System.out.println("Informe o segundo número novamente: ");
                valor1 = in.nextInt();
            }

            double divisao = valor / valor1;
            System.out.println("O resultado da divisão foi " + divisao);
    }
}