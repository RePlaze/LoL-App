package me.ibrahimsn.smoothbottombar
import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import java.util.*


class ChampionInfo : AppCompatActivity() {
    @SuppressLint("DiscouragedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_champion_info)

        val championName = intent.getStringExtra("championName")

        val championImageView: ImageView = findViewById(R.id.championImageView)
        val championNameTextView: TextView = findViewById(R.id.championNameTextView)

        val backgroundName = "${championName?.toLowerCase(Locale.ROOT)}_background"
        val backgroundResourceId = resources.getIdentifier(backgroundName, "drawable", packageName)
        val championBackgroundImageView: ImageView = findViewById(R.id.championBackgroundImageView)

        if (backgroundResourceId != 0) {
            championBackgroundImageView.setImageResource(backgroundResourceId)
        }

        // Set the champion image
        val imageName = championName?.toLowerCase(Locale.ROOT)
        val imageResourceId = resources.getIdentifier(imageName, "drawable", packageName)
        championImageView.setImageResource(imageResourceId)

        championNameTextView.text = championName

        val cardView1 = findViewById<CardView>(R.id.card1)
        val cardView2 = findViewById<CardView>(R.id.card2)
        val cardView3 = findViewById<CardView>(R.id.card3)
        val Aimage1 = cardView1.findViewById<ImageView>(R.id.image1)
        val Aimage2 = cardView1.findViewById<ImageView>(R.id.image2)
        val Aimage3 = cardView1.findViewById<ImageView>(R.id.image3)
        val Bimage1 = cardView2.findViewById<ImageView>(R.id.image1)
        val Bimage2 = cardView2.findViewById<ImageView>(R.id.image2)
        val Bimage3 = cardView2.findViewById<ImageView>(R.id.image3)
        val Cimage1 = cardView3.findViewById<ImageView>(R.id.image1)
        val Cimage2 = cardView3.findViewById<ImageView>(R.id.image2)
        val Cimage3 = cardView3.findViewById<ImageView>(R.id.image3)

        Aimage1.setImageResource(R.drawable.m3053)
        Aimage2.setImageResource(R.drawable.m3036)
        Aimage3.setImageResource(R.drawable.m3046)

        Bimage1.setImageResource(R.drawable.m3053)
        Bimage2.setImageResource(R.drawable.m3036)
        Bimage3.setImageResource(R.drawable.m3046)

        Cimage1.setImageResource(R.drawable.m3053)
        Cimage2.setImageResource(R.drawable.m3036)
        Cimage3.setImageResource(R.drawable.m3046)


    }
}
