package com.example.overflowmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater=menuInflater
        inflater.inflate(R.menu.overflow_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
       return when(item.itemId){
           R.id.item1 ->{
               Toast.makeText(this,"Bluetooth is selected",Toast.LENGTH_SHORT).show()
               true
           }
           R.id.item2->{
               Toast.makeText(this,"Chat is selected",Toast.LENGTH_SHORT).show()
               true

           }
           else -> {super.onOptionsItemSelected(item)}

    }

}

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
        invalidateOptionsMenu()
        if (menu != null) {
            menu.findItem(R.id.item1).isVisible = true
        }
        if (menu != null) {
            menu.findItem(R.id.item2).isVisible = true
        }
        return super.onPrepareOptionsMenu(menu)
    }
    }