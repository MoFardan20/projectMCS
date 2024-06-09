package com.example.projectmcs

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.SmsManager
import android.util.Log
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.example.projectmcs.databinding.ActivityLoginPageBinding

class LoginPage : AppCompatActivity() {

    private lateinit var binding: ActivityLoginPageBinding
    private lateinit var dbHelper: DBHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        dbHelper = DBHelper(this)

        binding.btnLogin.setOnClickListener{
            val loginUsername = binding.etUsername.text.toString()
            val loginPassword = binding.etPassword.text.toString()
            loginDatabase(loginUsername, loginPassword)
        }

        binding.textSignUp.setOnClickListener {
            var intent= Intent(this,SignupPage::class.java)
            startActivity(intent)
        }
    }

    private fun loginDatabase(username: String, password: String){
        val userExists = dbHelper.findUserByUsername(username)
        Log.d("data",userExists.toString())
        if(userExists){
            val cpassword = dbHelper.getPasswordByUsername(username)
            Log.d("password",cpassword.toString())
            if (cpassword == password){
                Log.d("masuk","data benar")
                var intent= Intent(this,MainActivity::class.java)
                startActivity(intent)
                Toast.makeText(this, "Login Succesfull", Toast.LENGTH_SHORT).show()
            }

        }else{
            Toast.makeText(this, "Login Failed!", Toast.LENGTH_SHORT).show()
        }

    }
}