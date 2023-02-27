public class MovieManager {
    private MoviePoster[] movies = new MoviePoster[0];
    private int limit;

    public MovieManager() {
        this.limit = 10;
    }

    public MovieManager(int limit) {
        this.limit = limit;
    }

    public void addMovie(MoviePoster movie) {
        MoviePoster[] tmp = new MoviePoster[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public MoviePoster[] findAll() {
        return movies;
    }

    public MoviePoster[] findList() {
        int resultLength;
        if (limit > movies.length) {
            resultLength = movies.length;
        } else {
            resultLength = limit;
        }
        MoviePoster[] result = new MoviePoster[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }

}

