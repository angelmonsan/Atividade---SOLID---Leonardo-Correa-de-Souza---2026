package exerc_2_OCP;

public class PagamentoDinheiro implements FormaPagamento {

    @Override
    public void pagar(double valor) {
        System.out.printf(
                "Pagamento em dinheiro: R$ %.2f%n", valor
        );
    }
}
