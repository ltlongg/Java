package javaa;

public class NNCollection {
    private NNTree root;
    public NNCollection() {}
    public void insert(NameNumber n) {
    if (root != null){
        root.insert(n);
    }
    else{
        root = new NNTree(n);
    }
    public String findNumber(String lName);
    if (root != null){
        return root.findNumber(lName);
    }
    else{
        return new String("Name not found");
    }
}