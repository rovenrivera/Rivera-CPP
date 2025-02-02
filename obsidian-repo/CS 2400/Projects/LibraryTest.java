public class LibraryTest {
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        Book book2 = new Book("1984", "George Orwell", 1949);
        
        System.out.println("Initial Book Information: ");
        book1.displayBookInfo();
        System.out.println();
        book2.displayBookInfo();
        System.out.println();

        System.out.println("Attempting to borrow 'The Great Gatsby':");
        book1.borrowBook();
        book1.displayBookInfo();
        System.out.println();

        System.out.println("Attempting to borrow 'The Great Gatsby' again:");
        book1.borrowBook();
        System.out.println("Returning 'The Great Gatsby':");
        book1.returnBook();
        book1.displayBookInfo();
        System.out.println();

        System.out.println("Attempting to return 'The Great Gatsby' again:");
        book1.returnBook();
        System.out.println("Attempting to borrow '1984':");
        book2.borrowBook();
        book2.displayBookInfo();
        System.out.println();
    }

}
