package strategy;

/**
 * Desconto para clientes VIP: 15%
 */
public class DescontoClienteVIP implements IEstrategiaDesconto {

    @Override
    public double calcularDesconto(double valorOriginal) {
        return valorOriginal * 0.85; // 15% de desconto
    }

    @Override
    public String getDescricao() {
        return "Desconto Cliente VIP (15%)";
    }
}

