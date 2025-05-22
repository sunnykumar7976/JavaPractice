package May6;

import java.util.Scanner;

public class customerService {
    public static void main(String[] args) {
        System.out.println("**************************************");
        System.out.println("    Welcome to Rogers       ");
        System.out.println("**************************************");

        System.out.println("Choose one of the options :");
        System.out.println("1.  Customer Service");
        System.out.println("2.  Technical Support");
        System.out.println("3.  Exit");

        Scanner scanner = new Scanner(System.in);
        int option= scanner.nextInt();

        switch(option){
            case 1:
                System.out.println("**************************************");
                System.out.println("Welcome to Rogers Customer Service");
                System.out.println("**************************************");
                System.out.println("Choose one of the options : ");
                System.out.println("1. Products and services");
                System.out.println("2. Billing");
                System.out.println("3. Complaints");
                int option1 = scanner.nextInt();
                if(option1 == 1){
                    System.out.println("Welcome to products and services");
                }
                else if(option1 == 2){
                    System.out.println("Welcome to Billing");
                }
                else{
                    System.out.println("Welcome to Complaints");
                }
                break;

            case 2:
                System.out.println("**************************************");
                System.out.println("Welcome to Rogers Technical Support");
                System.out.println("**************************************");
                System.out.println("Choose one of the options : ");
                System.out.println("1. Phone");
                System.out.println("2. Wifi");
                int option2 = scanner.nextInt();

                if(option2 == 1){
                    System.out.println("Mobile technical support");
                }
                else if(option2 == 2){
                    System.out.println("Home wifi technical support");
                }
                break;
        }
    }
}
