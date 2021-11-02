package day01;

public class MovieMain {
    public static void main(String[] args) {
        Movie movie = new Movie("Titanic", 1997);
        movie.addActor(new Actor("Leonardo Dicaprio", 1968));
        movie.addActor(new Actor("Joska Pista", 1993));
        movie.addActor(new Actor("Sanyi Bacsi", 1964));
        movie.addActor(new Actor("John Doe", 1965));
        movie.addActor(new Actor("Jane Doe", 1972));

        System.out.println("Actors in their twenties: " + movie.actorsInTheirTwenties());
    }
}
