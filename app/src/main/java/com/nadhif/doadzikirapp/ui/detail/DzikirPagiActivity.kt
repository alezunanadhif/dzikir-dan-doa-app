package com.nadhif.doadzikirapp.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.nadhif.doadzikirapp.R
import com.nadhif.doadzikirapp.adapter.DzikirDoaAdapter
import com.nadhif.doadzikirapp.databinding.ActivityDzikirPagiBinding
import com.nadhif.doadzikirapp.databinding.ActivitySunnahQouliyahBinding
import com.nadhif.doadzikirapp.model.DataDzikirDoaModel

class DzikirPagiActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDzikirPagiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDzikirPagiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Dzikir Pagi"

        binding.apply {
            rvDzikirPagi.layoutManager = LinearLayoutManager(this@DzikirPagiActivity)
            rvDzikirPagi.adapter = DzikirDoaAdapter(DataDzikirDoaModel.listDzikirPagi)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return super.onSupportNavigateUp()
    }
}