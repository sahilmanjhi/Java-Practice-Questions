// Code for Encapsulation//
class Student {

    private String name;
    private int age;

    // Setter
    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    // Getter
    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }
}

public class Que4 {
    public static void main(String[] args) {

        Student s = new Student();

        s.setName("Sahil");
        s.setAge(20);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}