package kr.hs.emirim.areum.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_constellation.*

class AbsoluteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constellation)

        goResultButton.setOnClickListener {
            startActivity(Intent(this, ResultActivity::class.java))
        }
    }
}
