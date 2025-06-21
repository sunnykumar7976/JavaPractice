package May31;

public class Strings {
    public static void main(String[] args) {

        String doc = "The class String includes methods for examining individual characters of the sequence";
        String temp = doc.replaceAll(" ","");

        System.out.println("Number of Characters is : " + temp.length());
        String[] temp2 = doc.split(" ");
        System.out.println("Number of words is " + temp2.length);
        //System.out.println(temp2);


    }
}
