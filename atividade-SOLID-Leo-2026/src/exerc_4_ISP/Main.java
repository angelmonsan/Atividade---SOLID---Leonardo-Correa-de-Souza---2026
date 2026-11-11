package exerc_4_ISP;

public class Main {

    public static void main(String[] args) {

        EnviadorNotificacao notificacao = new NotificacaoEmail();
        notificacao.enviarNotificacao("Seu pedido foi confirmado!");

        GeradorRelatorio relatorio = new RelatorioPedido();
        relatorio.gerarRelatorio();

        GerenciadorPedido pedido = new PedidoManager();
        pedido.atualizarPedido(1, "Em preparação");

        GerenciadorEntrega entrega = new EntregaManager();
        entrega.iniciarEntrega(1);
    }
}
