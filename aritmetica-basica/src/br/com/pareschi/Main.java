package br.com.pareschi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Criar um código que leia dois números imprima soma , diferença e a multiplicação desses números.
        // Imprimir também um número em hexadecimal, octal.

        Scanner scanner = new Scanner(System.in);

        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();

        int soma = numero1 + numero2;
        int diferenca = numero1 - numero2;
        int multiplicacao = numero1 * numero2;

        System.out.println(numero1 + " + " + numero2 + " = " + soma);
        System.out.println(numero1 + " - " + numero2 + " = " +diferenca);
        System.out.println(numero1 + " * " + numero2 + " = " +multiplicacao);

        System.out.println(numero1 + " to hexa: " + Integer.toHexString(numero1));
        System.out.println(numero1 + " to octal: " + Integer.toOctalString(numero1));

        System.out.println(numero2 + " to hexa: " + Integer.toHexString(numero2));
        System.out.println(numero2 + " to octal: " + Integer.toOctalString(numero2));
    }
}
