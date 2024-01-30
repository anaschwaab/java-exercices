import java.util.Scanner;

public class MenuCalculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        String mensagem = """
                Digite o número para escolher uma das opções abaixo:
                1. Calcular área do quadrado
                2. Calcular área do círculo
                """;
        System.out.println(mensagem);
        opcao = sc.nextInt();
        if (opcao == 1) {
            double lado;
            double areaQuadrado;
            System.out.println("Digite o valor de um dos lados do quadrado");
            lado = sc.nextDouble();
            areaQuadrado = lado * lado;
            System.out.println("A área do quadrado é de " + areaQuadrado);
        } else if (opcao == 2) {
            double raio;
            double areaCirculo;
            System.out.println("Digite o valor do raio do círculo");
            raio = sc.nextDouble();
            areaCirculo = Math.PI * (raio * raio);
            System.out.println("A área do círculo é de " + areaCirculo);
        } else {
            System.out.println("Por favor, digite uma opção válida!");
        }
    }
}
