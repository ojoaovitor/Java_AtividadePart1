import java.util.Scanner;

//Paralelogramo

public class Paralelogramo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor da base: ");
            int base = in.nextInt();

        System.out.println("Digite o valor da altura: ");
            int altura = in.nextInt();

        System.out.println("A area do paralelogramo e " + (base * altura));
    }
}