// Q: Write a Java program where:
//     - Class Books has method read()
//     - Class Novel inherits Book and has Method storyLine()
//     - Create an object of Novel and call both methods.
class Books{
    void read(){
        System.out.println("Reading a book");
    }
}
class Novel extends Books{
    void storyline(){
        System.out.println("The novel has a interesting storyline");
    }
}
public class BookNovel {
    public static void main(String[] args){
        Novel n= new Novel();
        n.read();n.storyline();
    }
}