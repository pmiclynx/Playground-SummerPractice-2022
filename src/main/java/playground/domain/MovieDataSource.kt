package playground.domain

interface MovieDataSource {
    fun getMovies(): List<Movie>
}