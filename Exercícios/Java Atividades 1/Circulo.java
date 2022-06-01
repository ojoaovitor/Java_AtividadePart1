import java.util.Scanner;

//Circulo

public class Circulo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor do raio do círculo: ");
            int raio = in.nextInt();
        System.out.println("A area do circulo e " + 3.14 * (raio*raio));
    }
}