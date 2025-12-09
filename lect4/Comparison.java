//String comparison
public class Comparison {
    public static void main(String[] args){
        String str ="java";
        String str1 = "java";
        System.out.println(str==str1); //true
        System.out.println(str.equals(str1)); //true
        String s1="java";
        String s2="ja"+"va";
        String s3="ja";
        String s4=s3+"va"; //runtime concat
        System.out.println(s1==s2);
        System.out.println(s1==s4);
        System.out.println(s1.equals(s4));

    }
}