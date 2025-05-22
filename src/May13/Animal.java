package May13;

public class Animal {

    String type ;
    String colour;
    double weight;
    double height;

    public void eat(){
        System.out.println("This animal eats");
    }
    public void sleep(){
        System.out.println("This animal Sleeps");
    }
    public void walk(){
        System.out.println("This animal Walks");
    }
    public void run(){
        System.out.println("This animal Runs");
    }
    public void animalDetails(){
        System.out.println("Type : " + type);
        System.out.println("Colour : " + colour);
        System.out.println("Height : " + height);
        System.out.println("Weight : " + weight);
    }
}


