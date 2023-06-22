import java.util.Scanner;
public class Ex11 {
    public static void main(String[] args) {
        //Exercicio 11 - Feito por Thulio;
        //Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:o produto do dobro do primeiro com metade do segundo .a soma do triplo do primeiro com o terceiro.o terceiro elevado ao cubo.
        int a,b,c=0;
        Scanner p = new Scanner(System.in);
        System.out.println("Insira o priemeiro numero inteiro:");
        a = p.nextInt();
        System.out.println("Insira o segundo numero inteiro:");
        b = p.nextInt();
        c = (a*2) / (b/2);
        System.out.println("O produto do dobro do priemiro com metade do segundo é:"+c);
        float d,e,o=0;
        System.out.println("Insira um numero real:");
        d = p.nextFloat();
        e = (a*3) +d;
        System.out.println("A soma do triplo do primeiro com o terceiro é:" +e);
        o = d*d;
        System.out.println("O terceiro elevado ao cubo é:"+ o);
    }
}