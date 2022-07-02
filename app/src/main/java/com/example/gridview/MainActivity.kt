package com.example.gridview

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var gridView : GridView
    var animalNames = ArrayList<String>()
    var imageList = ArrayList<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gridView = findViewById(R.id.gridView)
        fillArrays()

        val adapter = AnimalAdapter(this,animalNames,imageList)

        gridView.adapter = adapter

        gridView.setOnItemClickListener { adapterView, view, position, id ->

            lateinit var player : MediaPlayer
            Toast.makeText(applicationContext, "You selected the ${animalNames[position]}", Toast.LENGTH_LONG).show()
            if(animalNames[position].equals("Bird")){
                player = MediaPlayer.create(applicationContext, R.raw.bird)
            }
            else if(animalNames[position].equals("Cat")){
                player = MediaPlayer.create(applicationContext, R.raw.cat)
            }
            else if(animalNames[position].equals("Chicken")){
                player = MediaPlayer.create(applicationContext, R.raw.chicken)
            }
            else if(animalNames[position].equals("Dog")){
                player = MediaPlayer.create(applicationContext, R.raw.dog)
            }
            else if(animalNames[position].equals("Fish")){
                player = MediaPlayer.create(applicationContext, R.raw.fish)
            }
            else if(animalNames[position].equals("Monkey")){
                player = MediaPlayer.create(applicationContext, R.raw.monkey)
            }
            else if(animalNames[position].equals("Rabbit")){
                player = MediaPlayer.create(applicationContext, R.raw.rabbit)
            }
            else if(animalNames[position].equals("Sheep")){
                player = MediaPlayer.create(applicationContext, R.raw.sheep)
            }
            else if(animalNames[position].equals("Lion")){
                player = MediaPlayer.create(applicationContext, R.raw.lion)
            }
            player.start()
        }
    }

    fun fillArrays(){
        animalNames.add("Bird")
        animalNames.add("Cat")
        animalNames.add("Chicken")
        animalNames.add("Dog")
        animalNames.add("Fish")
        animalNames.add("Monkey")
        animalNames.add("Rabbit")
        animalNames.add("Sheep")
        animalNames.add("Lion")

        imageList.add(R.drawable.bird)
        imageList.add(R.drawable.cat)
        imageList.add(R.drawable.chicken)
        imageList.add(R.drawable.dog)
        imageList.add(R.drawable.fish)
        imageList.add(R.drawable.monkey)
        imageList.add(R.drawable.rabbit)
        imageList.add(R.drawable.sheep)
        imageList.add(R.drawable.lion)
    }
}