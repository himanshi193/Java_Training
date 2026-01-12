//5. Create an interface Vehicle with a default method start() that prints "Vehicle is starting...".
//Create a class Motor that implements Vehicle.
//Call the default method from an object of Car in the main method
interface Vehicle{
    default void start()
    {
        System.out.println("vehicle is starting....");
    }
}
class Motor implements Vehicle{
    public void start() {
    }
}
public class VehicleAndCar {
    public static void main(String[] args){
        Motor myMotor=new Motor();
        myMotor.start();
    }
}