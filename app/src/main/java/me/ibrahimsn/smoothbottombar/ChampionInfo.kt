package me.ibrahimsn.smoothbottombar

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class ChampionInfo : AppCompatActivity() {
    private lateinit var recyclerView1: RecyclerView
    private lateinit var recyclerView2: RecyclerView
    private lateinit var adapter1: GridAdapter
    private lateinit var adapter2: GridAdapter

    @SuppressLint("DiscouragedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_champion_info)


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

        recyclerView1 = findViewById(R.id.conters1)
        recyclerView2 = findViewById(R.id.conters2)

        // Set counters for the first RecyclerView (counter1)
        val gridItems1 = mutableListOf(
            GridItem("Aatrox", R.drawable.aatrox),
            GridItem("Ahri", R.drawable.ahri),
            // Add more items as needed
        )
        adapter1 = GridAdapter(gridItems1, this)
        recyclerView1.adapter = adapter1
        recyclerView1.layoutManager = GridLayoutManager(this, 5) // Adjust span count if needed

        // Set counters for the second RecyclerView (counter2)
        val gridItems2 = mutableListOf(
            GridItem("Kaisa", R.drawable.kaisa),
            GridItem("Irelia", R.drawable.irelia),
            // Add more items as needed
        )
        adapter2 = GridAdapter(gridItems2, this)
        recyclerView2.adapter = adapter2
        recyclerView2.layoutManager = GridLayoutManager(this, 5) // Adjust span count if needed

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
        var firstbuyView = findViewById<CardView>(R.id.firstbuy)
        val Buyimage1 = firstbuyView.findViewById<ImageView>(R.id.buyimage1)
        val Buyimage2 = firstbuyView.findViewById<ImageView>(R.id.buyimage2)

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
        if (championName == "Bard") {
            Buyimage1.setImageResource(R.drawable.m2003)
            Buyimage2.setImageResource(R.drawable.m3850)
        }
        if (championName == "Blitzcrank") {
            Buyimage1.setImageResource(R.drawable.m2003)
            Buyimage2.setImageResource(R.drawable.m3858)
        }
        if (championName == "Brand") {
            Buyimage1.setImageResource(R.drawable.m2003)
            Buyimage2.setImageResource(R.drawable.m3850)
        }
        if (championName == "Briar") {
            Buyimage1.setImageResource(R.drawable.m1103)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Braum") {
            Buyimage1.setImageResource(R.drawable.m2003)
            Buyimage2.setImageResource(R.drawable.m3858)
        }
        if (championName == "Caitlyn") {
            Buyimage1.setImageResource(R.drawable.m1055)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Camille") {
            Buyimage1.setImageResource(R.drawable.m1054)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Cassiopeia") {
            Buyimage1.setImageResource(R.drawable.m2003)
            Buyimage2.setImageResource(R.drawable.m3070)
        }
        if (championName == "ChoGath") {
            Buyimage1.setImageResource(R.drawable.m1056)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Corki") {
            Buyimage1.setImageResource(R.drawable.m1083)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Darius") {
            Buyimage1.setImageResource(R.drawable.m1054)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Diana") {
            Buyimage1.setImageResource(R.drawable.m1103)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "DrMundo") {
            Buyimage1.setImageResource(R.drawable.m1054)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Draven") {
            Buyimage1.setImageResource(R.drawable.m1055)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Ekko") {
            Buyimage1.setImageResource(R.drawable.m1102)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Elise") {
            Buyimage1.setImageResource(R.drawable.m1101)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Evelynn") {
            Buyimage1.setImageResource(R.drawable.m1102)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Ezreal") {
            Buyimage1.setImageResource(R.drawable.m1055)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Fiddlesticks") {
            Buyimage1.setImageResource(R.drawable.m1102)
            Buyimage2.setImageResource(R.drawable.m1102)
        }
        if (championName == "Fiora") {
            Buyimage1.setImageResource(R.drawable.m1055)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Fizz") {
            Buyimage1.setImageResource(R.drawable.m2033)
            Buyimage2.setImageResource(R.drawable.m1056)
        }
        if (championName == "Galio") {
            Buyimage1.setImageResource(R.drawable.m1056)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Gangplank") {
            Buyimage1.setImageResource(R.drawable.m1036)
            Buyimage2.setImageResource(R.drawable.m2031)
        }
        if (championName == "Garen") {
            Buyimage1.setImageResource(R.drawable.m1054)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Gnar") {
            Buyimage1.setImageResource(R.drawable.m1055)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Gragas") {
            Buyimage1.setImageResource(R.drawable.m1102)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Graves") {
            Buyimage1.setImageResource(R.drawable.m1101)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Gwen") {
            Buyimage1.setImageResource(R.drawable.m1056)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Hecarim") {
            Buyimage1.setImageResource(R.drawable.m1102)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Heimerdinger") {
            Buyimage1.setImageResource(R.drawable.m2003)
            Buyimage2.setImageResource(R.drawable.m3850)
        }
        if (championName == "Illaoi") {
            Buyimage1.setImageResource(R.drawable.m2033)
            Buyimage2.setImageResource(R.drawable.m1054)
        }
        if (championName == "Irelia") {
            Buyimage1.setImageResource(R.drawable.m1055)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Ivern") {
            Buyimage1.setImageResource(R.drawable.m1102)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Janna") {
            Buyimage1.setImageResource(R.drawable.m2003)
            Buyimage2.setImageResource(R.drawable.m3850)
        }
        if (championName == "JarvanIV") {
            Buyimage1.setImageResource(R.drawable.m1103)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Jax") {
            Buyimage1.setImageResource(R.drawable.m1054)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Jayce") {
            Buyimage1.setImageResource(R.drawable.m1055)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Jhin") {
            Buyimage1.setImageResource(R.drawable.m1055)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Jinx") {
            Buyimage1.setImageResource(R.drawable.m1055)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "KaiSa") {
            Buyimage1.setImageResource(R.drawable.m1055)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Kalista") {
            Buyimage1.setImageResource(R.drawable.m1055)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Karma") {
            Buyimage1.setImageResource(R.drawable.m2003)
            Buyimage2.setImageResource(R.drawable.m3850)
        }
        if (championName == "Karthus") {
            Buyimage1.setImageResource(R.drawable.m1101)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Kassadin") {
            Buyimage1.setImageResource(R.drawable.m1054)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Ksante") {
            Buyimage1.setImageResource(R.drawable.m1054)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Katarina") {
            Buyimage1.setImageResource(R.drawable.m1082)
            Buyimage2.setImageResource(R.drawable.m2031)
        }
        if (championName == "Kayle") {
            Buyimage1.setImageResource(R.drawable.m1055)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Kayn") {
            Buyimage1.setImageResource(R.drawable.m1102)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Kennen") {
            Buyimage1.setImageResource(R.drawable.m1055)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "KhaZix") {
            Buyimage1.setImageResource(R.drawable.m1102)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Kindred") {
            Buyimage1.setImageResource(R.drawable.m1103)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Kled") {
            Buyimage1.setImageResource(R.drawable.m1055)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "KogMaw") {
            Buyimage1.setImageResource(R.drawable.m1055)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "LeBlanc") {
            Buyimage1.setImageResource(R.drawable.m1036)
            Buyimage2.setImageResource(R.drawable.m2031)
        }
        if (championName == "LeeSin") {
            Buyimage1.setImageResource(R.drawable.m1103)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Leona") {
            Buyimage1.setImageResource(R.drawable.m2003)
            Buyimage2.setImageResource(R.drawable.m3858)
        }
        if (championName == "Lillia") {
            Buyimage1.setImageResource(R.drawable.m1102)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Lissandra") {
            Buyimage1.setImageResource(R.drawable.m1056)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Lucian") {
            Buyimage1.setImageResource(R.drawable.m1055)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Lulu") {
            Buyimage1.setImageResource(R.drawable.m2003)
            Buyimage2.setImageResource(R.drawable.m3850)
        }
        if (championName == "Lux") {
            Buyimage1.setImageResource(R.drawable.m2003)
            Buyimage2.setImageResource(R.drawable.m3850)
        }
        if (championName == "Malphite") {
            Buyimage1.setImageResource(R.drawable.m1056)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Malzahar") {
            Buyimage1.setImageResource(R.drawable.m1056)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Maokai") {
            Buyimage1.setImageResource(R.drawable.m1103)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "MasterYi") {
            Buyimage1.setImageResource(R.drawable.m1103)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "MissFortune") {
            Buyimage1.setImageResource(R.drawable.m1055)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Mordekaiser") {
            Buyimage1.setImageResource(R.drawable.m1054)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Milio") {
            Buyimage1.setImageResource(R.drawable.m2003)
            Buyimage2.setImageResource(R.drawable.m3850)
        }
        if (championName == "Morgana") {
            Buyimage1.setImageResource(R.drawable.m2003)
            Buyimage2.setImageResource(R.drawable.m3850)
        }
        if (championName == "Nami") {
            Buyimage1.setImageResource(R.drawable.m2003)
            Buyimage2.setImageResource(R.drawable.m3850)
        }
        if (championName == "Nasus") {
            Buyimage1.setImageResource(R.drawable.m1054)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Nautilus") {
            Buyimage1.setImageResource(R.drawable.m2003)
            Buyimage2.setImageResource(R.drawable.m3858)
        }
        if (championName == "Neeko") {
            Buyimage1.setImageResource(R.drawable.m2003)
            Buyimage2.setImageResource(R.drawable.m3850)
        }
        if (championName == "Nidalee") {
            Buyimage1.setImageResource(R.drawable.m1101)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Nocturne") {
            Buyimage1.setImageResource(R.drawable.m1103)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "NunuWillump") {
            Buyimage1.setImageResource(R.drawable.m1102)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Olaf") {
            Buyimage1.setImageResource(R.drawable.m1055)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Orianna") {
            Buyimage1.setImageResource(R.drawable.m1056)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Ornn") {
            Buyimage1.setImageResource(R.drawable.m1054)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Pantheon") {
            Buyimage1.setImageResource(R.drawable.m1055)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Poppy") {
            Buyimage1.setImageResource(R.drawable.m1102)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Pyke") {
            Buyimage1.setImageResource(R.drawable.m2003)
            Buyimage2.setImageResource(R.drawable.m3854)
        }
        if (championName == "Qiyana") {
            Buyimage1.setImageResource(R.drawable.m1036)
            Buyimage2.setImageResource(R.drawable.m2031)
        }
        if (championName == "Quinn") {
            Buyimage1.setImageResource(R.drawable.m1036)
            Buyimage2.setImageResource(R.drawable.m2031)
        }
        if (championName == "Rakan") {
            Buyimage1.setImageResource(R.drawable.m2003)
            Buyimage2.setImageResource(R.drawable.m3858)
        }
        if (championName == "Rammus") {
            Buyimage1.setImageResource(R.drawable.m1103)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "RekSai") {
            Buyimage1.setImageResource(R.drawable.m1103)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Rell") {
            Buyimage1.setImageResource(R.drawable.m2003)
            Buyimage2.setImageResource(R.drawable.m3858)
        }
        if (championName == "Renekton") {
            Buyimage1.setImageResource(R.drawable.m1054)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Rengar") {
            Buyimage1.setImageResource(R.drawable.m1102)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Riven") {
            Buyimage1.setImageResource(R.drawable.m1036)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Rumble") {
            Buyimage1.setImageResource(R.drawable.m1056)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Ryze") {
            Buyimage1.setImageResource(R.drawable.m2003)
            Buyimage2.setImageResource(R.drawable.m3070)
        }
        if (championName == "Samira") {
            Buyimage1.setImageResource(R.drawable.m1055)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Sejuani") {
            Buyimage1.setImageResource(R.drawable.m1103)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Senna") {
            Buyimage1.setImageResource(R.drawable.m2003)
            Buyimage2.setImageResource(R.drawable.m3862)
        }
        if (championName == "Seraphine") {
            Buyimage1.setImageResource(R.drawable.m2003)
            Buyimage2.setImageResource(R.drawable.m3850)
        }
        if (championName == "Sett") {
            Buyimage1.setImageResource(R.drawable.m1054)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Shaco") {
            Buyimage1.setImageResource(R.drawable.m1102)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Shen") {
            Buyimage1.setImageResource(R.drawable.m1054)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Shyvana") {
            Buyimage1.setImageResource(R.drawable.m1103)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Singed") {
            Buyimage1.setImageResource(R.drawable.m1056)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Sion") {
            Buyimage1.setImageResource(R.drawable.m1054)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Sivir") {
            Buyimage1.setImageResource(R.drawable.m1083)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Skarner") {
            Buyimage1.setImageResource(R.drawable.m1102)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Sona") {
            Buyimage1.setImageResource(R.drawable.m2003)
            Buyimage2.setImageResource(R.drawable.m3850)
        }
        if (championName == "Soraka") {
            Buyimage1.setImageResource(R.drawable.m2003)
            Buyimage2.setImageResource(R.drawable.m3850)
        }
        if (championName == "Swain") {
            Buyimage1.setImageResource(R.drawable.m2003)
            Buyimage2.setImageResource(R.drawable.m3850)
        }
        if (championName == "Sylas") {
            Buyimage1.setImageResource(R.drawable.m1056)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Syndra") {
            Buyimage1.setImageResource(R.drawable.m1056)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "TahmKench") {
            Buyimage1.setImageResource(R.drawable.m1054)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Taliyah") {
            Buyimage1.setImageResource(R.drawable.m1101)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Talon") {
            Buyimage1.setImageResource(R.drawable.m1036)
            Buyimage2.setImageResource(R.drawable.m2031)
        }
        if (championName == "Taric") {
            Buyimage1.setImageResource(R.drawable.m2003)
            Buyimage2.setImageResource(R.drawable.m3858)
        }
        if (championName == "Teemo") {
            Buyimage1.setImageResource(R.drawable.m1056)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Thresh") {
            Buyimage1.setImageResource(R.drawable.m2003)
            Buyimage2.setImageResource(R.drawable.m3858)
        }
        if (championName == "Tristana") {
            Buyimage1.setImageResource(R.drawable.m1055)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Trundle") {
            Buyimage1.setImageResource(R.drawable.m1055)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Tryndamere") {
            Buyimage1.setImageResource(R.drawable.m1054)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "TwistedFate") {
            Buyimage1.setImageResource(R.drawable.m1056)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Twitch") {
            Buyimage1.setImageResource(R.drawable.m1055)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Udyr") {
            Buyimage1.setImageResource(R.drawable.m1102)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Urgot") {
            Buyimage1.setImageResource(R.drawable.m1055)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Varus") {
            Buyimage1.setImageResource(R.drawable.m1055)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Vayne") {
            Buyimage1.setImageResource(R.drawable.m1055)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Veigar") {
            Buyimage1.setImageResource(R.drawable.m1056)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "VelKoz") {
            Buyimage1.setImageResource(R.drawable.m2003)
            Buyimage2.setImageResource(R.drawable.m3850)
        }
        if (championName == "Vi") {
            Buyimage1.setImageResource(R.drawable.m1103)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Viego") {
            Buyimage1.setImageResource(R.drawable.m1103)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Viktor") {
            Buyimage1.setImageResource(R.drawable.m1056)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Vladimir") {
            Buyimage1.setImageResource(R.drawable.m1056)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Volibear") {
            Buyimage1.setImageResource(R.drawable.m1056)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Warwick") {
            Buyimage1.setImageResource(R.drawable.m1103)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Wukong") {
            Buyimage1.setImageResource(R.drawable.m1103)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Xayah") {
            Buyimage1.setImageResource(R.drawable.m1055)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Xerath") {
            Buyimage1.setImageResource(R.drawable.m2003)
            Buyimage2.setImageResource(R.drawable.m3850)
        }
        if (championName == "XinZhao") {
            Buyimage1.setImageResource(R.drawable.m1103)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Yasuo") {
            Buyimage1.setImageResource(R.drawable.m1055)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Yone") {
            Buyimage1.setImageResource(R.drawable.m1055)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Yorick") {
            Buyimage1.setImageResource(R.drawable.m1054)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Yuumi") {
            Buyimage1.setImageResource(R.drawable.m3850)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Zac") {
            Buyimage1.setImageResource(R.drawable.m1103)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Zed") {
            Buyimage1.setImageResource(R.drawable.m1036)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Zeri") {
            Buyimage1.setImageResource(R.drawable.m1083)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Ziggs") {
            Buyimage1.setImageResource(R.drawable.m1056)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Zilean") {
            Buyimage1.setImageResource(R.drawable.m2003)
            Buyimage2.setImageResource(R.drawable.m3850)
        }
        if (championName == "Zoe") {
            Buyimage1.setImageResource(R.drawable.m1056)
            Buyimage2.setImageResource(R.drawable.m2003)
        }
        if (championName == "Zyra") {
            Buyimage1.setImageResource(R.drawable.m2003)
            Buyimage2.setImageResource(R.drawable.m3850)
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
        if (championName == "Bard") {
            Aimage1.setImageResource(R.drawable.m3001)
            Aimage2.setImageResource(R.drawable.m3107)
            Aimage3.setImageResource(R.drawable.m3011)
            Bimage1.setImageResource(R.drawable.m6667)
            Bimage2.setImageResource(R.drawable.m3107)
            Bimage3.setImageResource(R.drawable.m3157)
            Cimage1.setImageResource(R.drawable.m6672)
            Cimage2.setImageResource(R.drawable.m3078)
            Cimage3.setImageResource(R.drawable.m3153)
        }
        if (championName == "Blitzcrank") {
            Aimage1.setImageResource(R.drawable.m3115)
            Aimage2.setImageResource(R.drawable.m6656)
            Aimage3.setImageResource(R.drawable.m4645)
            Bimage1.setImageResource(R.drawable.m6655)
            Bimage2.setImageResource(R.drawable.m4628)
            Bimage3.setImageResource(R.drawable.m3089)
            Cimage1.setImageResource(R.drawable.m6656)
            Cimage2.setImageResource(R.drawable.m4645)
            Cimage3.setImageResource(R.drawable.m3157)
        }
        if (championName == "Brand") {
            Aimage1.setImageResource(R.drawable.m6653)
            Aimage2.setImageResource(R.drawable.m3116)
            Aimage3.setImageResource(R.drawable.m4637)
            Bimage1.setImageResource(R.drawable.m6653)
            Bimage2.setImageResource(R.drawable.m3116)
            Bimage3.setImageResource(R.drawable.m3157)
            Cimage1.setImageResource(R.drawable.m6653)
            Cimage2.setImageResource(R.drawable.m3116)
            Cimage3.setImageResource(R.drawable.m3135)
        }
        if (championName == "Briar") {
            Aimage1.setImageResource(R.drawable.m3153)
            Aimage2.setImageResource(R.drawable.m6631)
            Aimage3.setImageResource(R.drawable.m6333)
            Bimage1.setImageResource(R.drawable.m3153)
            Bimage2.setImageResource(R.drawable.m3078)
            Bimage3.setImageResource(R.drawable.m3071)
            Cimage1.setImageResource(R.drawable.m3153)
            Cimage2.setImageResource(R.drawable.m6630)
            Cimage3.setImageResource(R.drawable.m3071)
        }
        if (championName == "Braum") {
            Aimage1.setImageResource(R.drawable.m3070)
            Aimage2.setImageResource(R.drawable.m3001)
            Aimage3.setImageResource(R.drawable.m3121)
            Bimage1.setImageResource(R.drawable.m3109)
        }
        if (championName == "Caitlyn") {
            Aimage1.setImageResource(R.drawable.m3087)
            Aimage2.setImageResource(R.drawable.m3031)
            Aimage3.setImageResource(R.drawable.m3094)
            Bimage1.setImageResource(R.drawable.m3087)
            Bimage2.setImageResource(R.drawable.m3031)
            Bimage3.setImageResource(R.drawable.m3036)
            Cimage1.setImageResource(R.drawable.m3095)
            Cimage2.setImageResource(R.drawable.m3031)
            Cimage3.setImageResource(R.drawable.m3094)
        }
        if (championName == "Camille") {
            Aimage1.setImageResource(R.drawable.m3078)
            Aimage2.setImageResource(R.drawable.m3074)
            Aimage3.setImageResource(R.drawable.m3161)
            Bimage1.setImageResource(R.drawable.m3078)
            Bimage2.setImageResource(R.drawable.m3074)
            Bimage3.setImageResource(R.drawable.m6333)
            Cimage1.setImageResource(R.drawable.m3078)
            Cimage2.setImageResource(R.drawable.m3074)
            Cimage3.setImageResource(R.drawable.m3181)
        }
        if (championName == "Cassiopeia") {
            Aimage1.setImageResource(R.drawable.m3040)
            Aimage2.setImageResource(R.drawable.m3116)
            Aimage3.setImageResource(R.drawable.m3070)
            Bimage1.setImageResource(R.drawable.m6653)
            Bimage2.setImageResource(R.drawable.m3040)
            Bimage3.setImageResource(R.drawable.m3116)
            Cimage1.setImageResource(R.drawable.m3070)
            Cimage2.setImageResource(R.drawable.m6653)
            Cimage3.setImageResource(R.drawable.m3116)
        }
        if (championName == "ChoGath") {
            Aimage1.setImageResource(R.drawable.m6656)
            Aimage2.setImageResource(R.drawable.m4637)
            Aimage3.setImageResource(R.drawable.m3157)
            Bimage1.setImageResource(R.drawable.m6656)
            Bimage2.setImageResource(R.drawable.m4637)
            Bimage3.setImageResource(R.drawable.m3089)
            Cimage1.setImageResource(R.drawable.m6656)
            Cimage2.setImageResource(R.drawable.m4637)
            Cimage3.setImageResource(R.drawable.m3075)
        }
        if (championName == "Corki") {
            Aimage1.setImageResource(R.drawable.m3042)
            Aimage2.setImageResource(R.drawable.m6655)
            Aimage3.setImageResource(R.drawable.m3074)
            Bimage1.setImageResource(R.drawable.m3070)
            Bimage2.setImageResource(R.drawable.m3087)
            Bimage3.setImageResource(R.drawable.m3042)
            Cimage1.setImageResource(R.drawable.m6655)
            Cimage2.setImageResource(R.drawable.m3070)
            Cimage3.setImageResource(R.drawable.m3078)
        }
        if (championName == "Darius") {
            Aimage1.setImageResource(R.drawable.m6631)
            Aimage2.setImageResource(R.drawable.m3053)
            Aimage3.setImageResource(R.drawable.m6333)
            Bimage1.setImageResource(R.drawable.m6631)
            Bimage2.setImageResource(R.drawable.m3742)
            Bimage3.setImageResource(R.drawable.m3053)
            Cimage1.setImageResource(R.drawable.m6631)
            Cimage2.setImageResource(R.drawable.m6333)
            Cimage3.setImageResource(R.drawable.m3053)
        }
        if (championName == "Diana") {
            Aimage1.setImageResource(R.drawable.m3152)
            Aimage2.setImageResource(R.drawable.m4645)
            Aimage3.setImageResource(R.drawable.m3089)
            Bimage1.setImageResource(R.drawable.m1082)
            Bimage2.setImageResource(R.drawable.m3152)
            Bimage3.setImageResource(R.drawable.m3041)
            Cimage1.setImageResource(R.drawable.m3089)
            Cimage2.setImageResource(R.drawable.m3152)
            Cimage3.setImageResource(R.drawable.m3157)
        }
        if (championName == "DrMundo") {
            Aimage1.setImageResource(R.drawable.m3084)
            Aimage2.setImageResource(R.drawable.m3068)
            Aimage3.setImageResource(R.drawable.m3065)
            Bimage1.setImageResource(R.drawable.m3084)
            Bimage2.setImageResource(R.drawable.m3065)
            Bimage3.setImageResource(R.drawable.m3075)
            Cimage1.setImageResource(R.drawable.m3084)
            Cimage2.setImageResource(R.drawable.m3068)
            Cimage3.setImageResource(R.drawable.m3075)
        }
        if (championName == "Draven") {
            Aimage1.setImageResource(R.drawable.m3508)
            Aimage2.setImageResource(R.drawable.m3074)
            Aimage3.setImageResource(R.drawable.m3031)
            Bimage1.setImageResource(R.drawable.m3508)
            Bimage2.setImageResource(R.drawable.m3031)
            Bimage3.setImageResource(R.drawable.m3072)
            Cimage1.setImageResource(R.drawable.m3508)
            Cimage2.setImageResource(R.drawable.m3031)
            Cimage3.setImageResource(R.drawable.m3036)
        }
        if (championName == "Ekko") {
            Aimage1.setImageResource(R.drawable.m3100)
            Aimage2.setImageResource(R.drawable.m3089)
            Aimage3.setImageResource(R.drawable.m3152)
            Bimage1.setImageResource(R.drawable.m3100)
            Bimage2.setImageResource(R.drawable.m3157)
            Bimage3.setImageResource(R.drawable.m1082)
            Cimage1.setImageResource(R.drawable.m3152)
            Cimage2.setImageResource(R.drawable.m3100)
            Cimage3.setImageResource(R.drawable.m3089)
        }
        if (championName == "Elise") {
            Aimage1.setImageResource(R.drawable.m3117)
            Aimage2.setImageResource(R.drawable.m3041)
            Aimage3.setImageResource(R.drawable.m6655)
            Bimage1.setImageResource(R.drawable.m3157)
            Bimage2.setImageResource(R.drawable.m3115)
            Bimage3.setImageResource(R.drawable.m4636)
            Cimage1.setImageResource(R.drawable.m3075)
            Cimage2.setImageResource(R.drawable.m4636)
            Cimage3.setImageResource(R.drawable.m4645)
        }
        if (championName == "Evelynn") {
            Aimage1.setImageResource(R.drawable.m4645)
            Aimage2.setImageResource(R.drawable.m3089)
            Aimage3.setImageResource(R.drawable.m1082)
            Bimage1.setImageResource(R.drawable.m6655)
            Bimage2.setImageResource(R.drawable.m3100)
            Bimage3.setImageResource(R.drawable.m3041)
            Cimage1.setImageResource(R.drawable.m3152)
            Cimage2.setImageResource(R.drawable.m3100)
            Cimage3.setImageResource(R.drawable.m3089)
        }
        if (championName == "Ezreal") {
            Aimage1.setImageResource(R.drawable.m3070)
            Aimage2.setImageResource(R.drawable.m3078)
            Aimage3.setImageResource(R.drawable.m3042)
            Bimage1.setImageResource(R.drawable.m6694)
            Bimage2.setImageResource(R.drawable.m3070)
            Bimage3.setImageResource(R.drawable.m3078)
            Cimage1.setImageResource(R.drawable.m3042)
            Cimage2.setImageResource(R.drawable.m3074)
            Cimage3.setImageResource(R.drawable.m3070)
        }
        if (championName == "Fiddlesticks") {
            Aimage1.setImageResource(R.drawable.m6653)
            Aimage2.setImageResource(R.drawable.m3157)
            Aimage3.setImageResource(R.drawable.m3089)
            Bimage1.setImageResource(R.drawable.m3152)
            Bimage2.setImageResource(R.drawable.m3157)
            Bimage3.setImageResource(R.drawable.m4645)
            Cimage1.setImageResource(R.drawable.m6653)
            Cimage2.setImageResource(R.drawable.m4645)
            Cimage3.setImageResource(R.drawable.m3157)
        }
        if (championName == "Fiora") {
            Aimage1.setImageResource(R.drawable.m3508)
            Aimage2.setImageResource(R.drawable.m3095)
            Aimage3.setImageResource(R.drawable.m6667)
            Bimage1.setImageResource(R.drawable.m6632)
            Bimage2.setImageResource(R.drawable.m3074)
            Bimage3.setImageResource(R.drawable.m3181)
            Cimage1.setImageResource(R.drawable.m3074)
            Cimage2.setImageResource(R.drawable.m3078)
            Cimage3.setImageResource(R.drawable.m3181)
        }
        if (championName == "Fizz") {
            Aimage1.setImageResource(R.drawable.m6655)
            Aimage2.setImageResource(R.drawable.m3157)
            Aimage3.setImageResource(R.drawable.m3100)
            Bimage1.setImageResource(R.drawable.m6655)
            Bimage2.setImageResource(R.drawable.m3157)
            Bimage3.setImageResource(R.drawable.m3100)
            Cimage1.setImageResource(R.drawable.m6655)
            Cimage2.setImageResource(R.drawable.m3100)
            Cimage3.setImageResource(R.drawable.m3157)
        }
        if (championName == "Galio") {
            Aimage1.setImageResource(R.drawable.m6656)
            Aimage2.setImageResource(R.drawable.m4637)
            Aimage3.setImageResource(R.drawable.m3157)
            Bimage1.setImageResource(R.drawable.m6656)
            Bimage2.setImageResource(R.drawable.m3157)
            Bimage3.setImageResource(R.drawable.m3102)
            Cimage1.setImageResource(R.drawable.m6656)
            Cimage2.setImageResource(R.drawable.m8020)
            Cimage3.setImageResource(R.drawable.m4637)
        }
        if (championName == "Gangplank") {
            Aimage1.setImageResource(R.drawable.m6675)
            Aimage2.setImageResource(R.drawable.m6676)
            Aimage3.setImageResource(R.drawable.m3508)
            Bimage1.setImageResource(R.drawable.m6676)
            Bimage2.setImageResource(R.drawable.m6675)
            Bimage3.setImageResource(R.drawable.m3508)
            Cimage1.setImageResource(R.drawable.m6675)
            Cimage2.setImageResource(R.drawable.m3036)
            Cimage3.setImageResource(R.drawable.m3508)
        }
        if (championName == "Garen") {
            Aimage1.setImageResource(R.drawable.m6631)
            Aimage2.setImageResource(R.drawable.m3181)
            Aimage3.setImageResource(R.drawable.m3742)
            Bimage1.setImageResource(R.drawable.m6631)
            Bimage2.setImageResource(R.drawable.m3161)
            Bimage3.setImageResource(R.drawable.m3053)
            Cimage1.setImageResource(R.drawable.m6631)
            Cimage2.setImageResource(R.drawable.m3742)
            Cimage3.setImageResource(R.drawable.m3071)
        }
        if (championName == "Gnar") {
            Aimage1.setImageResource(R.drawable.m3078)
            Aimage2.setImageResource(R.drawable.m3071)
            Aimage3.setImageResource(R.drawable.m3075)
            Bimage1.setImageResource(R.drawable.m3078)
            Bimage2.setImageResource(R.drawable.m3071)
            Bimage3.setImageResource(R.drawable.m3053)
            Cimage1.setImageResource(R.drawable.m3078)
            Cimage2.setImageResource(R.drawable.m3071)
            Cimage3.setImageResource(R.drawable.m3143)
        }
        if (championName == "Gragas") {
            Aimage1.setImageResource(R.drawable.m6656)
            Aimage2.setImageResource(R.drawable.m4629)
            Aimage3.setImageResource(R.drawable.m3157)
            Bimage1.setImageResource(R.drawable.m6656)
            Bimage2.setImageResource(R.drawable.m4629)
            Bimage3.setImageResource(R.drawable.m4645)
            Cimage1.setImageResource(R.drawable.m6656)
            Cimage2.setImageResource(R.drawable.m4629)
            Cimage3.setImageResource(R.drawable.m3102)
        }
        if (championName == "Graves") {
            Aimage1.setImageResource(R.drawable.m3142)
            Aimage2.setImageResource(R.drawable.m6676)
            Aimage3.setImageResource(R.drawable.m3036)
            Bimage1.setImageResource(R.drawable.m6692)
            Bimage2.setImageResource(R.drawable.m6676)
            Bimage3.setImageResource(R.drawable.m3036)
            Cimage1.setImageResource(R.drawable.m6691)
            Cimage2.setImageResource(R.drawable.m6676)
            Cimage3.setImageResource(R.drawable.m3036)
        }
        if (championName == "Gwen") {
            Aimage1.setImageResource(R.drawable.m4633)
            Aimage2.setImageResource(R.drawable.m3115)
            Aimage3.setImageResource(R.drawable.m3157)
            Bimage1.setImageResource(R.drawable.m3115)
            Bimage2.setImageResource(R.drawable.m4633)
            Bimage3.setImageResource(R.drawable.m3089)
            Cimage1.setImageResource(R.drawable.m4633)
            Cimage2.setImageResource(R.drawable.m3115)
            Cimage3.setImageResource(R.drawable.m3089)
        }
        if (championName == "Hecarim") {
            Aimage1.setImageResource(R.drawable.m3161)
            Aimage2.setImageResource(R.drawable.m3071)
            Aimage3.setImageResource(R.drawable.m3042)
            Bimage1.setImageResource(R.drawable.m3070)
            Bimage2.setImageResource(R.drawable.m6691)
            Bimage3.setImageResource(R.drawable.m3042)
            Cimage1.setImageResource(R.drawable.m3161)
            Cimage2.setImageResource(R.drawable.m3070)
            Cimage3.setImageResource(R.drawable.m6691)
        }
        if (championName == "Heimerdinger") {
            Aimage1.setImageResource(R.drawable.m6653)
            Aimage2.setImageResource(R.drawable.m3157)
            Aimage3.setImageResource(R.drawable.m3116)
            Bimage1.setImageResource(R.drawable.m6653)
            Bimage2.setImageResource(R.drawable.m3116)
            Bimage3.setImageResource(R.drawable.m3157)
            Cimage1.setImageResource(R.drawable.m6653)
            Cimage2.setImageResource(R.drawable.m3157)
            Cimage3.setImageResource(R.drawable.m3089)
        }
        if (championName == "Illaoi") {
            Aimage1.setImageResource(R.drawable.m3071)
            Aimage2.setImageResource(R.drawable.m3053)
            Aimage3.setImageResource(R.drawable.m6662)
            Bimage1.setImageResource(R.drawable.m3181)
            Bimage2.setImageResource(R.drawable.m3053)
            Bimage3.setImageResource(R.drawable.m3071)
            Cimage1.setImageResource(R.drawable.m6662)
            Cimage2.setImageResource(R.drawable.m3053)
            Cimage3.setImageResource(R.drawable.m6662)
        }
        if (championName == "Irelia") {
            Aimage1.setImageResource(R.drawable.m3153)
            Aimage2.setImageResource(R.drawable.m3091)
            Aimage3.setImageResource(R.drawable.m6630)
            Bimage1.setImageResource(R.drawable.m3153)
            Bimage2.setImageResource(R.drawable.m3091)
            Bimage3.setImageResource(R.drawable.m6665)
            Cimage1.setImageResource(R.drawable.m3153)
            Cimage2.setImageResource(R.drawable.m6630)
            Cimage3.setImageResource(R.drawable.m3091)
        }
        if (championName == "Ivern") {
            Aimage1.setImageResource(R.drawable.m8001)
            Aimage2.setImageResource(R.drawable.m4636)
            Aimage3.setImageResource(R.drawable.m3116)
            Bimage1.setImageResource(R.drawable.m2065)
            Bimage2.setImageResource(R.drawable.m3504)
            Bimage3.setImageResource(R.drawable.m6616)
            Cimage1.setImageResource(R.drawable.m2065)
            Cimage2.setImageResource(R.drawable.m3107)
            Cimage3.setImageResource(R.drawable.m3116)
        }
        if (championName == "Janna") {
            Aimage1.setImageResource(R.drawable.m6617)
            Aimage2.setImageResource(R.drawable.m3504)
            Aimage3.setImageResource(R.drawable.m6616)
            Bimage1.setImageResource(R.drawable.m3087)
            Bimage2.setImageResource(R.drawable.m3078)
            Bimage3.setImageResource(R.drawable.m3153)
        }
        if (championName == "JarvanIV") {
            Aimage1.setImageResource(R.drawable.m6691)
            Aimage2.setImageResource(R.drawable.m6676)
            Aimage3.setImageResource(R.drawable.m6693)
            Bimage1.setImageResource(R.drawable.m6630)
            Bimage2.setImageResource(R.drawable.m3161)
            Bimage3.setImageResource(R.drawable.m3071)
            Cimage1.setImageResource(R.drawable.m6630)
            Cimage2.setImageResource(R.drawable.m3161)
            Cimage3.setImageResource(R.drawable.m3110)
        }
        if (championName == "Jax") {
            Aimage1.setImageResource(R.drawable.m6632)
            Aimage2.setImageResource(R.drawable.m3161)
            Aimage3.setImageResource(R.drawable.m3157)
            Bimage1.setImageResource(R.drawable.m6632)
            Bimage2.setImageResource(R.drawable.m3161)
            Bimage3.setImageResource(R.drawable.m3110)
            Cimage1.setImageResource(R.drawable.m3153)
            Cimage2.setImageResource(R.drawable.m6632)
            Cimage3.setImageResource(R.drawable.m3161)
        }
        if (championName == "Jayce") {
            Aimage1.setImageResource(R.drawable.m3070)
            Aimage2.setImageResource(R.drawable.m6692)
            Aimage3.setImageResource(R.drawable.m3042)
            Bimage1.setImageResource(R.drawable.m6694)
            Bimage2.setImageResource(R.drawable.m3070)
            Bimage3.setImageResource(R.drawable.m6691)
            Cimage1.setImageResource(R.drawable.m3042)
            Cimage2.setImageResource(R.drawable.m6694)
            Cimage3.setImageResource(R.drawable.m6692)
        }
        if (championName == "Jhin") {
            Aimage1.setImageResource(R.drawable.m3095)
            Aimage2.setImageResource(R.drawable.m6671)
            Aimage3.setImageResource(R.drawable.m3094)
            Bimage1.setImageResource(R.drawable.m3095)
            Bimage2.setImageResource(R.drawable.m6671)
            Bimage3.setImageResource(R.drawable.m3036)
            Cimage1.setImageResource(R.drawable.m3095)
            Cimage2.setImageResource(R.drawable.m3031)
            Cimage3.setImageResource(R.drawable.m3094)
        }
        if (championName == "Jinx") {
            Aimage1.setImageResource(R.drawable.m6672)
            Aimage2.setImageResource(R.drawable.m3031)
            Aimage3.setImageResource(R.drawable.m3094)
            Bimage1.setImageResource(R.drawable.m6672)
            Bimage2.setImageResource(R.drawable.m3031)
            Bimage3.setImageResource(R.drawable.m3085)
            Cimage1.setImageResource(R.drawable.m6672)
            Cimage2.setImageResource(R.drawable.m6671)
            Cimage3.setImageResource(R.drawable.m3036)
        }
        if (championName == "KaiSa") {
            Aimage1.setImageResource(R.drawable.m3087)
            Aimage2.setImageResource(R.drawable.m3115)
            Aimage3.setImageResource(R.drawable.m3124)
            Bimage1.setImageResource(R.drawable.m6672)
            Bimage2.setImageResource(R.drawable.m6675)
            Bimage3.setImageResource(R.drawable.m3046)
            Cimage1.setImageResource(R.drawable.m3179)
            Cimage2.setImageResource(R.drawable.m6691)
            Cimage3.setImageResource(R.drawable.m3115)
        }
        if (championName == "Kalista") {
            Aimage1.setImageResource(R.drawable.m3153)
            Aimage2.setImageResource(R.drawable.m3124)
            Aimage3.setImageResource(R.drawable.m3085)
            Bimage1.setImageResource(R.drawable.m3153)
            Bimage2.setImageResource(R.drawable.m3124)
            Bimage3.setImageResource(R.drawable.m3091)
            Cimage1.setImageResource(R.drawable.m3153)
            Cimage2.setImageResource(R.drawable.m3124)
            Cimage3.setImageResource(R.drawable.m6673)
        }
        if (championName == "Karma") {
            Aimage1.setImageResource(R.drawable.m3190)
            Aimage2.setImageResource(R.drawable.m6616)
            Aimage3.setImageResource(R.drawable.m3504)
            Bimage1.setImageResource(R.drawable.m4005)
            Bimage2.setImageResource(R.drawable.m2065)
            Bimage3.setImageResource(R.drawable.m3011)
            Cimage1.setImageResource(R.drawable.m6655)
            Cimage2.setImageResource(R.drawable.m4645)
            Cimage3.setImageResource(R.drawable.m4005)
        }
        if (championName == "Karthus") {
            Aimage1.setImageResource(R.drawable.m6653)
            Aimage2.setImageResource(R.drawable.m4645)
            Aimage3.setImageResource(R.drawable.m3089)
            Bimage1.setImageResource(R.drawable.m6653)
            Bimage2.setImageResource(R.drawable.m4645)
            Bimage3.setImageResource(R.drawable.m3157)
            Cimage1.setImageResource(R.drawable.m1082)
            Cimage2.setImageResource(R.drawable.m6653)
            Cimage3.setImageResource(R.drawable.m4645)
        }
        if (championName == "Kassadin") {
            Aimage1.setImageResource(R.drawable.m3070)
            Aimage2.setImageResource(R.drawable.m6657)
            Aimage3.setImageResource(R.drawable.m3040)
            Bimage1.setImageResource(R.drawable.m3089)
            Bimage2.setImageResource(R.drawable.m3070)
            Bimage3.setImageResource(R.drawable.m6657)
            Cimage1.setImageResource(R.drawable.m3040)
            Cimage2.setImageResource(R.drawable.m3157)
            Cimage3.setImageResource(R.drawable.m3070)
        }
        if (championName == "Ksante") {
            Aimage1.setImageResource(R.drawable.m3111)
            Aimage2.setImageResource(R.drawable.m6662)
            Aimage3.setImageResource(R.drawable.m3068)
            Bimage1.setImageResource(R.drawable.m3193)
            Bimage2.setImageResource(R.drawable.m6665)
            Bimage3.setImageResource(R.drawable.m3068)
            Cimage1.setImageResource(R.drawable.m4401)
            Cimage2.setImageResource(R.drawable.m6662)
            Cimage3.setImageResource(R.drawable.m3193)
        }
        if (championName == "Katarina") {
            Aimage1.setImageResource(R.drawable.m3115)
            Aimage2.setImageResource(R.drawable.m3152)
            Aimage3.setImageResource(R.drawable.m3157)
            Bimage1.setImageResource(R.drawable.m1082)
            Bimage2.setImageResource(R.drawable.m3115)
            Bimage3.setImageResource(R.drawable.m3152)
            Cimage1.setImageResource(R.drawable.m3157)
            Cimage2.setImageResource(R.drawable.m3115)
            Cimage3.setImageResource(R.drawable.m3152)
        }
        if (championName == "Kayle") {
            Aimage1.setImageResource(R.drawable.m3115)
            Aimage2.setImageResource(R.drawable.m4633)
            Aimage3.setImageResource(R.drawable.m3089)
            Bimage1.setImageResource(R.drawable.m3087)
            Bimage2.setImageResource(R.drawable.m3115)
            Bimage3.setImageResource(R.drawable.m4633)
            Cimage1.setImageResource(R.drawable.m6672)
            Cimage2.setImageResource(R.drawable.m3115)
            Cimage3.setImageResource(R.drawable.m4633)
        }
        if (championName == "Kayn") {
            Aimage1.setImageResource(R.drawable.m3070)
            Aimage2.setImageResource(R.drawable.m6691)
            Aimage3.setImageResource(R.drawable.m3042)
            Bimage1.setImageResource(R.drawable.m6694)
            Bimage2.setImageResource(R.drawable.m3070)
            Bimage3.setImageResource(R.drawable.m6630)
            Cimage1.setImageResource(R.drawable.m3042)
            Cimage2.setImageResource(R.drawable.m3071)
            Cimage3.setImageResource(R.drawable.m6691)
        }
        if (championName == "Kennen") {
            Aimage1.setImageResource(R.drawable.m3152)
            Aimage2.setImageResource(R.drawable.m4645)
            Aimage3.setImageResource(R.drawable.m3089)
            Bimage1.setImageResource(R.drawable.m3152)
            Bimage2.setImageResource(R.drawable.m4645)
            Bimage3.setImageResource(R.drawable.m3157)
            Cimage1.setImageResource(R.drawable.m3152)
            Cimage2.setImageResource(R.drawable.m3157)
            Cimage3.setImageResource(R.drawable.m4645)
        }
        if (championName == "KhaZix") {
            Aimage1.setImageResource(R.drawable.m3070)
            Aimage2.setImageResource(R.drawable.m6691)
            Aimage3.setImageResource(R.drawable.m3042)
            Bimage1.setImageResource(R.drawable.m6693)
            Bimage2.setImageResource(R.drawable.m3070)
            Bimage3.setImageResource(R.drawable.m6692)
            Cimage1.setImageResource(R.drawable.m3042)
            Cimage2.setImageResource(R.drawable.m3074)
            Cimage3.setImageResource(R.drawable.m3070)
        }
        if (championName == "Kindred") {
            Aimage1.setImageResource(R.drawable.m6672)
            Aimage2.setImageResource(R.drawable.m3078)
            Aimage3.setImageResource(R.drawable.m3071)
            Bimage1.setImageResource(R.drawable.m6672)
            Bimage2.setImageResource(R.drawable.m3078)
            Bimage3.setImageResource(R.drawable.m3091)
            Cimage1.setImageResource(R.drawable.m3078)
            Cimage2.setImageResource(R.drawable.m3091)
            Cimage3.setImageResource(R.drawable.m3071)
        }
        if (championName == "Kled") {
            Aimage1.setImageResource(R.drawable.m3074)
            Aimage2.setImageResource(R.drawable.m6692)
            Aimage3.setImageResource(R.drawable.m3033)
            Bimage1.setImageResource(R.drawable.m3074)
            Bimage2.setImageResource(R.drawable.m6692)
            Bimage3.setImageResource(R.drawable.m3071)
            Cimage1.setImageResource(R.drawable.m3074)
            Cimage2.setImageResource(R.drawable.m3142)
            Cimage3.setImageResource(R.drawable.m3033)
        }
        if (championName == "KogMaw") {
            Aimage1.setImageResource(R.drawable.m3153)
            Aimage2.setImageResource(R.drawable.m3124)
            Aimage3.setImageResource(R.drawable.m3085)
            Bimage1.setImageResource(R.drawable.m3153)
            Bimage2.setImageResource(R.drawable.m3124)
            Bimage3.setImageResource(R.drawable.m3091)
            Cimage1.setImageResource(R.drawable.m3124)
            Cimage2.setImageResource(R.drawable.m3085)
            Cimage3.setImageResource(R.drawable.m3091)
        }
        if (championName == "LeBlanc") {
            Aimage1.setImageResource(R.drawable.m3087)
            Aimage2.setImageResource(R.drawable.m4636)
            Aimage3.setImageResource(R.drawable.m3100)
            Bimage1.setImageResource(R.drawable.m3087)
            Bimage2.setImageResource(R.drawable.m6655)
            Bimage3.setImageResource(R.drawable.m3100)
            Cimage1.setImageResource(R.drawable.m3087)
            Cimage2.setImageResource(R.drawable.m4636)
            Cimage3.setImageResource(R.drawable.m4645)
        }
        if (championName == "LeeSin") {
            Aimage1.setImageResource(R.drawable.m6630)
            Aimage2.setImageResource(R.drawable.m3071)
            Aimage3.setImageResource(R.drawable.m6333)
            Bimage1.setImageResource(R.drawable.m6692)
            Bimage2.setImageResource(R.drawable.m3071)
            Bimage3.setImageResource(R.drawable.m6333)
            Cimage1.setImageResource(R.drawable.m6692)
            Cimage2.setImageResource(R.drawable.m3074)
            Cimage3.setImageResource(R.drawable.m3071)
        }
        if (championName == "Leona") {
            Aimage1.setImageResource(R.drawable.m4636)
            Aimage2.setImageResource(R.drawable.m3089)
            Aimage3.setImageResource(R.drawable.m4628)
            Bimage1.setImageResource(R.drawable.m3068)
            Bimage2.setImageResource(R.drawable.m6662)
            Bimage3.setImageResource(R.drawable.m8020)
            Cimage1.setImageResource(R.drawable.m6662)
            Cimage2.setImageResource(R.drawable.m3075)
            Cimage3.setImageResource(R.drawable.m3109)
        }
        if (championName == "Lillia") {
            Aimage1.setImageResource(R.drawable.m6665)
            Aimage2.setImageResource(R.drawable.m3116)
            Aimage3.setImageResource(R.drawable.m6653)
            Bimage1.setImageResource(R.drawable.m4637)
            Bimage2.setImageResource(R.drawable.m3157)
            Bimage3.setImageResource(R.drawable.m6653)
            Cimage1.setImageResource(R.drawable.m3116)
            Cimage2.setImageResource(R.drawable.m4637)
            Cimage3.setImageResource(R.drawable.m1082)
        }
        if (championName == "Lissandra") {
            Aimage1.setImageResource(R.drawable.m4645)
            Aimage2.setImageResource(R.drawable.m3157)
            Aimage3.setImageResource(R.drawable.m6656)
            Bimage1.setImageResource(R.drawable.m3157)
            Bimage2.setImageResource(R.drawable.m4645)
            Bimage3.setImageResource(R.drawable.m6656)
            Cimage1.setImageResource(R.drawable.m3157)
            Cimage2.setImageResource(R.drawable.m3165)
            Cimage3.setImageResource(R.drawable.m6655)
        }
        if (championName == "Lucian") {
            Aimage1.setImageResource(R.drawable.m6672)
            Aimage2.setImageResource(R.drawable.m6675)
            Aimage3.setImageResource(R.drawable.m3036)
            Bimage1.setImageResource(R.drawable.m6672)
            Bimage2.setImageResource(R.drawable.m6675)
            Bimage3.setImageResource(R.drawable.m3094)
            Cimage1.setImageResource(R.drawable.m6672)
            Cimage2.setImageResource(R.drawable.m6675)
            Cimage3.setImageResource(R.drawable.m3508)
        }
        if (championName == "Lulu") {
            Aimage1.setImageResource(R.drawable.m3070)
            Aimage2.setImageResource(R.drawable.m3087)
            Aimage3.setImageResource(R.drawable.m3124)
            Bimage1.setImageResource(R.drawable.m6672)
            Bimage2.setImageResource(R.drawable.m6616)
            Bimage3.setImageResource(R.drawable.m2065)
            Cimage1.setImageResource(R.drawable.m3504)
            Cimage2.setImageResource(R.drawable.m4644)
            Cimage3.setImageResource(R.drawable.m4005)
        }
        if (championName == "Lux") {
            Aimage1.setImageResource(R.drawable.m6655)
            Aimage2.setImageResource(R.drawable.m4645)
            Aimage3.setImageResource(R.drawable.m3089)
            Bimage1.setImageResource(R.drawable.m6655)
            Bimage2.setImageResource(R.drawable.m4628)
            Bimage3.setImageResource(R.drawable.m3089)
            Cimage1.setImageResource(R.drawable.m1082)
            Cimage2.setImageResource(R.drawable.m6655)
            Cimage3.setImageResource(R.drawable.m4628)
        }
        if (championName == "Malphite") {
            Aimage1.setImageResource(R.drawable.m6662)
            Aimage2.setImageResource(R.drawable.m3068)
            Aimage3.setImageResource(R.drawable.m3075)
            Bimage1.setImageResource(R.drawable.m6655)
            Bimage2.setImageResource(R.drawable.m3157)
            Bimage3.setImageResource(R.drawable.m4645)
            Cimage1.setImageResource(R.drawable.m6662)
            Cimage2.setImageResource(R.drawable.m3110)
            Cimage3.setImageResource(R.drawable.m3075)
        }
        if (championName == "Malzahar") {
            Aimage1.setImageResource(R.drawable.m6653)
            Aimage2.setImageResource(R.drawable.m3116)
            Aimage3.setImageResource(R.drawable.m4637)
            Bimage1.setImageResource(R.drawable.m3070)
            Bimage2.setImageResource(R.drawable.m6653)
            Bimage3.setImageResource(R.drawable.m3040)
            Cimage1.setImageResource(R.drawable.m3116)
            Cimage2.setImageResource(R.drawable.m6653)
            Cimage3.setImageResource(R.drawable.m3116)
        }
        if (championName == "Maokai") {
            Aimage1.setImageResource(R.drawable.m3068)
            Aimage2.setImageResource(R.drawable.m3001)
            Aimage3.setImageResource(R.drawable.m3110)
            Bimage1.setImageResource(R.drawable.m3001)
            Bimage2.setImageResource(R.drawable.m3068)
            Bimage3.setImageResource(R.drawable.m8020)
            Cimage1.setImageResource(R.drawable.m3068)
            Cimage2.setImageResource(R.drawable.m3001)
            Cimage3.setImageResource(R.drawable.m8020)
        }
        if (championName == "MasterYi") {
            Aimage1.setImageResource(R.drawable.m3153)
            Aimage2.setImageResource(R.drawable.m3124)
            Aimage3.setImageResource(R.drawable.m3091)
            Bimage1.setImageResource(R.drawable.m6672)
            Bimage2.setImageResource(R.drawable.m3124)
            Bimage3.setImageResource(R.drawable.m3153)
            Cimage1.setImageResource(R.drawable.m3153)
            Cimage2.setImageResource(R.drawable.m3124)
            Cimage3.setImageResource(R.drawable.m6672)
        }
        if (championName == "MissFortune") {
            Aimage1.setImageResource(R.drawable.m3142)
            Aimage2.setImageResource(R.drawable.m6676)
            Aimage3.setImageResource(R.drawable.m6694)
            Bimage1.setImageResource(R.drawable.m3142)
            Bimage2.setImageResource(R.drawable.m6676)
            Bimage3.setImageResource(R.drawable.m3036)
            Cimage1.setImageResource(R.drawable.m3142)
            Cimage2.setImageResource(R.drawable.m6676)
            Cimage3.setImageResource(R.drawable.m3814)
        }
        if (championName == "Mordekaiser") {
            Aimage1.setImageResource(R.drawable.m3116)
            Aimage2.setImageResource(R.drawable.m6665)
            Aimage3.setImageResource(R.drawable.m4637)
            Bimage1.setImageResource(R.drawable.m3116)
            Bimage2.setImageResource(R.drawable.m3152)
            Bimage3.setImageResource(R.drawable.m3157)
            Cimage1.setImageResource(R.drawable.m3116)
            Cimage2.setImageResource(R.drawable.m4633)
            Cimage3.setImageResource(R.drawable.m4637)
        }
        if (championName == "Milio") {
            Aimage1.setImageResource(R.drawable.m2065)
            Aimage2.setImageResource(R.drawable.m3504)
            Aimage3.setImageResource(R.drawable.m3011)
        }
        if (championName == "Morgana") {
            Aimage1.setImageResource(R.drawable.m6653)
            Aimage2.setImageResource(R.drawable.m3157)
            Aimage3.setImageResource(R.drawable.m4637)
            Bimage1.setImageResource(R.drawable.m6653)
            Bimage2.setImageResource(R.drawable.m3157)
            Bimage3.setImageResource(R.drawable.m3116)
            Cimage1.setImageResource(R.drawable.m6653)
            Cimage2.setImageResource(R.drawable.m3116)
            Cimage3.setImageResource(R.drawable.m3157)
        }
        if (championName == "Nami") {
            Aimage1.setImageResource(R.drawable.m4005)
            Aimage2.setImageResource(R.drawable.m6620)
            Aimage3.setImageResource(R.drawable.m3011)
            Bimage1.setImageResource(R.drawable.m4005)
            Bimage2.setImageResource(R.drawable.m2065)
            Bimage3.setImageResource(R.drawable.m6616)
            Cimage1.setImageResource(R.drawable.m6655)
            Cimage2.setImageResource(R.drawable.m4629)
            Cimage3.setImageResource(R.drawable.m4005)
        }
        if (championName == "Nasus") {
            Aimage1.setImageResource(R.drawable.m6632)
            Aimage2.setImageResource(R.drawable.m3110)
            Aimage3.setImageResource(R.drawable.m3065)
            Bimage1.setImageResource(R.drawable.m6632)
            Bimage2.setImageResource(R.drawable.m3110)
            Bimage3.setImageResource(R.drawable.m3075)
            Cimage1.setImageResource(R.drawable.m6632)
            Cimage2.setImageResource(R.drawable.m3110)
            Cimage3.setImageResource(R.drawable.m3193)
        }
        if (championName == "Nautilus") {
            Aimage1.setImageResource(R.drawable.m6657)
            Aimage2.setImageResource(R.drawable.m8020)
            Aimage3.setImageResource(R.drawable.m4637)
            Bimage1.setImageResource(R.drawable.m3190)
            Bimage2.setImageResource(R.drawable.m3050)
            Bimage3.setImageResource(R.drawable.m3109)
            Cimage1.setImageResource(R.drawable.m3001)
            Cimage2.setImageResource(R.drawable.m3110)
            Cimage3.setImageResource(R.drawable.m4401)
        }
        if (championName == "Neeko") {
            Aimage1.setImageResource(R.drawable.m3152)
            Aimage2.setImageResource(R.drawable.m4645)
            Aimage3.setImageResource(R.drawable.m3157)
            Bimage1.setImageResource(R.drawable.m3152)
            Bimage2.setImageResource(R.drawable.m3157)
            Bimage3.setImageResource(R.drawable.m4645)
            Cimage1.setImageResource(R.drawable.m3152)
            Cimage2.setImageResource(R.drawable.m4645)
            Cimage3.setImageResource(R.drawable.m3089)
        }
        if (championName == "Nidalee") {
            Aimage1.setImageResource(R.drawable.m6655)
            Aimage2.setImageResource(R.drawable.m4645)
            Aimage3.setImageResource(R.drawable.m3089)
            Bimage1.setImageResource(R.drawable.m6655)
            Bimage2.setImageResource(R.drawable.m4645)
            Bimage3.setImageResource(R.drawable.m3157)
            Cimage1.setImageResource(R.drawable.m4636)
            Cimage2.setImageResource(R.drawable.m3089)
            Cimage3.setImageResource(R.drawable.m3100)
        }
        if (championName == "Nocturne") {
            Aimage1.setImageResource(R.drawable.m3071)
            Aimage2.setImageResource(R.drawable.m6333)
            Aimage3.setImageResource(R.drawable.m3042)
            Bimage1.setImageResource(R.drawable.m3078)
            Bimage2.setImageResource(R.drawable.m3156)
            Bimage3.setImageResource(R.drawable.m3070)
            Cimage1.setImageResource(R.drawable.m3074)
            Cimage2.setImageResource(R.drawable.m3508)
            Cimage3.setImageResource(R.drawable.m6671)
        }
        if (championName == "NunuWillump") {
        }
        if (championName == "Olaf") {
            Aimage1.setImageResource(R.drawable.m3074)
            Aimage2.setImageResource(R.drawable.m6631)
            Aimage3.setImageResource(R.drawable.m3053)
            Bimage1.setImageResource(R.drawable.m3074)
            Bimage2.setImageResource(R.drawable.m6665)
            Bimage3.setImageResource(R.drawable.m6333)
            Cimage1.setImageResource(R.drawable.m6631)
            Cimage2.setImageResource(R.drawable.m3074)
            Cimage3.setImageResource(R.drawable.m6333)
        }
        if (championName == "Orianna") {
            Aimage1.setImageResource(R.drawable.m3070)
            Aimage2.setImageResource(R.drawable.m6655)
            Aimage3.setImageResource(R.drawable.m3040)
            Bimage1.setImageResource(R.drawable.m4645)
            Bimage2.setImageResource(R.drawable.m3070)
            Bimage3.setImageResource(R.drawable.m6655)
            Cimage1.setImageResource(R.drawable.m3040)
            Cimage2.setImageResource(R.drawable.m3089)
            Cimage3.setImageResource(R.drawable.m6655)
        }
        if (championName == "Ornn") {
            Aimage1.setImageResource(R.drawable.m3068)
            Aimage2.setImageResource(R.drawable.m8020)
            Aimage3.setImageResource(R.drawable.m3070)
            Bimage1.setImageResource(R.drawable.m6665)
            Bimage2.setImageResource(R.drawable.m3121)
            Bimage3.setImageResource(R.drawable.m3075)
            Cimage1.setImageResource(R.drawable.m3068)
            Cimage2.setImageResource(R.drawable.m6665)
            Cimage3.setImageResource(R.drawable.m3075)
        }
        if (championName == "Pantheon") {
            Aimage1.setImageResource(R.drawable.m6692)
            Aimage2.setImageResource(R.drawable.m3071)
            Aimage3.setImageResource(R.drawable.m3814)
            Bimage1.setImageResource(R.drawable.m6692)
            Bimage2.setImageResource(R.drawable.m3071)
            Bimage3.setImageResource(R.drawable.m3161)
            Cimage1.setImageResource(R.drawable.m6692)
            Cimage2.setImageResource(R.drawable.m3071)
            Cimage3.setImageResource(R.drawable.m3153)
        }
        if (championName == "Poppy") {
            Aimage1.setImageResource(R.drawable.m3068)
            Aimage2.setImageResource(R.drawable.m6662)
            Aimage3.setImageResource(R.drawable.m3110)
            Bimage1.setImageResource(R.drawable.m3001)
            Bimage2.setImageResource(R.drawable.m3068)
            Bimage3.setImageResource(R.drawable.m3742)
            Cimage1.setImageResource(R.drawable.m6691)
            Cimage2.setImageResource(R.drawable.m6693)
            Cimage3.setImageResource(R.drawable.m3042)
        }
        if (championName == "Pyke") {
            Aimage1.setImageResource(R.drawable.m6691)
            Aimage2.setImageResource(R.drawable.m6696)
            Aimage3.setImageResource(R.drawable.m6693)
            Bimage1.setImageResource(R.drawable.m6691)
            Bimage2.setImageResource(R.drawable.m3179)
            Bimage3.setImageResource(R.drawable.m3814)
            Cimage1.setImageResource(R.drawable.m6691)
            Cimage2.setImageResource(R.drawable.m6696)
            Cimage3.setImageResource(R.drawable.m6333)
        }
        if (championName == "Qiyana") {
            Aimage1.setImageResource(R.drawable.m6691)
            Aimage2.setImageResource(R.drawable.m6693)
            Aimage3.setImageResource(R.drawable.m6694)
            Bimage1.setImageResource(R.drawable.m6691)
            Bimage2.setImageResource(R.drawable.m3814)
            Bimage3.setImageResource(R.drawable.m6694)
            Cimage1.setImageResource(R.drawable.m6691)
            Cimage2.setImageResource(R.drawable.m6696)
            Cimage3.setImageResource(R.drawable.m3814)
        }
        if (championName == "Quinn") {
            Aimage1.setImageResource(R.drawable.m3087)
            Aimage2.setImageResource(R.drawable.m3142)
            Aimage3.setImageResource(R.drawable.m6676)
            Bimage1.setImageResource(R.drawable.m3087)
            Bimage2.setImageResource(R.drawable.m3142)
            Bimage3.setImageResource(R.drawable.m3036)
            Cimage1.setImageResource(R.drawable.m3087)
            Cimage2.setImageResource(R.drawable.m6671)
            Cimage3.setImageResource(R.drawable.m3036)
        }
        if (championName == "Rakan") {
            Aimage1.setImageResource(R.drawable.m6656)
            Aimage2.setImageResource(R.drawable.m3157)
            Aimage3.setImageResource(R.drawable.m3102)
            Bimage1.setImageResource(R.drawable.m3087)
            Bimage2.setImageResource(R.drawable.m3152)
            Bimage3.setImageResource(R.drawable.m3116)
            Cimage1.setImageResource(R.drawable.m6667)
            Cimage2.setImageResource(R.drawable.m3068)
            Cimage3.setImageResource(R.drawable.m8001)
        }
        if (championName == "Rammus") {
            Aimage1.setImageResource(R.drawable.m3075)
            Aimage2.setImageResource(R.drawable.m6665)
            Aimage3.setImageResource(R.drawable.m3068)
            Bimage1.setImageResource(R.drawable.m3075)
            Bimage2.setImageResource(R.drawable.m3068)
            Bimage3.setImageResource(R.drawable.m6665)
            Cimage1.setImageResource(R.drawable.m3075)
            Cimage2.setImageResource(R.drawable.m6665)
            Cimage3.setImageResource(R.drawable.m3193)
        }
        if (championName == "RekSai") {
            Aimage1.setImageResource(R.drawable.m6631)
            Aimage2.setImageResource(R.drawable.m3074)
            Aimage3.setImageResource(R.drawable.m3153)
            Bimage1.setImageResource(R.drawable.m6631)
            Bimage2.setImageResource(R.drawable.m3153)
            Bimage3.setImageResource(R.drawable.m3071)
            Cimage1.setImageResource(R.drawable.m6631)
            Cimage2.setImageResource(R.drawable.m3071)
            Cimage3.setImageResource(R.drawable.m3814)
        }
        if (championName == "Rell") {
            Aimage1.setImageResource(R.drawable.m6656)
            Aimage2.setImageResource(R.drawable.m8020)
            Aimage3.setImageResource(R.drawable.m3109)
            Bimage1.setImageResource(R.drawable.m6667)
            Bimage2.setImageResource(R.drawable.m3075)
            Bimage3.setImageResource(R.drawable.m4401)
        }
        if (championName == "Renekton") {
            Aimage1.setImageResource(R.drawable.m6630)
            Aimage2.setImageResource(R.drawable.m3071)
            Aimage3.setImageResource(R.drawable.m3053)
            Bimage1.setImageResource(R.drawable.m6630)
            Bimage2.setImageResource(R.drawable.m3161)
            Bimage3.setImageResource(R.drawable.m3071)
            Cimage1.setImageResource(R.drawable.m6630)
            Cimage2.setImageResource(R.drawable.m3161)
            Cimage3.setImageResource(R.drawable.m3053)
        }
        if (championName == "Rengar") {
            Aimage1.setImageResource(R.drawable.m3074)
            Aimage2.setImageResource(R.drawable.m6692)
            Aimage3.setImageResource(R.drawable.m6693)
            Bimage1.setImageResource(R.drawable.m6691)
            Bimage2.setImageResource(R.drawable.m3074)
            Bimage3.setImageResource(R.drawable.m3036)
            Cimage1.setImageResource(R.drawable.m6691)
            Cimage2.setImageResource(R.drawable.m6693)
            Cimage3.setImageResource(R.drawable.m3508)
        }
        if (championName == "Riven") {
            Aimage1.setImageResource(R.drawable.m3074)
            Aimage2.setImageResource(R.drawable.m3071)
            Aimage3.setImageResource(R.drawable.m6692)
            Bimage1.setImageResource(R.drawable.m3074)
            Bimage2.setImageResource(R.drawable.m6692)
            Bimage3.setImageResource(R.drawable.m3071)
            Cimage1.setImageResource(R.drawable.m3074)
            Cimage2.setImageResource(R.drawable.m6691)
            Cimage3.setImageResource(R.drawable.m6333)
        }
        if (championName == "Rumble") {
            Aimage1.setImageResource(R.drawable.m4636)
            Aimage2.setImageResource(R.drawable.m4637)
            Aimage3.setImageResource(R.drawable.m3157)
            Bimage1.setImageResource(R.drawable.m4636)
            Bimage2.setImageResource(R.drawable.m4645)
            Bimage3.setImageResource(R.drawable.m3157)
            Cimage1.setImageResource(R.drawable.m4637)
            Cimage2.setImageResource(R.drawable.m4636)
            Cimage3.setImageResource(R.drawable.m3157)
        }
        if (championName == "Ryze") {
            Aimage1.setImageResource(R.drawable.m3070)
            Aimage2.setImageResource(R.drawable.m6657)
            Aimage3.setImageResource(R.drawable.m3040)
            Bimage1.setImageResource(R.drawable.m3089)
            Bimage2.setImageResource(R.drawable.m3070)
            Bimage3.setImageResource(R.drawable.m6657)
            Cimage1.setImageResource(R.drawable.m3040)
            Cimage2.setImageResource(R.drawable.m3157)
            Cimage3.setImageResource(R.drawable.m3070)
        }
        if (championName == "Samira") {
            Aimage1.setImageResource(R.drawable.m6676)
            Aimage2.setImageResource(R.drawable.m3031)
            Aimage3.setImageResource(R.drawable.m6673)
            Bimage1.setImageResource(R.drawable.m6691)
            Bimage2.setImageResource(R.drawable.m6676)
            Bimage3.setImageResource(R.drawable.m6673)
            Cimage1.setImageResource(R.drawable.m6676)
            Cimage2.setImageResource(R.drawable.m3031)
            Cimage3.setImageResource(R.drawable.m3036)
        }
        if (championName == "Sejuani") {
            Aimage1.setImageResource(R.drawable.m3084)
            Aimage2.setImageResource(R.drawable.m3075)
            Aimage3.setImageResource(R.drawable.m3068)
            Bimage1.setImageResource(R.drawable.m3068)
            Bimage2.setImageResource(R.drawable.m3001)
            Bimage3.setImageResource(R.drawable.m3110)
            Cimage1.setImageResource(R.drawable.m6667)
            Cimage2.setImageResource(R.drawable.m3068)
            Cimage3.setImageResource(R.drawable.m3075)
        }
        if (championName == "Senna") {
            Aimage1.setImageResource(R.drawable.m6672)
            Aimage2.setImageResource(R.drawable.m3031)
            Aimage3.setImageResource(R.drawable.m3094)
            Bimage1.setImageResource(R.drawable.m3087)
            Bimage2.setImageResource(R.drawable.m3031)
            Bimage3.setImageResource(R.drawable.m3094)
            Cimage1.setImageResource(R.drawable.m3095)
            Cimage2.setImageResource(R.drawable.m3031)
            Cimage3.setImageResource(R.drawable.m3094)
        }
        if (championName == "Seraphine") {
            Aimage1.setImageResource(R.drawable.m3070)
            Aimage2.setImageResource(R.drawable.m6653)
            Aimage3.setImageResource(R.drawable.m3040)
            Bimage1.setImageResource(R.drawable.m3116)
            Bimage2.setImageResource(R.drawable.m3070)
            Bimage3.setImageResource(R.drawable.m6653)
            Cimage1.setImageResource(R.drawable.m3116)
            Cimage2.setImageResource(R.drawable.m3040)
            Cimage3.setImageResource(R.drawable.m3070)
        }
        if (championName == "Sett") {
            Aimage1.setImageResource(R.drawable.m6631)
            Aimage2.setImageResource(R.drawable.m3748)
            Aimage3.setImageResource(R.drawable.m3053)
            Bimage1.setImageResource(R.drawable.m6631)
            Bimage2.setImageResource(R.drawable.m3161)
            Bimage3.setImageResource(R.drawable.m3053)
            Cimage1.setImageResource(R.drawable.m6631)
            Cimage2.setImageResource(R.drawable.m3053)
            Cimage3.setImageResource(R.drawable.m3748)
        }
        if (championName == "Shaco") {
            Aimage1.setImageResource(R.drawable.m4636)
            Aimage2.setImageResource(R.drawable.m4005)
            Aimage3.setImageResource(R.drawable.m4629)
            Bimage1.setImageResource(R.drawable.m6653)
            Bimage2.setImageResource(R.drawable.m3165)
            Bimage3.setImageResource(R.drawable.m4637)
            Cimage1.setImageResource(R.drawable.m6676)
            Cimage2.setImageResource(R.drawable.m3508)
            Cimage3.setImageResource(R.drawable.m3031)
        }
        if (championName == "Shen") {
            Aimage1.setImageResource(R.drawable.m3084)
            Aimage2.setImageResource(R.drawable.m3068)
            Aimage3.setImageResource(R.drawable.m3748)
            Bimage1.setImageResource(R.drawable.m3068)
            Bimage2.setImageResource(R.drawable.m3001)
            Bimage3.setImageResource(R.drawable.m8020)
            Cimage1.setImageResource(R.drawable.m3068)
            Cimage2.setImageResource(R.drawable.m3084)
            Cimage3.setImageResource(R.drawable.m4637)
        }
        if (championName == "Shyvana") {
            Aimage1.setImageResource(R.drawable.m3074)
            Aimage2.setImageResource(R.drawable.m3078)
            Aimage3.setImageResource(R.drawable.m3181)
            Bimage1.setImageResource(R.drawable.m4636)
            Bimage2.setImageResource(R.drawable.m4645)
            Bimage3.setImageResource(R.drawable.m3089)
            Cimage1.setImageResource(R.drawable.m1082)
            Cimage2.setImageResource(R.drawable.m4636)
            Cimage3.setImageResource(R.drawable.m4645)
        }
        if (championName == "Singed") {
            Aimage1.setImageResource(R.drawable.m3116)
            Aimage2.setImageResource(R.drawable.m4637)
            Aimage3.setImageResource(R.drawable.m6665)
            Bimage1.setImageResource(R.drawable.m3116)
            Bimage2.setImageResource(R.drawable.m4637)
            Bimage3.setImageResource(R.drawable.m6667)
            Cimage1.setImageResource(R.drawable.m6657)
            Cimage2.setImageResource(R.drawable.m3116)
            Cimage3.setImageResource(R.drawable.m4637)
        }
        if (championName == "Sion") {
            Aimage1.setImageResource(R.drawable.m3084)
            Aimage2.setImageResource(R.drawable.m3068)
            Aimage3.setImageResource(R.drawable.m3748)
            Bimage1.setImageResource(R.drawable.m6691)
            Bimage2.setImageResource(R.drawable.m6696)
            Bimage3.setImageResource(R.drawable.m6676)
            Cimage1.setImageResource(R.drawable.m3068)
            Cimage2.setImageResource(R.drawable.m3084)
            Cimage3.setImageResource(R.drawable.m3748)
        }
        if (championName == "Sivir") {
            Aimage1.setImageResource(R.drawable.m3087)
            Aimage2.setImageResource(R.drawable.m6675)
            Aimage3.setImageResource(R.drawable.m3046)
            Bimage1.setImageResource(R.drawable.m3087)
            Bimage2.setImageResource(R.drawable.m6675)
            Bimage3.setImageResource(R.drawable.m3036)
            Cimage1.setImageResource(R.drawable.m3087)
            Cimage2.setImageResource(R.drawable.m3071)
            Cimage3.setImageResource(R.drawable.m6691)
        }
        if (championName == "Skarner") {
            Aimage1.setImageResource(R.drawable.m3070)
            Aimage2.setImageResource(R.drawable.m3078)
            Aimage3.setImageResource(R.drawable.m3071)
            Bimage1.setImageResource(R.drawable.m3121)
            Bimage2.setImageResource(R.drawable.m3070)
            Bimage3.setImageResource(R.drawable.m3078)
            Cimage1.setImageResource(R.drawable.m3042)
            Cimage2.setImageResource(R.drawable.m3071)
            Cimage3.setImageResource(R.drawable.m3077)
        }
        if (championName == "Sona") {
            Aimage1.setImageResource(R.drawable.m3070)
            Aimage2.setImageResource(R.drawable.m6617)
            Aimage3.setImageResource(R.drawable.m6616)
            Bimage1.setImageResource(R.drawable.m3040)
            Bimage2.setImageResource(R.drawable.m3070)
            Bimage3.setImageResource(R.drawable.m6620)
            Cimage1.setImageResource(R.drawable.m6616)
            Cimage2.setImageResource(R.drawable.m3040)
            Cimage3.setImageResource(R.drawable.m3070)
        }
        if (championName == "Soraka") {
            Aimage1.setImageResource(R.drawable.m6617)
            Aimage2.setImageResource(R.drawable.m3107)
            Aimage3.setImageResource(R.drawable.m6616)
            Bimage1.setImageResource(R.drawable.m6617)
            Bimage2.setImageResource(R.drawable.m3107)
            Bimage3.setImageResource(R.drawable.m3011)
            Cimage1.setImageResource(R.drawable.m6617)
            Cimage2.setImageResource(R.drawable.m3107)
            Cimage3.setImageResource(R.drawable.m3083)
        }
        if (championName == "Swain") {
            Aimage1.setImageResource(R.drawable.m6653)
            Aimage2.setImageResource(R.drawable.m3116)
            Aimage3.setImageResource(R.drawable.m3157)
            Bimage1.setImageResource(R.drawable.m6653)
            Bimage2.setImageResource(R.drawable.m3157)
            Bimage3.setImageResource(R.drawable.m3116)
            Cimage1.setImageResource(R.drawable.m6653)
            Cimage2.setImageResource(R.drawable.m3116)
            Cimage3.setImageResource(R.drawable.m4637)
        }
        if (championName == "Sylas") {
            Aimage1.setImageResource(R.drawable.m6656)
            Aimage2.setImageResource(R.drawable.m4645)
            Aimage3.setImageResource(R.drawable.m3157)
            Bimage1.setImageResource(R.drawable.m6656)
            Bimage2.setImageResource(R.drawable.m3157)
            Bimage3.setImageResource(R.drawable.m4645)
            Cimage1.setImageResource(R.drawable.m6656)
            Cimage2.setImageResource(R.drawable.m4645)
            Cimage3.setImageResource(R.drawable.m3089)
        }
        if (championName == "Syndra") {
            Aimage1.setImageResource(R.drawable.m6655)
            Aimage2.setImageResource(R.drawable.m4645)
            Aimage3.setImageResource(R.drawable.m3089)
            Bimage1.setImageResource(R.drawable.m6655)
            Bimage2.setImageResource(R.drawable.m4645)
            Bimage3.setImageResource(R.drawable.m3157)
            Cimage1.setImageResource(R.drawable.m6655)
            Cimage2.setImageResource(R.drawable.m4645)
            Cimage3.setImageResource(R.drawable.m3135)
        }
        if (championName == "TahmKench") {
            Aimage1.setImageResource(R.drawable.m3084)
            Aimage2.setImageResource(R.drawable.m3068)
            Aimage3.setImageResource(R.drawable.m3075)
            Bimage1.setImageResource(R.drawable.m3084)
            Bimage2.setImageResource(R.drawable.m3068)
            Bimage3.setImageResource(R.drawable.m3065)
            Cimage1.setImageResource(R.drawable.m3084)
            Cimage2.setImageResource(R.drawable.m3065)
            Cimage3.setImageResource(R.drawable.m3068)
        }
        if (championName == "Taliyah") {
            Aimage1.setImageResource(R.drawable.m3070)
            Aimage2.setImageResource(R.drawable.m6655)
            Aimage3.setImageResource(R.drawable.m3040)
            Bimage1.setImageResource(R.drawable.m4645)
            Bimage2.setImageResource(R.drawable.m6655)
            Bimage3.setImageResource(R.drawable.m4645)
            Cimage1.setImageResource(R.drawable.m3089)
            Cimage2.setImageResource(R.drawable.m6655)
            Cimage3.setImageResource(R.drawable.m4645)
        }
        if (championName == "Talon") {
            Aimage1.setImageResource(R.drawable.m3142)
            Aimage2.setImageResource(R.drawable.m6693)
            Aimage3.setImageResource(R.drawable.m6694)
            Bimage1.setImageResource(R.drawable.m3142)
            Bimage2.setImageResource(R.drawable.m6693)
            Bimage3.setImageResource(R.drawable.m3814)
            Cimage1.setImageResource(R.drawable.m3142)
            Cimage2.setImageResource(R.drawable.m6693)
            Cimage3.setImageResource(R.drawable.m6696)
        }
        if (championName == "Taric") {
            Aimage1.setImageResource(R.drawable.m3070)
            Aimage2.setImageResource(R.drawable.m3190)
            Aimage3.setImageResource(R.drawable.m3121)
            Bimage1.setImageResource(R.drawable.m3504)
            Bimage2.setImageResource(R.drawable.m3070)
            Bimage3.setImageResource(R.drawable.m3190)
            Cimage1.setImageResource(R.drawable.m3121)
            Cimage2.setImageResource(R.drawable.m3109)
            Cimage3.setImageResource(R.drawable.m3070)
        }
        if (championName == "Teemo") {
            Aimage1.setImageResource(R.drawable.m3115)
            Aimage2.setImageResource(R.drawable.m6653)
            Aimage3.setImageResource(R.drawable.m4637)
            Bimage1.setImageResource(R.drawable.m3115)
            Bimage2.setImageResource(R.drawable.m6653)
            Bimage3.setImageResource(R.drawable.m3089)
            Cimage1.setImageResource(R.drawable.m3115)
            Cimage2.setImageResource(R.drawable.m6653)
            Cimage3.setImageResource(R.drawable.m3157)
        }
        if (championName == "Thresh") {
            Aimage1.setImageResource(R.drawable.m3095)
            Aimage2.setImageResource(R.drawable.m3031)
            Aimage3.setImageResource(R.drawable.m3094)
            Bimage1.setImageResource(R.drawable.m3087)
            Bimage2.setImageResource(R.drawable.m3031)
            Bimage3.setImageResource(R.drawable.m3094)
            Cimage1.setImageResource(R.drawable.m3087)
            Cimage2.setImageResource(R.drawable.m3078)
            Cimage3.setImageResource(R.drawable.m3153)
        }
        if (championName == "Tristana") {
            Aimage1.setImageResource(R.drawable.m6672)
            Aimage2.setImageResource(R.drawable.m6675)
            Aimage3.setImageResource(R.drawable.m3036)
            Bimage1.setImageResource(R.drawable.m6672)
            Bimage2.setImageResource(R.drawable.m6675)
            Bimage3.setImageResource(R.drawable.m3046)
            Cimage1.setImageResource(R.drawable.m6672)
            Cimage2.setImageResource(R.drawable.m6675)
            Cimage3.setImageResource(R.drawable.m3072)
        }
        if (championName == "Trundle") {
            Aimage1.setImageResource(R.drawable.m3074)
            Aimage2.setImageResource(R.drawable.m3078)
            Aimage3.setImageResource(R.drawable.m3181)
            Bimage1.setImageResource(R.drawable.m3078)
            Bimage2.setImageResource(R.drawable.m3074)
            Bimage3.setImageResource(R.drawable.m3181)
            Cimage1.setImageResource(R.drawable.m3078)
            Cimage2.setImageResource(R.drawable.m3181)
            Cimage3.setImageResource(R.drawable.m3748)
        }
        if (championName == "Tryndamere") {
            Aimage1.setImageResource(R.drawable.m6672)
            Aimage2.setImageResource(R.drawable.m6631)
            Aimage3.setImageResource(R.drawable.m3181)
            Bimage1.setImageResource(R.drawable.m6672)
            Bimage2.setImageResource(R.drawable.m6631)
            Bimage3.setImageResource(R.drawable.m3046)
            Cimage1.setImageResource(R.drawable.m6672)
            Cimage2.setImageResource(R.drawable.m6675)
            Cimage3.setImageResource(R.drawable.m3046)
        }
        if (championName == "TwistedFate") {
            Aimage1.setImageResource(R.drawable.m6656)
            Aimage2.setImageResource(R.drawable.m3100)
            Aimage3.setImageResource(R.drawable.m3094)
            Bimage1.setImageResource(R.drawable.m6672)
            Bimage2.setImageResource(R.drawable.m3124)
            Bimage3.setImageResource(R.drawable.m3153)
            Cimage1.setImageResource(R.drawable.m6672)
            Cimage2.setImageResource(R.drawable.m3124)
            Cimage3.setImageResource(R.drawable.m3094)
        }
        if (championName == "Twitch") {
            Aimage1.setImageResource(R.drawable.m3153)
            Aimage2.setImageResource(R.drawable.m3124)
            Aimage3.setImageResource(R.drawable.m3085)
            Bimage1.setImageResource(R.drawable.m3153)
            Bimage2.setImageResource(R.drawable.m3085)
            Bimage3.setImageResource(R.drawable.m3031)
            Cimage1.setImageResource(R.drawable.m3153)
            Cimage2.setImageResource(R.drawable.m3085)
            Cimage3.setImageResource(R.drawable.m3124)
        }
        if (championName == "Udyr") {
            Aimage1.setImageResource(R.drawable.m3070)
            Aimage2.setImageResource(R.drawable.m4637)
            Aimage3.setImageResource(R.drawable.m3040)
            Bimage1.setImageResource(R.drawable.m6665)
            Bimage2.setImageResource(R.drawable.m3107)
            Bimage3.setImageResource(R.drawable.m6667)
            Cimage1.setImageResource(R.drawable.m8001)
            Cimage2.setImageResource(R.drawable.m4637)
            Cimage3.setImageResource(R.drawable.m3157)
        }
        if (championName == "Urgot") {
            Aimage1.setImageResource(R.drawable.m3071)
            Aimage2.setImageResource(R.drawable.m3053)
            Aimage3.setImageResource(R.drawable.m6665)
            Bimage1.setImageResource(R.drawable.m3748)
            Bimage2.setImageResource(R.drawable.m3071)
            Bimage3.setImageResource(R.drawable.m6665)
            Cimage1.setImageResource(R.drawable.m3071)
            Cimage2.setImageResource(R.drawable.m3748)
            Cimage3.setImageResource(R.drawable.m6665)
        }
        if (championName == "Varus") {
            Aimage1.setImageResource(R.drawable.m6672)
            Aimage2.setImageResource(R.drawable.m3124)
            Aimage3.setImageResource(R.drawable.m3153)
            Bimage1.setImageResource(R.drawable.m6672)
            Bimage2.setImageResource(R.drawable.m3124)
            Bimage3.setImageResource(R.drawable.m6673)
            Cimage1.setImageResource(R.drawable.m3070)
            Cimage2.setImageResource(R.drawable.m6691)
            Cimage3.setImageResource(R.drawable.m3042)
        }
        if (championName == "Vayne") {
            Aimage1.setImageResource(R.drawable.m3087)
            Aimage2.setImageResource(R.drawable.m3078)
            Aimage3.setImageResource(R.drawable.m3153)
            Bimage1.setImageResource(R.drawable.m3087)
            Bimage2.setImageResource(R.drawable.m3078)
            Bimage3.setImageResource(R.drawable.m3091)
            Cimage1.setImageResource(R.drawable.m3087)
            Cimage2.setImageResource(R.drawable.m3078)
            Cimage3.setImageResource(R.drawable.m6673)
        }
        if (championName == "Veigar") {
            Aimage1.setImageResource(R.drawable.m6656)
            Aimage2.setImageResource(R.drawable.m3089)
            Aimage3.setImageResource(R.drawable.m3157)
            Bimage1.setImageResource(R.drawable.m6656)
            Bimage2.setImageResource(R.drawable.m3089)
            Bimage3.setImageResource(R.drawable.m3135)
            Cimage1.setImageResource(R.drawable.m6656)
            Cimage2.setImageResource(R.drawable.m3157)
            Cimage3.setImageResource(R.drawable.m3089)
        }
        if (championName == "VelKoz") {
            Aimage1.setImageResource(R.drawable.m6655)
            Aimage2.setImageResource(R.drawable.m4645)
            Aimage3.setImageResource(R.drawable.m3089)
            Bimage1.setImageResource(R.drawable.m6655)
            Bimage2.setImageResource(R.drawable.m4645)
            Bimage3.setImageResource(R.drawable.m3157)
            Cimage1.setImageResource(R.drawable.m6653)
            Cimage2.setImageResource(R.drawable.m4645)
            Cimage3.setImageResource(R.drawable.m3157)
        }
        if (championName == "Vi") {
            Aimage1.setImageResource(R.drawable.m6691)
            Aimage2.setImageResource(R.drawable.m3508)
            Aimage3.setImageResource(R.drawable.m6676)
            Bimage1.setImageResource(R.drawable.m6692)
            Bimage2.setImageResource(R.drawable.m3508)
            Bimage3.setImageResource(R.drawable.m6676)
            Cimage1.setImageResource(R.drawable.m6692)
            Cimage2.setImageResource(R.drawable.m6676)
            Cimage3.setImageResource(R.drawable.m3036)
        }
        if (championName == "Viego") {
            Aimage1.setImageResource(R.drawable.m3153)
            Aimage2.setImageResource(R.drawable.m6632)
            Aimage3.setImageResource(R.drawable.m6672)
            Bimage1.setImageResource(R.drawable.m6672)
            Bimage2.setImageResource(R.drawable.m3078)
            Bimage3.setImageResource(R.drawable.m6333)
            Cimage1.setImageResource(R.drawable.m6672)
            Cimage2.setImageResource(R.drawable.m3078)
            Cimage3.setImageResource(R.drawable.m3071)
        }
        if (championName == "Viktor") {
            Aimage1.setImageResource(R.drawable.m6655)
            Aimage2.setImageResource(R.drawable.m4645)
            Aimage3.setImageResource(R.drawable.m3089)
            Bimage1.setImageResource(R.drawable.m6655)
            Bimage2.setImageResource(R.drawable.m4645)
            Bimage3.setImageResource(R.drawable.m3157)
            Cimage1.setImageResource(R.drawable.m6653)
            Cimage2.setImageResource(R.drawable.m4645)
            Cimage3.setImageResource(R.drawable.m3157)
        }
        if (championName == "Vladimir") {
            Aimage1.setImageResource(R.drawable.m4636)
            Aimage2.setImageResource(R.drawable.m3089)
            Aimage3.setImageResource(R.drawable.m3135)
            Bimage1.setImageResource(R.drawable.m4636)
            Bimage2.setImageResource(R.drawable.m4629)
            Bimage3.setImageResource(R.drawable.m3089)
            Cimage1.setImageResource(R.drawable.m1082)
            Cimage2.setImageResource(R.drawable.m3152)
            Cimage3.setImageResource(R.drawable.m3041)
        }
        if (championName == "Volibear") {
            Aimage1.setImageResource(R.drawable.m3115)
            Aimage2.setImageResource(R.drawable.m4633)
            Aimage3.setImageResource(R.drawable.m3181)
            Bimage1.setImageResource(R.drawable.m4633)
            Bimage2.setImageResource(R.drawable.m3181)
            Bimage3.setImageResource(R.drawable.m3110)
            Cimage1.setImageResource(R.drawable.m3115)
            Cimage2.setImageResource(R.drawable.m4633)
            Cimage3.setImageResource(R.drawable.m3075)
        }
        if (championName == "Warwick") {
            Aimage1.setImageResource(R.drawable.m3153)
            Aimage2.setImageResource(R.drawable.m6632)
            Aimage3.setImageResource(R.drawable.m3748)
            Bimage1.setImageResource(R.drawable.m3153)
            Bimage2.setImageResource(R.drawable.m3078)
            Bimage3.setImageResource(R.drawable.m3748)
            Cimage1.setImageResource(R.drawable.m3153)
            Cimage2.setImageResource(R.drawable.m3748)
            Cimage3.setImageResource(R.drawable.m6632)
        }
        if (championName == "Wukong") {
        }
        if (championName == "Xayah") {
            Aimage1.setImageResource(R.drawable.m6672)
            Aimage2.setImageResource(R.drawable.m6675)
            Aimage3.setImageResource(R.drawable.m3036)
            Bimage1.setImageResource(R.drawable.m6672)
            Bimage2.setImageResource(R.drawable.m6675)
            Bimage3.setImageResource(R.drawable.m3072)
            Cimage1.setImageResource(R.drawable.m6672)
            Cimage2.setImageResource(R.drawable.m6675)
            Cimage3.setImageResource(R.drawable.m3046)
        }
        if (championName == "Xerath") {
            Aimage1.setImageResource(R.drawable.m6655)
            Aimage2.setImageResource(R.drawable.m4645)
            Aimage3.setImageResource(R.drawable.m3089)
            Bimage1.setImageResource(R.drawable.m6655)
            Bimage2.setImageResource(R.drawable.m4628)
            Bimage3.setImageResource(R.drawable.m3089)
            Cimage1.setImageResource(R.drawable.m6653)
            Cimage2.setImageResource(R.drawable.m4645)
            Cimage3.setImageResource(R.drawable.m3089)
        }
        if (championName == "XinZhao") {
            Aimage1.setImageResource(R.drawable.m6692)
            Aimage2.setImageResource(R.drawable.m3508)
            Aimage3.setImageResource(R.drawable.m6676)
            Bimage1.setImageResource(R.drawable.m6630)
            Bimage2.setImageResource(R.drawable.m3161)
            Bimage3.setImageResource(R.drawable.m3053)
            Cimage1.setImageResource(R.drawable.m6692)
            Cimage2.setImageResource(R.drawable.m3153)
            Cimage3.setImageResource(R.drawable.m6676)
        }
        if (championName == "Yasuo") {
            Aimage1.setImageResource(R.drawable.m6672)
            Aimage2.setImageResource(R.drawable.m3031)
            Aimage3.setImageResource(R.drawable.m6673)
            Bimage1.setImageResource(R.drawable.m6672)
            Bimage2.setImageResource(R.drawable.m3031)
            Bimage3.setImageResource(R.drawable.m3072)
            Cimage1.setImageResource(R.drawable.m6672)
            Cimage2.setImageResource(R.drawable.m3031)
            Cimage3.setImageResource(R.drawable.m6333)
        }
        if (championName == "Yone") {
            Aimage1.setImageResource(R.drawable.m6672)
            Aimage2.setImageResource(R.drawable.m3031)
            Aimage3.setImageResource(R.drawable.m6673)
            Bimage1.setImageResource(R.drawable.m6672)
            Bimage2.setImageResource(R.drawable.m3031)
            Bimage3.setImageResource(R.drawable.m3072)
            Cimage1.setImageResource(R.drawable.m6672)
            Cimage2.setImageResource(R.drawable.m3031)
            Cimage3.setImageResource(R.drawable.m3153)
        }
        if (championName == "Yorick") {
            Aimage1.setImageResource(R.drawable.m3078)
            Aimage2.setImageResource(R.drawable.m3181)
            Aimage3.setImageResource(R.drawable.m6694)
            Bimage1.setImageResource(R.drawable.m6691)
            Bimage2.setImageResource(R.drawable.m6694)
            Bimage3.setImageResource(R.drawable.m6676)
            Cimage1.setImageResource(R.drawable.m3074)
            Cimage2.setImageResource(R.drawable.m6692)
            Cimage3.setImageResource(R.drawable.m6694)
        }
        if (championName == "Yuumi") {
            Aimage1.setImageResource(R.drawable.m2065)
            Aimage2.setImageResource(R.drawable.m3222)
            Aimage3.setImageResource(R.drawable.m3107)
            Bimage1.setImageResource(R.drawable.m3153)
            Bimage2.setImageResource(R.drawable.m3124)
            Bimage3.setImageResource(R.drawable.m3748)
        }
        if (championName == "Zac") {
            Aimage1.setImageResource(R.drawable.m3068)
            Aimage2.setImageResource(R.drawable.m6667)
            Aimage3.setImageResource(R.drawable.m3075)
            Bimage1.setImageResource(R.drawable.m6667)
            Bimage2.setImageResource(R.drawable.m3068)
            Bimage3.setImageResource(R.drawable.m8020)
            Cimage1.setImageResource(R.drawable.m6667)
            Cimage2.setImageResource(R.drawable.m3068)
            Cimage3.setImageResource(R.drawable.m3065)
        }
        if (championName == "Zed") {
            Aimage1.setImageResource(R.drawable.m3074)
            Aimage2.setImageResource(R.drawable.m6691)
            Aimage3.setImageResource(R.drawable.m3071)
            Bimage1.setImageResource(R.drawable.m3074)
            Bimage2.setImageResource(R.drawable.m6691)
            Bimage3.setImageResource(R.drawable.m6694)
            Cimage1.setImageResource(R.drawable.m6691)
            Cimage2.setImageResource(R.drawable.m3074)
            Cimage3.setImageResource(R.drawable.m6694)
        }
        if (championName == "Zeri") {
            Aimage1.setImageResource(R.drawable.m3087)
            Aimage2.setImageResource(R.drawable.m6675)
            Aimage3.setImageResource(R.drawable.m3085)
            Bimage1.setImageResource(R.drawable.m3087)
            Bimage2.setImageResource(R.drawable.m6675)
            Bimage3.setImageResource(R.drawable.m6673)
            Cimage1.setImageResource(R.drawable.m3087)
            Cimage2.setImageResource(R.drawable.m6675)
            Cimage3.setImageResource(R.drawable.m3072)
        }
        if (championName == "Ziggs") {
            Aimage1.setImageResource(R.drawable.m3070)
            Aimage2.setImageResource(R.drawable.m6653)
            Aimage3.setImageResource(R.drawable.m3040)
            Bimage1.setImageResource(R.drawable.m4645)
            Bimage2.setImageResource(R.drawable.m6653)
            Bimage3.setImageResource(R.drawable.m4645)
            Cimage1.setImageResource(R.drawable.m3089)
            Cimage2.setImageResource(R.drawable.m3070)
            Cimage3.setImageResource(R.drawable.m6653)
        }
        if (championName == "Zilean") {
            Aimage1.setImageResource(R.drawable.m6656)
            Aimage2.setImageResource(R.drawable.m4005)
            Aimage3.setImageResource(R.drawable.m4629)
            Bimage1.setImageResource(R.drawable.m6656)
            Bimage2.setImageResource(R.drawable.m3157)
            Bimage3.setImageResource(R.drawable.m4629)
            Cimage1.setImageResource(R.drawable.m1082)
            Cimage2.setImageResource(R.drawable.m6655)
            Cimage3.setImageResource(R.drawable.m4645)
        }
        if (championName == "Zoe") {
            Aimage1.setImageResource(R.drawable.m4645)
            Aimage2.setImageResource(R.drawable.m3089)
            Aimage3.setImageResource(R.drawable.m6655)
            Bimage1.setImageResource(R.drawable.m4628)
            Bimage2.setImageResource(R.drawable.m3089)
            Bimage3.setImageResource(R.drawable.m1082)
            Cimage1.setImageResource(R.drawable.m6655)
            Cimage2.setImageResource(R.drawable.m3089)
            Cimage3.setImageResource(R.drawable.m4645)
        }
        if (championName == "Zyra") {
            Aimage1.setImageResource(R.drawable.m6653)
            Aimage2.setImageResource(R.drawable.m4637)
            Aimage3.setImageResource(R.drawable.m3135)
            Bimage1.setImageResource(R.drawable.m6653)
            Bimage2.setImageResource(R.drawable.m3116)
            Bimage3.setImageResource(R.drawable.m4637)
            Cimage1.setImageResource(R.drawable.m6653)
            Cimage2.setImageResource(R.drawable.m4637)
            Cimage3.setImageResource(R.drawable.m3116)
        }
    }
}
