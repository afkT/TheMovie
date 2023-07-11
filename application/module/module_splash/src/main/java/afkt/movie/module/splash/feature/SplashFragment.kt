package afkt.movie.module.splash.feature

import afkt.movie.core.lib.base.app.BaseAppFragment
import afkt.movie.module.splash.BR
import afkt.movie.module.splash.R
import afkt.movie.module.splash.SplashViewModel
import afkt.movie.module.splash.databinding.SplashFragmentBinding

class SplashFragment : BaseAppFragment<SplashFragmentBinding, SplashViewModel>(
    R.layout.splash_fragment, BR.viewModel
)