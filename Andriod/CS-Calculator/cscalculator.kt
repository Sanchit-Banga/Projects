package com.example.andriodone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var no1 = findViewById<EditText>(R.id.act1screen1)
        var no2 = findViewById<EditText>(R.id.act1screen2)
        var mid = findViewById<TextView>(R.id.act1midoperator)
        var res = findViewById<TextView>(R.id.act1result)

        var btnclr = findViewById<Button>(R.id.act1btnclr)
        var btnplus = findViewById<Button>(R.id.act1btnplus)
        var btnminus = findViewById<Button>(R.id.act1btnminus)
        var btndiv = findViewById<Button>(R.id.act1btndiv)
        var btnrem = findViewById<Button>(R.id.act1btnrem)
        var btnmul = findViewById<Button>(R.id.act1btnmul)
        var btnpow = findViewById<Button>(R.id.act1btnpow)
        var btnlog = findViewById<Button>(R.id.act1btnlog)
        var btnabs = findViewById<Button>(R.id.act1btnabs)
        var btnlshift = findViewById<Button>(R.id.act1btnlshift)
        var btnrshift = findViewById<Button>(R.id.act1btnrshift)
        var btnxor = findViewById<Button>(R.id.act1btnxor)
        var btncontri = findViewById<Button>(R.id.act1btnshow)

        btnclr.setOnClickListener{
            no1.text.clear()
            no2.text.clear()
            mid.text = ""
        }

        btnplus.setOnClickListener {

            if(no1.text.toString().isEmpty() || no2.text.toString().isEmpty()) {
                Toast.makeText(this, "Pls fill the values", Toast.LENGTH_LONG).show()
            }
            else {
                var x = no1.text.toString().toInt()
                var y = no2.text.toString().toInt()
                mid.text = "+"
                res.text = "${x+y}"
            }

        }

        btnminus.setOnClickListener {

            if(no1.text.toString().isEmpty() || no2.text.toString().isEmpty()) {
                Toast.makeText(this, "Pls fill the values", Toast.LENGTH_LONG).show()
            }
            else {
                var x = no1.text.toString().toInt()
                var y = no2.text.toString().toInt()
                mid.text = "-"
                res.text = "${x-y}"
            }

        }

        btnmul.setOnClickListener {

            if(no1.text.toString().isEmpty() || no2.text.toString().isEmpty()) {
                Toast.makeText(this, "Pls fill the values", Toast.LENGTH_LONG).show()
            }
            else {
                var x = no1.text.toString().toInt()
                var y = no2.text.toString().toInt()
                mid.text = "*"
                res.text = "${x*y}"
            }

        }

        btndiv.setOnClickListener {

            if(no1.text.toString().isEmpty() || no2.text.toString().isEmpty()) {
                Toast.makeText(this, "Pls fill the values", Toast.LENGTH_LONG).show()
            }
            else {
                var x = no1.text.toString().toInt()
                var y = no2.text.toString().toInt()

                if (y == 0) {
                    Toast.makeText(this, "divide by zero not allowed", Toast.LENGTH_LONG).show()
                } else {

                    mid.text = "/"
                    res.text = "${x / y}"
                }
            }

        }
        btnrem.setOnClickListener {

            if(no1.text.toString().isEmpty() || no2.text.toString().isEmpty()) {
                Toast.makeText(this, "Pls fill the values", Toast.LENGTH_LONG).show()
            }
            else {
                var x = no1.text.toString().toInt()
                var y = no2.text.toString().toInt()
                mid.text = "%"
                res.text = "${x%y}"
            }

        }
        btnpow.setOnClickListener {

            if(no1.text.toString().isEmpty() || no2.text.toString().isEmpty()) {
                Toast.makeText(this, "Pls fill the values", Toast.LENGTH_LONG).show()
            }
            else {
                var x = no1.text.toString().toInt()
                var y = no2.text.toString().toInt()
                mid.text = "pow"
                res.text = "${Math.pow(x.toDouble(),y.toDouble())}"
            }

        }
        btnlog.setOnClickListener {

            if(no1.text.toString().isEmpty() || no2.text.toString().isEmpty()) {
                Toast.makeText(this, "Pls fill the values", Toast.LENGTH_LONG).show()
            }
            else {
                var x = no1.text.toString().toInt()
                var y = no2.text.toString().toInt()

                if (x == 0 || y == 0) {
                    Toast.makeText(this, "zero not allowed in log", Toast.LENGTH_LONG).show()
                } else {
                    mid.text = "Log10"
                    res.text = "log value for 1 N0. = ${Math.log10(x.toDouble())}\nlog value for 2 N0. = ${Math.log10(y.toDouble())}"
                }
            }
        }

        btnabs.setOnClickListener {

            if(no1.text.toString().isEmpty() || no2.text.toString().isEmpty()) {
                Toast.makeText(this, "Pls fill the values", Toast.LENGTH_LONG).show()
            }
            else {
                var x = no1.text.toString().toInt()
                var y = no2.text.toString().toInt()
                mid.text = "abs"
                res.text = "abs for 1 no. = ${Math.abs(x)}\n abs for 2 no. = ${Math.abs(y)}"
            }

        }
        btnxor.setOnClickListener {

            if(no1.text.toString().isEmpty() || no2.text.toString().isEmpty()) {
                Toast.makeText(this, "Pls fill the values", Toast.LENGTH_LONG).show()
            }
            else {
                var x = no1.text.toString().toInt()
                var y = no2.text.toString().toInt()
                var z = x xor y
                mid.text = "^"
                res.text = "${z}"
            }
        }

        btnlshift.setOnClickListener {

            if(no1.text.toString().isEmpty() || no2.text.toString().isEmpty()) {
                Toast.makeText(this, "Pls fill the values", Toast.LENGTH_LONG).show()
            }
            else {
                var x = no1.text.toString().toInt()
                var y = no2.text.toString().toInt()
                var z : Int = x.shl(y)
                mid.text = "<<"
                res.text = "${z}"
            }

        }

        btnrshift.setOnClickListener {

            if(no1.text.toString().isEmpty() || no2.text.toString().isEmpty()) {
                Toast.makeText(this, "Pls fill the values", Toast.LENGTH_LONG).show()
            }
            else {
                var x = no1.text.toString().toInt()
                var y = no2.text.toString().toInt()
                var z : Int = x.shr(y)
                mid.text = ">>"
                res.text = "${z}"
            }
        }

        btncontri.setOnClickListener {

            var intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)

        }

    }
}
