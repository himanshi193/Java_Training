// to check palindrome using reverse() and toString
public class PalindromeCheck {
    public static void main(String[] args){
        String str = "level";
        StringBuilder sb = new StringBuilder(str);

        if (str.equals(sb.reverse().toString())){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}