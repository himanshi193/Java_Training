// Reverse string
public class Reverse {
    public static void main(String[] args){
        String str ="level";
        String rev = " ";
        for(int i = str.length() - 1; i>=0; i--){
            rev +=str.charAt(i);
        }
        System.out.println(str.equals(rev)? "palindrome" : "not palindrome");
    }
}