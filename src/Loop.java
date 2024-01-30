import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaNota = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Dê uma nota para o filme ");
            nota = leitura.nextDouble();
            mediaNota += nota; // mesma coisa que mediaNota = mediaNota + nota;
        }

        System.out.println("Média: " + mediaNota / 3);

    }
}
