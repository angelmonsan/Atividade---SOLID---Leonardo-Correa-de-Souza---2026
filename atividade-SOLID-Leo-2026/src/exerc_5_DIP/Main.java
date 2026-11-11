package exerc_5_DIP;

public class Main {

    public static void main(String[] args) {

        Notificador email = new EmailNotificador();
        Notificador sms = new SmsNotificador();
        Notificador whatsapp = new WhatsAppNotificador();

        NotificationService servicoEmail =
                new NotificationService(email);

        NotificationService servicoSms =
                new NotificationService(sms);

        NotificationService servicoWhatsApp =
                new NotificationService(whatsapp);

        servicoEmail.enviarNotificacao("Pedido confirmado!");

        servicoSms.enviarNotificacao("Pedido saiu para entrega!");

        servicoWhatsApp.enviarNotificacao("Pedido entregue!");
    }
}
