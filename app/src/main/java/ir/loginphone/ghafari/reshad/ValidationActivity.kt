package ir.loginphone.ghafari.reshad

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat

class ValidationActivity : AppCompatActivity() {

    val rnds = (27574..98545).random()

    private val CHANNEL_ID = "5"
    private val notificationId = 101

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_validation)

        title = "صفحه ثبت نام"
        val txt_phoneview = findViewById<TextView>(R.id.ac_val_txt_viewphone)
        val txt_valcod = findViewById<EditText>(R.id.ac_val_txt_incod)
        val btn_suub = findViewById<Button>(R.id.ac_val_btn_subcod)
        btn_suub.setBackgroundColor(Color.parseColor("#4b8efa"))
        createNotificationChannel()
        sendNotification()

       btn_suub.setOnClickListener {
          if (txt_valcod.text.toString() == rnds.toString()) {
              Toast.makeText(getApplicationContext(), "ورود با موفقیت انجام شد", Toast.LENGTH_LONG).show();
              var intent: Intent = Intent(this, Page3Activity::class.java)
              startActivity(intent)
              this.finish()
          }else if (txt_valcod.text.toString().equals("")){
              Toast.makeText(getApplicationContext(), "کدی وارد نشده است!", Toast.LENGTH_LONG).show();
           }else{
                Toast.makeText(getApplicationContext(), "کد وارد شده صحیح نمیباشد!", Toast.LENGTH_LONG).show();
           }

     }


        if (intent.extras != null) {
            var ph: String = intent.extras!!.getString("phone", "")
            txt_phoneview.text = ph
        } else {
            txt_phoneview.text = " محل نمایش شماره موبایل کاربر"
        }

    }

    private fun createNotificationChannel() {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val name = "test"
            val descriptionText = "test"
            val importance = NotificationManager.IMPORTANCE_DEFAULT
            val channel = NotificationChannel(CHANNEL_ID, name, importance).apply {
                description = descriptionText
            }
            val notificationManager: NotificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)
        }
    }

    private fun sendNotification() {


        val builder = NotificationCompat.Builder(this, CHANNEL_ID)
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setContentTitle("برای ورود به برنامه کد زیر را وارد کنید")
                .setContentText(rnds.toString())
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)

        with(NotificationManagerCompat.from(this)) {
            notify(notificationId, builder.build())
        }
    }
}