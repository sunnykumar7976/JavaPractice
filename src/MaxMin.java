import java.sql.SQLOutput;
import java.util.Scanner;

public class MaxMin {
    public static int largestElem(int[] num){
        int max = 0;
        for(int i=0; i<num.length;i++){
            if(num[i]>max){
                max = num[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int size = scanner.nextInt();
        System.out.println("Enter the elements of the array");
        int[] num = new int[size];
        for (int i=0; i<num.length;i++){
            num[i] = scanner.nextInt();
        }

        int result = largestElem(num);
        System.out.println(result);

    }
}
