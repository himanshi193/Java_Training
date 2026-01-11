// Interfaces with default and abstract methods
interface Mother{
    abstract void sleep(); // abstract method
    default void dee(){  // default method
        System.out.println("hehehe");
    }
}
class son implements Mother{
    public void sleep(){
        System.out.println("hello hii");
    }
    void deep(){
        System.out.println("hiii");
    }
}
public class AbstractMethods {
    public static void main(String[] args){
        son s1 = new son();
        s1.sleep();
        s1.deep();
        s1.dee();
    }
}