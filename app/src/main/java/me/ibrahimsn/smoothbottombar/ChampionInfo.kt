package me.ibrahimsn.smoothbottombar

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.squareup.picasso.Picasso
import java.util.*

class ChampionInfo : AppCompatActivity() {

    @SuppressLint("DiscouragedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_champion_info)

        // Load and display the YouTube video thumbnail image
        val youtubeVideoThumbnailImageView = findViewById<ImageView>(R.id.youtubeVideoThumbnail)
        val youtubeThumbnailUrl = "https://www.youtube.com/watch?v=13dUcN9AeTA&ab_channel=3MinuteLeagueofLegends"

        Picasso.get().load(youtubeThumbnailUrl).into(youtubeVideoThumbnailImageView)

        val championName = intent.getStringExtra("championName")

        val championImageView: ImageView = findViewById(R.id.championImageView)
        val championNameTextView: TextView = findViewById(R.id.championNameTextView)

        val backgroundName = "${championName?.toLowerCase(Locale.ROOT)}_background"
        val backgroundResourceId =
            resources.getIdentifier(backgroundName, "drawable", packageName)
        val championBackgroundImageView: ImageView =
            findViewById(R.id.championBackgroundImageView)

        if (backgroundResourceId != 0) {
            championBackgroundImageView.setImageResource(backgroundResourceId)
        }

        // Set the champion image
        val imageName = championName?.toLowerCase(Locale.ROOT)
        val imageResourceId = resources.getIdentifier(imageName, "drawable", packageName)
        championImageView.setImageResource(imageResourceId)

        championNameTextView.text = championName

        //find and set builds
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

        //find and set first buy
        val firstbuyView = findViewById<CardView>(R.id.firstbuy)
        val Buyimage1 = firstbuyView.findViewById<ImageView>(R.id.buyimage1)
        val Buyimage2 = firstbuyView.findViewById<ImageView>(R.id.buyimage2)

        //set the counters
        val counter1 = findViewById<ImageView>(R.id.counter1)
        val counter2 = findViewById<ImageView>(R.id.counter2)
        val counter3 = findViewById<ImageView>(R.id.counter3)
        val counter4 = findViewById<ImageView>(R.id.counter4)
        val counter5 = findViewById<ImageView>(R.id.counter5)
        val counter6 = findViewById<ImageView>(R.id.counter6)
        val counter7 = findViewById<ImageView>(R.id.counter7)
        val counter8 = findViewById<ImageView>(R.id.counter8)
        val counter9 = findViewById<ImageView>(R.id.counter9)
        val counter10 = findViewById<ImageView>(R.id.counter10)
        val setCounter1 = counter1.findViewById<ImageView>(R.id.counter1)
        val setCounter2 = counter2.findViewById<ImageView>(R.id.counter2)
        val setCounter3 = counter3.findViewById<ImageView>(R.id.counter3)
        val setCounter4 = counter4.findViewById<ImageView>(R.id.counter4)
        val setCounter5 = counter5.findViewById<ImageView>(R.id.counter5)
        val setCounter6 = counter6.findViewById<ImageView>(R.id.counter6)
        val setCounter7 = counter7.findViewById<ImageView>(R.id.counter7)
        val setCounter8 = counter8.findViewById<ImageView>(R.id.counter8)
        val setCounter9 = counter9.findViewById<ImageView>(R.id.counter9)
        val setCounter10 = counter10.findViewById<ImageView>(R.id.counter10)
        setCounter1.setImageResource(R.drawable.kaisa)
        setCounter2.setImageResource(R.drawable.kaisa)
        setCounter3.setImageResource(R.drawable.kaisa)
        setCounter4.setImageResource(R.drawable.kaisa)
        setCounter5.setImageResource(R.drawable.kaisa)
        setCounter6.setImageResource(R.drawable.kaisa)
        setCounter7.setImageResource(R.drawable.kaisa)
        setCounter8.setImageResource(R.drawable.kaisa)
        setCounter9.setImageResource(R.drawable.kaisa)
        setCounter10.setImageResource(R.drawable.kaisa)
        //set firstbuy for each champion
        if (championName == "Aatrox") {
            Buyimage1.setImageResource(R.drawable.m1054)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Ahri") {
            Buyimage1.setImageResource(R.drawable.m1056)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Akali") {
            Buyimage1.setImageResource(R.drawable.m1054)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Alistar") {
            Buyimage1.setImageResource(R.drawable.m2003)
            Buyimage2.setImageResource(R.drawable.m3858)
        }
        if (championName == "Amumu") {
            Buyimage1.setImageResource(R.drawable.m1103)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Anivia") {
            Buyimage1.setImageResource(R.drawable.m1056)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Annie") {
            Buyimage1.setImageResource(R.drawable.m1056)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Aphelios") {
            Buyimage1.setImageResource(R.drawable.m1083)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Ashe") {
            Buyimage1.setImageResource(R.drawable.m1055)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "AurelionSol") {
            Buyimage1.setImageResource(R.drawable.m1056)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Azir") {
            Buyimage1.setImageResource(R.drawable.m1056)
            Buyimage2.setImageResource(R.drawable.m2003)
        }

        //set builds for each champion

        if (championName == "Aatrox") {
            Aimage1.setImageResource(R.drawable.m6630)
            Aimage2.setImageResource(R.drawable.m3161)
            Aimage3.setImageResource(R.drawable.m3053)
            Bimage1.setImageResource(R.drawable.m6691)
            Bimage2.setImageResource(R.drawable.m6694)
            Bimage3.setImageResource(R.drawable.m3071)
            Cimage1.setImageResource(R.drawable.m6691)
            Cimage2.setImageResource(R.drawable.m3814)
            Cimage3.setImageResource(R.drawable.m6694)
        }
        if (championName == "Ahri") {
            Aimage1.setImageResource(R.drawable.m6656)
            Aimage2.setImageResource(R.drawable.m4645)
            Aimage3.setImageResource(R.drawable.m3157)
            Bimage1.setImageResource(R.drawable.m6656)
            Bimage2.setImageResource(R.drawable.m4645)
            Bimage3.setImageResource(R.drawable.m3089)
            Cimage1.setImageResource(R.drawable.m6655)
            Cimage2.setImageResource(R.drawable.m4645)
            Cimage3.setImageResource(R.drawable.m3089)
        }
        if (championName == "Akali") {
            Aimage1.setImageResource(R.drawable.m3152)
            Aimage2.setImageResource(R.drawable.m4645)
            Aimage3.setImageResource(R.drawable.m3157)
            Bimage1.setImageResource(R.drawable.m3152)
            Bimage2.setImageResource(R.drawable.m4645)
            Bimage3.setImageResource(R.drawable.m3089)
            Cimage1.setImageResource(R.drawable.m3152)
            Cimage2.setImageResource(R.drawable.m3157)
            Cimage3.setImageResource(R.drawable.m4645)
        }
        if (championName == "Alistar") {
            Aimage1.setImageResource(R.drawable.m3068)
            Aimage2.setImageResource(R.drawable.m6665)
            Aimage3.setImageResource(R.drawable.m3193)
            Bimage1.setImageResource(R.drawable.m3070)
            Bimage2.setImageResource(R.drawable.m3068)
            Bimage3.setImageResource(R.drawable.m6656)
            Cimage1.setImageResource(R.drawable.m3040)
            Cimage2.setImageResource(R.drawable.m4636)
            Cimage3.setImageResource(R.drawable.m4645)
        }
        if (championName == "Amumu") {
            Aimage1.setImageResource(R.drawable.m3070)
            Aimage2.setImageResource(R.drawable.m4637)
            Aimage3.setImageResource(R.drawable.m3068)
            Bimage1.setImageResource(R.drawable.m3121)
            Bimage2.setImageResource(R.drawable.m3076)
            Bimage3.setImageResource(R.drawable.m3068)
            Cimage1.setImageResource(R.drawable.m3001)
            Cimage2.setImageResource(R.drawable.m3075)
            Cimage3.setImageResource(R.drawable.m4637)
        }
        if (championName == "Anivia") {
            Aimage1.setImageResource(R.drawable.m3070)
            Aimage2.setImageResource(R.drawable.m6657)
            Aimage3.setImageResource(R.drawable.m3040)
            Bimage1.setImageResource(R.drawable.m3157)
            Bimage2.setImageResource(R.drawable.m3070)
            Bimage3.setImageResource(R.drawable.m6653)
            Cimage1.setImageResource(R.drawable.m3040)
            Cimage2.setImageResource(R.drawable.m3157)
            Cimage3.setImageResource(R.drawable.m3070)
        }
        if (championName == "Annie") {
            Aimage1.setImageResource(R.drawable.m6655)
            Aimage2.setImageResource(R.drawable.m4645)
            Aimage3.setImageResource(R.drawable.m3089)
            Bimage1.setImageResource(R.drawable.m6655)
            Bimage2.setImageResource(R.drawable.m3157)
            Bimage3.setImageResource(R.drawable.m4645)
            Cimage1.setImageResource(R.drawable.m6655)
            Cimage2.setImageResource(R.drawable.m4645)
            Cimage3.setImageResource(R.drawable.m3102)
        }
        if (championName == "Aphelios") {
            Aimage1.setImageResource(R.drawable.m6672)
            Aimage2.setImageResource(R.drawable.m6671)
            Aimage3.setImageResource(R.drawable.m3072)
            Bimage1.setImageResource(R.drawable.m6672)
            Bimage2.setImageResource(R.drawable.m6671)
            Bimage3.setImageResource(R.drawable.m3036)
            Cimage1.setImageResource(R.drawable.m6672)
            Cimage2.setImageResource(R.drawable.m3031)
            Cimage3.setImageResource(R.drawable.m3036)
        }
        if (championName == "Ashe") {
            Aimage1.setImageResource(R.drawable.m6672)
            Aimage2.setImageResource(R.drawable.m3078)
            Aimage3.setImageResource(R.drawable.m3085)
            Bimage1.setImageResource(R.drawable.m6672)
            Bimage2.setImageResource(R.drawable.m3078)
            Bimage3.setImageResource(R.drawable.m3153)
            Cimage1.setImageResource(R.drawable.m6672)
            Cimage2.setImageResource(R.drawable.m3078)
            Cimage3.setImageResource(R.drawable.m3046)
        }
        if (championName == "AurelionSol") {
            Aimage1.setImageResource(R.drawable.m3070)
            Aimage2.setImageResource(R.drawable.m6653)
            Aimage3.setImageResource(R.drawable.m3116)
            Bimage1.setImageResource(R.drawable.m3040)
            Bimage2.setImageResource(R.drawable.m3070)
            Bimage3.setImageResource(R.drawable.m3116)
            Cimage1.setImageResource(R.drawable.m6653)
            Cimage2.setImageResource(R.drawable.m3040)
            Cimage3.setImageResource(R.drawable.m3070)
        }
        if (championName == "Azir") {
            Aimage1.setImageResource(R.drawable.m6653)
            Aimage2.setImageResource(R.drawable.m3115)
            Aimage3.setImageResource(R.drawable.m3089)
            Bimage1.setImageResource(R.drawable.m6653)
            Bimage2.setImageResource(R.drawable.m3115)
            Bimage3.setImageResource(R.drawable.m3157)
            Cimage1.setImageResource(R.drawable.m4644)
            Cimage2.setImageResource(R.drawable.m3115)
            Cimage3.setImageResource(R.drawable.m3157)
        }


        }
    }
