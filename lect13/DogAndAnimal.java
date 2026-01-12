//Create an interface cute with a method makeSound().
//Then, create a class Doggy that implements Animal and overrides makeSound() to print "Bark".
//In the main method, use the interface reference to call the method from Dog.
interface cute{
    void makeSound();
}
class Doggy implements cute{
    public void makeSound() {
        System.out.println("Bark");
    }
}
public class DogAndAnimal {
    public static void main(String[] args){
        cute doggy= new Doggy();
        doggy.makeSound();
    }
}