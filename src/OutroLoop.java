import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaNota = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Dê uma nota para o filme ou -1 para encerrar ");
            nota = leitura.nextDouble();
            if (nota != -1) {
                mediaNota += nota;
                System.out.println("nota: " + nota);
                totalDeNotas++; // incrementando
                System.out.println("qtd de notas: " + totalDeNotas);
            }
        }

        System.out.println("Média: " + mediaNota / totalDeNotas);
    }
}
