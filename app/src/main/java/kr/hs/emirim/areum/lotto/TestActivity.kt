package kr.hs.emirim.areum.lotto

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_test.*

class TestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        button5.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java);
            startActivity(intent)
        }

        button6.setOnClickListener {
            val intent = Intent(this, ConstellationActivity::class.java);
            startActivity(intent)
        }

        button7.setOnClickListener {
            val intent = Intent(this, NameActivity::class.java);
            startActivity(intent)
        }

        button8.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java);
            startActivity(intent)
        }

        button9.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.naver.com/")
            )
            startActivity(intent)
        }
    }

    fun goConstellation(view: View){ //메소드 하나 만듬
        val intent = Intent(this, ConstellationActivity::class.java);
        startActivity(intent)
    }

    fun CallWeb(view: View){
        val intent = Intent(this, ConstellationActivity::class.java);
        startActivity(intent)
    }
}
