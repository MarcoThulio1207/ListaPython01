import java.util.Scanner;
public class Ex17 {
    public static void main(String[] args) {
        //Exercicio 17; - Feito por Thulio;
        //Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:comprar apenas latas de 18 litros;comprar apenas galões de 3,6 litros;misturar latas e galões, de forma que o desperdício de tinta seja menor. Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.
        Scanner scanner = new Scanner(System.in);

        // Definindo as constantes do programa
        final int COBERTURA_TINTA = 6; // em metros quadrados
        final double PRECO_LATA = 80.0; // em reais
        final double PRECO_GALAO = 25.0; // em reais
        final double CAPACIDADE_LATA = 18.0; // em litros
        final double CAPACIDADE_GALAO = 3.6; // em litros
        final double FOLGA = 1.1; // 10% de folga

        // Solicitando o tamanho da área a ser pintada
        System.out.print("Informe o tamanho da área a ser pintada (em metros quadrados): ");
        int tamanhoArea = scanner.nextInt();

        // Calculando a quantidade de tinta necessária (em litros)
        double quantidadeTinta = tamanhoArea / COBERTURA_TINTA * FOLGA;

        // Calculando a quantidade de latas de tinta necessárias
        int quantidadeLatas = (int) Math.ceil(quantidadeTinta / CAPACIDADE_LATA);

        // Calculando o preço total para comprar apenas latas de tinta
        double precoTotalLatas = quantidadeLatas * PRECO_LATA;

        // Calculando a quantidade de galões de tinta necessários
        int quantidadeGaloes = (int) Math.ceil(quantidadeTinta / CAPACIDADE_GALAO);

        // Calculando o preço total para comprar apenas galões de tinta
        double precoTotalGaloes = quantidadeGaloes * PRECO_GALAO;

        // Calculando a quantidade de latas e galões de tinta necessários
        int quantidadeLatasMix = (int) Math.floor(quantidadeTinta / CAPACIDADE_LATA);
        double quantidadeRestante = quantidadeTinta - quantidadeLatasMix * CAPACIDADE_LATA;
        int quantidadeGaloesMix = (int) Math.ceil(quantidadeRestante / CAPACIDADE_GALAO);

        // Calculando o preço total para comprar latas e galões de tinta
        double precoTotalMix = quantidadeLatasMix * PRECO_LATA + quantidadeGaloesMix * PRECO_GALAO;

        // Exibindo os resultados
        System.out.println("Quantidade de tinta necessária: " + quantidadeTinta + " litros");

        System.out.println("Comprando apenas latas de tinta:");
        System.out.println("Quantidade de latas: " + quantidadeLatas);
        System.out.println("Preço total: R$" + precoTotalLatas);

        System.out.println("Comprando apenas galões de tinta:");
        System.out.println("Quantidade de galões: " + quantidadeGaloes);
        System.out.println("Preço total: R$" + precoTotalGaloes);

        System.out.println("Misturando latas e galões de tinta:");
        System.out.println("Quantidade de latas: " + quantidadeLatasMix);
        System.out.println("Quantidade de galões: " + quantidadeGaloesMix);
        System.out.println("Preço total: R$" + precoTotalMix);
    }
}