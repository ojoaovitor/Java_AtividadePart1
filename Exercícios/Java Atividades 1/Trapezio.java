import java.util.Scanner;

//Trapézio

public class Trapezio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor da base maior:");
            int baseMaior = in.nextInt();

        System.out.println("Digite o valor da base menor:");
            int baseMenor = in.nextInt();

        System.out.println("Digite o valor h:");
            int h = in.nextInt();

        System.out.println("A area do trapézio e " + (baseMaior + baseMenor)*h/2);
    }
}