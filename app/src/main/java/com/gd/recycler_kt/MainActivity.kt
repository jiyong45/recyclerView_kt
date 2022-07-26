package com.gd.recycler_kt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carList = ArrayList<CarForList>()
        for (i in 0 until 50) {
            carList.add(CarForList(""+i+"번째 자동차" , ""+i+"순위 엔진"))
        }
        val adapter = RecyclerViewAdapter(carList,LayoutInflater.from(this))
        recycler_view.adapter =adapter
        recycler_view.layoutManager = LinearLayoutManager(this)
        //recycler_view.layoutManager = GridLayoutManager(this,2)

    }

}

class CarForList(val name: String, val engine: String){

}
