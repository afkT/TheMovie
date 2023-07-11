package afkt.movie.module.movie

import afkt.movie.core.lib.base.app.BaseViewModel

class MovieViewModel(
    private val repository: MovieRepository = MovieRepository()
) : BaseViewModel()