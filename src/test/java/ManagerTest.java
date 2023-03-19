import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {
    @Test
    public void testAdd() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Book book1 = new Book(1, "112263",100,"Steven king");
        Book book2 = new Book(2, "War and Piece",200,"Tolstoy");
        Book book3 = new Book(3, "War of the Worlds",300,"George Wells");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        Proguct[] actual = repo.findAll();
        Proguct[] expected = {book1,book2,book3};

        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void testSearch() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Book book1 = new Book(1, "112263",100,"Steven king");
        Book book2 = new Book(2, "War and Piece",200,"Tolstoy");
        Book book3 = new Book(3, "War of the Worlds",300,"George Wells");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        Proguct[] actual = manager.searchBy("Piece");
        Proguct[] expected = {book2};

        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void testSearch2() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Book book1 = new Book(1, "112263",100,"Steven king");
        Book book2 = new Book(2, "War and Piece",200,"Tolstoy");
        Book book3 = new Book(3, "War of the Worlds",300,"George Wells");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        Proguct[] actual = manager.searchBy("War");
        Proguct[] expected = {book2,book3};

        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void testSearch3() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Book book1 = new Book(1, "112263",100,"Steven king");
        Book book2 = new Book(2, "War and Piece",200,"Tolstoy");
        Book book3 = new Book(3, "War of the Worlds",300,"George Wells");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        Proguct[] actual = manager.searchBy("112263");
        Proguct[] expected = {book1};

        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void testSearch5() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Book book1 = new Book(1, "112263",100,"Steven king");
        Book book2 = new Book(2, "War and Piece",200,"Tolstoy");
        Book book3 = new Book(3, "War of the Worlds",300,"George Wells");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        Proguct[] actual = manager.searchBy("1424");
        Proguct[] expected = {};

        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void testAdd2() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Smatrphone smatrphone1 = new Smatrphone  (1, "C100",10000,"Samsung");
        Smatrphone smatrphone2 = new Smatrphone(2, "5S",20000,"Apple");
        Smatrphone smatrphone3 = new Smatrphone(3, "S100",15000,"Samsung");

        manager.add(smatrphone1);
        manager.add(smatrphone2);
        manager.add(smatrphone3);
        Proguct[] actual = repo.findAll();
        Proguct[] expected = {smatrphone1,smatrphone2,smatrphone3};

        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void testSearchSmatrphone() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Smatrphone smatrphone1 = new Smatrphone  (1, "C100",10000,"Samsung");
        Smatrphone smatrphone2 = new Smatrphone(2, "5S",20000,"Apple");
        Smatrphone smatrphone3 = new Smatrphone(3, "S100",15000,"Samsung");

        manager.add(smatrphone1);
        manager.add(smatrphone2);
        manager.add(smatrphone3);
        Proguct[] actual = manager.searchBy("C100");
        Proguct[] expected = {smatrphone1};

        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void testSearch4() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Book book1 = new Book(1, "112263",100,"Steven king");
        Book book2 = new Book(2, "War and Piece",200,"Tolstoy");
        Book book3 = new Book(3, "War of the Worlds",300,"George Wells");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        Proguct[] actual = manager.searchBy("1");
        Proguct[] expected = {book1};

        Assertions.assertArrayEquals(expected,actual);
    }

}