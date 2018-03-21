package me.tango.wallpaper_explorer.ui.base

/**
 * Created by tang on 18-3-21.
 */
open class BasePresenterImpl<V : BaseMvpView> : BaseMvpPresenter<V> {
    protected var mView: V? = null

    override fun attachView(view: V) {
        mView = view
    }

    override fun detachView() {
        mView = null
    }
}