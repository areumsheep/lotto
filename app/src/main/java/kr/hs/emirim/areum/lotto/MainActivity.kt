package kr.hs.emirim.areum.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ActionMenuView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        randomCard.setOnClickListener{
            val intent = Intent(this,ResultActivity::class.java)

            intent.putIntegerArrayListExtra("result",ArrayList(LottoNumberMaker.getShuffleLottoNumbers()))
            startActivity(intent)
        }

        constellationCard.setOnClickListener{
            startActivity(Intent(this, ConstellationActivity::class.java))
        }

        nameCard.setOnClickListener{
            startActivity(Intent(this, NameActivity::class.java))
        }

    }
}
