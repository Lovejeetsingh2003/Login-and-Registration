package com.example.project1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast

class ForgetPasswordActivity : AppCompatActivity() {

    lateinit var llForget: LinearLayout
    lateinit var etEmail2: EditText
    lateinit var btnOtp : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget_password)

        llForget = findViewById(R.id.llForget)
        etEmail2 = llForget.findViewById(R.id.etEmail2)
        btnOtp = llForget.findViewById(R.id.btnOtp)



        btnOtp.setOnClickListener {
            val email = etEmail2.text.toString()

            if (etEmail2.text.toString().isEmpty())
            {
                etEmail2.error = "Enter Your Email id"
            }
            else
            {
                Toast.makeText(this,"Otp Sent",Toast.LENGTH_SHORT).show()
                val intent = Intent(this,OtpActivity::class.java)
                intent.putExtra("Email",email)
                startActivity(intent)
            }
        }


    }
}