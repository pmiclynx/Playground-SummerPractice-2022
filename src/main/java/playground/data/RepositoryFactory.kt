package playground.data

import playground.data.sources.LocalMovieDataSource
import playground.data.sources.RemoteMovieDataSource
import playground.domain.MovieDataSource
import playground.domain.MovieFetcherRepository

fun getMovieFetcherRepository(hasInternetConnection: Boolean): MovieFetcherRepository {
    return ImplMovieFetcherRepository(getMovieDataSource(hasInternetConnection))
}

fun getMovieDataSource(hasInternetConnection: Boolean): MovieDataSource {
    if (hasInternetConnection) {
        return RemoteMovieDataSource()
    }

    return LocalMovieDataSource()
}