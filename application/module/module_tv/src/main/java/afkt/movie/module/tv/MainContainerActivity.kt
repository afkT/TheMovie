package afkt.movie.module.tv

import afkt.movie.core.lib.base.app.BaseAppActivity
import afkt.movie.core.lib.base.controller.ui.ext.defaultMainContainerController
import afkt.movie.core.lib.base.controller.ui.ext.setExitBackIntercept
import afkt.movie.core.lib.base.controller.ui.theme.defaultMainContainerUITheme
import afkt.movie.core.lib.router.module.tv.TvRouter
import afkt.movie.module.tv.databinding.TvAppContainerBinding
import com.alibaba.android.arouter.facade.annotation.Route
import dev.mvvm.utils.toResString

@Route(path = TvRouter.PATH_MAIN, group = TvRouter.GROUP)
class MainContainerActivity : BaseAppActivity<TvAppContainerBinding, TvViewModel>(
    R.layout.tv_app_container, BR.viewModel, simple_UITheme = {
        it.defaultMainContainerUITheme()
    }, simple_PreLoad = {
        it.apply {
            uiController.defaultMainContainerController(
                R.string.app_name.toResString()
            )
            // 设置返回键退出 App 拦截监听
            keyEventController.setExitBackIntercept(BuildConfig.MODULE_NAME)
        }
    }
)