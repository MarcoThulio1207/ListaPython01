import java.util.Scanner;
public class Ex08 {
    public static void main(String[] args) {
        //Exercicio 8 - Feito por Thulio;
        //Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.

        double a,b,c=0;
        Scanner h = new Scanner (System.in);
        System.out.println("Quanto você ganha por hora?");
        a = h.nextDouble();
        System.out.println("Qual o numero de horas trabalhadas no mês?");
        b = h.nextDouble();
        c = (a * 8) + (b*24);
        System.out.println("Seu salário no mês é:"+c);
    }
}