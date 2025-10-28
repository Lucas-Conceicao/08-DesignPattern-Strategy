package app;

import model.Disciplina;
import strategy.Aritmetica;
import strategy.Geometrica;
import strategy.MediaStrategy;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== TESTE COM ARITMÉTICA ===");
        testarEstrategia(new Aritmetica());
        
        System.out.println("\n=== TESTE COM GEOMÉTRICA ===");
        testarEstrategia(new Geometrica());
    }
    
    private static void testarEstrategia(MediaStrategy estrategia) {
        Disciplina d = new Disciplina(estrategia);
        d.setNome("Padrões de Desenvolvimento");
        d.setP1(10);
        d.setP2(5);
        d.calcularMedia();
        System.out.printf("Média: %.2f - %s%n", d.getMedia(), d.getSituacao());
    }
}
