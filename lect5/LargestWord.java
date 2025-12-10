// find  largest word in a sentence
public class LargestWord {
    public static void main(String[] args){
        String str = " java is powerful";
        String[]word= str.split("");
        String largest = "";
        for (String words: word){
            if(words.length()>largest.length()){
                largest=words;
            }
        }
        System.out.println(largest); // output : powerful
    }
}