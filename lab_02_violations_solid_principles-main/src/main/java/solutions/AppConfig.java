package solutions;

public class AppConfig {
    public static OrderService createOrderService() {
        NotificationService2 notificationService = new EmailNotificationService();
        Logger logger = new FileLoggerService();
        OrderRepository repository = new DatabaseOrderRepository();

        return new OrderService(notificationService, logger, repository);
    }
}
