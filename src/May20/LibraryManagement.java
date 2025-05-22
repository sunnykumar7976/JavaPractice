package May20;

public class LibraryManagement {
    String studentName;
    String bookTitle;
    String author ;
    static int totalBooksIssued = 0;

    public LibraryManagement(String studentName, String bookTitle, String author) {
        this.studentName = studentName;
        this.bookTitle = bookTitle;
        this.author = author;
        totalBooksIssued++;
    }

    public void printInfo(){
        System.out.println("Student name is : "+ studentName);
        System.out.println("Book Issued is : "+bookTitle);
        System.out.println("Author is : "+ author);
    }

    public static void showTotalIssued(){
        System.out.println("Total books issued is : "+ totalBooksIssued);
    }


}
