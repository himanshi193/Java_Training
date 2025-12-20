//6. Create a class Book with title, author, and price. Add a method to apply a discount of 10% and
//display the final price.
class Book{
    String title;
    String author;
    double price;
    Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    void applyDiscount(){
        price=price-(price*0.10);
    }
    void displayPrice(){
        System.out.println("Final price of \"" +title+"\"by"+author+ "is:rupees"+price);
    }
}
public class DiscountedBook {
    public static void main(String[] args){
        Book b1 = new Book("Clean code","Robin Martin",500);
        b1.displayPrice();
    }
}