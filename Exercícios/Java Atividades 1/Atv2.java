import java.util.Scanner;

//Escreva um programa em Java em que o usuário informe o seu nome e exiba a mensagem "Olá, [NomeDoUsuario]".

public class Atv2 {
    public static void main(String[] args) {

        System.out.println("Informe seu nome: ");

        Scanner in = new Scanner(System.in);

        String nome = in.next();

        System.out.println("Ola " + nome + " !");
    }
}