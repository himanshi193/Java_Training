public class StringComparsion {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = new String("hello");
        System.out.println("Using == : " + (s1 == s2)); //false
        System.out.println("Using equals() : " + s1.equals(s2)); //true
    }
}