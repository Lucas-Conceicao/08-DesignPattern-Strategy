package strategy;

/**
 * Desconto para promoção especial: 25%
 */
public class DescontoPromocional implements IEstrategiaDesconto {

    @Override
    public double calcularDesconto(double valorOriginal) {
        return valorOriginal * 0.75; // 25% de desconto
    }

    @Override
    public String getDescricao() {
        return "Desconto Promocional (25%)";
    }
}

