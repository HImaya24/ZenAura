package com.example.zenaura_yourpersonaltherapist

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Home : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        findViewById<Button>(R.id.dashboardButton).setOnClickListener {
            startActivity(Intent(this, Dashboard::class.java))
        }
        findViewById<Button>(R.id.professionalSupportButton).setOnClickListener {
            startActivity(Intent(this, ProfessionalSupport::class.java))
        }
        findViewById<Button>(R.id.blogButton).setOnClickListener {
            startActivity(Intent(this, Blog::class.java))
        }
        findViewById<Button>(R.id.communitySupportButton).setOnClickListener {
            startActivity(Intent(this, CommunityActivity::class.java))
        }




        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}