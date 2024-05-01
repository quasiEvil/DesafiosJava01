public class DesafiosJava01 {
    public static void main(String[] args) {
        System.out.println("\n==============================");
        System.out.println("RESOLUÇÃO DOS DESAFIOS DE JAVA");
        System.out.println("==============================\n");

        // Crie um programa que realize a média de duas notas decimais e exiba o resultado.
        double nota1 = 7.2;
        double nota2 = 8.3;
        double media = (nota1 + nota2) / 2;
        System.out.println("DESAFIO 01 - MÉDIA DE DUAS NOTAS");
        System.out.println("Primeira nota: " + nota1 + "\nSegunda nota: " + nota2);
        System.out.println("A média das notas é: " + media);
        System.out.println("============================\n");

        // Declare uma variável do tipo double e uma variável do tipo int.
        // Faça o casting da variável double para int e imprima o resultado.
        double numeroDouble = 42.2;
        int numeroInt = (int) numeroDouble;
        System.out.println("DESAFIO 02 - CASTING DE double PARA int");
        System.out.println("Casting explícito de double para int: " + numeroInt);
        System.out.println("============================\n");

        // Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra).
        // Atribua valores a essas variáveis e concatene-as em uma mensagem.
        char letra = 'e';
        String palavra = "spaço";
        System.out.println("DESAFIO 03 - CONCATENAÇÃO DE char E String");
        System.out.println("variável char letra: " + letra + "\nvariável String palavra: " + palavra);
        System.out.println("Imprimindo o resultado da concatenação: " + letra + palavra);
        System.out.println("============================\n");

        // Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade).
        // Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado numa mensagem.
        double precoProduto = 4.99;
        int quantidade = 4;
        double valorTotal = precoProduto * quantidade;
        System.out.println("DESAFIO 04: CÁLCULO DO VALOR TOTAL DO PRODUTO\nO valor total é: " + valorTotal);
        System.out.println("============================\n");

        // Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável.
        // Considere que o valor de 1 dólar é equivalente a 4.94 reais.
        // Realize a conversão do valor em dólares para reais e imprima o resultado formatado.
        double valorEmDolares = 200.5;
        double valorEmReais = 4.94;
        double conversaoDolarParaReal = valorEmDolares * valorEmReais;
        System.out.println("DESAFIO 05: CONVERSÃO DE USD EM BRL");
        System.out.println("Câmbio: 1 USD = " + valorEmReais);
        System.out.println("Valor em dólares: " + valorEmDolares);
        System.out.println("Valor em reais: " + conversaoDolarParaReal);
        System.out.println("============================\n");

        /* Declare uma variável do tipo double precoOriginal.
           Atribua um valor em reais a essa variável, representando o preço original de um produto.
           Em seguida, declare uma variável do tipo double percentualDesconto
           e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%).
           Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.
        */
        double precoOriginal = 899.99;
        double percentualDesconto = 15;
        double valorDesconto = precoOriginal * (percentualDesconto / 100);
        double precoComDesconto = precoOriginal - valorDesconto;
        System.out.println("DESAFIO 06: CÁLCULO DE DESCONTO");
        System.out.printf("Preço original: R$ %.2f%n", precoOriginal);
        System.out.println("Desconto: " + valorDesconto);
        System.out.printf("Preço com desconto: R$ %.2f%n", precoComDesconto);

    }
}