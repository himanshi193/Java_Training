// constructor and this keyword
class bat{
    int a;

    bat(int a){
        this.a=a;
    }
}
public class Constructor {
    public static void main(String[] args){
        bat obj = new bat(5);
        System.out.println(obj.a);
    }
}