package br.com.cineflow.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private int episodiosTotais;


    public void setEpisodiosTotais(int episodiosTotais) {
        this.episodiosTotais = episodiosTotais;
    }

    public int getEpisodiosTotais() {
        return episodiosTotais;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public Serie(String nome, String genero, String descricao,
             int anoDeLancamento, int temporadas,
             int episodiosTotais) {

    super(nome, descricao, anoDeLancamento, genero);

    this.temporadas = temporadas;
    this.episodiosTotais = episodiosTotais;
 }
}
