import java.util.Scanner;

//Losango

public class Losango {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Valor da Diagonal 1:");
            int diagonal1 = in.nextInt();

        System.out.println("Valor da Diagonal 2:");
            int diagonal2 = in.nextInt();

        System.out.println("A area do losango e " + (diagonal1 * diagonal2)/2);
    }
}