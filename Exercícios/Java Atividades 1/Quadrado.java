import java.util.Scanner;

//Quadrado

public class Quadrado {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor dos lados do quadrado");
            int area = in.nextInt();

        System.out.println("A area do quadrado e " + (area * area));
    }
}