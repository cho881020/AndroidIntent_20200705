package kr.co.tjoeun.androidintent_20200705

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        다이얼버튼 이벤트
        dialBtn.setOnClickListener {
            
        }

    }
}