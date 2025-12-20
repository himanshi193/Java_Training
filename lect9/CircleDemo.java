import java.io.StringBufferInputStream;

//Create a class Circle with radius. Write methods of calculate area and circumference of the circle
class Circle{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    double area(){
        return Math.PI*radius*radius;
    }
    double circumference(){
        return 2*Math.PI*radius;
    }
    void display(){
        System.out.println("Radius:"+ radius);
        System.out.println("Area:"+area());
        System.out.println("Circumference:" + circumference());
        System.out.println("----------------------------");
    }
}
public class CircleDemo {
    public static void main(String[] args){
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(7.5);
        c1.display();
        c2.display();
    }
}