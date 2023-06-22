import java.util.Scanner;
public class Ex03 {
    public static void main(String[] args) {
        //Exercicio 3 - Feito por Thulio;
        //Faça um Programa que peça dois números e imprima a soma.
        int a,b,c=0;
        Scanner s = new Scanner (System.in);
        System.out.println("Insira dois Números:");
        a = s.nextInt();
        b = s.nextInt();
        c = a+b;
        System.out.println("A soma dos número é:" +c);
    }
}