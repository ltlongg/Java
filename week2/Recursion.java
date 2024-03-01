package javaa;

public class Recursion {
    public static long factorial(long number) {
        if (number <= 1){
            return 1;
        } // base case
        else{
            return number * factorial(number - 1);
        }
    }
}
