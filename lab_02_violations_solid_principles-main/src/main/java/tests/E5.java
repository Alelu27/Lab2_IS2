package tests;

import solutions.*;

public class E5 {
    public static void main(String[] args) {
        // Inyección de dependencias con mocks
        NotificationService2 mockNotification = new MockNotificationService();
        Logger mockLogger = new MockLogger();
        OrderRepository mockRepo = new MockRepository();

        OrderService orderService = new OrderService(mockNotification, mockLogger, mockRepo);

        System.out.println("=== Ejecutando prueba con Mocks ===");
        orderService.createOrder("OrdenTest", "usuario@test.com");
    }
}