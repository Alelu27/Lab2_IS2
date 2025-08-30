/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Solutions;

/**
 *
 * @author Ximena Lopez
 */
public interface OrderManager {
    void createOrder(String customerId, String productIds);
    void cancelOrder(String orderId); 
    void updateOrderStatus(String orderId, String status); 
}
