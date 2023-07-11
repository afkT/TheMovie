package afkt.movie.module.splash

import afkt.movie.core.lib.bean.splash.SplashAds
import afkt.movie.core.lib.router.BaseProviderExt
import afkt.movie.core.lib.router.module.splash.ISplashProvider
import afkt.movie.core.lib.router.module.splash.SplashRouter
import afkt.movie.lib.splash.ads.SplashAdsUtils
import android.content.Context
import androidx.databinding.ObservableField
import com.alibaba.android.arouter.facade.annotation.Route

@Route(path = SplashRouter.PATH_SPLASH_PROVIDER, group = SplashRouter.GROUP)
class SplashProvider : ISplashProvider,
    BaseProviderExt(SplashProvider::class.java.simpleName) {

    override fun init(context: Context?) {
        SplashAdsUtils.instance.init(context)
    }

    // ===================
    // = ISplashProvider =
    // ===================

    override fun getAdsOb(): ObservableField<SplashAds> {
        return SplashAdsUtils.instance.getAdsOb()
    }

    override fun queryAds() {
        SplashAdsUtils.instance.queryAds()
    }

    override fun insertAds(list: List<SplashAds>): Boolean {
        return SplashAdsUtils.instance.insertAds(list)
    }
}