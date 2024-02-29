package javaa;

public class Book {
    String title;
    String author;
    int numPages;
    public Book() { } ; // default constructor
    public Book(String t, String a, int p) {
    title = t;
    author = a;
    numPages = p;
    }
    public static void main(String[] args){
        Book myBook = new Book("l","lt",2004);
        Book myBook2 = new Book();
        System.out.println(myBook.title);
        System.out.println(myBook.author);
        System.out.println(myBook.numPages);
        System.out.println(myBook2.numPages); //bị null do Book k có tham số
    }
}
