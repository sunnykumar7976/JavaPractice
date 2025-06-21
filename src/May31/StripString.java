package May31;

import java.util.Scanner;

public class StripString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your email : ");
        String st = scanner.nextLine();

        int index = st.indexOf('@');

        String temp = st.substring(0,index);
        System.out.println(temp);
    }
}
