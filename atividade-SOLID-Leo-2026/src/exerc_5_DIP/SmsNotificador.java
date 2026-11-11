package exerc_5_DIP;

public class SmsNotificador implements Notificador {

    @Override
    public void enviar(String mensagem) {
        System.out.println("SMS enviado: " + mensagem);
    }
}
