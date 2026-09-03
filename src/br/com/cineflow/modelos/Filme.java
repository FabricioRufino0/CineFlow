package br.com.cineflow.modelos;


public class Filme {

    private String nome;
    private String descricao;
    private int anoDeLancamento;

    private double somaDasAvaliacoes;
    private int totalAvaliacoes;
    private int estrelas;
    private String estrelasGeradas = "";
    private int estrelasVazias;
    private String estrelasApagadas = "";



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



    public void calcularNota(double nota) {


        somaDasAvaliacoes += nota;
        totalAvaliacoes += 1;
    }

    public double calculaMediaFIlme() {
        if (totalAvaliacoes == 0) {
            return 0;
        }

        double media = somaDasAvaliacoes / totalAvaliacoes;
        return media;
    }

    public String calculaEstrelas(){
        estrelas = (int) calculaMediaFIlme() / 2;
        estrelasVazias = 5 - estrelas;

        for (int i = 0; i < estrelas; i++) {
            estrelasGeradas += "★";
        }
        for (int i = 0; i < estrelasVazias; i++) {
            estrelasApagadas += "☆";
        }
        return estrelasGeradas + estrelasApagadas;
    }



    public void exibeFichaFilme() {
        System.out.println("\n-----------------------------------");
        System.out.println("Filme: " + nome+ "\nDescriçao do filme: " + descricao +
                "\nAno de lançamento: " + anoDeLancamento  + "\nNota do filme: " +  calculaMediaFIlme() + " É um filme: " + calculaEstrelas() + " Estrelas");
    }
}
