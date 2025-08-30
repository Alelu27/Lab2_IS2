package solutions;

public class OrderService {
    private final NotificationService2 notificationService;
    private final Logger logger;
    private final OrderRepository orderRepository;

    public OrderService(NotificationService2 notificationService, Logger logger, OrderRepository orderRepository) {
        this.notificationService = notificationService;
        this.logger = logger;
        this.orderRepository = orderRepository;
    }

    public void createOrder(String order, String userEmail) {
        logger.log("Creando orden: " + order);
        orderRepository.save(order);
        notificationService.sendNotification(userEmail, "Tu orden '" + order + "' fue creada exitosamente.");
    }
}
