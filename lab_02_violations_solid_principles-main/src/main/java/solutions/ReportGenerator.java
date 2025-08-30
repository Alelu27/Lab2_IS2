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
public interface ReportGenerator {
    String generateOrderReport (String OrderId) ; 
    String generateDailyReport(Date date); 
    String generateCustomerReport(String customerId); 
}
