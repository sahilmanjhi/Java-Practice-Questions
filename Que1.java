class Employee {
    private String name;
    private int age;
    private double salary;

    Employee(String name, int age) {
    this.name = name;
    this.age = age;
    }
    public double getSalary() {
    return salary;
    }
    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Error: Salary cannot be negative.");
            this.salary = 15000.0;
        } else {
            this.salary = salary;
        }
    }
}

public class Que1 {
    public static void main(String[] args) {

        Employee emp = new Employee("Sahil", 20);

        emp.setSalary(25000.0);
        System.out.println("Valid Salary: " + emp.getSalary());

        emp.setSalary(-5000.0);
        System.out.println("Salary after invalid input: " + emp.getSalary());
    }
}