package br.com.pedropareschi;

import java.util.Scanner;

public class Telefone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (scanner) {
            System.out.println("Digite o telefone em letras: ");
            String telefone = scanner.nextLine();
            System.out.println(converterParaDigitos(telefone));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public static String converterParaDigitos(String telefoneLetras) {
        if (telefoneLetras.length() < 1 || telefoneLetras.length() > 15) {
            throw new IllegalArgumentException("Telefone deve ter entre 1 à 15 caracteres");
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < telefoneLetras.length(); i++) {
            char letra = telefoneLetras.charAt(i);
            if (letra == '-') {
                stringBuilder.append(letra);
            } else if (Character.isAlphabetic(letra) && letra != 'Z') {
                letra = Character.toUpperCase(letra);
                if (letra <= 'C') {
                    stringBuilder.append(2);
                } else if (letra <= 'F') {
                    stringBuilder.append(3);
                } else if (letra <= 'I') {
                    stringBuilder.append(4);
                } else if (letra <= 'L') {
                    stringBuilder.append(5);
                } else if (letra <= 'O') {
                    stringBuilder.append(6);
                } else if (letra <= 'S') {
                    stringBuilder.append(7);
                } else if (letra <= 'V') {
                    stringBuilder.append(8);
                } else {
                    stringBuilder.append(9);
                }
            } else {
                throw new IllegalArgumentException("Número inválido");
            }
        }
        return stringBuilder.toString();
    }
}
