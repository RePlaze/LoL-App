package me.ibrahimsn.smoothbottombar
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ChampionInfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_champion_info)

        val championName = intent.getStringExtra("championName")

        val championImageView: ImageView = findViewById(R.id.championImageView)
        val championNameTextView: TextView = findViewById(R.id.championNameTextView)

        val imageName = championName?.toLowerCase()

        val imageResourceId = resources.getIdentifier(imageName, "drawable", packageName)
            championImageView.setImageResource(imageResourceId)

        championNameTextView.text = championName
    }
}
