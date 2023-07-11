package afkt.movie.module.movie.feature.details

import afkt.movie.core.lib.base.app.BaseAppActivity
import afkt.movie.core.lib.base.controller.ui.theme.defaultActivityBlankUITheme
import afkt.movie.core.lib.router.module.movie.MovieRouter
import afkt.movie.module.movie.BR
import afkt.movie.module.movie.MovieViewModel
import afkt.movie.module.movie.R
import afkt.movie.module.movie.databinding.MovieActivityDetailsBinding
import androidx.navigation.fragment.NavHostFragment
import com.alibaba.android.arouter.facade.annotation.Route

@Route(path = MovieRouter.PATH_MOVIE_DETAILS_ACTIVITY, group = MovieRouter.GROUP)
class MovieDetailsActivity : BaseAppActivity<MovieActivityDetailsBinding, MovieViewModel>(
    R.layout.movie_activity_details, BR.viewModel, simple_UITheme = {
        it.defaultActivityBlankUITheme()
    }, simple_Agile = {
        val fragment = it.supportFragmentManager.findFragmentById(
            it.binding.navContainer.id
        ) as NavHostFragment
        val navController = fragment.navController
        navController.navigate(R.id.MovieDetailsFragment, it.intent.extras)
    }
)