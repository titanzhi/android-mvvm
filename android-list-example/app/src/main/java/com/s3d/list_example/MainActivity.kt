package com.s3d.list_example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    val adapter = AnimalRVAdapter(DataProvider.provideData())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        animalsRV.adapter = adapter
        //animalsRV.layoutManager = LinearLayoutManager(this)
        animalsRV.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))

        animalsRV.layoutManager = GridLayoutManager(this, 3)

        adapter.updateAnimals(DataProvider.provideReversedData())
    }
}