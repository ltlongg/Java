package javaa;

public class TestArithmetic {
    // evaluate 1.1 + 2.2 + 3.3
    public static void main(String[] args) {
    Node n = new Plus(new Plus(new Const(1.1), new Const(2.2)),new Const(3.3));
    System.out.println(""+ n.eval());
    }
}