package May20;

public class Main {
    public static void main(String[] args) {
        LibraryManagement student1 = new LibraryManagement("Naman","Rich Dad Poor Dad","robert");
        LibraryManagement student2 = new LibraryManagement("Sid","Sherlock Holmes","Charles");
        LibraryManagement student3 = new LibraryManagement("Rahul", "Harry Potter", "Jk Rowling");

        student1.printInfo();
        System.out.println("");
        student2.printInfo();
        System.out.println("");
        student3.printInfo();
        System.out.println("");

        System.out.println("Total books Issued is : " + LibraryManagement.totalBooksIssued);
    }
}
