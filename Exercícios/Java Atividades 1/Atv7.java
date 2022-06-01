import java.util.Scanner;

//Faça um programa que leia  3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores. 

public class Atv7 {
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

            if (valor1 < valor2 && valor1 < valor3 ) {
                int soma = valor2 + valor3;
                System.out.println("O valor " + valor2 + " e " + valor3 + " foram os maiores e a soma deles é " + soma);

            } else if (valor2 < valor1 && valor2 < valor3) {
                int soma = valor1 + valor3;
                System.out.println("O valor " + valor1 + " e " + valor3 + " foram os maiores e a soma deles é " + soma);

            } else {
                int soma = valor1 + valor2;
                System.out.println("O valor " + valor1 + " e " + valor2 + " foram os maiores e a soma deles é " + soma);
            }
    }
}