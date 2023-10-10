package com.nadhif.doadzikirapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.nadhif.doadzikirapp.R
import com.nadhif.doadzikirapp.adapter.DzikirDoaAdapter
import com.nadhif.doadzikirapp.databinding.ActivitySunnahQouliyahBinding
import com.nadhif.doadzikirapp.databinding.RowItemDzikirDoaBinding
import com.nadhif.doadzikirapp.model.DataDzikirDoaModel

class SunnahQouliyahActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySunnahQouliyahBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySunnahQouliyahBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Sunnah - Sunnah Qouliyah"

        binding.apply {
            rvQauliyahShalat.layoutManager = LinearLayoutManager(this@SunnahQouliyahActivity)
            rvQauliyahShalat.adapter = DzikirDoaAdapter(DataDzikirDoaModel.listQauliyah)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return super.onSupportNavigateUp()
    }
}