//7. Create a class Employee with name, id, and salary. Write a method to give a 5% salary
//increment. Print details before and after increment.
class Employee{
    String name;
    int id;
    double salary;
    Employee(String name, int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    void applyIncrement(){
        salary=salary+(salary*0.05);
    }
    void displayDetails(){
        System.out.println("Employee Name:"+name);
        System.out.println("Employee Id:"+id);
        System.out.println("Employee salary:"+salary);
        System.out.println("------------------------");
    }
}
public class Intern {
    public static void main(String[] args){
        Employee e1 = new Employee("HIMANSHI",4,12000);
        System.out.println("before increment:");
        e1.displayDetails();
        e1.applyIncrement();
        System.out.println("\nafter increment:");
        e1.displayDetails();
    }
}