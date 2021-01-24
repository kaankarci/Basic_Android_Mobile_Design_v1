package com.kk.instagram_clone_v1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun editPost(view:View){
        val intent=Intent(applicationContext,Gallery::class.java)
        startActivity(intent)
    }
    fun editProfile(view:View){
        val intent=Intent(applicationContext,Edit_Profile::class.java)
        startActivity(intent)
    }
}