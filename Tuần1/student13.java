package javaa;
public class student13 {
    int id;
    String name;
 
    student13() {
        System.out.println("call Constructor mặc định");
    }
 
    student13(int id, String name) {
        this.id = id;
        this.name = name;
        
    }
 
    void display() {
        System.out.println(id + " " + name);
    }
 
    public static void main(String args[]) {
        student13 e1 = new student13(111, "Viet");
        student13 e2 = new student13(222, "Nam");
        e1.display();
        e2.display();
    }
}
