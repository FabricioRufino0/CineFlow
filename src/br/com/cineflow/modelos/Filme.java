package br.com.cineflow.modelos;

public class Filme {

    private String nome;
    private String descricao;
    private int anoDeLancamento;
    public double nota1DoFilme;
    public double nota2DoFilme;

    private double notaGeralDoFilme;
    private int estrelas ;
    private String estrelasGeradas;
    private int estrelasVazias;
    private String estrelasApagadas;



    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }



    public void calcularNota() {

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

    public void exibeFichaFilme() {
        System.out.println("\n-----------------------------------");
        System.out.println("br.com.cineflow.modelos.Filme: " + nome+ "\nDescriçao do filme: " + descricao +
                "\nAno de lançamento: " + anoDeLancamento  + "\nNota do filme: " + notaGeralDoFilme + " É um filme: " + estrelasGeradas + estrelasApagadas + " Estrelas");
    }
}
