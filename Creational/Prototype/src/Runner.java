/**
 * Created by den on 2017-01-15.
 */
public class Runner {
    public static void main(String[] args) {
        Book book = new Book("Den","First book",100);
        System.out.println(book);

        BookFactory factory = new BookFactory(book);
        Book book1 = factory.cloneBook();

        System.out.println(book1);
    }
}
