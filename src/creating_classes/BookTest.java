package creating_classes;

public class BookTest {
    public static void main(String[] args) {
        Book myBook= new Book("War and peace", "Tolstoy", "01234321", 1200, true, "", "");
        System.out.println(myBook.toString());
        myBook.borrowBook("3/18/2020");
        System.out.println(myBook.getBorrowDate());
        System.out.println(myBook.isAvailability());
        myBook.borrowBook("3/18/2020");
        myBook.returnBook("3/20/2020");
        System.out.println(myBook.isAvailability());
    }
}
