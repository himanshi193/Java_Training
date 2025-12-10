// count vowel in string
public class VowelCount {
    public static void main(String[] args){
        String str="hello is powerful";
        int count=0;
        for (char ch : str.toCharArray()){
            if ("aeiou".indexOf(ch)!=-1){
                count++;
            }
        }
        System.out.println(count); //output : 6
    }
}