package dev.nicollas.exercicio2;

public class Livro {
    private long codigo;
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;

    public Livro(long codigo, String nome, String descricao, double valor, String isbn) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.isbn = isbn;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) throws Exception {

        // Validação sem msg de erro
        //if (valor <= 0) return;

        if (valor <= 0 ) {
            throw new Exception("O valor do Livro não pode ser negativo!");
        }

        this.valor = valor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Livro {" +
                "\n codigo=" + codigo +
                "\n nome='" + nome + '\'' +
                "\n descricao='" + descricao + '\'' +
                "\n valor=" + valor +
                "\n isbn='" + isbn + '\'' +
                "\n}";
    }
}
