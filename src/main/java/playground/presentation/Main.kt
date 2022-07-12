package playground.presentation

import playground.domain.MovieFetcherRepository
import playground.data.getMovieFetcherRepository

fun main() {
    val repository: MovieFetcherRepository = getMovieFetcherRepository(true)

    repository.getMovies().forEach {
        println(it)
    }
}