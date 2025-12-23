//simple inheritance and polymorphism
class Animals{
    void eat(){
        System.out.println("pizza");
    }
}
class Dogs extends Animals{
    void eat(){
        System.out.println("briyani");
    }
    void data(){
        System.out.println("hello");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Animals s1 = new Dogs();
        s1.eat();
        Dogs s2 = (Dogs) s1;
        s2.data();
    }
}