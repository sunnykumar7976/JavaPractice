package June17;

public class Driving {
    private int age;

    public Driving(int age) {
        this.age = age;
    }

    public void checkAge(){
        if(age<18){
            throw new UnderAgeException("Underage, not eligible to drive");
        }
        System.out.println("Eligible to drive");
    }

}


