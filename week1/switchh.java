package javaa;
public class switchh{
    public static void main(String[] args){
        for (int i = 0; i < 100; i++) {
            char c = (char) (Math.random() * 26 + 'a');
            switch(c) {
                case 'a':
                  break;
                case 'e':
                   break;
                case 'i':
                   break;
                case 'o':
                   break;
                case 'u':
                   System.out.println("Vowel"); 
                   break;
                case 'y':
                   break;
                case 'w':
                   System.out.println("Sometimes a vowel"); break;
                default:
                   System.out.println("Not a vowel");
                   break;
            }
        }
    }
}