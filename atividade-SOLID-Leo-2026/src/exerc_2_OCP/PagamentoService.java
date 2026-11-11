package exerc_2_OCP;

public class PagamentoService {

    public void realizarPagamento(
            FormaPagamento forma, double valor) {

        forma.pagar(valor);
    }
}
