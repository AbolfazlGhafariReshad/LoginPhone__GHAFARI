package ir.loginphone.ghafari.reshad

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import ir.loginphone.ghafari.reshad.R

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        title = "صفحه ثبت نام"

        val txt_phone = findViewById<EditText>(R.id.ac_start_txt_phone)
        val btn_submit = findViewById<Button>(R.id.ac_start_btn_submit)
        btn_submit.setBackgroundColor(Color.parseColor("#4b8efa"))

                btn_submit.setOnClickListener {

                    if (txt_phone.text.length == 11 && txt_phone.text.startsWith("09")) {
                        Toast.makeText(getApplicationContext(), "کد تایید ارسال شد", Toast.LENGTH_LONG).show();
                        var intent: Intent = Intent(this, ValidationActivity::class.java)
                        intent.putExtra("phone", txt_phone.text.toString())
                        startActivity(intent)
                        this.finish()
                    } else if (txt_phone.text.toString().equals("")) {
                        Toast.makeText(getApplicationContext(), "لطفا شماره تلفن خود وارد نمایید", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "شماره تلفن صحیح نمیباشد!", Toast.LENGTH_LONG).show();
                    }


                }


    }
}