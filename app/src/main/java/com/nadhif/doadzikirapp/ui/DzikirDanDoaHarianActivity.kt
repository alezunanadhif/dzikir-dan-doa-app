package com.nadhif.doadzikirapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.nadhif.doadzikirapp.R
import com.nadhif.doadzikirapp.adapter.DzikirDoaAdapter
import com.nadhif.doadzikirapp.databinding.ActivityDzikirDanDoaHarianBinding
import com.nadhif.doadzikirapp.model.DzikirDoaModel

class DzikirDanDoaHarianActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDzikirDanDoaHarianBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDzikirDanDoaHarianBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Dzikir Dan Doa Harian"

        binding.apply {
            rvDzikirSetiapSaat.layoutManager = LinearLayoutManager(this@DzikirDanDoaHarianActivity)
            rvDzikirSetiapSaat.adapter = DzikirDoaAdapter(GetDataDzikirHarian())
        }

    }

    fun GetDataDzikirHarian(): ArrayList<DzikirDoaModel> {
        val desc = resources.getStringArray(R.array.arr_dzikir_doa_harian)
        val lafaz = resources.getStringArray(R.array.arr_lafaz_dzikir_doa_harian)
        val terjemah = resources.getStringArray(R.array.arr_terjemah_dzikir_doa_harian)

        val dataDzikirDoaHarian = arrayListOf<DzikirDoaModel>()
        for (i in desc.indices) {
            var gabung = DzikirDoaModel(
                desc[i],
                lafaz[i],
                terjemah[i]
            )
            dataDzikirDoaHarian.addAll(listOf(gabung))
        }
        return dataDzikirDoaHarian
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return super.onSupportNavigateUp()
    }
}