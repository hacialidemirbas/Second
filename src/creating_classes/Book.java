package creating_classes;

public class Book {
    private String bookTitle;
    private String bookAuthor;
    private String ISBN;
    private int numOfPage;
    private  boolean availability;
    private String borrowDate;
    private String returnDate;

    public Book( String bookTitle, String bookAuthor, String ISBN, int numOfPage, boolean availability, String borrowDate,String returnDate){
        this.bookTitle=bookTitle;
        this.bookAuthor=bookAuthor;
        this.ISBN=ISBN;
        this.numOfPage=numOfPage;
        this.availability=availability;
        this.borrowDate=borrowDate;
        this.returnDate=returnDate;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getNumOfPage() {
        return numOfPage;
    }

    public void setNumOfPage(int numOfPage) {
        this.numOfPage = numOfPage;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }
public void borrowBook(String date){
        String[] arr= date.split("/");
        int month=Integer.parseInt(arr[0]);
        int day= Integer.parseInt(arr[1]);
        if((month>0&&month<13)&&(day>0&&day<32)){
            this.borrowDate=date;
        }
        else{
            System.out.println("Date is not correct");
        }
}
public void returnBook(String date){
        this.availability=true;
        String dateArr[]=date.split("/");
        int month= Integer.parseInt(dateArr[0]);
        int day= Integer.parseInt(dateArr[1]);
        if((month>0&&month<13)&&(day>0&&day<32)){
    this.returnDate=date;
    }
        else{
            System.out.println("Date is wrong");
        }
}
    @Override
    public String toString() {
        return "Book{" +
                "bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", numOfPage=" + numOfPage +
                ", availability=" + availability +
                ", borrowDate='" + borrowDate + '\'' +
                ", returnDate='" + returnDate + '\'' +
                '}';
    }
}
