package com.cookandroid.project5_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    lateinit var Edit1 : EditText
    lateinit var Result : TextView //결과창
    lateinit var BtnNum0 : Button
    lateinit var BtnNum1 : Button
    lateinit var BtnNum2 : Button
    lateinit var BtnNum3 : Button
    lateinit var BtnNum4 : Button
    lateinit var BtnNum5 : Button
    lateinit var BtnNum6 : Button
    lateinit var BtnNum7 : Button
    lateinit var BtnNum8 : Button
    lateinit var BtnNum9 : Button
    lateinit var BtnMul : Button
    lateinit var BtnDiv : Button
    lateinit var BtnPlus : Button
    lateinit var BtnSub : Button
    lateinit var BtnDot : Button
    lateinit var BtnEqual : Button
    lateinit var BtnClear : Button
//    lateinit var num : String
//    internal var result  : String?=null //value
//    internal var NumButtons = ArrayList<Button>(10)
//    internal var BtnIDs = arrayOf(R.id.BtnNum0,R.id.BtnNum1,R.id.BtnNum2,R.id.BtnNum3,R.id.BtnNum4,R.id.BtnNum5,
//        R.id.BtnNum6,R.id.BtnNum7,R.id.BtnNum8,R.id.BtnNum9)

    internal var I :Int = 0 //증가값 용도

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "계산기(조영은)"

        Edit1 = findViewById<EditText>(R.id.Edit1)
        Result = findViewById<TextView>(R.id.Result)

        BtnNum0 = findViewById<Button>(R.id.BtnNum0)
        BtnNum1 = findViewById<Button>(R.id.BtnNum1)
        BtnNum2 = findViewById<Button>(R.id.BtnNum2)
        BtnNum3 = findViewById<Button>(R.id.BtnNum3)
        BtnNum4 = findViewById<Button>(R.id.BtnNum4)
        BtnNum5 = findViewById<Button>(R.id.BtnNum5)
        BtnNum6 = findViewById<Button>(R.id.BtnNum6)
        BtnNum7 = findViewById<Button>(R.id.BtnNum7)
        BtnNum8 = findViewById<Button>(R.id.BtnNum8)
        BtnNum9 = findViewById<Button>(R.id.BtnNum9)

        BtnPlus = findViewById<Button>(R.id.BtnPlus)
        BtnSub = findViewById<Button>(R.id.BtnSub)
        BtnDiv = findViewById<Button>(R.id.BtnDiv)
        BtnDot = findViewById<Button>(R.id.BtnDot)
        BtnMul = findViewById<Button>(R.id.BtnMul)
        BtnEqual = findViewById<Button>(R.id.BtnEqual)
        BtnClear = findViewById<Button>(R.id.BtnClear)

        BtnNum0.setOnClickListener {
            Edit1.text.append("0")
        }
        BtnNum1.setOnClickListener {
            Edit1.text.append("1")
        }
        BtnNum2.setOnClickListener {
            Edit1.text.append("2")
        }
        BtnNum3.setOnClickListener {
            Edit1.text.append("3")
        }
        BtnNum4.setOnClickListener {
            Edit1.text.append("4")
        }
        BtnNum5.setOnClickListener {
            Edit1.text.append("5")
        }
        BtnNum6.setOnClickListener {
            Edit1.text.append("6")
        }
        BtnNum7.setOnClickListener {
            Edit1.text.append("7")
        }
        BtnNum8.setOnClickListener {
            Edit1.text.append("8")
        }
        BtnNum9.setOnClickListener {
            Edit1.text.append("9")
        }
        BtnDot.setOnClickListener {
            Edit1.text.append(".")
        }
        BtnPlus.setOnClickListener {
            Edit1.text.append("+")
        }
        BtnSub.setOnClickListener {
            Edit1.text.append("-")
        }
        BtnMul.setOnClickListener {
            Edit1.text.append("*")
        }
        BtnDiv.setOnClickListener {
            Edit1.text.append("/")
        }
        BtnClear.setOnClickListener {
            Edit1.setText("0")
        }

        BtnEqual.setOnClickListener {
            var st = StringTokenizer(Edit1.text.toString(),"+-*/")
            var left : Double = st.nextToken().toDouble()
            var right :  Double =st.nextToken().toDouble()

            var result : Double = 0.0
            if(Edit1.text.contains("+")){
                result = left + right
            }
            else if(Edit1.text.contains("-")){
                result = left - right
            }
            else if(Edit1.text.contains("*")){
                result = left * right
            }
            else if(Edit1.text.contains("/")){
                result = left / right
            }
            Result.text = Edit1.text.append("=").append(""+result)
            Edit1.setText("0")
        }

    }
}
