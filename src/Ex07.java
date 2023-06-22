import java.util.Scanner;
public class Ex07 {
    public static void main(String[] args) {
//Exercicio 7 - Feito por Thulio;
        //Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.

        double a,b,c=0;
        Scanner p = new Scanner(System.in);
        System.out.println("Insira Base da área:");
        a = p.nextDouble();
        System.out.println("Insira a altura:");
        b = p.nextDouble();
        c = (a * b) * 2;
        System.out.println("O dobro da área é:"+c);
    }
}