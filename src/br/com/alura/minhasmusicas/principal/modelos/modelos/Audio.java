package br.com.alura.minhasmusicas.principal.modelos.modelos;

public class Audio {
    private String titulo;
    private int totaldeReproducoes;
    private int totalCurtidas;
    private int classificacao;

    public void curte(){
        this.totalCurtidas++;
    }

    public void reproduz(){
        this.totaldeReproducoes++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotaldeReproducoes() {
        return totaldeReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

}