package exerc_5_DIP;

public class EmailNotificador implements Notificador {

    @Override
    public void enviar(String mensagem) {
        System.out.println("E-mail enviado: " + mensagem);
    }
}
