/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solutions;

public class ApplePayPayment implements PaymentMethod {

    @Override
    public boolean process(double amount, String data) {
        System.out.println("Procesando pago con Apple Pay...");
        System.out.println("Monto: $" + amount + " | Token ApplePay: " + data);
        System.out.println("Pago con Apple Pay procesado exitosamente");
        return true; // Indicamos que el pago fue exitoso
    }

    @Override
    public double calculateProcessingFee(double amount) {
        // Supongamos que Apple Pay cobra una comisión del 2.5%
        return amount * 0.025;
    }

    @Override
    public String getPaymentType() {
        return "APPLE_PAY";
    }
}
