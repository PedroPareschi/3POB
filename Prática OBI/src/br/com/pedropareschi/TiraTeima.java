package br.com.pedropareschi;

import java.util.Scanner;

public class TiraTeima {
    public static boolean estaDentro(int X, int Y) {
        if (X < -500 || X > 500) {
            throw new IllegalArgumentException("O valor de X deve estar entre -500 e 500");
        }
        if (Y < -500 || Y > 500) {
            throw new IllegalArgumentException("O valor de Y deve estar entre -500 e 500");
        }

        return (X >= 0) && (X <= 432) && (Y >= 0) && (Y <= 468);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        try (scanner) {
            System.out.println("Digite as coordenadas: ");
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            if (estaDentro(X, Y)) {
                System.out.println("dentro");
            } else {
                System.out.println("fora");
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

    }
}
