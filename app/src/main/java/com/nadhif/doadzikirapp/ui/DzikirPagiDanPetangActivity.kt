package com.nadhif.doadzikirapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.nadhif.doadzikirapp.R
import com.nadhif.doadzikirapp.adapter.DzikirDoaAdapter
import com.nadhif.doadzikirapp.databinding.ActivityDzikirPagiDanPetangBinding
import com.nadhif.doadzikirapp.model.DataDzikirDoaModel
import com.nadhif.doadzikirapp.ui.detail.DzikirPagiActivity
import com.nadhif.doadzikirapp.ui.detail.DzikirPetangActivity

class DzikirPagiDanPetangActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityDzikirPagiDanPetangBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDzikirPagiDanPetangBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Dzikir Pagi Dan Petang"

        setView()
    }

    private fun setView() {
        binding.apply {
            imgBtnDzikirPagi.setOnClickListener(this@DzikirPagiDanPetangActivity)
            imgBtnDzikirPetang.setOnClickListener(this@DzikirPagiDanPetangActivity)
        }
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.img_btn_dzikir_pagi -> {
                val intentDPagi = Intent(this@DzikirPagiDanPetangActivity, DzikirPagiActivity::class.java)
                startActivity(intentDPagi)
            }
            R.id.img_btn_dzikir_petang -> {
                val intentDPetang = Intent(this@DzikirPagiDanPetangActivity, DzikirPetangActivity::class.java)
                startActivity(intentDPetang)
            }
        }
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return super.onSupportNavigateUp()
    }

}