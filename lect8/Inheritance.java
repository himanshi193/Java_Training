// topic : Inheritance
class Animal{
    void eat(){
        System.out.println("pizza");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("hehe");
    }
}
class Cat extends Dog{

}
public class Inheritance {
    public static void main(String[] args){
        Dog s1 = new Dog();
        s1.bark();
        s1.eat();
    }
}