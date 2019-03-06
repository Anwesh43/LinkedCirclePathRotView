package com.anwesh.uiprojects.linkedcirclepathrotview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.circlepathrotview.CirclePathRotView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        CirclePathRotView.create(this)
    }
}
