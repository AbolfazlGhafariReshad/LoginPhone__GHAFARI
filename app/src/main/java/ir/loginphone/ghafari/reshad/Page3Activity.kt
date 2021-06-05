package ir.loginphone.ghafari.reshad

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import ir.loginphone.ghafari.reshad.R

class Page3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page3)

        val btn_calc = findViewById<Button>(R.id.ac_p3_btn_calc)
        val txt_rnum1 = findViewById<TextView>(R.id.ac_p3_txt_resnum1)
        val txt_rnum2 = findViewById<TextView>(R.id.ac_p3_txt_resnum2)
        val txt_res = findViewById<TextView>(R.id.ac_p3_txt_res)
        val txt_alamat = findViewById<TextView>(R.id.ac_p3_txt_alamat)
        val txt_tasavi = findViewById<TextView>(R.id.ac_p3_txt_tasavi)
        val txtsave = findViewById<TextView>(R.id.txtsave)

        btn_calc.setBackgroundColor(Color.parseColor("#4b8efa"))

        btn_calc.setOnClickListener {
            var intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        if (intent.extras != null) {

            var pa: String = intent.extras!!.getString("numa", "")
            txt_rnum1.text = pa

            var pb: String = intent.extras!!.getString("numb", "")
            txt_rnum2.text = pb

            var alamat: String = intent.extras!!.getString("alamat", "")
            txtsave.text = alamat

            var sum: String = intent.extras!!.getString("sum", "")
            txt_res.text = sum


            txt_tasavi.visibility = View.VISIBLE


            if (txtsave.text == "1") {
                txt_alamat.text = "+"
                txt_rnum1.setTextColor(Color.parseColor("#ff002b"))
                txt_rnum2.setTextColor(Color.parseColor("#ff002b"))
                txt_res.setTextColor(Color.parseColor("#ff002b"))
                txt_tasavi.setTextColor(Color.parseColor("#ff002b"))
                txt_alamat.setTextColor(Color.parseColor("#ff002b"))

            } else if (txtsave.text == "2") {
                txt_alamat.text = "-"
                txt_rnum1.setTextColor(Color.parseColor("#00aaff"))
                txt_rnum2.setTextColor(Color.parseColor("#00aaff"))
                txt_res.setTextColor(Color.parseColor("#00aaff"))
                txt_tasavi.setTextColor(Color.parseColor("#00aaff"))
                txt_alamat.setTextColor(Color.parseColor("#00aaff"))

            } else if (txtsave.text == "3") {
                txt_alamat.text = "*"
                txt_rnum1.setTextColor(Color.parseColor("#f7cf02"))
                txt_rnum2.setTextColor(Color.parseColor("#f7cf02"))
                txt_res.setTextColor(Color.parseColor("#f7cf02"))
                txt_tasavi.setTextColor(Color.parseColor("#f7cf02"))
                txt_alamat.setTextColor(Color.parseColor("#f7cf02"))

            } else if (txtsave.text == "4") {
                txt_alamat.text = "/"
                txt_rnum1.setTextColor(Color.parseColor("#a0522d"))
                txt_rnum2.setTextColor(Color.parseColor("#a0522d"))
                txt_res.setTextColor(Color.parseColor("#a0522d"))
                txt_tasavi.setTextColor(Color.parseColor("#a0522d"))
                txt_alamat.setTextColor(Color.parseColor("#a0522d"))
            }

        } else {
            txt_alamat.text = ""
            txt_rnum1.text = ""
            txt_rnum2.text = ""
            txt_res.text = ""
            txt_tasavi.visibility = View.INVISIBLE

        }
    }
}