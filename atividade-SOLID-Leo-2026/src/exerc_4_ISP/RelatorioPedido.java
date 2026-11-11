package exerc_4_ISP;

public class RelatorioPedido implements GeradorRelatorio {

    @Override
    public void gerarRelatorio() {
        System.out.println("Relatório de pedidos gerado!");
    }
}
