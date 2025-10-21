package strategy;

/**
 * Desconto para clientes regulares: 5%
 */
public class DescontoClienteRegular implements IEstrategiaDesconto {

    @Override
    public double calcularDesconto(double valorOriginal) {
        return valorOriginal * 0.95; // 5% de desconto
    }

    @Override
    public String getDescricao() {
        return "Desconto Cliente Regular (5%)";
    }
}

