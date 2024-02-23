public class if_else{
    public static int hi(int testVal, int target) {
        int result = 0;
        if (testVal > target)
        result = 1;
        else if (testVal < target)
        result = -1;
        else {
        System.out.println("They are equal");
        result = 0;
        }
        return result;
    }
    public static void main(String[] args) {
        int testVal = 5;
        int target = 10;
        int result = hi(testVal, target);
        System.out.println("Kết quả: " + result);
    }
}