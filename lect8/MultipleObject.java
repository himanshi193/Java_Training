// Multiple Object
// Create a class Student with fields name, RollNumber , and marks.Write a method to display
//Student details. Create 3 student objects and display their data
class student{
    String name;
    int rollNo;
    double marks;
    void display(){
        System.out.println("Name:"+name);
        System.out.println("RollNo:"+rollNo);
        System.out.println("Marks:"+marks);
    }
}
public class MultipleObject {
    public static void main(String[] args){
        student s1 = new student();
        s1.name = "cute";
        s1.rollNo = 7;
        s1.marks = 56;
        student s2 = new student();
        s2.name = "deepti";
        s2.rollNo = 8;
        s2.marks = 70;
        student s3 = new student();
        s3.name = "mine";
        s3.rollNo = 9;
        s3.marks = 60;
        s1.display();
        s2.display();
        s3.display();
    }
}