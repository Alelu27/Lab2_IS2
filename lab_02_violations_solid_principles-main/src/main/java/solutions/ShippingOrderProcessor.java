/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Solutions;
import java.util.Date;
/**
 *
 * @author Ximena Lopez
 */
public  class ShippingOrderProcessor implements OrderManager, ShippingService {
    
    @Override
    public void createOrder(String customerId, String productId) {
        System.out.println("Creando orden con envío para cliente: " + customerId);
    }

    @Override
    public void cancelOrder(String orderId) {
        System.out.println("Cancelando orden con envío: " + orderId);
    }

    @Override
    public void updateOrderStatus(String orderId, String status) {
        System.out.println("Actualizando estado de la orden: " + orderId + " a " + status);
    }

    @Override
    public void scheduleDelivery(String orderId, Date date) {
        System.out.println("Programando envío para la orden: " + orderId + " en fecha: " + date);
    }

    @Override
    public void calculateShippingCost(String orderId) {
        System.out.println("Calculando costo de envío para la orden: " + orderId);
    }

    @Override
    public void trackShipment(String orderId) {
        System.out.println("Rastreando el envío de la orden: " + orderId);
    }
    
}
