package id.ac.polbeng.depandienda.androidkotlinapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var tvCounter: TextView
    private lateinit var btnAddNumber: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //layout binding
        setContentView(R.layout.activity_main)

        //view binding
        tvCounter = findViewById(R.id.tvCounter)
        btnAddNumber = findViewById(R.id.btnAddNumber)

        tvCounter.text = "1"
    }

    fun addNumber(v: View){
        val currVal = tvCounter.text.toString().toInt()
        val nextVal = currVal + 1
        tvCounter.text = nextVal.toString()
    }

    fun resetNumber(v: View){
        tvCounter.text = "0"
    }

    fun subtractNumber(v: View){
        val currVal = tvCounter.text.toString().toInt()
        val nextVal = currVal - 1
        tvCounter.text = nextVal.toString()
    }
}