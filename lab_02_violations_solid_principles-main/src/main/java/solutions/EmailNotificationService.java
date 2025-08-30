package solutions;

public class EmailNotificationService implements NotificationService2 {
    @Override
    public void sendNotification(String to, String message) {
        System.out.println("Enviando email a: " + to);
        System.out.println("Mensaje: " + message);
    }
}
