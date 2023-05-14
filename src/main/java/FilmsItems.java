public class FilmsItems {
    private int filmId;
    private String filmName;
    private String filmGenre;
    private String filmPoster;

    public FilmsItems(int filmId, String filmName, String filmGenre, String filmPoster) {
        this.filmId = filmId;
        this.filmName = filmName;
        this.filmGenre = filmGenre;
        this.filmPoster = filmPoster;
    }

    public int getFilmId() {
        return filmId;
    }

    public String getFilmName() {
        return filmName;
    }

    public String getFilmGenre() {
        return filmGenre;
    }

    public String getFilmPoster() {
        return filmPoster;
    }

    public void setFilmId(int filmId) {

        this.filmId = filmId;
    }

    public void setFilmName(String filmName) {

        this.filmName = filmName;
    }

    public void setFilmGenre(String filmGenre) {

        this.filmGenre = filmGenre;
    }

    public void setFilmPoster(String filmPoster) {

        this.filmPoster = filmPoster;
    }

}
