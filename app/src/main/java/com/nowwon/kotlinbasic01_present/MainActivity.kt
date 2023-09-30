package com.nowwon.kotlinbasic01_present

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.clickBtn
import kotlinx.android.synthetic.main.activity_main.smallBtn

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clickBtn.setOnClickListener {

            // 코드에 메모 남기기 - 주석
//            ctrl + /: 커서가 있는 줄을 주석처리.
//            이 { } 안에 있는 코드만, 버튼이 눌렸을 때 실행됨.

            Log.d("메인화면로그", "클릭용 버튼이 눌림")
            Log.e("메인화면로그", "에러 관련 로그")

        }
        smallBtn

    }
}