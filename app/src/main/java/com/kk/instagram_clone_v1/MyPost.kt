package com.kk.instagram_clone_v1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MyPost : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_post)
    }
    fun quit(view: View){
        val intent= Intent(applicationContext,Gallery::class.java)
        startActivity(intent)
        finish()
    }
    fun editMyPost(view:View){
        val intent=Intent(applicationContext,PostUpdate::class.java)
        startActivity(intent)
    }
}