public class Book extends Proguct {
    private String Author;

    public Book(int id, String name, int price, String author) {
        super(id, name, price);
        Author = author;
    }

    public String getAuthor() {
        return Author;
    }
}
