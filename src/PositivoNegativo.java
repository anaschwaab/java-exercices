import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numUsuario;
        System.out.println("Por favor, digite um número: ");
        numUsuario = sc.nextInt();
        if (numUsuario > 0) {
            System.out.println("O número " + numUsuario + " é positivo!");
        } else if (numUsuario < 0){
            System.out.println("O número " + numUsuario + " é negativo!");
        } else {
            System.out.println("O número é zero!");
        }
    }
}
