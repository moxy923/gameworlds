package com.example.gameworlds

import android.content.Intent
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_world_select.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN)

        //Click the button to go to the next activity: WorldSelect
        btn_enter.setOnClickListener {
            val intent = Intent(this, WorldSelect::class.java)
            startActivity(intent)
            finish()

        }

    }
}
