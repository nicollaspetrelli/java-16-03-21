package dev.nicollas.exercico1;

public class Aluno {
    private String nome;
    private long RA;
    private String dataNasc;
    private String email;

    public Aluno(String nome, long RA, String dataNasc, String email) {
        this.nome = nome;
        this.RA = RA;
        this.dataNasc = dataNasc;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", RA=" + RA +
                ", dataNasc='" + dataNasc + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
