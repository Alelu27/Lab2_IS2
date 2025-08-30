/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solutions;

public class BitcoinPayment implements PaymentMethod {

    @Override
    public boolean process(double amount, String data) {
        System.out.println("Procesando pago con Bitcoin...");
        System.out.println("Monto: $" + amount + " | Dirección BTC: " + data);

        // Simulación de validación (ejemplo: dirección debe empezar con "bc1" o "1")
        if (!(data.startsWith("bc1") || data.startsWith("1"))) {
            System.out.println("Error: Dirección de Bitcoin inválida");
            return false;
        }

        System.out.println("Pago con Bitcoin procesado exitosamente");
        return true;
    }

    @Override
    public double calculateProcessingFee(double amount) {
        return amount * 0.001; // 0.1% de comisión
    }

    @Override
    public String getPaymentType() {
        return "BITCOIN";
    }
}
