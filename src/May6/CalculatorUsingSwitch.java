package May6;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CalculatorUsingSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*****************************");
        System.out.println("        Calculator           ");
        System.out.println("*****************************");

        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Divide");
        System.out.println("4. Multiply");
        System.out.println("5. Modulus");
        System.out.println("0. Exit");

        System.out.println("Enter one of the options ");
        int option = scanner.nextInt();

        System.out.println("Enter the first number ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number ");
        int num2 = scanner.nextInt();

        int result;

        switch(option){
            case 1:
                result = num1 + num2;
                System.out.println("Result is " + result);
                break;

            case 2:
                result = num1 - num2;
                System.out.println("Result is " + result);
                break;

            case 3:
                result = num1 / num2;
                System.out.println("Result is " + result);
                break;

            case 4:
                result = num1 * num2;
                System.out.println("Result is " + result);
                break;

            case 5:
                result = num1 % num2;
                System.out.println("Result is " + result);
                break;

            case 0:
                break;
        }

    }
}
