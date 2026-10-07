//E-Commerce Discount System
class Product {
    double price;

    Product(double price) {
        this.price = price;
    }

    void calculateDiscount() {
        System.out.println("No discount");
    }
}

class Electronics extends Product {

    Electronics(double price) {
        super(price);
    }

    @Override
    void calculateDiscount() {
        double discount = price * 0.10;
        System.out.println("Electronics Discount: " + discount);
        System.out.println("Final Price: " + (price - discount));
    }
}

class Clothing extends Product {

    Clothing(double price) {
        super(price);
    }

    @Override
    void calculateDiscount() {
        double discount = price * 0.20;
        System.out.println("Clothing Discount: " + discount);
        System.out.println("Final Price: " + (price - discount));
    }
}

public class Que7{
    public static void main(String[] args) {

        Product p;

        p = new Electronics(50000);
        p.calculateDiscount();

        p = new Clothing(2000);
        p.calculateDiscount();
    }
}