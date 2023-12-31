package afkt.movie.core.lib.base.controller

import afkt.movie.core.lib.base.controller.transition.ITransitionController
import afkt.movie.core.lib.base.split.controller.TransformationLayoutController
import afkt.movie.core.lib.base.split.data.IntentData
import afkt.movie.core.lib.router.module.AppRouter
import android.app.Activity
import com.alibaba.android.arouter.facade.Postcard
import com.skydoves.transformationlayout.TransformationLayout

/**
 * detail: 基础 Activity Transition Animation 跳转动画
 * @author Ttt
 */
class BaseTransitionController(
    private val controller: ITransitionController
) : TransformationLayoutController() {

    /**
     * 在 super.onCreate() 之前调用
     * @param activity Activity
     */
    fun createBeforeOnTransformation(activity: Activity) {
        if (controller.isUseTransformationLayout()) {
            if (controller.isTransformationStartContainer()) {
                super.createBeforeOnTransformationStartContainer(activity)
            }
            if (controller.isTransformationEndContainer()) {
                super.createBeforeOnTransformationEndContainer(activity)
            }
        }
    }

    // =

    /**
     * 路由跳转动画
     * @param layout TransformationLayout
     * @param postcard 跳转路由信息
     * @return `true` success, `false` fail
     */
    fun routerTransition(
        layout: TransformationLayout,
        postcard: Postcard
    ): Boolean {
        return routerTransition(
            layout, AppRouter.routerIntent(layout.context, postcard),
        )
    }

    /**
     * 路由跳转动画
     * @param layout TransformationLayout
     * @param postcard 跳转路由信息
     * @param intentData Intent 传参读写辅助类
     * @return `true` success, `false` fail
     */
    fun routerTransition(
        layout: TransformationLayout,
        postcard: Postcard,
        intentData: IntentData
    ): Boolean {
        AppRouter.routerIntent(layout.context, postcard)?.let {
            intentData.insert(it)
            return routerTransition(layout, it)
        }
        return false
    }
}