import java.util.Scanner;
public class Ex06 {
    public static void main(String[] args) {
        //Exercicio 6 - Feito por Thulio;
        //Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.

        double raio,pi,area;
        Scanner r = new Scanner(System.in);
        System.out.println("Insira o valor do raio:");
        raio = r.nextDouble();
        pi = 3.14;
        area = 2 * pi * raio;
        System.out.println("A area é:"+area);

    }
}