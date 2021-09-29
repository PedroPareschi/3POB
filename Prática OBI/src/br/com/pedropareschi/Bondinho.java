package br.com.pedropareschi;

import java.util.Scanner;

public class Bondinho {
    public static boolean ehSuficiente(int M, int A) {
        if (M < 1 || M > 50) {
            throw new IllegalArgumentException("O número de monitores deve estar entre 1 e 50");
        }


        if (A < 1 || A > 50) {
            throw new IllegalArgumentException("O número de alunos deve estar entre 1 e 50");
        }

        return (M + A) <= 50;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        try (scanner) {
            System.out.println("Digite o número de monitores: ");
            int M = scanner.nextInt();
            System.out.println("Digite o número de alunos: ");
            int A = scanner.nextInt();
            if (ehSuficiente(M, A)) {
                System.out.println("S");
            } else {
                System.out.println("N");
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

    }
}
