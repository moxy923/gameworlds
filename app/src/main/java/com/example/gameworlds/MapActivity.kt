package com.example.gameworlds

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_map.*
import kotlinx.android.synthetic.main.activity_world_select.*
import kotlinx.android.synthetic.main.activity_world_view.*

class MapActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)

        btn_leaveAreaSelect.setOnClickListener {
            val intent = Intent(this, WorldView::class.java)
            startActivity(intent)
            finish()
        }

    }
}