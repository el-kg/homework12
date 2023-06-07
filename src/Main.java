import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Умберто ", "Эко");
        Author author2 = new Author("Кобо ", "Абэ");

        Book book1 = new Book("Имя розы", author1, 672, 0);
        Book book2 = new Book("Женщина в песках", author2, 224, 0);
        book1.setPublicationYear(1980);
        book2.setPublicationYear(1962);

    }
}
