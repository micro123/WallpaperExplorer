package me.tango.wallpaper_explorer.ui.activity

import android.animation.AnimatorInflater
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Window
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_splash.*
import me.tango.wallpaper_explorer.R

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Full Screen
        requestWindowFeature(Window.FEATURE_NO_TITLE) // No Title
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN) // No Status Bar

        setContentView(R.layout.activity_splash)
        startAnimations()
    }

    private fun startAnimations() {
        val animator = AnimatorInflater.loadAnimator(this, R.animator.splash_animator)
        animator.setTarget(container)
        animator.start()
    }
}
