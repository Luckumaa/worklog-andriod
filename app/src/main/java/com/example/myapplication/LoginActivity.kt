package com.example.myapplication

import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.imhungry.R


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    val positiveButtonClick = { dialog: DialogInterface, which: Int ->
        Toast.makeText(applicationContext, android.R.string.ok, Toast.LENGTH_SHORT).show()
    }

    val negativeButtonClick = { dialog: DialogInterface, which: Int ->
        Toast.makeText(applicationContext, android.R.string.cancel, Toast.LENGTH_SHORT).show()
    }

    fun onClickBtn(v: View?) {
        Toast.makeText(this, "Clicked on Button", Toast.LENGTH_LONG).show()
        val builder = AlertDialog.Builder(this)

        with(builder)
        {
            setTitle("Logged in")
            setMessage("Welcome, Bazsup!")
            setPositiveButton("OK", DialogInterface.OnClickListener(function = positiveButtonClick))
            setNegativeButton(android.R.string.cancel, negativeButtonClick)
            show()
        }
    }
}