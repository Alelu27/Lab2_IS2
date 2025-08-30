/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solutions;

public class CreditCardPayment implements PaymentMethod {

    @Override
    public boolean process(double amount, String data) {
        System.out.println("Procesando pago con Tarjeta de Crédito...");
        System.out.println("Monto: $" + amount + " | Tarjeta: " + data);
        return true; // simulación de éxito
    }

    @Override
    public double calculateProcessingFee(double amount) {
        return amount * 0.03; // 3% de comisión
    }

    @Override
    public String getPaymentType() {
        return "CREDIT_CARD";
    }
}
