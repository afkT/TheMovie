package afkt.movie.module.person.feature.popular

import afkt.movie.core.lib.base.app.extension.loading.BaseLoadingSkeletonFragment
import afkt.movie.core.lib.router.module.person.PersonRouter
import afkt.movie.module.person.BR
import afkt.movie.module.person.R
import afkt.movie.module.person.databinding.PersonFragmentPopularBinding
import com.alibaba.android.arouter.facade.annotation.Route

@Route(path = PersonRouter.PATH_POPULAR_FRAGMENT, group = PersonRouter.GROUP)
class PopularPersonFragment : BaseLoadingSkeletonFragment<PersonFragmentPopularBinding, PopularPersonViewModel>(
    R.layout.person_fragment_popular, BR.viewModel, simple_Agile = {
        // 初始化 PopularPersonFragment ViewModel 调用
        it.viewModel.initializePopularPersonFragment(it as PopularPersonFragment)
    }
)