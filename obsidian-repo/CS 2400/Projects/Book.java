public class Book {
    private String title;
    private String author;
    private int yearPublished;
    private boolean isAvailable;

    public Book(String title, String author, int yearPublished) {
        isAvailable = true;
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public void borrowBook() {
        if (!isAvailable) {
            System.out.println("The book '" + title + "' is already borrowed");
        }
        else {
            isAvailable = false;
            System.out.println("The book '" + title + "' has been borrowed");
        }
    }

    public void returnBook() {
        if (isAvailable) {
            System.out.println("The book '" + title + "' is already in the library");
        }
        else {
            isAvailable = true;
            System.out.println("The book '" + title + "' has been returned");
        }
    }

    public void displayBookInfo() {
        String availability = "";
        if (isAvailable) {
            availability = "Yes";
        }
        else {
            availability = "No";
        }
        System.out.printf("Title: %s%nAuthor: %s%nYear Published: %d%nAvailability: %s%n", title, author, yearPublished, availability);
    }
    
}