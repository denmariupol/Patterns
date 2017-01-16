/**
 * Created by den on 2017-01-15.
 */
public class BookFactory {
    Book book;

    public BookFactory(Book book) {
        this.book = book;
    }
    Book cloneBook(){
        return (Book)book.copy();
    }
}
