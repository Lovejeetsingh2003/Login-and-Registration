package com.example.project1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast

class PasswordActivity : AppCompatActivity() {

    lateinit var llPsw : LinearLayout
    lateinit var etNewPsw : EditText
    lateinit var etConPsw : EditText
    lateinit var btnUpdate : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password)

        llPsw = findViewById(R.id.llPsw)
        etNewPsw = llPsw.findViewById(R.id.etNewPsw)
        etConPsw = llPsw.findViewById(R.id.etConPsw)
        btnUpdate = llPsw.findViewById(R.id.btnUpdate)

        btnUpdate.setOnClickListener {
            if(etNewPsw.text.toString().isEmpty())
            {
                etNewPsw.error = "Enter Password"
            }
            else if(etConPsw.text.toString().isEmpty())
            {
                etConPsw.error = "Confirm Password"
            }
            else{
                val Password = etNewPsw.text.toString()
                val Confirm = etConPsw.text.toString()
                if (Password.equals(Confirm)) {
                    Toast.makeText(this, "Login", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, FirstPageActivity::class.java)
                    startActivity(intent)
                }
                else{
                    etConPsw.error = "Confirm Password"
                }
            }
        }
    }
}