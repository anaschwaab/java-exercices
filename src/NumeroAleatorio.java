import java.util.Random;
import java.util.Scanner;

public class NumeroAleatorio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numDoUsuario;
        int numAleatorio;
        numAleatorio = new Random().nextInt(100);
        System.out.println("Número gerado aleatoriamente: " + numAleatorio);
        for (int i = 0; i < 5; i++) {
            System.out.println("Adivinhe um número: ");
            numDoUsuario = sc.nextInt();

            if (numDoUsuario == numAleatorio) {
                System.out.println("Parabéns, você acertou o número: " + numDoUsuario);
                i = 4;
            }
        }
    }
}
