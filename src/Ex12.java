import java.util.Scanner;
public class Ex12 {
    public static void main(String[] args) {
        //Exercicio 12 - Feito por Thulio;
        //Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58
        double altura,peso;
        Scanner a = new Scanner (System.in);
        System.out.println("Insira sua altura:");
        altura = a.nextDouble();
        peso = (72.7*altura) - 58;
        System.out.println("O seu peso ideal é:"+peso);
    }
}