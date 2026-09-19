package br.com.cineflow.modelos;

public class Serie extends Titulo {

    private int temporadas;
    private int episodiosTotais;
    private int episodiosPorTemporada;
    private int tempoMedioPorEpisodio;

    //Getters da classe
    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }
    public int getTempoMedioPorEpisodio() {
        return tempoMedioPorEpisodio;
    }
    public int getEpisodiosTotais() {
        return episodiosTotais;
    }
    public int getTemporadas() {
        return temporadas;
    }
    //Setters da classe
    public void setEpisodiosTotais(int episodiosTotais) {
        this.episodiosTotais = episodiosTotais;
    }
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }
    public void setTempoMedioPorEpisodio(int tempoMedioPorEpisodio) {
        this.tempoMedioPorEpisodio = tempoMedioPorEpisodio;
    }

    public Serie(String nome, String genero, String descricao, int anoDeLancamento, int temporadas, int episodiosPorTemporada, int tempoMedioPorEpisodio ) {
        super(nome, descricao, anoDeLancamento, genero);
        this.temporadas = temporadas;
        this.episodiosTotais = episodiosTotais;

    }
}
