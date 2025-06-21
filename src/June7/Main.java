package June7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the username : ");
        String username = scanner.next();
        System.out.println("Enter the password : ");
        String password = scanner.next();
        Football football = new Football("user123","pass123");

        football.loginUser(username,password);

        System.out.println(football.getUserName());
        System.out.println(football.geteMail());
        System.out.println(football.setPassword("hat bc"));
        System.out.println(football);



    }
}
