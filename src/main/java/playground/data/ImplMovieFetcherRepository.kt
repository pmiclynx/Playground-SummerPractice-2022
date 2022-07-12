package playground.data

import playground.domain.Movie
import playground.domain.MovieDataSource
import playground.domain.MovieFetcherRepository

class ImplMovieFetcherRepository(private val dataSource: MovieDataSource): MovieFetcherRepository {

    override fun getMovies(): List<Movie> {
        return dataSource.getMovies()
    }
}