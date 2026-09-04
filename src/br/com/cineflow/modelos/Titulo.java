package br.com.cineflow.modelos;

public class Titulo {

    private String nome;
    private String descricao;
    private int anoDeLancamento;
    private String genero;

    private double somaDasAvaliacoes;
    private int totalAvaliacoes;

    public Titulo(String nome, String descricao, int anoDeLancamento, String genero) {
        this.nome = nome;
        this.descricao = descricao;
        this.anoDeLancamento = anoDeLancamento;
        this.genero = genero;
    }


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

    public double calculaMediaFilme() {
        if (totalAvaliacoes == 0) {
            return 0;
        }

        double media = somaDasAvaliacoes / totalAvaliacoes;
        return media;
    }

    public String calculaEstrelas(){
        int estrelas = (int) calculaMediaFilme() / 2;
        int estrelasVazias = 5 - estrelas;
        String estrelasGeradas = "";
        String estrelasApagadas = "";

        for (int i = 0; i < estrelas; i++) {
            estrelasGeradas += "★";
        }
        for (int i = 0; i < estrelasVazias; i++) {
            estrelasApagadas += "☆";
        }
        return estrelasGeradas + estrelasApagadas;
    }

    public void receberNota(double nota) {
        calcularNota(nota);
    }

    public void exibeNotaRecebida() {
        System.out.println("Nota dada para " + nome + ": " + calculaMediaFilme());
    }

    public void exibeFicha() {
        System.out.println("\n-----------------------------------");
        System.out.println("Filme: " + nome+ "\nDescriçao do filme: " + descricao +
                "\nAno de lançamento: " + anoDeLancamento  + "\nNota do filme: " +  calculaMediaFilme() + " É um filme: " + calculaEstrelas() + " Estrelas");
    }
}
