package ir.loginphone.ghafari.reshad

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import ir.loginphone.ghafari.reshad.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edt_num1 = findViewById<EditText>(R.id.txt_num1)
        val edt_num2 = findViewById<EditText>(R.id.txt_num2)
        val btn_sum = findViewById<Button>(R.id.btn_sum)
        val btn_sub = findViewById<Button>(R.id.btn_subtraction)
        val btn_mult = findViewById<Button>(R.id.btn_multiplication)
        val btn_Divide = findViewById<Button>(R.id.btn_Divide)
        val txt_res = findViewById<TextView>(R.id.txt_res)
        var txtalamat = findViewById<TextView>(R.id.txtalamat)

        txtalamat.text = "0"

        var intent: Intent = Intent(this, Page3Activity::class.java)

        btn_sum.setBackgroundColor(Color.parseColor("#ffc400"))
        btn_sub.setBackgroundColor(Color.parseColor("#63f542"))
        btn_mult.setBackgroundColor(Color.parseColor("#0015ff"))
        btn_Divide.setBackgroundColor(Color.parseColor("#d37aff"))



//کد مربوط به جمع
        btn_sum.setOnClickListener {
            if(edt_num1.getText().toString().equals("") || edt_num2.getText().toString().equals("")){
                Toast.makeText(getApplicationContext(),"مقداری وارد نشده است!" , Toast.LENGTH_LONG).show();
            }else {
                var num1: Int = edt_num1.text.toString().toInt()
                var num2: Int = edt_num2.text.toString().toInt()
                var sum: Int = num1 + num2
                txt_res.text = sum.toString()
                txt_res.setTextColor(Color.parseColor("#ffc400"))

                txtalamat.text = "1"

                intent.putExtra("numa", edt_num1.text.toString())
                intent.putExtra("numb", edt_num2.text.toString())
                intent.putExtra("alamat", txtalamat.text)
                intent.putExtra("sum", txt_res.text)
                startActivity(intent)
                this.finish()


            }
        }


//کد مربوط به تفریق
        btn_sub.setOnClickListener {
            if(edt_num1.getText().toString().equals("") || edt_num2.getText().toString().equals("")){
                Toast.makeText(getApplicationContext(),"مقداری وارد نشده است!" , Toast.LENGTH_LONG).show();
            }else {
                var num1: Int = edt_num1.text.toString().toInt()
                var num2: Int = edt_num2.text.toString().toInt()
                var sum: Int = num1 - num2
                txt_res.text = sum.toString()
                txt_res.setTextColor(Color.parseColor("#63f542"))

                txtalamat.text = "2"


                var intent: Intent = Intent(this, Page3Activity::class.java)
                intent.putExtra("numa", edt_num1.text.toString())
                intent.putExtra("numb", edt_num2.text.toString())
                intent.putExtra("alamat", txtalamat.text)
                intent.putExtra("sum", txt_res.text)
                startActivity(intent)
                this.finish()

            }
        }


//کد مربوط به ضرب
        btn_mult.setOnClickListener {
            if(edt_num1.getText().toString().equals("") || edt_num2.getText().toString().equals("")){
                Toast.makeText(getApplicationContext(),"مقداری وارد نشده است!" , Toast.LENGTH_LONG).show();
            }else {
                var num1: Int = edt_num1.text.toString().toInt()
                var num2: Int = edt_num2.text.toString().toInt()
                var sum: Int = num1 * num2
                txt_res.text = sum.toString()
                txt_res.setTextColor(Color.parseColor("#0015ff"))

                txtalamat.text = "3"

                var intent: Intent = Intent(this, Page3Activity::class.java)
                intent.putExtra("numa", edt_num1.text.toString())
                intent.putExtra("numb", edt_num2.text.toString())
                intent.putExtra("alamat", txtalamat.text)
                intent.putExtra("sum", txt_res.text)
                startActivity(intent)
                this.finish()

            }
        }


//کد مربوط به تقسیم
        btn_Divide.setOnClickListener {
            if(edt_num1.getText().toString().equals("") || edt_num2.getText().toString().equals("")){
                Toast.makeText(getApplicationContext(),"مقداری وارد نشده است!" , Toast.LENGTH_LONG).show();
            }else {
                var num1: Int = edt_num1.text.toString().toInt()
                var num2: Int = edt_num2.text.toString().toInt()
                var sum: Int = num1 / num2
                txt_res.text = sum.toString()
                txt_res.setTextColor(Color.parseColor("#d37aff"))

                txtalamat.text = "4"

                var intent: Intent = Intent(this, Page3Activity::class.java)
                intent.putExtra("numa", edt_num1.text.toString())
                intent.putExtra("numb", edt_num2.text.toString())
                intent.putExtra("alamat", txtalamat.text)
                intent.putExtra("sum", txt_res.text)
                startActivity(intent)
                this.finish()

            }
        }
    }
}