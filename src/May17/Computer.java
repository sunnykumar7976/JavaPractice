package May17;

public class Computer {
    String brand;
    int capacity ;

    public Computer() {
        this("HP",128);
        System.out.println("Default constructor");
    }

    public Computer(String brand) {
        this();
        this.brand = brand;
        System.out.println("Constructor with 1 parameter");
    }

    public Computer(String brand, int capacity) {
        System.out.println("Constructor with 2 parameters");
        this.brand = brand;
        this.capacity = capacity;
    }
}
