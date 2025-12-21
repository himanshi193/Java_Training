//Q: Write a Java program where:
//    - Class Shape has method draw()
//    - Class Sphere inherits Shape and has method calculateArea()
//    - Create an object of Sphere and call both methods
class Shape{
    void draw(){
        System.out.println("Drawing a shape");
    }
}
class Sphere extends Shape{
    void calculateArea(){
        System.out.println("Area of sphere  is 4*pi*r*r");
    }
}
public class ShapeAndCircle {
    public static void main(String[] args){
        Sphere c =new Sphere();
        c.draw();
        c.calculateArea();
    }
}