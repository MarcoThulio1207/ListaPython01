import java.util.Scanner;
public class Ex13 {
    public static void main(String[] args) {
        //Exercicio 13 - Feito por Thulio;
        //Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:Para homens: (72.7*h) - 58.Para mulheres: (62.1*h) - 44.7
        Scanner p = new Scanner(System.in);
        System.out.println("Insira sua altura:");
        double altura = p.nextDouble();
        System.out.println("Digita seu sexo(M para masculino e F para feminino)");
        char sexo = p.next().charAt(0);
        double pesoideal;
        if (sexo == 'M') {
            pesoideal = (72.7 * altura) - 58;
            System.out.println("O peso ideal do homem é:" + altura + "m é:" + pesoideal + "kg");
        } else if (sexo == 'F') {
            pesoideal = (62.1 * altura) - 44.7;
            System.out.println("O peso ideal da mulher é:" + altura + "m é:" + pesoideal + "kg");
        }
    }
}