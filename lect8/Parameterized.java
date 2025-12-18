// Parameterized constructor
class bullet{
    int a;
    String name;
    bullet(int a, String name){
        this.a = a;
        this.name = name;
        System.out.println("Name:" +name);
        System.out.println("a:" +a);
    }
}
public class Parameterized {
    public static void main(String[] args){
        bullet b1= new bullet(5,"himanshi");
        bullet b2= new bullet(6,"ansh");
        bullet b3= new bullet(7,"golu");
    }
}