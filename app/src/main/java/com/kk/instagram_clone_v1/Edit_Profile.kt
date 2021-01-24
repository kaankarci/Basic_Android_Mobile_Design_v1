package com.kk.instagram_clone_v1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Edit_Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit__profile)
    }
    fun quit(view: View){
        val intent= Intent(applicationContext,MainActivity::class.java)
        startActivity(intent)
        finish()
    }
    fun agree(view:View){
        val intent=Intent(applicationContext,MainActivity::class.java)
        startActivity(intent)
        finish()
    }
    fun editPhoto(view:View){
        val intent=Intent(applicationContext,EditPhoto::class.java)
        startActivity(intent)
    }
}