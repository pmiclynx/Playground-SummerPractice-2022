package playground.data.sources

import playground.domain.Movie
import playground.domain.MovieDataSource
import java.util.*

class LocalMovieDataSource : MovieDataSource {
    override fun getMovies(): List<Movie> {
        val list = ArrayList<Movie>()
        (0..10).forEach { item ->
            list.add(
                Movie(
                    name = "Local Movie name $item",
                    imageUrl = "https//testLink$item"
                )
            )
        }
        return list
    }
}