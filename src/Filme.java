public class Filme {

    String nome;
    String descricao;
    int anoDeLancamento;
    double nota1DoFilme;
    double nota2DoFilme;



    double notaGeralDoFilme;
    int estrelas ;
    String estrelasGeradas;
    int estrelasVazias;
    String estrelasApagadas;

    void calcularNota() {

        estrelasApagadas = "";
        estrelasGeradas = "";
        notaGeralDoFilme = (nota1DoFilme + nota2DoFilme) / 2;
        estrelas = (int) notaGeralDoFilme / 2;
        estrelasVazias = 5 - estrelas;


        for (int i = 0; i < estrelas; i++) {
            estrelasGeradas += "★";
        }
        for (int i = 0; i < estrelasVazias; i++) {
            estrelasApagadas += "☆";
        }
    }

    void exibeFichaFilme() {
        System.out.println("\n-----------------------------------");
        System.out.println("Filme: " + nome+ "\nDescriçao do filme: " + descricao +
                "\nAno de lançamento: " + anoDeLancamento  + "\nNota do filme: " + notaGeralDoFilme + " É um filme: " + estrelasGeradas + estrelasApagadas + " Estrelas");
    }
}
