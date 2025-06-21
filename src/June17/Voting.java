package June17;

public class Voting {
    private int age;

    public Voting(int age) {
        this.age = age;
    }

    public void checkAge(){
        if (age<18){
            throw new UnderAgeException("Underage, not eligible to vote");
        }
        else{
            System.out.println("Eligible to vote");
        }
    }
}
