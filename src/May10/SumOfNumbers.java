package May10;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = scanner.nextInt();

        int i=0;
        int sum = 0;
        do {
            sum = sum+i;
            i++;
        }while(i<=n);
        System.out.println(sum);
    }
}
