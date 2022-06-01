import java.util.Scanner;

//Triangulo

public class Triangulo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor da base: ");
            int base = in.nextInt();

        System.out.println("Digite o valor da altura: ");
            int altura = in.nextInt();

        System.out.println("A area do triangulo e " + (base * altura)/2);
    }
}