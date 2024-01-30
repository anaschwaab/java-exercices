import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        int numUsuario = sc.nextInt();
        int resultado = 1;
        for (int i = 1; i <= numUsuario; i++) {
            resultado *= i;
        }
        System.out.println("Resultado do fatorial de " + numUsuario + " é " + resultado);
    }
}
