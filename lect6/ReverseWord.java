// Reverse each word in a sentence
//application of reverse for word manipulation
public class ReverseWord {
    public static void main(String[] args){
        String str = "I love programming";
        StringBuilder result = new StringBuilder();

        String[] words = str.split(" ");
        for (String w : words){
            StringBuilder rev = new StringBuilder(w);
            result.append(rev.reverse()).append(" ");
        }
        System.out.println(result);
    }
}