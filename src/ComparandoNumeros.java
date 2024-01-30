import java.util.Scanner;

public class ComparandoNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite o primeiro número: ");
        int primeiroNum = sc.nextInt();
        System.out.println("Por favor, digite o segundo número: ");
        int segundoNum = sc.nextInt();
        if (primeiroNum == segundoNum) {
            System.out.println("Os números são iguais!");
        } else if (primeiroNum > segundoNum) {
            System.out.println("O número " + primeiroNum + " é maior que " + segundoNum);
        } else {
            System.out.println("O número " + segundoNum + " é maior que " + primeiroNum);
        }
    }
}
