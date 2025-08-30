/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Solutions;

/**
 *
 * @author Ximena Lopez
 */
public interface InventoryManager {
    boolean checkProductAvailability(String productId, int quantity);
    void reserveProduct(String productId, int quantity);
    int releaseProductReservation(String productId, int quantity); 
}

