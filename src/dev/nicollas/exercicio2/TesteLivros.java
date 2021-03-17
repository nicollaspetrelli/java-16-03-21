package dev.nicollas.exercicio2;

public class TesteLivros {
    public static void main(String[] args) throws Exception {

        Livro livro = new Livro(156, "Clean Code", "Um livro de Uncle Bob", 122.85, "978-85-66250-46-6");

        livro.setValor(10);

        System.out.println(livro);
    }
}
