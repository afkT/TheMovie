package afkt.movie.module.tv

import afkt.movie.core.lib.bean.base.TMDBCommon
import afkt.movie.core.lib.router.module.tv.TvNav

/**
 * detail: TvNav 跳转参数构建
 * @author Ttt
 */
object TvNavBuild {

    /**
     * 跳转 Tv Details Path
     * @receiver TMDBCommon
     * @return Postcard
     */
    internal fun TMDBCommon.routerTvDetails() {
        TvNav.buildTvDetails(
            id.toString(), title()
        ).navigation()
    }
}