
public class PublicationDemo {
    public static void main(String[] args) {
        Publication magazine = new Magazine("Revista Semana");
        Publication book = new Book("Cien años de soledad");

        // Printing out the details of the publications
        System.out.println(magazine); // Prints Magazine: Revista Semana
        System.out.println(book);     // Prints Book: Cien años de soledad
    }
}
