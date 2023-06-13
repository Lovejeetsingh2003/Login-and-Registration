package com.example.project1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast

class RegisterPageActivity : AppCompatActivity() {

    lateinit var llRegi : LinearLayout
    lateinit var etName : EditText
    lateinit var etEmail1 : EditText
    lateinit var etPhone : EditText
    lateinit var etPassword1 : EditText
    lateinit var etConfirm : EditText
    lateinit var btnReg : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_page)

        llRegi =findViewById(R.id.llRegi)
        etName = llRegi.findViewById(R.id.etName)
        etEmail1 = llRegi.findViewById(R.id.etEmail1)
        etPhone = llRegi.findViewById(R.id.etPhone)
        etPassword1 = llRegi.findViewById(R.id.etPassword1)
        etConfirm = llRegi.findViewById(R.id.etConfirm)
        btnReg = llRegi.findViewById(R.id.btnReg)

        val psw = etPassword1
        btnReg.setOnClickListener {
            if(etName.text.toString().isEmpty())
            {
                etName.error = "Enter Your Name"
            }

            else if(etPhone.text.toString().length <10){
                etPhone.error = "Phone Number Length is Short"
            }
            else if(etEmail1.text.toString().isEmpty())
            {
                etEmail1.error = "Enter Your Email id"
            }
            else if(etPhone.text.toString().isEmpty())
            {
                etPhone.error = "Enter Your Mob. No."
            }
            else if(etPassword1.text.toString().isEmpty())
            {
                etPassword1.error = "Enter your Password"
            }
            else if(etConfirm.text.toString().isEmpty())
            {
                etConfirm.error = "Confirm Password"
            }
            else
            {
                 val Psw = etPassword1.text.toString()
                val confirm = etConfirm.text.toString()
                if(Psw.equals(confirm))
                {
                    Toast.makeText(this, "Register Successfully", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, FirstPageActivity::class.java)
                    startActivity(intent)
                }
                else {
                    etConfirm.error = "Confirm Password"
                }

            }
        }
    }
}