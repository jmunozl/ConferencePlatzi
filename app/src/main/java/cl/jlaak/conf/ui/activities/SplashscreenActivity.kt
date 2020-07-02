package cl.jlaak.conf.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cl.jlaak.conf.R

class SplashscreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)
    }
}