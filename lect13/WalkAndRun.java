//. Create two interfaces Walkable and Runnable.
//Each should have a method: walk() and run() respectively.
//  Then, create a class Human that implements both interfaces and defines both methods.
//Create a main method where an object of Human is created and both methods are called.
interface Walkable{
    void walk();    // abstract method
}
interface Runnable{
    void run();
}
class Human implements Walkable,Runnable {
    public void walk() {
        System.out.println("Human is walking .....");
    }

    public void run() {
        System.out.println("Human is running.....");
    }
}

public class WalkAndRun {
    public static void main(String[] args){
        Human h1=new Human();
        h1.walk();
        h1.run();
    }
}