//10. Create a class Laptop with brand, RAM,and price. Add a constructor to initialize values and a
// method to display them.
class Laptop{
    String brand;
    int ram;
    double price;

    // Constructor to initialize values
    Laptop(String brand,int ram,double price){
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }
    // Method to display laptop details
    void displayDetails(){
        System.out.println("Brand:" +brand);
        System.out.println("RAM:" + ram + "GB");
        System.out.println("Price:" + price);
        System.out.println("------------------------");
    }
}
// Driver class to run the program
public class LaptopDemo {
    public static void main(String[] args){
        Laptop l1 = new Laptop("Dell",16,65000);
        Laptop l2 = new Laptop("HP",8, 45000);

        System.out.println("Laptop 1 Details:");
        l1.displayDetails();

        System.out.println("\nLaptop 2 Details:");
        l2.displayDetails();
    }
}