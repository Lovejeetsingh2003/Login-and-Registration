package com.example.project1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

class FirstPageActivity : AppCompatActivity() {

    lateinit var llLogin : LinearLayout
    lateinit var etEmail: EditText
    lateinit var etPassword : EditText
    lateinit var tvForget: TextView
    lateinit var btnLogin : Button
    lateinit var llReg : LinearLayout
    lateinit var tvReg : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_firstpage)

        llLogin = findViewById(R.id.llLogin)
        etEmail = llLogin.findViewById(R.id.etEmail)
        etPassword = llLogin.findViewById(R.id.etPassword)
        tvForget = llLogin.findViewById(R.id.tvForget)
        btnLogin = llLogin.findViewById(R.id.btnLogin)
        llReg = llLogin.findViewById(R.id.llReg)
        tvReg = llReg.findViewById(R.id.tvReg)

        btnLogin.setOnClickListener {
            if(etEmail.text.toString().isEmpty())
            {
                etEmail.error = "Enter Your Email id"
            }
            else if(etPassword.text.toString().isEmpty())
            {
                etPassword.error = "Enter Your Password"
            }
            else
            {
                Toast.makeText(this,"Login Successfully",Toast.LENGTH_SHORT).show()
            }
        }
        tvReg.setOnClickListener {
            val intent =Intent(this,RegisterPageActivity::class.java)
            startActivity(intent)
        }
        tvForget.setOnClickListener {
            val intent =Intent(this,ForgetPasswordActivity::class.java)
            startActivity(intent)
        }
    }
}