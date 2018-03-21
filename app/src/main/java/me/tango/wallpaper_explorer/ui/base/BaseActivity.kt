package me.tango.wallpaper_explorer.ui.base

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by tang on 18-3-21.
 */
abstract class BaseActivity<in V : BaseMvpView, P : BaseMvpPresenter<V>> : AppCompatActivity(), BaseMvpView {

    protected var mPresenter: P? = null

    override fun getViewContext() = this
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(getLayout())
        mPresenter = getPresenter()
        mPresenter!!.attachView(this as V)
    }

    override fun onDestroy() {
        super.onDestroy()
        mPresenter!!.detachView()
    }

    abstract fun getPresenter(): P

    abstract fun getLayout(): Int
}