package com.example.gameworlds

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_world_view.*

class WorldView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_world_view)

        btn_viewWorldMap.setOnClickListener {
            val intent = Intent(this, MapActivity::class.java)
            startActivity(intent)
            finish()
        }
        btn_view1.setOnClickListener {
            val intent = Intent(this, MapActivity::class.java)
            startActivity(intent)
            finish()
        }
        btn_view2.setOnClickListener {
            val intent = Intent(this, MapActivity::class.java)
            startActivity(intent)
            finish()
        }
        btn_view3.setOnClickListener {
            val intent = Intent(this, MapActivity::class.java)
            startActivity(intent)
            finish()
        }
        btn_view4.setOnClickListener {
            val intent = Intent(this, MapActivity::class.java)
            startActivity(intent)
            finish()
        }
        btn_view5.setOnClickListener {
            val intent = Intent(this, MapActivity::class.java)
            startActivity(intent)
            finish()
        }
        btn_view6.setOnClickListener {
            val intent = Intent(this, MapActivity::class.java)
            startActivity(intent)
            finish()
        }
        btn_view7.setOnClickListener {
            val intent = Intent(this, MapActivity::class.java)
            startActivity(intent)
            finish()
        }
        btn_view8.setOnClickListener {
            val intent = Intent(this, MapActivity::class.java)
            startActivity(intent)
            finish()
        }
        btn_viewWorldMap.setOnClickListener {
            val intent = Intent(this, MapActivity::class.java)
            startActivity(intent)
            finish()
        }
        btn_returnWorldSelect.setOnClickListener {
            val intent = Intent(this, WorldSelect::class.java)
            startActivity(intent)
            finish()
        }
    }
}