package exerc_5_DIP;

public class NotificationService {

    private Notificador notificador;

    public NotificationService(Notificador notificador) {
        this.notificador = notificador;
    }

    public void enviarNotificacao(String mensagem) {
        notificador.enviar(mensagem);
    }
}
