import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    MovieManager movie = new MovieManager();
    MoviePoster movie1 = new MoviePoster(1, 1, "Бладшот", "боевик");
    MoviePoster movie2 = new MoviePoster(2, 33, "Вперед", "мультфильм");
    MoviePoster movie3 = new MoviePoster(3, 154, "Отель \"Белград\"", "комедия");
    MoviePoster movie4 = new MoviePoster(4, 13, "Терминатор", "боевик");
    MoviePoster movie5 = new MoviePoster(5, 353, "Мой сосед - Тоторо", "мультфильм");
    MoviePoster movie6 = new MoviePoster(6, 754, "Отель \"Гранд - Будапешт\"", "комедия");
    MoviePoster movie7 = new MoviePoster(7, 338, "Русалочка", "мультфильм");
    MoviePoster movie8 = new MoviePoster(8, 154, "Каникулы строгого режима", "комедия");
    MoviePoster movie9 = new MoviePoster(9, 10, "Матрица", "боевик");
    MoviePoster movie10 = new MoviePoster(10, 303, "Король Лев", "мультфильм");
    MoviePoster movie11 = new MoviePoster(11, 524, "Реальные упыри", "комедия");
    MoviePoster movie12 = new MoviePoster(12, 383, "Тролли. Мировой тур", "мультфильм");
    MoviePoster movie13 = new MoviePoster(13, 454, "Номер один", "комедия");

    @Test
    public void addMovie() {
        movie.addMovie(movie1);
        movie.addMovie(movie2);
        movie.addMovie(movie3);

        MoviePoster[] expected = {movie1, movie2, movie3};
        MoviePoster[] actual = movie.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findListIfMovieOverLimit() {
        movie.addMovie(movie1);
        movie.addMovie(movie2);
        movie.addMovie(movie3);
        movie.addMovie(movie4);
        movie.addMovie(movie5);
        movie.addMovie(movie6);
        movie.addMovie(movie7);
        movie.addMovie(movie8);
        movie.addMovie(movie9);
        movie.addMovie(movie10);
        movie.addMovie(movie11);
        movie.addMovie(movie12);
        movie.addMovie(movie13);

        MoviePoster[] expected = {movie13, movie12, movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4};
        MoviePoster[] actual = movie.findList();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findListIfMovieUnderLimit() {
        MovieManager movie = new MovieManager(7);
        movie.addMovie(movie1);
        movie.addMovie(movie2);
        movie.addMovie(movie3);
        movie.addMovie(movie4);
        movie.addMovie(movie5);

        MoviePoster[] expected = {movie5, movie4, movie3, movie2, movie1};
        MoviePoster[] actual = movie.findList();

        Assertions.assertArrayEquals(expected, actual);

    }
}
