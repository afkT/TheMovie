package afkt.movie.module.movie.data.api

import afkt.movie.core.lib.bean.movie.MovieDetails
import afkt.movie.core.lib.bean.movie.MoviePosterImages
import afkt.movie.core.lib.bean.movie.PopularMovie
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * detail: Movie API Service
 * @author Ttt
 */
interface MovieService {

    @GET("/3/movie/popular")
    suspend fun getPopularMovie(@Query("page") page: Int): PopularMovie

    @GET("/3/movie/{movie_id}")
    suspend fun getMovieDetails(@Path("movie_id") id: Int): MovieDetails

    @GET("/3/movie/{movie_id}/images")
    suspend fun getMoviePosterImages(@Path("movie_id") id: Int): MoviePosterImages
}