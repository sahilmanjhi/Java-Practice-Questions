class Payment {

    void processPayment(double amount) {
     System.out.println("Processing generic payment of $" + amount);
    }
}
class CreditCardPayment extends Payment {

    @Override
    void processPayment(double amount) {
    System.out.println("Processing credit card payment of $" + amount + ". Charging 2% fee.");
    }
}

class UPIPayment extends Payment {

    @Override
    void processPayment(double amount) {
    System.out.println("Processing UPI payment of $"  + amount + ". No extra fees applied.");
    }
}

public class Que3 {

    public static void main(String[] args) {

        int choice = 1;
        double amount = 1000.0;

        // Parent class reference
        Payment payment;

        if (choice == 1) {
            payment = new CreditCardPayment();
        } else {
            payment = new UPIPayment();
        }

        // Method overriding
        payment.processPayment(amount);
    }
}