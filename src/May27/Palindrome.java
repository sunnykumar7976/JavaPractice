package May27;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 1;
        do{
            System.out.println("Enter the string : ");
            String st = scanner.next();
            int start = 0;
            int end = st.length() - 1;
            boolean result = true;

            for(int i=0;i<=end/2;i++){
                if(st.charAt(start) == st.charAt(end)){
                    start++;
                    end--;
                    continue;
                }else{
                    System.out.println("Not a palindrom");
                    result = false;
                    break;
                }
            }
            if(result){
                System.out.println("Palindrome");
            }

            System.out.println("");
            System.out.println("Enter one of the option :");
            System.out.println("Enter 1 to Continue");
            System.out.println("Enter 2 to exit");
            int option2 = scanner.nextInt();
            if(option2 == 1){
                continue;
            }else{
                System.out.println("Exiting...");
                break;
            }
        }while(option==1);
    }
}
