package com.kk.instagram_clone_v1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class EditPhoto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_photo)
    }
    fun quit(view: View){
        val intent= Intent(applicationContext,Edit_Profile::class.java)
        startActivity(intent)
        finish()
    }
    fun camera(view: View){
        val intent= Intent(applicationContext,PhotoUpdated::class.java)
        startActivity(intent)

    }
}