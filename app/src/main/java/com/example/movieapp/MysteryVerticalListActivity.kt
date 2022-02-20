/*
* Copyright (C) 2021 The Android Open Source Project.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.example.movieapp

import MysteryGenreAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.movieapp.const.Layout
//import com.example
//import com.example.movieapp.databinding.ActivityVerticalListBinding

//import.com.example.MovieApp.adapter.GenreAdapter
//import com.example.dogglers.const.Layout
//import com.example.dogglers.databinding.ActivityVerticalListBinding
import com.example.movieapp.databinding.ActivityVerticalListBinding

class MysteryVerticalListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityVerticalListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVerticalListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.verticalRecyclerView.adapter = MysteryGenreAdapter(
            applicationContext,
            Layout.VERTICAL
        )

        // Specify fixed size to improve performance
        binding.verticalRecyclerView.setHasFixedSize(true)

        // Enable up button for backward navigation
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}