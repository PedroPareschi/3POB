package br.com.pedropareschi;

public class Nota {
    private double[] notas;

    public Nota(double[] notas) {
        this.notas = notas;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double getMedia() {
        double soma = 0;
        soma += 3 * notas[0];
        soma += 2 * notas[1];
        soma += 5 * notas[2];
        return soma / 10;
    }
}
