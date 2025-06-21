package June7;

import java.util.Scanner;

public class PasswordManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean b = true;
        do {
            System.out.println("Enter the username : ");
            String username = scanner.next();
            System.out.println("Enter the password : ");
            String password = scanner.next();
            LoginDemo loginDemo = new LoginDemo("user12","pass123");
            loginDemo.loginUser(username,password);
            if(username.equals(loginDemo.userName) && password.equals(loginDemo.password)){
                break;
            }else{
                b = false;
                continue;
            }


        }while(b=true);





    }
}
