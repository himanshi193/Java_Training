//Search and replace
public class SearchReplaceDemo {
    public static void main(String[] args){
        String original = "java is fun.java is powerful";
        //replace java with "Python"
        String replaced = original.replace("java","Python");
        //print both version
        System.out.println("Original :"+original);
        System.out.println("Replaced :"+replaced);
    }
}