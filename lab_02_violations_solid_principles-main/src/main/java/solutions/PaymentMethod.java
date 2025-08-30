/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solutions;

public interface PaymentMethod {
    /**
     * Procesa un pago
     * @param amount monto a procesar
     * @param data datos adicionales (número de tarjeta, correo, etc.)
     * @return true si el pago fue exitoso, false en caso contrario
     */
    boolean process(double amount, String data);

    /**
     * Calcula la comisión del método de pago
     * @param amount monto de la transacción
     * @return monto de la comisión
     */
    double calculateProcessingFee(double amount);

    /**
     * Identificador del tipo de pago (ej. "CREDIT_CARD", "PAYPAL")
     * @return tipo de pago
     */
    String getPaymentType();
}
