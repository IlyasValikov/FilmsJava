public class FilmsManager {

    private FilmsItems[] films = new FilmsItems[0];
    private int limit;

    public FilmsManager() {
        this.limit = 5;
    }

    public FilmsManager(int limit) {
        this.limit = limit;
    }


    public void addFilm(FilmsItems film) {
        FilmsItems[] tmp = new FilmsItems[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public FilmsItems[] findAllFilms() {
        return films;

    }

    public FilmsItems[] findLastFilm() {
        int resultlenth;
        if (films.length < limit) {
            resultlenth = films.length;
        } else  {
            resultlenth = limit;
        }
        FilmsItems[] tmp = new FilmsItems[resultlenth];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }
}
