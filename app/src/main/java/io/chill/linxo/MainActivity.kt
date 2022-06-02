package io.chill.linxo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.chill.linxo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // use of viewBinding to inflate layout
        setContentView(ActivityMainBinding.inflate(layoutInflater).root)
    }
}