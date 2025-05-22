package May17;

public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = new Car("Mustang");
        Car car2 = new Car("Accord","Honda");
        Car car3 = new Car("Elantra", "Hyundai", "Gasoline");
        Car car4 = new Car("Passat","Volkswagon","EV", "Black");
        Car car5 = new Car("Optima","Kia","Gasoline","Blue",185);

        car5.carDetails();
    }
}
