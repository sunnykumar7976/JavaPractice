package June17;

public class votingMain {
    public static void main(String[] args) {

        Voting voting = new Voting(12);
        try{voting.checkAge();}
        catch (Exception e) {
           e.getStackTrace();
        }
        System.out.println(".>>>>>>>>>>>>>>>>>");
    }
}
