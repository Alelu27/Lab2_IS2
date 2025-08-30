/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tests;
  
import java.util.Date;
import Solutions.*;   

/**
 *
 * @author Ximena Lopez
 */
public class E4_ISP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos el procesador completo
        CompleteOrderProcessor processor = new CompleteOrderProcessor();

        // --- OrderManager ---
        processor.createOrder("C001", "P002,P003");
        processor.updateOrderStatus("O001", "Confirmada");
        processor.cancelOrder("O002");

        // --- PaymentHandler ---
        boolean pagoOk = processor.processPayment("O001", "Tarjeta", "****1234");
        System.out.println("Pago exitoso: " + pagoOk);
        processor.processRefund("O001", 50.0);

        // --- ShippingService ---
        processor.calculateShippingCost("O001");
        processor.scheduleDelivery("O001", new Date());
        processor.trackShipment("O001");

        // --- InventoryManager ---
        boolean disponible = processor.checkProductAvailability("P002", 5);
        System.out.println("Disponibilidad producto: " + disponible);
        processor.reserveProduct("P002", 5);
        processor.releaseProductReservation("P002", 2);

        // --- NotificationSender ---
        processor.sendOrderNotification("O001");
        processor.sendShippingNotification("O001");
        processor.sendDeliveryNotification("O001");

        // --- ReportGenerator ---
        processor.generateOrderReport("O001");
        processor.generateDailyReport(new Date());
        processor.generateCustomerReport("C001");
    }

}