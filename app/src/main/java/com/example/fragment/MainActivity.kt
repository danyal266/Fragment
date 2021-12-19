package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import com.example.fragment.fragment.fragment_one
import com.example.fragment.fragment.fragment_two
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun first(view: android.view.View) {
        val first_fragment:fragment_one = fragment_one()
        val transition:FragmentTransaction = supportFragmentManager.beginTransaction()
        transition.replace(R.id.linear_container,first_fragment)
        transition.commit()
    }
    fun second(view: android.view.View) {
        val second_fragment:fragment_two = fragment_two()
        val transition:FragmentTransaction = supportFragmentManager.beginTransaction()
        transition.replace(R.id.linear_container,second_fragment)
        transition.commit()
    }
}