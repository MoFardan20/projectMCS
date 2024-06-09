package com.example.projectmcs

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import org.w3c.dom.Text

class DollDetail : AppCompatActivity() {
    private lateinit var backButton: ImageView
    private lateinit var imgDoll: ImageView
    private lateinit var nameDoll: TextView
    private lateinit var ratingDoll: TextView
    private lateinit var descDoll: TextView
    private lateinit var priceDoll: TextView
    private lateinit var buyButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doll_detail)

        backButton = findViewById(R.id.backButton)
        imgDoll = findViewById(R.id.imgDoll)
        nameDoll = findViewById(R.id.nameDoll)
        ratingDoll = findViewById(R.id.ratingDoll)
        descDoll = findViewById(R.id.descDoll)
        priceDoll = findViewById(R.id.priceDoll)
        buyButton = findViewById(R.id.buyButton)

        val img = intent.getStringExtra("image")
        val name = intent.getStringExtra("name")
        val rating = intent.getStringExtra("rating")
        val desc = intent.getStringExtra("desc")
        val price = intent.getStringExtra("price")


        nameDoll.text = name
        ratingDoll.text = rating
        descDoll.text = desc
        priceDoll.text = "Rp $price,00"

        Glide.with(this)
            .load(img)
            .into(imgDoll)

        backButton.setOnClickListener {
            finish()
        }







    }
}