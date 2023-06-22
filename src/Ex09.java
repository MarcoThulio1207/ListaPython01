import java.util.Scanner;
public class Ex09 {
    public static void main(String[] args) {
        //Exercicio 9 - Feito por Thulio;
        //Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.C = 5 * ((F-32) / 9).
        int a,Fahrenheit,Celsius;
        Scanner t = new Scanner(System.in);
        System.out.println("Insira a temperatura em graus Fahrenheit:");
        a = t.nextInt();
        Fahrenheit= a-32/9;
        Celsius=5 * (a-32)/9;
        System.out.println("A temperatura em graus Celsius é:"+Celsius);
    }
}