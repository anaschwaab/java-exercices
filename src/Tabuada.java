import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int number = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int resultado = i * number;
            System.out.println(i + " x " + number + " = " + resultado);
        }
    }
}
