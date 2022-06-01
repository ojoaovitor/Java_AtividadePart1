import java.util.Scanner;

//Retangulo

public class Retangulo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe o valor da base do retângulo: ");
            int base = in.nextInt();

        System.out.println("Informe um valor da altura do retângulo");
            int altura = in.nextInt();

        System.out.println("O valor da área do retangulo e " + (base * altura));
    }
}