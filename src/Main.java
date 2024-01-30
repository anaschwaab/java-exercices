public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int ano = 2022;
        System.out.println("Ano de lançamento: " + ano);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        // Média calculada por 3 notas
        double media = (9.8 + 6.3 + 8.0) /  3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme de aventura com galã dos anos 90
                Filme Top Gun
                legal
                """;
        System.out.println(sinopse);

        String str1 = "Olá";
        String str2 = "Olá";
        String str3 = new String("Olá");

        System.out.println(str1 == str2); // aqui resulta em true pois as strings pertencem a mesma instância
        System.out.println(str1 == str3); // aqui resulta em false pois as duas strings pertencem à diferentes instâncias
        System.out.println(str1.equals(str3)); // aqui resulta em true pois está comparando o valor da string (apesar de diferentes instâncias)


        String nome = "Ana";
        int idade = 32;
        double valor = 55.9999;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));

        int aulas = 4;
        String mensagem = """
                  Olá, %s!
                  Boas vindas ao curso de Java.
                  Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                  """.formatted(nome, aulas);

        System.out.println(mensagem);
        int classificacao;
        classificacao = (int) (media / 2); // estamos fazendo um 'casting' aqui (de double para int)
        System.out.println(classificacao);

        // fórmula de celsius para fahrenheit: "(temperatura * 1.8) + 32"
        double tempCelsius = 28.70;
        double tempFahrenheit = (tempCelsius * 1.8) + 32;
        System.out.println(tempFahrenheit);
        int tempFahrenheitInteger = (int) tempFahrenheit;
        System.out.println(tempFahrenheitInteger);


        // Desafio Hora da Prática
        calcularMedia(3.6, 9.5); // 1. e 2.
        char letra = 'a';
        String palavra = "computador";
        System.out.println("Essa é a minha variável do tipo char: " + letra + " e essa é a minha String: " + palavra); // 3.
        double precoProduto = 5.50;
        int quantidade = 20;
        double valorTotal = precoProduto * quantidade;
        System.out.println("O valor total é de: " + valorTotal);




    }

    public static void calcularMedia(double num1, double num2) {

        int media = (int) (num1 + num2) / 2;

        System.out.println("A média das notas é: " + media);

    }


}