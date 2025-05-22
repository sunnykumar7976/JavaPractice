package May10;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want factorial of : ");
        int num = scanner.nextInt();
        int result=1;
        do{
           result = result*num;
           num--;
        }while(num>1);
        System.out.println("Factorial of "+num+" is "+result);
    }
}
