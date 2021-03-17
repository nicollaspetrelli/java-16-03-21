package dev.nicollas.exercicio3;

public class TesteGeometrias {
    public static void main(String[] args) {

        System.out.println(
            // Areas
            "\nAreas: \n" +

            "Circulo: "   + Geometria.circulo(5) + "\n" +
            "Retangulo: " + Geometria.retangulo(10, 5) + "\n" +
            "Triangulo: " + Geometria.triangulo(4, 4) + "\n" +
            "Quadrado: "  + Geometria.quadrado(10) + "\n" +

            // Volumes
            "\nVolumes: \n" +

            "Cubo: "              + Geometria.cubo(10) + "\n" +
            "Paralelepipedo: "    + Geometria.paralelepipedo(10, 7, 5) + "\n" +
            "Esfera: "            + Geometria.esfera(5) + "\n" +
            "Cilindro: "          + Geometria.cilindro(10, 5) + "\n" +
            "Cilindro por Raio: " + Geometria.cilindroRaio(10, 5) + "\n"
        );
    }
}
