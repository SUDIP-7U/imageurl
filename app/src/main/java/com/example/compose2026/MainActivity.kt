package com.example.compose2026

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import coil.load

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView: ImageView = findViewById(R.id.productImageView)

        // Server-hosted image URL
        val imageUrl = "https://chaldn.com/_mpimage/ruchi-hot-tomato-sauce-350-gm?src=https%3A%2F%2Feggyolk.chaldal.com%2Fapi%2FPicture%2FRaw%3FpictureId%3D133071&q=best&v=1&m=400&webp=1"


        imageView.load(imageUrl) {

            placeholder(R.drawable.placeholder)

            error(R.drawable.error_image)

        }
    }
}
