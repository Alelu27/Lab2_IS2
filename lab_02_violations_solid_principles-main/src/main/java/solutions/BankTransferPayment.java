/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solutions;

public class BankTransferPayment implements PaymentMethod {

    @Override
    public boolean process(double amount, String data) {
        System.out.println("Procesando pago con Transferencia Bancaria...");
        System.out.println("Monto: $" + amount + " | Cuenta Bancaria: " + data);

        // Simulación de validación (ejemplo: cuenta debe tener al menos 10 dígitos)
        if (data.length() < 10) {
            System.out.println("Error: Número de cuenta inválido");
            return false;
        }

        System.out.println("Transferencia bancaria procesada exitosamente");
        return true;
    }

    @Override
    public double calculateProcessingFee(double amount) {
        return 5.0; // tarifa fija por transferencia
    }

    @Override
    public String getPaymentType() {
        return "BANK_TRANSFER";
    }
}

