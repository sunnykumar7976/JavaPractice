package June10;

public class Student {
    int id;
    String email;
    char section;

    public Student(int id, String email, char section) {
        this.id = id;
        this.email = email;
        this.section = section;
    }

    @Override
    public String toString() {
        return "ID : " + id;
    }
}
