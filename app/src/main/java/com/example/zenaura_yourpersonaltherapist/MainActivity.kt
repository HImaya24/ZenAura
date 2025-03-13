package com.example.zenaura_yourpersonaltherapist

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.logging.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Delay for 2 seconds to show the splash screen before navigating
        android.os.Handler().postDelayed({
            // After 2 seconds, move to the next activity (e.g., a menu or dashboard)
            val intent = Intent(this, LogoScreen::class.java) // Change this to your next screen
            startActivity(intent)
            finish() // Close the current activity (optional)
        }, 2000) // 2000 milliseconds = 2 seconds

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}