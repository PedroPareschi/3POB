package br.com.pedropareschi;

import java.util.Scanner;

public class Pneu {
    public static int obterDiferenca(int N, int M) {
        if (N < 1 || N > 40) {
            throw new IllegalArgumentException("A pressão desejada estar entre 1 e 40");
        }


        if (M < 1 || M > 40) {
            throw new IllegalArgumentException("A pressão atual deve estar entre 1 e 40");
        }

        return N - M;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        try (scanner) {
            System.out.println("Pressão desejada: ");
            int N = scanner.nextInt();
            System.out.println("Pressão lida: ");
            int M = scanner.nextInt();
            System.out.println(obterDiferenca(N, M));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

    }
}
