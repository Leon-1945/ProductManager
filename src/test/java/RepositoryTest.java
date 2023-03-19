import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryTest {
    @Test
    public void testRemove() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Book book1 = new Book(1, "112263",100,"Steven king");
        Book book2 = new Book(2, "War and Piece",200,"Tolstoy");
        Book book3 = new Book(3, "War of the Worlds",300,"George Wells");

        repo.add(book1);
        repo.add(book2);
        repo.add(book3);
        repo.removeById(1);
        Proguct[] actual = repo.findAll();
        Proguct[] expected = {book2, book3};
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testRemove2() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Book book1 = new Book(1, "112263",100,"Steven king");
        Book book2 = new Book(2, "War and Piece",200,"Tolstoy");
        Book book3 = new Book(3, "War of the Worlds",300,"George Wells");

        repo.add(book1);
        repo.add(book2);
        repo.add(book3);
        repo.removeById(2);
        Proguct[] actual = repo.findAll();
        Proguct[] expected = {book1, book3};
        Assertions.assertArrayEquals(expected, actual);
    }
}