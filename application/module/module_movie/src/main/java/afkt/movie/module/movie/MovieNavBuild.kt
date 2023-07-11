package afkt.movie.module.movie

import afkt.movie.core.lib.bean.base.TMDBCommon
import afkt.movie.core.lib.router.module.movie.MovieNav

/**
 * detail: MovieNav 跳转参数构建
 * @author Ttt
 */
object MovieNavBuild {

    /**
     * 跳转 Movie Details Path
     * @receiver TMDBCommon
     * @return Postcard
     */
    internal fun TMDBCommon.routerMovieDetails() {
        MovieNav.buildMovieDetails(
            id.toString(), title()
        ).navigation()
    }
}