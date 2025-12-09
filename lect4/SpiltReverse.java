//spilt and reverse
public class SpiltReverse {
    public static void main(String[] args){
        String str = "java is fun";
        String[]words=str.trim().split(" ");
        for (String word : words ){
            if (!word.isEmpty())System.out.println(word);
        }
        String reversed = new StringBuilder(str.trim()).reverse().toString();
        System.out.println(reversed);
    }
}