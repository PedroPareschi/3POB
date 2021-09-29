package br.com.pedropareschi;

import java.util.Scanner;

public class AvioesDePapel {

    public static boolean ehSuficiente(int C, int P, int F) {
        if (C < 1 || C > 1000) {
            throw new IllegalArgumentException("O número de competidores deve estar entre 1 e 1000");
        }


        if (P < 1 || P > 1000) {
            throw new IllegalArgumentException("O número de papéis deve estar entre 1 e 1000");
        }


        if (F < 1 || F > 1000) {
            throw new IllegalArgumentException("O número de folhas por competidores deve estar entre 1 e 1000");
        }
        int folhasPorCompetidor = P / C;
        return folhasPorCompetidor >= F;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        try (scanner) {
            System.out.println("Digite o número de competidores: ");
            int C = scanner.nextInt();
            System.out.println("Digite o número de papel: ");
            int P = scanner.nextInt();
            System.out.println("Digite o número mínimo de folhas por competidor: ");
            int F = scanner.nextInt();
            if (ehSuficiente(C, P, F)) {
                System.out.println("S");
            } else {
                System.out.println("N");
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

    }
}
