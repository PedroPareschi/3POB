package br.com.pareschi;

public class Aluno {
    private String nome;
    private long matricula;

    public Aluno(String nome, long matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nMatricula: " + matricula + "\n";
    }
}
