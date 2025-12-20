//4. Create a class Car With fields brand, model, and price.Write a method to display Car details.
// Create multiple objects and display info.
class Car{
    String brand;
    String model;
    double price;
    Car(String brand,String model,double price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    void display(){
        System.out.println("Brand:"+brand);
        System.out.println("Model:"+model);
        System.out.println("Price:"+price);
        System.out.println("------------------");
    }
}
public class CarDemo {
    public static void main(String[] args){
        Car c1 = new Car("Toyota","corolla",1500000);
        Car c2 = new Car("maruti","swift",2500000);
        Car c3 = new Car("Honda","City",400000);
        c1.display();
        c2.display();
        c3.display();
    }
}