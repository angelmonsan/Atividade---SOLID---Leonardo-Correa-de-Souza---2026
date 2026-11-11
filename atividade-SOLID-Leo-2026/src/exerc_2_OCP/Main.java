package exerc_2_OCP;

public class Main {

    public static void main(String[] args) {

        PagamentoService servico = new PagamentoService();

        FormaPagamento cartao = new PagamentoCartao();
        FormaPagamento pix = new PagamentoPix();
        FormaPagamento dinheiro = new PagamentoDinheiro();

        servico.realizarPagamento(cartao, 50.00);
        servico.realizarPagamento(pix, 35.00);
        servico.realizarPagamento(dinheiro, 20.00);
    }
}

