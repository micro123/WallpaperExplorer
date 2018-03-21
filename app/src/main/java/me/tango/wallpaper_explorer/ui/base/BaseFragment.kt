package me.tango.wallpaper_explorer.ui.base

import android.app.Fragment
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by tang on 18-3-21.
 */
abstract class BaseFragment<in V : BaseMvpView, P : BaseMvpPresenter<V>> : Fragment(), BaseMvpView {

    protected var mPresenter: P? = null
    override fun getViewContext() = activity as Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mPresenter = getPresenter()
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view = inflater!!.inflate(getLayout(), container, false)
        mPresenter!!.attachView(view as V)
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        mPresenter!!.detachView()
    }

    abstract fun getLayout(): Int

    abstract fun getPresenter(): P


}