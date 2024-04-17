// Abstract class Publication
abstract class Publication {
    private String title;


    public Publication(String title) {
        this.title = title;
    }


    abstract String getPublicationType();


    public String getTitle() {
        return this.title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    @Override
    public String toString() {
        return getPublicationType() + ": " + getTitle();
    }
}


class Magazine extends Publication {

    public Magazine(String title) {
        super(title);
    }


    @Override
    String getPublicationType() {
        return "Revista";
    }
}

// Subclass Book
class Book extends Publication {

    public Book(String title) {
        super(title);
    }


    @Override
    String getPublicationType() {
        return "Libro";
    }
}
