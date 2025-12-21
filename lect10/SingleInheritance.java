//Q: Write a Java program where
//- Class Employee has method work()
//- Class Manager inherits Employee and has method attendMeeting()
//- Create an object of Manager and call both methods.
class employee{
    void work(){
        System.out.println("employee is working");
    }
}
class Manager extends employee{
    void attendMeeting(){
        System.out.println("Manager is attending meeting");
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.work();
        m.attendMeeting();
    }
}