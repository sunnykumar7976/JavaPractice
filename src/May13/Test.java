package May13;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.type = "Dog";
        animal.colour = "Black";
        animal.weight = 28.99;
        animal.height = 6.3;

        System.out.println("Animal Details : ");
        animal.animalDetails();

        animal.eat();
        animal.sleep();
        animal.walk();
        animal.run();

        System.out.println();
        Animal animal1 = new Animal();
        animal1.type = "Lion";
        animal1.height = 5.4;
        animal1.colour = "Golden";
        animal1.weight = 45.23;

        System.out.println("Animal Details : ");
        animal1.animalDetails();

        animal1.eat();
        animal1.sleep();
        animal1.walk();
        animal1.run();


    }
}
