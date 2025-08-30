/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Solutions;

/**
 *
 * @author Ximena Lopez
 */
public interface NotificationSender {
    void sendOrderNotification(String OrderId);
    void sendShippingNotification (String OrderId); 
    void sendDeliveryNotification(String OrderId); 

}
