import java.util.Scanner;

//Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou zero. 

public class Atv5 {
    public static void main(String[] args) {

        System.out.println("Informe um número: ");
            Scanner num = new Scanner(System.in);

            int valor = num.nextInt();

            if (valor > 0 ) {
                System.out.println("Numero " + valor + " e positivo");

            } else if (valor == 0) { 
                System.out.println("Numero " + valor + " e zero");

            } else {
                System.out.println("Numero " + valor + " e negativo");

            }
    }
}