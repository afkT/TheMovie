package afkt.movie.module.person

import afkt.movie.core.lib.base.app.BaseAppActivity
import afkt.movie.core.lib.base.controller.ui.theme.defaultAppLauncherUITheme
import afkt.movie.core.lib.config.AppLibConfig
import afkt.movie.core.lib.router.module.person.PersonNav
import afkt.movie.core.lib.router.module.person.PersonRouter
import afkt.movie.module.person.databinding.PersonAppLauncherBinding
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import me.jessyan.autosize.internal.CancelAdapt

class AppLauncherActivity : BaseAppActivity<PersonAppLauncherBinding, PersonViewModel>(
    R.layout.person_app_launcher, BR.viewModel, simple_UITheme = {
        it.defaultAppLauncherUITheme()
    }
),
    CancelAdapt {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 非组件化编译运行直接关闭页面
        if (!BuildConfig.isModular) {
            finish()
            return
        }

        lifecycleScope.launch {
            delay(AppLibConfig.ROUTER_DELAY_MILLIS)
            PersonNav.build(PersonRouter.PATH_MAIN).navigation()
            finish()
        }
    }
}