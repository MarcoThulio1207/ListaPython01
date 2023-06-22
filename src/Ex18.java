import java.util.Scanner;
    public class Ex18 {
    public static void main(String[] args) {
        //Exercicio 18 - feito por Thulio;
        //Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps), calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).

        Scanner t = new Scanner (System.in);
        System.out.println("Informe o tamanho do arquivo para Download (em MB)");
        double tamanhoArquivo = t.nextDouble();
        System.out.println("Informe a velocidade da Internet (em Mbps)");
        double velocidadeInternet = t.nextDouble();
        double download = (tamanhoArquivo*8) / (velocidadeInternet*60);
        System.out.printf("O tempo aproximado de download em minutos é:" +download);
    }
}

