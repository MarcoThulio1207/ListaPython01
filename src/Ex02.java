import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {

        //Exercicio 2 - Feito por Thulio;
        //Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
        Scanner entrada = new Scanner(System.in);
        System.out.println("Numero?");
        int numero = entrada.nextInt();
        System.out.println("O numero lido foi:" + numero);

    }
}