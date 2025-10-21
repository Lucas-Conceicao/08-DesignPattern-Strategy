package app;

import model.Carrinho;
import strategy.DescontoClienteRegular;
import strategy.DescontoClienteVIP;
import strategy.DescontoPromocional;
import strategy.SemDesconto;

public class Main {
    public static void main(String[] args) {
        // Criar carrinho com valor de R$ 1000
        Carrinho carrinho = new Carrinho(1000.00);

        System.out.println("🛒 SISTEMA DE DESCONTOS - PADRÃO STRATEGY\n");

        // Cenário 1: Cliente regular
        System.out.println("📋 Cenário 1: Cliente Regular");
        carrinho.setEstrategiaDesconto(new DescontoClienteRegular());
        carrinho.exibirResumo();

        // Cenário 2: Cliente VIP
        System.out.println("👑 Cenário 2: Cliente VIP");
        carrinho.setEstrategiaDesconto(new DescontoClienteVIP());
        carrinho.exibirResumo();

        // Cenário 3: Promoção especial
        System.out.println("🎉 Cenário 3: Promoção Especial");
        carrinho.setEstrategiaDesconto(new DescontoPromocional());
        carrinho.exibirResumo();

        // Cenário 4: Sem desconto
        System.out.println("💰 Cenário 4: Sem Desconto");
        carrinho.setEstrategiaDesconto(new SemDesconto());
        carrinho.exibirResumo();
    }
}
