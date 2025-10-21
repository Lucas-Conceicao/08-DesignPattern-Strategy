package strategy;

/**
 * Sem desconto: 0%
 */
public class SemDesconto implements IEstrategiaDesconto {

    @Override
    public double calcularDesconto(double valorOriginal) {
        return valorOriginal; // Sem desconto
    }

    @Override
    public String getDescricao() {
        return "Sem Desconto (0%)";
    }
}

