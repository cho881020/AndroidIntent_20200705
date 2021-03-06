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

        callBtn.setOnClickListener {
            val inputPhone = phoneNumEdt.text.toString()

            val myUri = Uri.parse("tel:${inputPhone}")
            val myIntent = Intent(Intent.ACTION_CALL, myUri)
            startActivity(myIntent)
        }

        sendSmsBtn.setOnClickListener {
//            입력한 폰번 / 문자 내용 받아오기
            val inputPhone = phoneNumEdt.text.toString()
            val content = smsContentEdt.text.toString()

//            전화번호를 uri로 변경
            val myUri = Uri.parse("smsto:${inputPhone}")
//            문자 전송 화면으로 이동
            val myIntent = Intent(Intent.ACTION_SENDTO, myUri)

//            문자 화면 이동시 데이터 첨부
            myIntent.putExtra("sms_body", content)

            startActivity(myIntent)

        }

        naverLinkBtn.setOnClickListener {

//            Uri에 실제 인터넷 주소 대입
            val myUri = Uri.parse("https://naver.com")
            val myIntent = Intent(Intent.ACTION_VIEW, myUri)
            startActivity(myIntent)

        }

        kakaoStoreLinkBtn.setOnClickListener {
            val myUri = Uri.parse("market://details?id=com.kakao.talk")
            val myIntent = Intent(Intent.ACTION_VIEW, myUri)
            startActivity(myIntent)
        }

    }
}