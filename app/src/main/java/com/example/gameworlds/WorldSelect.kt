package com.example.gameworlds

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.example.gameworlds.Constants.getWorldScreen
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_world_select.*

class WorldSelect : AppCompatActivity() {
    private var wCurrentPosition: Int = 0
    private var wWorldList: ArrayList<World>? = null
    private var wSelectedOptionPosition: Int = 0



    //THIS IS THE METHOD THAT BRINGS SHIT INTO EXISTENCE
    override fun onCreate(savedInstanceState: Bundle?) {



        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_world_select)
        wWorldList = Constants.getWorlds()
        setWorld()

        //Click on "Enter ______ World" to enter the more detailed view of the world.
        btn_enterworld.setOnClickListener {
            val intent = Intent(this, WorldView::class.java)
            startActivity(intent)
            finish()
        }
        btn_nextWorld.setOnClickListener {
            nextWorld()
            setWorld()

        }
        btn_prevWorld.setOnClickListener {
            prevWorld()
            setWorld()

        }


    }

    private fun setWorld(){
        if (wCurrentPosition == 0){
            val currentWorldList = Constants.getWorldScreen()
            val currentWorld = currentWorldList!![wCurrentPosition]
            btn_enterworld.text = "Enter " + currentWorld.worldName
            iv_worldmap.setImageResource(currentWorld.worldMapSelect)
        }
        if (wCurrentPosition ==1){
            val currentWorldList = Constants.getWorldScreen()
            val currentWorld = currentWorldList!![wCurrentPosition]
            btn_enterworld.text = "Enter " + currentWorld.worldName
            iv_worldmap.setImageResource(currentWorld.worldMapSelect)


        }
    }

    private fun nextWorld(){
        if(wCurrentPosition == wWorldList!!.size){
            Toast.makeText( this, "There are no more worlds, you're at world $wCurrentPosition", Toast.LENGTH_SHORT).show()
        }else{
            wCurrentPosition++
        }



    }

    private fun prevWorld(){
        if(wCurrentPosition==0) {
            Toast.makeText(this, "You are currently at the " + wCurrentPosition + "st world", Toast.LENGTH_SHORT).show()
            wCurrentPosition = 0
        }else{
            wCurrentPosition--
        }

    }



}