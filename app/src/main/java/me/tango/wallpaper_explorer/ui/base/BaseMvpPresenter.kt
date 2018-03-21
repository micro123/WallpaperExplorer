package me.tango.wallpaper_explorer.ui.base

/**
 * Created by tang on 18-3-21.
 */
interface BaseMvpPresenter<in V : BaseMvpView> {
    fun attachView(view: V)
    fun detachView()
}