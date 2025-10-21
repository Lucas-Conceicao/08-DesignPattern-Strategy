package model;

import strategy.IEstrategiaDesconto;
import strategy.SemDesconto;

/**
 * Classe que usa a estratégia de desconto
 */
public class Carrinho {
    private IEstrategiaDesconto estrategiaDesconto;
    private double valorTotal;

    public Carrinho(double valorTotal) {
        this.valorTotal = valorTotal;
        this.estrategiaDesconto = new SemDesconto(); // Estratégia padrão
    }

    /**
     * Permite trocar a estratégia em tempo de execução
     */
    public void setEstrategiaDesconto(IEstrategiaDesconto estrategia) {
        this.estrategiaDesconto = estrategia;
    }

    /**
     * Calcula o valor final aplicando a estratégia atual
     */
    public double calcularValorFinal() {
        return estrategiaDesconto.calcularDesconto(valorTotal);
    }

    /**
     * Exibe detalhes do carrinho
     */
    public void exibirResumo() {
        System.out.println("=== RESUMO DO CARRINHO ===");
        System.out.printf("Valor Original: R$ %.2f%n", valorTotal);
        System.out.println("Estratégia: " + estrategiaDesconto.getDescricao());
        System.out.printf("Valor Final: R$ %.2f%n", calcularValorFinal());
        System.out.printf("Economia: R$ %.2f%n", valorTotal - calcularValorFinal());
        System.out.println("==========================\n");
    }
}

