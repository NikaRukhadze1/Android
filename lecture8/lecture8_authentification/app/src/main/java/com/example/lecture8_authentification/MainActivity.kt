package com.example.lecture8_authentification

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       clickandclick()
    }
//ვიზუალზე იმდენი ენერგია დავხარჯე ფუნქციონალზე ცოტა გავჭედე
    //checkLogin-ში განვიხილავ სამ შესაძლო ვარიანტს და სამივე შემთხვევაზე ვაგდებ ნოთფიქეიშენს
    //clickandclick-ზე დავაყენე ლისენერი და ვიძახებ მეინში, ხოლო ონ კლიკში ვიძახებ checkLogin ფუნქციას რათა შევამოწმო Sign In-ის შედეგი


    private fun checkLogin()
    {
        if(editText.text.isEmpty())
        {
            Toast.makeText(this,"Incorrect email adress",Toast.LENGTH_SHORT).show()
        }
        else if (editText2.text.isEmpty())
        {
            Toast.makeText(this,"Missing password",Toast.LENGTH_SHORT).show()
        }
        else
        {
            Toast.makeText(this,"Log is succes, Welcome to our Plant Shop!", Toast.LENGTH_SHORT).show()
        }
    }

    private fun clickandclick()
    {
      button2.setOnClickListener (this)
    }

    override fun onClick(v: View?) {
        checkLogin()
    }
}


