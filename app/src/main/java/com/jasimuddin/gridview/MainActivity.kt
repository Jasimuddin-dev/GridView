package com.jasimuddin.gridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var gridView:GridView

    var nameList=ArrayList<String>()
    var imageList=ArrayList<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        gridView=findViewById(R.id.gridView)
        fillArray()
        val adapter=AnimalsAdapter(this@MainActivity,nameList, imageList)
        gridView.adapter=adapter

        gridView.setOnItemClickListener { adapterView, view, position,id ->

            Toast.makeText(applicationContext,
                "You select the ${nameList[position]}",Toast.LENGTH_LONG).show()

        }

    }

    private fun fillArray()
    {
        nameList.add("Banana")
        nameList.add("Bird")
        nameList.add("Butterfly")
        nameList.add("Cat")
        nameList.add("Chicken")
        nameList.add("Dog")
        nameList.add("Flower")
        nameList.add("Grape")
        nameList.add("Horse")
        nameList.add("Panther")

        imageList.add(R.drawable.banana)
        imageList.add(R.drawable.bird)
        imageList.add(R.drawable.butterfly)
        imageList.add(R.drawable.cat)
        imageList.add(R.drawable.chicken)
        imageList.add(R.drawable.dog)
        imageList.add(R.drawable.flowers)
        imageList.add(R.drawable.grape)
        imageList.add(R.drawable.horse)
        imageList.add(R.drawable.panther)
    }

}