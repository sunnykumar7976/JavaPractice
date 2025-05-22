package May10;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DoWhileCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*****************************");
        System.out.println("        Calculator           ");
        System.out.println("*****************************");

        int option;
        do{
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Divide");
            System.out.println("4. Multiply");
            System.out.println("5. Modulus");
            System.out.println("0. Exit");
            System.out.println("Enter one of the options ");
            option = scanner.nextInt();

            int result;

            if(option == 1){
                System.out.println("Enter the first number ");
                int num1 = scanner.nextInt();
                System.out.println("Enter the second number ");
                int num2 = scanner.nextInt();
                result = num1 + num2;
                System.out.println("Result is " + result);

            }
            else if(option == 2){
                System.out.println("Enter the first number ");
                int num1 = scanner.nextInt();
                System.out.println("Enter the second number ");
                int num2 = scanner.nextInt();
                result = num1 - num2;
                System.out.println("Result is " + result);

            }
            else if(option == 3){
                System.out.println("Enter the first number ");
                int num1 = scanner.nextInt();
                System.out.println("Enter the second number ");
                int num2 = scanner.nextInt();
                result = num1 / num2;
                System.out.println("Result is " + result);

            }
            else if(option == 4){
                System.out.println("Enter the first number ");
                int num1 = scanner.nextInt();
                System.out.println("Enter the second number ");
                int num2 = scanner.nextInt();
                result = num1 * num2;
                System.out.println("Result is " + result);

            }
            else if(option == 5){
                System.out.println("Enter the first number ");
                int num1 = scanner.nextInt();
                System.out.println("Enter the second number ");
                int num2 = scanner.nextInt();
                result = num1 % num2;
                System.out.println("Result is " + result);

            }
            else if (option == 0){
                System.out.println("Exiting....");
                break;
            }
            else{
                System.out.println("Enter a valid number ");
            }
            System.out.println("Enter 1 to continue, 2 to exit");
            int option2 = scanner.nextInt();
            if(option2 == 1){
                continue;
            }else{
                System.out.println("Exiting...");
                break;
            }


        }while(option!=0);


    }

}
