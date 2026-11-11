package exerc_4_ISP;

public class PedidoManager implements GerenciadorPedido {

    @Override
    public void atualizarPedido(int id, String status) {
        System.out.println(
                "Pedido " + id + " atualizado para: " + status
        );
    }
}
