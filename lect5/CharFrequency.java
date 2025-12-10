// frequency count of each character
public class CharFrequency {
    public static void main(String[] args){
        String str="banana";
        int freq[]=new int[265]; // ASCII size
        for (char ch : str.toCharArray()){
            freq[ch]++;
        }
        for (int i=0; i<256; i++){
            if (freq[i]>0){
                System.out.println((char)i +"->"+freq[i]);
            }
        }
    }
}