/**
 * Created by maulana kavaldo on 18/12/2020.
 */package com.MaulanaKavaldo5180411365

 

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class HasilActivity: AppCompatActivity() {

    private lateinit var Judul: TextView
    private lateinit var desc: TextView
    private lateinit var Img: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil)

        Judul = findViewById(R.id.txtnama)
        desc = findViewById(R.id.txtdesc)
        Img = findViewById(R.id.img)

        val bundle = intent.extras!!

        //Menerima dan menampilkan daridari yang diambil
        Judul.setText(bundle.getString("Judul"))
        desc.setText(bundle.getString("desc"))
        Img.setImageResource(bundle.getInt("Img"))
    }
}