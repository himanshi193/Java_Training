abstract class cow {
    abstract void eat();
}

class cat extends cow {
    void eat() {
        System.out.println("hello");
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
        Dog s1 = new Dog();
        s1.eat(); // hello
    }
}