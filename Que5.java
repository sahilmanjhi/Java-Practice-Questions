//Area using Method Overloading
class AreaCalculator {

    double calculateArea(double side) {
        return side * side;
    }

    double calculateArea(double length, double width) {
        return length * width;
    }

    double calculateCircleArea(double radius) {
        return 3.14 * radius * radius;
    }
}

public class Que5 {
    public static void main(String[] args) {
        AreaCalculator a = new AreaCalculator();

        System.out.println("Square: " + a.calculateArea(5));
        System.out.println("Rectangle: " + a.calculateArea(5, 4));
        System.out.println("Circle: " + a.calculateCircleArea(3));
    }
}