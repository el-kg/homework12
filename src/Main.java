import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Умберто ", "Эко");
        Author author2 = new Author("Кобо ", "Абэ");

        Book book1 = new Book("Имя розы", author1, 672, 0);
        Book book2 = new Book("Женщина в песках", author2, 224, 0);
        book1.setPublicationYear(1980);
        book2.setPublicationYear(1962);
        System.out.println("Название книги : " + book1.getBookTitle());
        System.out.println("Автор : " + book1.getAuthor().getName() + " " + book1.getAuthor().getSurName());
        System.out.println("Количество страниц: " + book1.getPagesNumber());
        System.out.println("Год выпуска : " + book1.getPublicationYear());
    }
}
