package com.kk.instagram_clone_v1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class PostUpdate : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post_update)
    }
    fun quit(view: View){
        val intent= Intent(applicationContext,MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}