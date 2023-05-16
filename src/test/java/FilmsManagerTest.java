import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmsManagerTest {
    FilmsManager manager = new FilmsManager();

    FilmsItems film1 = new FilmsItems(1, "Бладшот", "боевик", "постер");
    FilmsItems film2 = new FilmsItems(2, "Вперёд", "мультфильм", "постер");
    FilmsItems film3 = new FilmsItems(3, "Отель (Белград)", "комедия", "постер");
    FilmsItems film4 = new FilmsItems(4, "Джентельмены", "боевик", "постер");
    FilmsItems film5 = new FilmsItems(5, "Человек- невидимка", "ужасы", "постер");
    FilmsItems film6 = new FilmsItems(6, "Тролли. Мировой тур", "мультфильм", "постер");
    FilmsItems film7 = new FilmsItems(7, "Номер один", "комедия", "постер");


    @Test
    public void allFilms() {
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);


        FilmsItems[] expected = {film1, film2, film3, film4, film5, film6, film7};
        FilmsItems[] actual = manager.findAllFilms();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addFilm() {
        manager.addFilm(film2);

        FilmsItems[] expected = {film2};
        FilmsItems[] actual = manager.findAllFilms();

        Assertions.assertArrayEquals(expected , actual);
    }

    @Test
    public void lastFilm() {
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);

        FilmsItems[] expected = {film7, film6, film5, film4, film3};
        FilmsItems[] actual = manager.findLastFilm();

        Assertions.assertArrayEquals(expected , actual);
    }

    @Test
    public void testLimit() {

        manager.getLimit();

        int expected = 5;
        int actual = manager.getLimit();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void FilmsAboveLimit() {
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);

        FilmsItems[] expected = {film3, film2, film1};
        FilmsItems[] actual = manager.findLastFilm();

        Assertions.assertArrayEquals(expected, actual);
    }

}
