package solutions;

public class MockNotificationService implements NotificationService2 {
    @Override
    public void sendNotification(String to, String message) {
        System.out.println("[MOCK Notification] a " + to + " con mensaje: " + message);
    }
}
