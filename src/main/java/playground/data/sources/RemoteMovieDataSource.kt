package playground.data.sources

import playground.domain.Movie
import playground.domain.MovieDataSource
import java.util.*

class RemoteMovieDataSource : MovieDataSource {
    override fun getMovies(): List<Movie> {
        val list = ArrayList<Movie>()
        (0..20).forEach { item ->
            list.add(
                Movie(
                    name = "Remote Movie name $item",
                    imageUrl = "https://testLink$item"
                )
            )
        }
        return list
    }
}