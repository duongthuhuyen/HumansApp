package jp.techacademy.huyen.duong.humanapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val human1: Human = Human("フエン", 22, "音楽")
        human1.say()
        human1.think()
        val human2 = Human("ハン", 18, "ゲーム")
        human2.hobby = "旅行"
        human2.say()
        human2.think()
    }
}

const val MY_TAG: String = "kotlintest"