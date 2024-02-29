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
    public void inkq(){
        System.out.println(this.title);
        System.out.println(this.author);
        System.out.println(this.numPages);
    }
}
