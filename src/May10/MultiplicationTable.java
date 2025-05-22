package May10;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want Multiplication table for : ");
        int n = scanner.nextInt();
        System.out.println("Enter the limit of the table");
        int lim = scanner.nextInt();
        int i=1;
        int sum=0;
        while(i<=lim){
            sum = i*n;
            System.out.println(sum);
            i++;

        }

    }
}
