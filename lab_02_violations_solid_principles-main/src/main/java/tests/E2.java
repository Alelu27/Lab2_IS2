package tests;

import solutions.PaymentProcessor; 
import solutions.CreditCardPayment;
import solutions.BitcoinPayment;
import solutions.BankTransferPayment;
import solutions.PayPalPayment;
import solutions.ApplePayPayment;

public class E2 {
    public static void main(String[] args) {
        System.out.println("=== DEMOSTRACIÓN DE VIOLACIONES SOLID ===\n");
        
        demonstrateSRPViolation();
        demonstrateOCPViolation();
        demonstrateOCPViolationFixed(); // versión corregida
        demonstrateLSPViolation();
        demonstrateISPViolation();
        demonstrateDIPViolation();
    }
    
    private static void demonstrateSRPViolation() {
        System.out.println("--- SRP Violation ---");
        // TODO: Implementar demostración
    }
    
    private static void demonstrateOCPViolation() {
        System.out.println("\n--- OCP Violation ---");
        // Ejemplo del procesador viejo que rompe OCP con switch
        violations.PaymentProcessor oldProcessor = new violations.PaymentProcessor();
        oldProcessor.processPayment("CREDIT_CARD", 100, "1234567890123456");
        System.out.println("Fee tarjeta (viejo): " + oldProcessor.calculateProcessingFee("CREDIT_CARD", 100));
    }
    
    private static void demonstrateOCPViolationFixed() {
        System.out.println("\n--- OCP Solution (Corrected) ---");

        // Nuevo procesador con polimorfismo
        PaymentProcessor processor = new PaymentProcessor();

        // Registrar métodos disponibles
        processor.registerPaymentMethod(new CreditCardPayment());
        processor.registerPaymentMethod(new PayPalPayment());
        processor.registerPaymentMethod(new BankTransferPayment());
        processor.registerPaymentMethod(new BitcoinPayment());
        processor.registerPaymentMethod(new ApplePayPayment()); // ✅ ApplePay agregado sin modificar nada más

        // Simular pagos
        processor.processPayment("CREDIT_CARD", 150.0, "1234567812345678");
        System.out.println("Fee tarjeta: " + processor.calculateProcessingFee("CREDIT_CARD", 150.0));

        processor.processPayment("PAYPAL", 200.0, "usuario@paypal.com");
        System.out.println("Fee PayPal: " + processor.calculateProcessingFee("PAYPAL", 200.0));

        processor.processPayment("BANK_TRANSFER", 500.0, "9876543210");
        System.out.println("Fee transferencia: " + processor.calculateProcessingFee("BANK_TRANSFER", 500.0));

        processor.processPayment("BITCOIN", 1000.0, "bc1qexampleaddress");
        System.out.println("Fee Bitcoin: " + processor.calculateProcessingFee("BITCOIN", 1000.0));

        processor.processPayment("APPLE_PAY", 250.0, "applepay-token-abc");
        System.out.println("Fee ApplePay: " + processor.calculateProcessingFee("APPLE_PAY", 250.0));
    }
    
    private static void demonstrateLSPViolation() {
        System.out.println("\n--- LSP Violation ---");
        // TODO: Implementar demostración
    }
    
    private static void demonstrateISPViolation() {
        System.out.println("\n--- ISP Violation ---");
        // TODO: Implementar demostración
    }
    
    private static void demonstrateDIPViolation() {
        System.out.println("\n--- DIP Violation ---");
        // TODO: Implementar demostración
    }
}
