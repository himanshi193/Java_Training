//. Create two interfaces A and B. Both interfaces should have a method named display().
//Then, create a class Demo that implements both interfaces.
//Implement the display() method and call it in the main method using a Demo object
interface a{
    void display();
}
interface b{
    void display();
}
class Demo implements a,b {
    public void display() {
        System.out.println("Display method implemented in Demo Class");
    }
}
public class InterfaceDemo {
    public static void main(String[] args){
        Demo obj=new Demo();
        obj.display();
    }
}