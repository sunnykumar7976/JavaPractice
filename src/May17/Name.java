package May17;

public class Name {
    public String nameOfPerson(String firstName){
        System.out.println("First Name is : ");
        return firstName;
    }

    public String nameOfPerson(String firstName, String middleName){
        System.out.println("First and middle name is : ");
        String name = firstName + " " + middleName;
        return name;
    }

    public String nameOfPerson(String firstName, String middleName, String lastName){
        System.out.println("Complete name is : ");
        String name1 = firstName + " " + middleName+ " "+ lastName;
        return name1;
    }

    public static void main(String[] args) {

    }


}
