// Q: Write a java program where:
//  - Class Device has method powerOn()
//  - Class Desktop inherits Device and has method boot()
//  - Class GamingLaptop inherits Desktop and has method startGame()
//  - Create an object of GamingLaptop and call all methods.
class Device{
    void powerOn(){
        System.out.println("Device is powered on");
    }
}
class Desktop extends Device{
    void boot(){
        System.out.println("Desktop is booting");
    }
}
class GamingLaptop extends Desktop{
    void startGame(){
        System.out.println("The device is gaming laptop");
    }
}
public class DeviceLaptop {
    public static void main(String[] args){
        GamingLaptop g = new GamingLaptop();
        g.powerOn();
        g.boot();
        g.startGame();
    }
}