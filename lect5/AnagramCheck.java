// check if two strings are anagram
import java.util.Arrays;
public class AnagramCheck {
    public static void main(String[] args){
        String a = "hello";
        String b = "lloeh";
        char[]ch1=a.toCharArray();
        char[]ch2=b.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String sortedA = new String(ch1);
        String sortedB = new String(ch2);
        System.out.println(sortedA.equals(sortedB));
    }
}