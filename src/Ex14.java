import java.util.Scanner;
public class Ex14 {
    public static void main(String[] args) {
        //Exercico 14; Feito por Thulio;
        //João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso. Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.
        Scanner j = new Scanner(System.in);
        System.out.println("Insira o peso dos peixes em quilos:");
        double peso = j.nextDouble();
        if (peso > 50.0) {
            double excesso = peso - 50.0;
            double multa = excesso * 4.0;

            System.out.println("Excesso de peso: " + excesso + " kg");
            System.out.println("Valor da multa: R$ " + multa);
        } else {
            System.out.println("Não houve excesso de peso. Multa não aplicável.");

        }
    }
}