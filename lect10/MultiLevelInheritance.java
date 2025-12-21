//Q: Write a Java program where
// Class Person has method displayName()
//Class Student inherits Person and adds method displayClass()
//Class Monitor inherits Student and adds method checkDiscipline()
//Create an object of Monitor and call all three method
class Person{
    void displayName(){
        System.out.println("Name: cutuu");
    }
}
class Student extends Person{
    void displayClass(){
        System.out.println("class:12th");
    }
}
class Monitor extends Student{
    void checkDiscipline(){
        System.out.println("Monitor is checking students are in discipline or not");
    }
}
public class MultiLevelInheritance {
    public static void main(String[] args){
        Monitor m = new Monitor();
        m.displayClass();
        m.displayName();
        m.checkDiscipline();
    }
}