import java.util.Scanner;

public class ContaBancariaVirtual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nomeCliente = "Ana Schwaab";
        double saldo = 2500.00;
        System.out.println(String.format("""
                ***********************
                Dados iniciais do cliente:
                                
                Nome: %s
                Saldo atual: R$ %.2f
                ***********************
                """, nomeCliente, saldo));
        String menu = """
                Operações
                                
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                
                Digite a opção desejada:
                """;
        System.out.println(menu);
        int opcaoEscolhida = sc.nextInt();

        while (opcaoEscolhida != 4) {
            if (opcaoEscolhida == 1) {
                System.out.println("Seu saldo atual é de " + saldo);
            } else if (opcaoEscolhida == 2) {
                System.out.println("Informe o valor a ser retirado: ");
                double valorRetirado = sc.nextDouble();
                    if (valorRetirado > saldo) {
                        System.out.println("Não é possível retirar um valor maior que o saldo");
                    } else {
                        saldo -= valorRetirado; // saldoInicial = saldoInicial - valorRetirado;
                        System.out.println("Valor retirado: " + valorRetirado + "\n Seu saldo atual é de: " + saldo);
                    }
            } else if (opcaoEscolhida == 3) {
                System.out.println("Informe o valor a ser depositado");
                double valorDepositado = sc.nextDouble();
                saldo += valorDepositado;
                System.out.println("Seu saldo atual é de " + saldo);
            } else {
                System.out.println("Opção inválida!");
            }
            System.out.println(menu);
            opcaoEscolhida = sc.nextInt();
        }
    }
}
