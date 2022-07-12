package playground.domain

interface MovieFetcherRepository {
    fun getMovies(): List<Movie>
}