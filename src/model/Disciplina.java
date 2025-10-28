package model;
import strategy.MediaStrategy;

/* Classe que representa uma disciplina e usa Strategy para calcular média*/
public class Disciplina {
    private String nome;
    private double p1;
    private double p2;
    private double media;
    private String situacao;
    private MediaStrategy estrategia;
    
    /*Construtor que recebe a estratégia de cálculo */
    public Disciplina(MediaStrategy estrategia) {
        this.estrategia = estrategia;
    }
    
    /*Calcula a média usando a estratégia injetada*/
    public void calcularMedia() {
        media = estrategia.calcularMedia(p1, p2);
        situacao = estrategia.verificarSituacao(media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        if(p1 > 10 || p1 < 0)
            throw new IllegalArgumentException("Nota P1 inválida");
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        if(p2 > 10 || p2 < 0)
            throw new IllegalArgumentException("Nota P2 inválida");
        this.p2 = p2;
    }

    public double getMedia() {
        return media;
    }

    public String getSituacao() {
        return situacao;
    }

    public MediaStrategy getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(MediaStrategy estrategia) {
        this.estrategia = estrategia;
    }
}