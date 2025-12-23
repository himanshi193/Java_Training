// METHOD HIDING AND OVERRIDING
class Father{
    static void staticMethod(){
        System.out.println("Parent static");
    }
    void instanceMethod(){
        System.out.println("Parent instance");
    }
    String name="ParentName";
}
class Child extends Father{
    static void staticMethod(){
        System.out.println("child static");// hides
    }
    void instanceMethod(){
        System.out.println("child instance ");//overrides
    }
    String name="hello";
}
public class MethodHiding {
    public static void main(String[] args) {
        Father f = new Child();
        f.instanceMethod();
        f.staticMethod();
        System.out.println(f.name);
    }
}