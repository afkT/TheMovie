package afkt.movie.module.person.feature.details

import afkt.movie.core.lib.base.app.BaseAppActivity
import afkt.movie.core.lib.base.controller.ui.theme.defaultActivityBlankUITheme
import afkt.movie.core.lib.router.module.person.PersonRouter
import afkt.movie.module.person.BR
import afkt.movie.module.person.PersonViewModel
import afkt.movie.module.person.R
import afkt.movie.module.person.databinding.PersonActivityDetailsBinding
import androidx.navigation.fragment.NavHostFragment
import com.alibaba.android.arouter.facade.annotation.Route

@Route(path = PersonRouter.PATH_PERSON_DETAILS_ACTIVITY, group = PersonRouter.GROUP)
class PersonDetailsActivity : BaseAppActivity<PersonActivityDetailsBinding, PersonViewModel>(
    R.layout.person_activity_details, BR.viewModel, simple_UITheme = {
        it.defaultActivityBlankUITheme()
    }, simple_Agile = {
        val fragment = it.supportFragmentManager.findFragmentById(
            it.binding.navContainer.id
        ) as NavHostFragment
        val navController = fragment.navController
        navController.navigate(R.id.PersonDetailsFragment, it.intent.extras)
    }
)