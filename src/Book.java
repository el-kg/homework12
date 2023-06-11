public class Book {
    private Author author;
    private String bookTitle;
    private int pagesNumber;
    private int publicationYear;

    public Book(String bookTitle, Author author, int pages, int year) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.pagesNumber = pages;
        this.publicationYear = year;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getPagesNumber() {
        return pagesNumber;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setPagesNumber(int pagesNumber) {
        this.pagesNumber = pagesNumber;
    }

    public void setPublicationYear(int Year) {
        this.publicationYear = Year;
    }

    public Author getAuthor() {
        return author;
    }
}
