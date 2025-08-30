/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Solutions;

/**
 *
 * @author Ximena Lopez
 */
public interface PaymentHandler {
    boolean processPayment(String orderId, String paymentMethod, String paymentData);
    void processRefund(String orderId, double amount);
}
