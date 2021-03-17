package dev.nicollas.exercicio3;

public class Geometria {
    private static final double pi = 3.14;

    // Areas
    public static double circulo(double raio) {
        return pi * (Math.pow(raio, 2));
    }

    public static double retangulo(double base, double altura) {
        return base * altura;
    }

    public static double triangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static double quadrado(double lado) {
        return lado * lado;
    }

    // Volumes
    public static double cubo(double aresta) {
        return Math.pow(aresta, 3);
    }

    public static double paralelepipedo(double comprimento, double largura, double altura) {
        return largura * comprimento * altura;
    }

    public static double esfera(double raio) {
        return (4 * pi * Math.pow(raio, 3)) / 3;
    }

    public static double cilindro(double areaBase, double altura) {
        return areaBase * altura;
    }

    public static double cilindroRaio(double raio, double altura) {
        return pi * (Math.pow(raio, 2)) * altura;
    }
}
