/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Solutions;
import java.util.Date;

/**
 *
 * @author Ximena Lopez
 */
public interface ShippingService {
    void calculateShippingCost(String orderId); 
    void scheduleDelivery(String orderId, Date date); 
    void trackShipment(String orderId); 
}
