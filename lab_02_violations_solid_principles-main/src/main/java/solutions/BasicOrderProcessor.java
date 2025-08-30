/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Solutions;
/**
 *
 * @author Ximena Lopez
 */
public  class BasicOrderProcessor implements OrderManager{
    @Override
    public void createOrder(String customerId, String productId){
        System.out.println("Creando orden para el cliente: " + customerId);
        System.out.println("Productos: " + productId);
    }

    @Override
    public void cancelOrder(String orderId) {
        System.out.println("Cancelando orden con ID: " + orderId);
    }

    @Override
    public void updateOrderStatus(String orderId, String status) {
        System.out.println("Orden " + orderId + " actualizada a estado: " + status);
    }
    
}
