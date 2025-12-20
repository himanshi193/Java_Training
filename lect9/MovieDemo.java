//8. Create a class Movie with name, rating, and releaseYear. Create 5 movie objects and display
//movies released after 2020.
class Movie{
    String name;
    double rating;
    int releaseYear;
    Movie(String name, double rating, int releaseYear){
        this.name = name;
        this.rating = rating;
        this.releaseYear = releaseYear;
    }
    void displayDetails(){
        System.out.println("Movie:"+name+",Rating:"+rating+",Release Year:"+releaseYear);
        System.out.println("---------------------------------------------------------------");
    }
}
public class MovieDemo {
            public static void main(String[] args){
                Movie m1 = new Movie("Inception", 8.8, 2010);
                Movie m2 = new Movie("Avengers: Endgame", 8.4, 2019);
                Movie m3 = new Movie("Spider-Man: No Way Home", 8.2, 2021);
                Movie m4 = new Movie("Dune", 8.1, 2021);
                Movie m5 = new Movie("Oppenheimer", 8.9, 2023);

                System.out.println("Movies released after 2020:");
                Movie[] movies = {m1, m2, m3, m4, m5};

                for (Movie m : movies) {
                    if (m.releaseYear > 2020) {
                        m.displayDetails();
                    }
                }
            }
    }
