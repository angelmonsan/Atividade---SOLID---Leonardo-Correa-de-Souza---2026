package exerc_2_OCP;

public class PagamentoCartao implements FormaPagamento {

    @Override
    public void pagar(double valor) {
        System.out.printf(
                "Pagamento com cartão: R$ %.2f%n", valor
        );
    }
}
