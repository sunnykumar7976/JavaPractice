package June7;

public class Football {
    private String userName;
    private String eMail = "abcd@123";
    private String password;
    private double salary = 10000;

    public String setPassword(String password) {
        this.password = password;
        return password;
    }

    public String getUserName() {
        return userName;
    }

    public String geteMail() {
        return eMail;
    }

    @Override
    public String toString() {
        return "Football{" +
                "userName='" + userName + '\'' +
                ", eMail='" + eMail + '\'' +
                ", password='" + password + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Football(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public void loginUser(String userName, String password){
        if(userName.equalsIgnoreCase(this.userName) && password.equals(this.password)){
            System.out.println("Login Successful");
            System.out.println(eMail);
            System.out.println(salary);
        }
        else{
            System.out.println("Invalid Username or Password...");
        }

    }

}


