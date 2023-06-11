import java.util.Objects;

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

    public String toString() {
        return "Название книги : " + bookTitle + " Автор : " + author.toString() + " Количество страниц : " + pagesNumber + " Год изания : " + publicationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pagesNumber == book.pagesNumber && publicationYear == book.publicationYear && Objects.equals(author, book.author) && Objects.equals(bookTitle, book.bookTitle);
    }
    @Override
    public int hashCode() {
        return Objects.hash(author, bookTitle, pagesNumber, publicationYear);
    }
}
