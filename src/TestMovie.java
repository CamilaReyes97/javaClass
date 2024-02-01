public class TestMovie {
    public static void main(String[] args) {

        Movie movie1 = new Movie("Avatar", 7.9);
        Movie movie2 = new Movie("Parasite", 8.5);
        Movie movie3 = new Movie("Sound of Freedom", 7.7);

        printMovieDetails(movie1);
        printMovieDetails(movie2);
        printMovieDetails(movie3);
    }

    private static void printMovieDetails(Movie movie) {
        System.out.println("Movie Name: " + movie.getName());
        System.out.println("Rating: " + movie.getRating());
        System.out.println();
    }
}
