package com.example.movieapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.movieapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var listIntent: Intent
    var GenreString = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        val actionBtn = findViewById<ImageButton>(R.id.actionButton)
        actionBtn.setOnClickListener{
            GenreString = "ACTION"
            val intent = Intent(this,VerticalListActivity::class.java)
            startActivity(intent)
        }

        val comedyBtn = findViewById<ImageButton>(R.id.comedyButton)
        comedyBtn.setOnClickListener{
            GenreString = "COMEDY"
            val intent = Intent(this,ComedyVerticalListActivity::class.java)
            startActivity(intent)
        }

        val dramaBtn = findViewById<ImageButton>(R.id.dramaButton)
        dramaBtn.setOnClickListener{
            GenreString = "DRAMA"
            val intent = Intent(this,DramaVerticalListActivity::class.java)
            startActivity(intent)
        }
        val horrorBtn = findViewById<ImageButton>(R.id.horrorButton)
        horrorBtn.setOnClickListener{
            GenreString = "HORROR"
            val intent = Intent(this,HorrorVerticalListActivity::class.java)
            startActivity(intent)
        }

        val mysteryBtn = findViewById<ImageButton>(R.id.mysteryButton)
        mysteryBtn.setOnClickListener{
            GenreString = "MYSTERY"
            val intent = Intent(this,MysteryVerticalListActivity::class.java)
            startActivity(intent)
        }

        val thrillerBtn = findViewById<ImageButton>(R.id.thrillerButton)
        thrillerBtn.setOnClickListener{
            GenreString = "THRILLER"
            val intent = Intent(this,ThrillerVerticalListActivity::class.java)
            startActivity(intent)
        }
//        val detailsBtn = findViewById<Button>(R.id.btn_details)
//        detailsBtn.setOnClickListener{
//            val intent = Intent(this,DetailsVerticalListActivity::class.java)
//            startActivity(intent)
//        }

    }
}