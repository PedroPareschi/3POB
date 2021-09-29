package br.com.pedropareschi;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double[] notas = new double[3];
        System.out.println("Digite a nota da prova: ");
        notas[0] = scanner.nextDouble();
        System.out.println("Digite a nota do teste: ");
        notas[1] = scanner.nextDouble();
        System.out.println("Digite a nota do trabalho: ");
        notas[2] = scanner.nextDouble();

        Nota nota = new Nota(notas);

        System.out.println("Media: " + nota.getMedia());

        scanner.close();

    }
}
