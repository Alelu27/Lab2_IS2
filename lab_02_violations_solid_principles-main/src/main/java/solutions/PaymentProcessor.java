/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solutions;

import java.util.HashMap;
import java.util.Map;

public class PaymentProcessor {
    private final Map<String, PaymentMethod> paymentMethods = new HashMap<>();

    // Registrar métodos de pago
    public void registerPaymentMethod(PaymentMethod method) {
        paymentMethods.put(method.getPaymentType().toUpperCase(), method);
    }

    // Procesar pago usando polimorfismo
    public boolean processPayment(String paymentType, double amount, String data) {
        PaymentMethod method = paymentMethods.get(paymentType.toUpperCase());
        if (method == null) {
            throw new IllegalArgumentException("Método de pago no soportado: " + paymentType);
        }
        return method.process(amount, data);
    }

    // Calcular comisión usando polimorfismo
    public double calculateProcessingFee(String paymentType, double amount) {
        PaymentMethod method = paymentMethods.get(paymentType.toUpperCase());
        if (method == null) {
            throw new IllegalArgumentException("Método de pago no soportado: " + paymentType);
        }
        return method.calculateProcessingFee(amount);
    }
}
