public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private boolean isAvailable;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isAvailable = true;
    }

 
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean isAvailable() {
        return isAvailable;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }


    public boolean borrow() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book '" + title + "' has been borrowed.");
            return true;
        } else {
            System.out.println("Book '" + title + "' is not available.");
            return false;
        }
    }


    public void returnBook() {
        isAvailable = true;
        System.out.println("Book '" + title + "' has been returned.");
    }

    public static void main(String[] args) {
        Book book = new Book("Reacher", "Pranab .B", 1999);
        System.out.println("Available: " + book.isAvailable());
        book.borrow();
        System.out.println("Available: " + book.isAvailable());
        book.returnBook();
        System.out.println("Available: " + book.isAvailable());
    }
}