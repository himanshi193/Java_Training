// inheritance vs this vs super function
class Parent{
    int x=20;
    Parent(){
        System.out.println("Parent constructor: x="+x);
    }
}
class child extends Parent{
    int x=30;
    child(){
        System.out.println("child this.x="+this.x);
        System.out.println("child super.x"+super.x);
    }
    void show(){
        int x=40;
        System.out.println("local x="+x);
        System.out.println("this.x="+this.x);
        System.out.println("super.x="+super.x);
    }
    public static void main(String[] args){
        child c = new child();
        c.show();
    }
}