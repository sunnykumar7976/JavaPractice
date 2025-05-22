package May17;

public class Car {

    String name ;
    String brand;
    String engineType;
    String colour;
    int horsepower;

    public Car(){

    }

    public Car(String name) {
        this.name = name;
    }

    public Car(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public Car(String name, String brand, String engineType) {
        this.name = name;
        this.brand = brand;
        this.engineType = engineType;
    }

    public Car(String name, String brand, String engineType, String colour) {
        this.name = name;
        this.brand = brand;
        this.engineType = engineType;
        this.colour = colour;
    }

    public Car(String name, String brand, String engineType, String colour, int horsepower) {
        this.name = name;
        this.brand = brand;
        this.engineType = engineType;
        this.colour = colour;
        this.horsepower = horsepower;
    }

    public void carDetails(){
        System.out.println(name);
        System.out.println(brand);
        System.out.println(engineType);
        System.out.println(colour);
        System.out.println(horsepower);
    }
}
