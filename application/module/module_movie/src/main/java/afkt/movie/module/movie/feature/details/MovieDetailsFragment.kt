package afkt.movie.module.movie.feature.details

import afkt.movie.core.lib.base.app.extension.loading.BaseLoadingSkeletonFragment
import afkt.movie.core.lib.router.module.movie.MovieRouter
import afkt.movie.module.movie.BR
import afkt.movie.module.movie.R
import afkt.movie.module.movie.databinding.MovieFragmentDetailsBinding
import com.alibaba.android.arouter.facade.annotation.Route

@Route(path = MovieRouter.PATH_MOVIE_DETAILS_FRAGMENT, group = MovieRouter.GROUP)
class MovieDetailsFragment : BaseLoadingSkeletonFragment<MovieFragmentDetailsBinding, MovieDetailsViewModel>(
    R.layout.movie_fragment_details, BR.viewModel, simple_Agile = {
        // 初始化 MovieDetailsFragment ViewModel 调用
        it.viewModel.initializeMovieDetailsFragment(it as MovieDetailsFragment)
    }
)