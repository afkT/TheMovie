package afkt.movie.module.tv.feature.details

import afkt.movie.core.lib.base.app.BaseAppActivity
import afkt.movie.core.lib.base.controller.ui.theme.defaultActivityBlankUITheme
import afkt.movie.core.lib.router.module.tv.TvRouter
import afkt.movie.module.tv.BR
import afkt.movie.module.tv.R
import afkt.movie.module.tv.TvViewModel
import afkt.movie.module.tv.databinding.TvActivityDetailsBinding
import androidx.navigation.fragment.NavHostFragment
import com.alibaba.android.arouter.facade.annotation.Route

@Route(path = TvRouter.PATH_TV_DETAILS_ACTIVITY, group = TvRouter.GROUP)
class TvDetailsActivity : BaseAppActivity<TvActivityDetailsBinding, TvViewModel>(
    R.layout.tv_activity_details, BR.viewModel, simple_UITheme = {
        it.defaultActivityBlankUITheme()
    }, simple_Agile = {
        val fragment = it.supportFragmentManager.findFragmentById(
            it.binding.navContainer.id
        ) as NavHostFragment
        val navController = fragment.navController
        navController.navigate(R.id.TvDetailsFragment, it.intent.extras)
    }
)