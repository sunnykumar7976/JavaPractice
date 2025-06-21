package June7;

public class LoginDemo {
    String userName;
    String password;

    public LoginDemo(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public void loginUser(String userName,String password){
        if(userName.equalsIgnoreCase(this.userName)&& password.equalsIgnoreCase(this.password)){
            System.out.println("Login Successful ");
        }else {
            System.out.println("Invalid username or Password.....Try Again");
        }

    }
}
