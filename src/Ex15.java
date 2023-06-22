import java.util.Scanner;
public class Ex15 {
    public static void main(String[] args) {
        //Exercicio 15; - Feito por Thulio;
        //Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:salário bruto.quanto pagou ao INSS.quanto pagou ao sindicato.o salário líquido.calcule os descontos e o salário líquido, conforme a tabela abaixo + Salário Bruto : R$- IR (11%) : R$ INSS (8%) : R$- Sindicato ( 5%) : R$= Salário Liquido : R$
        Scanner s = new Scanner (System.in);
        double a,b,c=0;
        System.out.println("Quanto você ganha por hora?");
        a = s.nextDouble();
        System.out.println("Quantas horas trabalhou no mês?");
        b = s.nextDouble();
        c = (a*8) + (b*30);
        double ir = c * 0.11;
        double inss = ir * 0.8;
        double sindicato = inss * 0.5;
        double salario = c - ir - inss - sindicato;
        System.out.println("O salário bruto é R$" + c);
        System.out.println("Desconto do IR é R$:" +ir);
        System.out.println("Desconto do INSS é R$:" + inss);
        System.out.println("Desconto do Sindicato é R$:" + sindicato);
        System.out.println("Salario Liquido é R$:" + salario);
    }
}