//  inheritance with interfaces
interface A {
    void show();
}

interface B {
    void show();
}

class C implements A, B {
    public void show() {
        System.out.println("C show()");
    }
}
class InheritanceWithInterfaces{
    public static void main(String[] args) {
        // Create object of class C
        C obj = new C();

        // Call the show() method
        obj.show();
    }
}
