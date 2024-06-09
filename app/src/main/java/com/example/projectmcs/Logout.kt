package com.example.projectmcs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projectmcs.databinding.ActivityLoginPageBinding
import com.example.projectmcs.databinding.ActivityLogoutBinding
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class Logout : AppCompatActivity() {

    private lateinit var binding: ActivityLogoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityLogoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textLogin.setOnClickListener{
            var intent= Intent(this,LoginPage::class.java)
            startActivity(intent)
        }
        val fragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        fragment.getMapAsync{
            val position = LatLng(-6.20201, 106.78113)
            val Option = MarkerOptions()
                .position(position)
                .title("Puff and Poof")
            it.addMarker(Option)
            val camera = CameraUpdateFactory.newLatLng(position)
            it.moveCamera(camera)
            it.moveCamera(CameraUpdateFactory.zoomTo(15.0f))
        }
    }
}