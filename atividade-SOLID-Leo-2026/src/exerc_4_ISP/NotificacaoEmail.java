package exerc_4_ISP;

public class NotificacaoEmail implements EnviadorNotificacao {

    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("E-mail enviado: " + mensagem);
    }
}

