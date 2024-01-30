import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numUsuario;
        System.out.println("Por favor, digite um número: ");
        numUsuario = sc.nextInt();
        if (numUsuario % 2 == 0) {
            System.out.println("O número " + numUsuario + " é par!");
        } else {
            System.out.println("O número " + numUsuario + " é ímpar!");
        }
    }
}
