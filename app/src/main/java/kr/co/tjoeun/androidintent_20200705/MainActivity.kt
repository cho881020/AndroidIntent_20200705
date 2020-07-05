package kr.co.tjoeun.androidintent_20200705

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        다이얼버튼 이벤트
        dialBtn.setOnClickListener {

//            입력된 전화번호를 받아오자.
            val inputPhoneNum = phoneNumEdt.text.toString()

//            안드로이드에게, 어디에 전화걸지 정보 전달 => Uri
//            전화 Uri양식 - tel:010-5112-3237
            val myUri = Uri.parse("tel:${inputPhoneNum}")

//            전화 화면으로 이동하는 Intent
            val myIntent = Intent(Intent.ACTION_DIAL, myUri)

            startActivity(myIntent)


        }

    }
}