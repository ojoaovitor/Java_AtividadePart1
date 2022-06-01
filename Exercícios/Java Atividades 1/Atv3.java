import java.util.Scanner;

//Escreva um programa em Java em que o usuário informe o seu nome e em seguida o programa perguntará a idade do usuário. 
//Agora o programa deve exibir a mensagem "Olá, [NomeDoUsuario], sua idade é [idade]".

public class Atv3 {
    public static void main(String[] args) {

        System.out.println("Informe seu nome: ");

            Scanner name = new Scanner(System.in);

            String nome = name.next();

        System.out.println("Informe sua idade: ");

            Scanner year = new Scanner(System.in);

            int idade = year.nextInt();

        System.out.println("Ola " + nome + "  sua idade e " + idade + " .");
    }
}