package exerc_4_ISP;

public class EntregaManager implements GerenciadorEntrega {

    @Override
    public void iniciarEntrega(int idPedido) {
        System.out.println(
                "Entrega do pedido " + idPedido + " iniciada!"
        );
    }
}
