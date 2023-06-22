import java.util.Scanner;
public class Ex16 {
    public static void main(String[] args) {
        //Exercicio 16 - Feito por Thulio;
        //Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.
        Scanner t = new Scanner (System.in);
        System.out.println("Qual o tamanho em metros quadrados a ser pintada?");
        double area = t.nextDouble();
        double litros = area/3;
        int latas = (int) Math.ceil(litros/18);
        double preco = latas*80;
        System.out.println("Você precisará de "+latas+ " lata(s) e terá um gasto de R$" +preco);
    }
}