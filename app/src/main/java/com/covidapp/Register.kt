package com.covidapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.prathik.schoolpro.interfaces.OnHttpResponse
import com.prathik.schoolpro.webapi.WebApi
import com.prathik.schoolpro.webapi.model.UserModel
import kotlinx.android.synthetic.main.activity_register.*

class Register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)


        registerBtn.setOnClickListener {

            startActivity(Intent(this,MapActivity::class.java))
        }



    }


    private fun getUserInfo(){

        WebApi(object : OnHttpResponse {
            override fun <T> onResponse(objectResponse: T) {

                val obj =objectResponse as UserModel



            }

        }).getAllDelayedChannels()
    }



}
