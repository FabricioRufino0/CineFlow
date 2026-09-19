package br.com.cineflow.modelos;


public class Filme extends Titulo {

    int duracaoEmMinutos;
    private String diretor;

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public Filme(String nome, String diretor, String genero, String descricao, int anoDeLancamento, int duracaoEmMinutos) {
        super(nome, descricao, anoDeLancamento, genero);
        this.diretor = diretor;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

}


