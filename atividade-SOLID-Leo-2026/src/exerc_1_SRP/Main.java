package exerc_1_SRP;

public class Main {

    public static void main(String[] args) {

        PedidoService servico = new PedidoService();

        Pedido pedido = servico.criarPedido(
                1, "João", "Pizza", 45.00
        );

        PedidoRepository repositorio =
                new PedidoRepositoryMemoria();

        repositorio.salvar(pedido);

        PedidoExibicao exibicao = new PedidoExibicao();

        exibicao.exibir(pedido);
    }
}
