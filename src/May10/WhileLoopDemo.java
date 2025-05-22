package May10;

import java.util.Scanner;

public class WhileLoopDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n ");
        int n = scanner.nextInt();
        int i=1;
        do {
            System.out.println(i);
            i++;
        }while(i<=n);
    }
}
