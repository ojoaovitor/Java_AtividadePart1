import java.util.Scanner;

//Faça um programa para ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles. 

public class Atv6 {
    public static void main(String[] args) {

        System.out.println("Informe o primeiro número: ");
            Scanner num1 = new Scanner(System.in);
            int valor1 = num1.nextInt();

        System.out.println("Informe o segundo número: ");
            Scanner num2 = new Scanner(System.in);
            int valor2 = num2.nextInt();

        System.out.println("Informe o terceiro número: ");
            Scanner num3 = new Scanner(System.in);
            int valor3 = num3.nextInt();

            if (valor1 > valor2 && valor1 > valor3 ) {
                System.out.println("Número " + valor1 + " e o maior");

            } else if (valor2 > valor1 && valor2 > valor3) {
                System.out.println("Número " + valor2 + " e maior");

            } else {
                System.out.println("Número " + valor3 + " e maior");

            }
    }
}