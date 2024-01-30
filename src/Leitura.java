import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine();
        System.out.println("Qual o ano de lançamento? ");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Dê uma nota para o filme ");
        double nota = leitura.nextDouble();
        System.out.println("Seu filme favorito é: " + filme + " e o ano em que foi lançado: " + anoDeLancamento + " e sua nota foi: " + nota);
    }
}
