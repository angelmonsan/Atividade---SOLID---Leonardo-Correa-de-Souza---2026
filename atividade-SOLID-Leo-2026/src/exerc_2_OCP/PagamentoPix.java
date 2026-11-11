package exerc_2_OCP;

public class PagamentoPix implements FormaPagamento {

    @Override
    public void pagar(double valor) {
        System.out.printf(
                "Pagamento via PIX: R$ %.2f%n", valor
        );
    }
}
