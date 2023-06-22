import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args) {
        //Exercicio 10 - Feito por Thulio;
        //Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.
        double a,Fahrenheit;
        Scanner t = new Scanner (System.in);
        System.out.println("Insira a temperatura em graus Celsius:");
        a = t.nextDouble();
        Fahrenheit= (a *1.800000) +32;
        System.out.println("A temperatura em graus Fahrenheit é:"+Fahrenheit);
    }
}