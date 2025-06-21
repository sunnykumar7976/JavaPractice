package May31;
import java.util.*;
public class ReturnSomething {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any sentence : ");
        String st = scanner.nextLine();


        char[] chars = st.toCharArray();

        int spaces = 0;
        int spchar = 0;
        int num = 0;
        for (int i = 0; i < chars.length; i++) {
            if (Character.isWhitespace(st.charAt(i))) {
                spaces++;
            } else if (Character.isDigit(st.charAt(i))) {
                num++;
            }
            else if(Character.isAlphabetic(st.charAt(i))){}
            else{
                spchar++;
            }

        }
        System.out.println("Number of spaces is : " + spaces);
        System.out.println("Number of spacial characters is : " + spchar);
        System.out.println("Number of Digits is : " + num);

    }
}
