import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args) {
        //Exercicio 4 - Feito por Thulio;
        //Faça um Programa que peça as 4 notas bimestrais e mostre a média.
        double a,b,c,d,e = 0;
        Scanner s = new Scanner (System.in);
        System.out.println("Insira os números:");
        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();
        d = s.nextDouble();
        e = (a+b+c+d)/4;
        System.out.println("As notas da média bimestral é:" + e);
    }
}