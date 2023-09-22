package me.ibrahimsn.smoothbottombar

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import me.ibrahimsn.smoothbottombar.databinding.ActivityChampionInfoBinding
import java.util.*

class ChampionInfo : AppCompatActivity() {
    private lateinit var binding: ActivityChampionInfoBinding

    @SuppressLint("SetJavaScriptEnabled", "DiscouragedApi", "CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChampionInfoBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        supportActionBar?.hide()

        val championName = intent.getStringExtra("championName")
        val championImageView: ImageView = findViewById(R.id.championImageView)
        val championNameTextView: TextView = findViewById(R.id.championNameTextView)

        if (championName == "Aatrox") {
            val videoId = "HO8alKVzKFA"
            val html =
                "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            // Load the HTML content into the WebView
            binding.youtubeVideo.setBackgroundColor(0)
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData(html, "text/html", "utf-8")
        }
        if(championName == "Ahri") {
            val videoId = "iSlqMwoqv5k"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Akali") {
            val videoId = "Fmh4BTPG_CU"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Alistar") {
            val videoId = "_CXLl7feukY"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Amumu") {
            val videoId = "vx-7ImjQqZo"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Anivia") {
            val videoId = "VvfxXqPzoV8"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Annie") {
            val videoId = "gPVB8rrgYW4"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Aphelios") {
            val videoId = "Ij1k8icU-WM"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Ashe") {
            val videoId = "yEC4BRvAwD4"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "AurelionSol") {
            val videoId = "HgafssYh_XI"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Azir") {
            val videoId = "86kdgo11WvY"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Bard") {
            val videoId = "kaT1U2VOrQQ"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Blitzcrank") {
            val videoId = "ma6-MIK-yNw"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Brand") {
            val videoId = "rbfEPgJP_Z8"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Briar") {
            val videoId = "EFjCJRW_FRw"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Braum") {
            val videoId = "2uUc586Gy2w"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Caitlyn") {
            val videoId = "eoz9PLSV1i0"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Camille") {
            val videoId = "a_pgHiRtbHs"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Cassiopeia") {
            val videoId = "KzzxGbJzXas"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "ChoGath") {
            val videoId = "xdnHIhWS14Q"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Corki") {
            val videoId = "Ek5qwBfkHqo"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Darius") {
            val videoId = "1DFbg0PoW0g"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Diana") {
            val videoId = "PKwIUSnlp30"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "DrMundo") {
            val videoId = "T8PYvnJPiZo"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Draven") {
            val videoId = "0I8-FrYQKHs"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Ekko") {
            val videoId = "ql6bJ2Wx24A"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Elise") {
            val videoId = "bEY5R_seVUc"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Evelynn") {
            val videoId = "n_p6IA4KkiQ"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Ezreal") {
            val videoId = "zN_TkUGY4oA"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Fiddlesticks") {
            val videoId = "ghLE3_gZ9k4"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Fiora") {
            val videoId = "xMVHTUc-Mas"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Fizz") {
            val videoId = "A-wx6tHFtBw"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Galio") {
            val videoId = "OSN7i9sg05s"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Gangplank") {
            val videoId = "oTNGfE_VicM&lc=z12ry1n4uwubz1rcc232vj5olrnxwpz1j"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Garen") {
            val videoId = "0OK5USWHX5U"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Gnar") {
            val videoId = "ARv2kn_i-aY"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Gragas") {
            val videoId = "HMPdBP-8pIg"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Graves") {
            val videoId = "PF71YjVz5J0"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Gwen") {
            val videoId = "L-c-M3GTrbY"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Hecarim") {
            val videoId = "tUn-o3Xe9JY"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Heimerdinger") {
            val videoId = "bDnDQCYFbyI"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Illaoi") {
            val videoId = "Egb6zbh0RaQ"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Irelia") {
            val videoId = "z94hitiUBV8"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Ivern") {
            val videoId = "nahzB5kZw8g"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Janna") {
            val videoId = "U8LeWdV3H_Y"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "JarvanIV") {
            val videoId = "9Ndys32t4So"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Jax") {
            val videoId = "3G-K-DdUFnY"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Jayce") {
            val videoId = "juItjxuMP88"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Jhin") {
            val videoId = "gE-8KU8Y3l4"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Jinx") {
            val videoId = "OEAg8YjXqg0"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "KaiSa") {
            val videoId = "9U2gqLdYOXw"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Kalista") {
            val videoId = "-k7OvI99h_o"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Karma") {
            val videoId = "94u_nSz0g5I"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Karthus") {
            val videoId = "YgXIjYiLA&pp=ygUXI9C60L7RgtGL0LLQtdCz0LjQv9GC0LU%3D"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Kassadin") {
            val videoId = "1dju-7Cbrkg"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Ksante") {
            val videoId = "l6tIEgbw2t8"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Katarina") {
            val videoId = "nd6qvOWEKbg"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Kayle") {
            val videoId = "7JZw-OWu5DE"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Kayn") {
            val videoId = "l8vtzD8tIyM"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Kennen") {
            val videoId = "-k5Qp-KWMTw"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "KhaZix") {
            val videoId = "QaTcFuwmJdg"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Kindred") {
            val videoId = "DxpyCkHZe3w"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Kled") {
            val videoId = "9T4BV_F7w5Y"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "KogMaw") {
            val videoId = "MCmdhjmt1Dk"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "LeBlanc") {
            val videoId = "fsxl5d79ZUc"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "LeeSin") {
            val videoId = "TDO774hBs8A"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Leona") {
            val videoId = "YfCInmdStWM"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Lillia") {
            val videoId = "7k9BfMovfUs"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Lissandra") {
            val videoId = "RsvDqbv8aOI"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Lucian") {
            val videoId = "x3qXrUNhCFM"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Lulu") {
            val videoId = "is3l93V5doU"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Lux") {
            val videoId = "FdFmSYqCucQ"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Malphite") {
            val videoId = "dBZ7kMDedDU"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Malzahar") {
            val videoId = "QVWv62n4pRA"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Maokai") {
            val videoId = "Sv_2HMdF7l8"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "MasterYi") {
            val videoId = "s3cF6Y3xqzM"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "MissFortune") {
            val videoId = "lcCxYPuO3ZQ"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Mordekaiser") {
            val videoId = "ETje9lLtxaE"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Milio") {
            val videoId = "IkqfFCN140I"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Morgana") {
            val videoId = "4SSQZZGgak4"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Nami") {
            val videoId = "ccwUMyvylzc"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Nasus") {
            val videoId = "XoqVMayOuFM"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Nautilus") {
            val videoId = "Zd4HKSd6hf0"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Neeko") {
            val videoId = "NDuKWI7aBSc"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Nidalee") {
            val videoId = "tVXzb3CAhZ4"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Nocturne") {
            val videoId = "gOitlMNXqeM"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "nunu") {
            val videoId = "V4KonpV9wlE"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Olaf") {
            val videoId = "4W32Sl56Xgk"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Orianna") {
            val videoId = "EPtW5oLg5VQ"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Ornn") {
            val videoId = "MWL6JyCcUbQ"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Pantheon") {
            val videoId = "KQTEEPFOvm0"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Poppy") {
            val videoId = "LsdeOsvo2Ak"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Pyke") {
            val videoId = "ueQkYOQoOXc"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Qiyana") {
            val videoId = "N4oXay4Qagw"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Quinn") {
            val videoId = "COvMhpgHSn0"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Rakan") {
            val videoId = "l8cmQsFnBOU"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Rammus") {
            val videoId = "lRlu7vUXok8"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "RekSai") {
            val videoId = "VBngcYQGh0w"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Rell") {
            val videoId = "NmzNtNdgKFM"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Renekton") {
            val videoId = "d__p9vBHkfw"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Rengar") {
            val videoId = "LJdW4VAVQoU"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Riven") {
            val videoId = "LcmDP2yGHmA"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Rumble") {
            val videoId = "px08oSlZQCE&lc=Ugiu9EjUNPZZK3gCoAEC"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Ryze") {
            val videoId = "eRNjoOu9SF8"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Samira") {
            val videoId = "Uph3FDFIZJU"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Sejuani") {
            val videoId = "rWw8D4qYQNQ"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Senna") {
            val videoId = "32P9fqoH40s"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Seraphine") {
            val videoId = "lfUAlbozRwY"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Sett") {
            val videoId = "uwTWDtyi72U"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Shaco") {
            val videoId = "EBaDp2NR3_M"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Shen") {
            val videoId = "1QsNkuQPI20"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Shyvana") {
            val videoId = "s8UkHh8FtSo"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Singed") {
            val videoId = "WynYqH60UFo"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Sion") {
            val videoId = "mgjztxJFvg0"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Sivir") {
            val videoId = "QjTy2f4LhTQ"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Skarner") {
            val videoId = "JQHf7iRDlTg"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Sona") {
            val videoId = "du9GHXWNTig"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Soraka") {
            val videoId = "No8eccm_8"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Swain") {
            val videoId = "N2kOJzVOGJw"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Sylas") {
            val videoId = "I2o_olw48e0"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Syndra") {
            val videoId = "c3o2ZHb3V2I"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "TahmKench") {
            val videoId = "0nlYDzb22dA"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Taliyah") {
            val videoId = "S8RNtEkG2OQ"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Talon") {
            val videoId = "c3RtayA4CUU"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Taric") {
            val videoId = "9GvcNAzbhXo"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Teemo") {
            val videoId = "zC1A3eUGt2s"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Thresh") {
            val videoId = "yK_UfLYBkGY"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Tristana") {
            val videoId = "dHO5wTKaNsE"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Trundle") {
            val videoId = "tfWy9cYW6Us"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Tryndamere") {
            val videoId = "8nJ8iWn2iBA"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "TwistedFate") {
            val videoId = "D8Rkapb7slU"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Twitch") {
            val videoId = "UCgSPTEKkw5LT-PvdFO6FOuQ"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Udyr") {
            val videoId = "63lMFq038ds"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Urgot") {
            val videoId = "Rdhc2k_u9JU"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Varus") {
            val videoId = "UCgSPTEKkw5LT-PvdFO6FOuQ"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Vayne") {
            val videoId = "gZDJqpFspmg"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Veigar") {
            val videoId = "zkNkzmtHlBg"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "VelKoz") {
            val videoId = "mGB8BKyfSSc"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Vi") {
            val videoId = "SYNdpg-urfw"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Viego") {
            val videoId = "kS-2lUfHc98"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Viktor") {
            val videoId = "6neiqWA4eEk"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Vladimir") {
            val videoId = "b2aD5V6XWXQ"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Volibear") {
            val videoId = "JWr1tFvbwCA"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Warwick") {
            val videoId = "SzkIBFq7OR8"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "monkeyking") {
            val videoId = "JN1TA9njCOU"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Xayah") {
            val videoId = "gUA3utmPDhs"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Xerath") {
            val videoId = "7brV-DrMh_w"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "XinZhao") {
            val videoId = "nwHlYvmZy1I"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Yasuo") {
            val videoId = "f6rytA0ps74"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Yone") {
            val videoId = "4IPUtB2yLj0"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Yorick") {
            val videoId = "NcvRIVBVV4k"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Yuumi") {
            val videoId = "lodi9_cmpv4"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Zac") {
            val videoId = "Kklbltc3T4s"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Zed") {
            val videoId = "OI3En9mojcQ"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Zeri") {
            val videoId = "7Nx6-lT1TbI"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Ziggs") {
            val videoId = "0OqIpdZwvoQ"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Zilean") {
            val videoId = "ZUE35rScmtM"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Zoe") {
            val videoId = "gG2sQJaTzBE"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }
        if(championName == "Zyra") {
            val videoId = "pBkSehazTG0"
            val html = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId\" frameborder=\"0\" allowfullscreen></iframe>"
            binding.youtubeVideo.setBackgroundColor( 0 )
            binding.youtubeVideo.settings.javaScriptEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.settings.domStorageEnabled = true
            binding.youtubeVideo.loadData( html, "text/html", "utf-8" )
        }

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

        val lane = findViewById<ImageView>(R.id.lane)
        val setLane = lane.findViewById<ImageView>(R.id.lane)
        setLane.setImageResource(R.drawable.botlane)

        //set counters
        if (championName == "Aatrox") {
            setCounter1.setImageResource(R.drawable.swain)
            setCounter2.setImageResource(R.drawable.singed)
            setCounter3.setImageResource(R.drawable.quinn)
            setCounter4.setImageResource(R.drawable.kennen)
            setCounter5.setImageResource(R.drawable.olaf)
            setCounter6.setImageResource(R.drawable.briar)
            setCounter7.setImageResource(R.drawable.chogath)
            setCounter8.setImageResource(R.drawable.sylas)
            setCounter9.setImageResource(R.drawable.sion)
            setCounter10.setImageResource(R.drawable.gangplank)
        }
        if (championName == "Ahri") {
            setCounter1.setImageResource(R.drawable.brand)
            setCounter2.setImageResource(R.drawable.rumble)
            setCounter3.setImageResource(R.drawable.pantheon)
            setCounter4.setImageResource(R.drawable.lux)
            setCounter5.setImageResource(R.drawable.talon)
            setCounter6.setImageResource(R.drawable.kayle)
            setCounter7.setImageResource(R.drawable.singed)
            setCounter8.setImageResource(R.drawable.jayce)
            setCounter9.setImageResource(R.drawable.gragas)
            setCounter10.setImageResource(R.drawable.ziggs)
        }
        if (championName == "Akali") {
            setCounter1.setImageResource(R.drawable.singed)
            setCounter2.setImageResource(R.drawable.taliyah)
            setCounter3.setImageResource(R.drawable.naafiri)
            setCounter4.setImageResource(R.drawable.veigar)
            setCounter5.setImageResource(R.drawable.akshan)
            setCounter6.setImageResource(R.drawable.velkoz)
            setCounter7.setImageResource(R.drawable.ziggs)
            setCounter8.setImageResource(R.drawable.kayle)
            setCounter9.setImageResource(R.drawable.xerath)
            setCounter10.setImageResource(R.drawable.ekko)
        }
        if (championName == "Alistar") {
            setCounter1.setImageResource(R.drawable.senna)
            setCounter2.setImageResource(R.drawable.sona)
            setCounter3.setImageResource(R.drawable.swain)
            setCounter4.setImageResource(R.drawable.lissandra)
            setCounter5.setImageResource(R.drawable.janna)
            setCounter6.setImageResource(R.drawable.twitch)
            setCounter7.setImageResource(R.drawable.tahmkench)
            setCounter8.setImageResource(R.drawable.amumu)
            setCounter9.setImageResource(R.drawable.yuumi)
            setCounter10.setImageResource(R.drawable.pantheon)
        }
        if (championName == "Amumu") {
            setCounter1.setImageResource(R.drawable.ivern)
            setCounter2.setImageResource(R.drawable.xinzhao)
            setCounter3.setImageResource(R.drawable.volibear)
            setCounter4.setImageResource(R.drawable.karthus)
            setCounter5.setImageResource(R.drawable.poppy)
            setCounter6.setImageResource(R.drawable.naafiri)
            setCounter7.setImageResource(R.drawable.briar)
            setCounter8.setImageResource(R.drawable.viego)
            setCounter9.setImageResource(R.drawable.kindred)
            setCounter10.setImageResource(R.drawable.sejuani)
        }
        if (championName == "Anivia") {
            setCounter1.setImageResource(R.drawable.garen)
            setCounter2.setImageResource(R.drawable.rumble)
            setCounter3.setImageResource(R.drawable.annie)
            setCounter4.setImageResource(R.drawable.cassiopeia)
            setCounter5.setImageResource(R.drawable.pantheon)
            setCounter6.setImageResource(R.drawable.velkoz)
            setCounter7.setImageResource(R.drawable.malphite)
            setCounter8.setImageResource(R.drawable.ekko)
            setCounter9.setImageResource(R.drawable.gangplank)
            setCounter10.setImageResource(R.drawable.renekton)
        }
        if (championName == "Annie") {
            setCounter1.setImageResource(R.drawable.naafiri)
            setCounter2.setImageResource(R.drawable.gangplank)
            setCounter3.setImageResource(R.drawable.chogath)
            setCounter4.setImageResource(R.drawable.gragas)
            setCounter5.setImageResource(R.drawable.corki)
            setCounter6.setImageResource(R.drawable.ziggs)
            setCounter7.setImageResource(R.drawable.brand)
            setCounter8.setImageResource(R.drawable.anivia)
            setCounter9.setImageResource(R.drawable.ryze)
            setCounter10.setImageResource(R.drawable.veigar)
        }
        if (championName == "Aphelios") {
            setCounter1.setImageResource(R.drawable.swain)
            setCounter2.setImageResource(R.drawable.ziggs)
            setCounter3.setImageResource(R.drawable.seraphine)
            setCounter4.setImageResource(R.drawable.twitch)
            setCounter5.setImageResource(R.drawable.yasuo)
        }
        if (championName == "Ashe") {
            setCounter1.setImageResource(R.drawable.swain)
            setCounter2.setImageResource(R.drawable.karthus)
            setCounter3.setImageResource(R.drawable.seraphine)
            setCounter4.setImageResource(R.drawable.nilah)
            setCounter5.setImageResource(R.drawable.yasuo)
            setCounter6.setImageResource(R.drawable.xayah)
            setCounter7.setImageResource(R.drawable.aphelios)
            setCounter8.setImageResource(R.drawable.jinx)
            setCounter9.setImageResource(R.drawable.veigar)
            setCounter10.setImageResource(R.drawable.kaisa)
        }
        if (championName == "AurelionSol") {
            setCounter1.setImageResource(R.drawable.talon)
            setCounter2.setImageResource(R.drawable.katarina)
            setCounter3.setImageResource(R.drawable.fizz)
            setCounter4.setImageResource(R.drawable.naafiri)
            setCounter5.setImageResource(R.drawable.diana)
            setCounter6.setImageResource(R.drawable.ziggs)
            setCounter7.setImageResource(R.drawable.ryze)
            setCounter8.setImageResource(R.drawable.brand)
            setCounter9.setImageResource(R.drawable.yasuo)
            setCounter10.setImageResource(R.drawable.corki)
        }
        if (championName == "Azir") {
            setCounter1.setImageResource(R.drawable.singed)
            setCounter2.setImageResource(R.drawable.viktor)
            setCounter3.setImageResource(R.drawable.aurelionsol)
            setCounter4.setImageResource(R.drawable.twistedfate)
            setCounter5.setImageResource(R.drawable.ekko)
            setCounter6.setImageResource(R.drawable.brand)
            setCounter7.setImageResource(R.drawable.corki)
            setCounter8.setImageResource(R.drawable.garen)
            setCounter9.setImageResource(R.drawable.kennen)
            setCounter10.setImageResource(R.drawable.yasuo)
        }
        if (championName == "Bard") {
            setCounter1.setImageResource(R.drawable.zac)
            setCounter2.setImageResource(R.drawable.taric)
            setCounter3.setImageResource(R.drawable.senna)
            setCounter4.setImageResource(R.drawable.soraka)
            setCounter5.setImageResource(R.drawable.velkoz)
            setCounter6.setImageResource(R.drawable.lissandra)
            setCounter7.setImageResource(R.drawable.poppy)
            setCounter8.setImageResource(R.drawable.twitch)
            setCounter9.setImageResource(R.drawable.swain)
            setCounter10.setImageResource(R.drawable.yuumi)
        }
        if (championName == "Blitzcrank") {
            setCounter1.setImageResource(R.drawable.taric)
            setCounter2.setImageResource(R.drawable.rell)
            setCounter3.setImageResource(R.drawable.zac)
            setCounter4.setImageResource(R.drawable.rakan)
            setCounter5.setImageResource(R.drawable.leona)
            setCounter6.setImageResource(R.drawable.tahmkench)
            setCounter7.setImageResource(R.drawable.yuumi)
            setCounter8.setImageResource(R.drawable.lulu)
            setCounter9.setImageResource(R.drawable.morgana)
            setCounter10.setImageResource(R.drawable.seraphine)
        }
        if (championName == "Brand") {
            setCounter1.setImageResource(R.drawable.poppy)
            setCounter2.setImageResource(R.drawable.shaco)
            setCounter3.setImageResource(R.drawable.taric)
            setCounter4.setImageResource(R.drawable.neeko)
            setCounter5.setImageResource(R.drawable.zilean)
            setCounter6.setImageResource(R.drawable.tahmkench)
            setCounter7.setImageResource(R.drawable.swain)
            setCounter8.setImageResource(R.drawable.velkoz)
            setCounter9.setImageResource(R.drawable.fiddlesticks)
            setCounter10.setImageResource(R.drawable.zac)
        }
        if (championName == "Briar") {
            setCounter1.setImageResource(R.drawable.volibear)
            setCounter2.setImageResource(R.drawable.trundle)
            setCounter3.setImageResource(R.drawable.reksai)
            setCounter4.setImageResource(R.drawable.nocturne)
            setCounter5.setImageResource(R.drawable.udyr)
            setCounter6.setImageResource(R.drawable.naafiri)
        }
        if (championName == "Braum") {
            setCounter1.setImageResource(R.drawable.zilean)
            setCounter2.setImageResource(R.drawable.tahmkench)
            setCounter3.setImageResource(R.drawable.taric)
            setCounter4.setImageResource(R.drawable.senna)
            setCounter5.setImageResource(R.drawable.xerath)
            setCounter6.setImageResource(R.drawable.lissandra)
            setCounter7.setImageResource(R.drawable.poppy)
            setCounter8.setImageResource(R.drawable.fiddlesticks)
            setCounter9.setImageResource(R.drawable.yuumi)
            setCounter10.setImageResource(R.drawable.nautilus)
        }
        if (championName == "Caitlyn") {
            setCounter1.setImageResource(R.drawable.seraphine)
            setCounter2.setImageResource(R.drawable.veigar)
            setCounter3.setImageResource(R.drawable.karthus)
            setCounter4.setImageResource(R.drawable.swain)
            setCounter5.setImageResource(R.drawable.yasuo)
            setCounter6.setImageResource(R.drawable.xayah)
            setCounter7.setImageResource(R.drawable.aphelios)
            setCounter8.setImageResource(R.drawable.varus)
            setCounter9.setImageResource(R.drawable.zeri)
            setCounter10.setImageResource(R.drawable.lucian)
        }
        if (championName == "Camille") {
            setCounter1.setImageResource(R.drawable.wukong)
            setCounter2.setImageResource(R.drawable.quinn)
            setCounter3.setImageResource(R.drawable.zac)
            setCounter4.setImageResource(R.drawable.teemo)
            setCounter5.setImageResource(R.drawable.udyr)
            setCounter6.setImageResource(R.drawable.briar)
            setCounter7.setImageResource(R.drawable.naafiri)
            setCounter8.setImageResource(R.drawable.cassiopeia)
            setCounter9.setImageResource(R.drawable.garen)
            setCounter10.setImageResource(R.drawable.trundle)
        }
        if (championName == "Cassiopeia") {
            setCounter1.setImageResource(R.drawable.zoe)
            setCounter2.setImageResource(R.drawable.rumble)
            setCounter3.setImageResource(R.drawable.ziggs)
            setCounter4.setImageResource(R.drawable.malzahar)
            setCounter5.setImageResource(R.drawable.fizz)
            setCounter6.setImageResource(R.drawable.kennen)
            setCounter7.setImageResource(R.drawable.swain)
            setCounter8.setImageResource(R.drawable.corki)
            setCounter9.setImageResource(R.drawable.kayle)
            setCounter10.setImageResource(R.drawable.chogath)
        }
        if (championName == "ChoGath") {
            setCounter1.setImageResource(R.drawable.drmundo)
            setCounter2.setImageResource(R.drawable.quinn)
            setCounter3.setImageResource(R.drawable.udyr)
            setCounter4.setImageResource(R.drawable.vayne)
            setCounter5.setImageResource(R.drawable.tryndamere)
            setCounter6.setImageResource(R.drawable.heimerdinger)
            setCounter7.setImageResource(R.drawable.briar)
            setCounter8.setImageResource(R.drawable.wukong)
            setCounter9.setImageResource(R.drawable.naafiri)
            setCounter10.setImageResource(R.drawable.sylas)
        }
        if (championName == "Corki") {
            setCounter1.setImageResource(R.drawable.gangplank)
            setCounter2.setImageResource(R.drawable.kennen)
            setCounter3.setImageResource(R.drawable.naafiri)
            setCounter4.setImageResource(R.drawable.akshan)
            setCounter5.setImageResource(R.drawable.twistedfate)
            setCounter6.setImageResource(R.drawable.annie)
            setCounter7.setImageResource(R.drawable.swain)
            setCounter8.setImageResource(R.drawable.malzahar)
            setCounter9.setImageResource(R.drawable.yasuo)
            setCounter10.setImageResource(R.drawable.jayce)
        }
        if (championName == "Darius") {
            setCounter1.setImageResource(R.drawable.cassiopeia)
            setCounter2.setImageResource(R.drawable.quinn)
            setCounter3.setImageResource(R.drawable.yorick)
            setCounter4.setImageResource(R.drawable.teemo)
            setCounter5.setImageResource(R.drawable.kayle)
            setCounter6.setImageResource(R.drawable.briar)
            setCounter7.setImageResource(R.drawable.udyr)
            setCounter8.setImageResource(R.drawable.akali)
            setCounter9.setImageResource(R.drawable.shen)
            setCounter10.setImageResource(R.drawable.rengar)
        }
        if (championName == "Diana") {
            setCounter1.setImageResource(R.drawable.volibear)
            setCounter2.setImageResource(R.drawable.xinzhao)
            setCounter3.setImageResource(R.drawable.skarner)
            setCounter4.setImageResource(R.drawable.trundle)
            setCounter5.setImageResource(R.drawable.masteryi)
            setCounter6.setImageResource(R.drawable.naafiri)
            setCounter7.setImageResource(R.drawable.wukong)
            setCounter8.setImageResource(R.drawable.gragas)
            setCounter9.setImageResource(R.drawable.maokai)
            setCounter10.setImageResource(R.drawable.briar)
        }
        if (championName == "DrMundo") {
            setCounter1.setImageResource(R.drawable.naafiri)
            setCounter2.setImageResource(R.drawable.gwen)
            setCounter3.setImageResource(R.drawable.vladimir)
            setCounter4.setImageResource(R.drawable.cassiopeia)
            setCounter5.setImageResource(R.drawable.trundle)
            setCounter6.setImageResource(R.drawable.heimerdinger)
            setCounter7.setImageResource(R.drawable.briar)
            setCounter8.setImageResource(R.drawable.yasuo)
            setCounter9.setImageResource(R.drawable.tahmkench)
            setCounter10.setImageResource(R.drawable.chogath)
        }
        if (championName == "Draven") {
            setCounter1.setImageResource(R.drawable.swain)
            setCounter2.setImageResource(R.drawable.ziggs)
            setCounter3.setImageResource(R.drawable.kalista)
            setCounter4.setImageResource(R.drawable.seraphine)
            setCounter5.setImageResource(R.drawable.yasuo)
            setCounter6.setImageResource(R.drawable.karthus)
            setCounter7.setImageResource(R.drawable.varus)
            setCounter8.setImageResource(R.drawable.zeri)
            setCounter9.setImageResource(R.drawable.aphelios)
            setCounter10.setImageResource(R.drawable.jinx)
        }
        if (championName == "Ekko") {
            setCounter1.setImageResource(R.drawable.ivern)
            setCounter2.setImageResource(R.drawable.evelynn)
            setCounter3.setImageResource(R.drawable.elise)
            setCounter4.setImageResource(R.drawable.rammus)
            setCounter5.setImageResource(R.drawable.reksai)
            setCounter6.setImageResource(R.drawable.naafiri)
            setCounter7.setImageResource(R.drawable.briar)
            setCounter8.setImageResource(R.drawable.sejuani)
            setCounter9.setImageResource(R.drawable.wukong)
            setCounter10.setImageResource(R.drawable.xinzhao)
        }
        if (championName == "Elise") {
            setCounter1.setImageResource(R.drawable.fiddlesticks)
            setCounter2.setImageResource(R.drawable.vi)
            setCounter3.setImageResource(R.drawable.ivern)
            setCounter4.setImageResource(R.drawable.udyr)
            setCounter5.setImageResource(R.drawable.diana)
            setCounter6.setImageResource(R.drawable.naafiri)
            setCounter7.setImageResource(R.drawable.warwick)
            setCounter8.setImageResource(R.drawable.gwen)
            setCounter9.setImageResource(R.drawable.briar)
            setCounter10.setImageResource(R.drawable.wukong)
        }
        if (championName == "Evelynn") {
            setCounter1.setImageResource(R.drawable.rammus)
            setCounter2.setImageResource(R.drawable.reksai)
            setCounter3.setImageResource(R.drawable.maokai)
            setCounter4.setImageResource(R.drawable.shaco)
            setCounter5.setImageResource(R.drawable.talon)
            setCounter6.setImageResource(R.drawable.wukong)
            setCounter7.setImageResource(R.drawable.shyvana)
            setCounter8.setImageResource(R.drawable.trundle)
            setCounter9.setImageResource(R.drawable.briar)
            setCounter10.setImageResource(R.drawable.gwen)
        }
        if (championName == "Ezreal") {
            setCounter1.setImageResource(R.drawable.karthus)
            setCounter2.setImageResource(R.drawable.swain)
            setCounter3.setImageResource(R.drawable.yasuo)
            setCounter4.setImageResource(R.drawable.kogmaw)
            setCounter5.setImageResource(R.drawable.ziggs)
            setCounter6.setImageResource(R.drawable.jinx)
            setCounter7.setImageResource(R.drawable.aphelios)
            setCounter8.setImageResource(R.drawable.draven)
            setCounter9.setImageResource(R.drawable.samira)
            setCounter10.setImageResource(R.drawable.xayah)
        }
        if (championName == "Fiddlesticks") {
            setCounter1.setImageResource(R.drawable.volibear)
            setCounter2.setImageResource(R.drawable.udyr)
            setCounter3.setImageResource(R.drawable.rengar)
            setCounter4.setImageResource(R.drawable.xinzhao)
            setCounter5.setImageResource(R.drawable.talon)
            setCounter6.setImageResource(R.drawable.naafiri)
            setCounter7.setImageResource(R.drawable.trundle)
            setCounter8.setImageResource(R.drawable.skarner)
            setCounter9.setImageResource(R.drawable.elise)
            setCounter10.setImageResource(R.drawable.ivern)
        }
        if (championName == "Fiora") {
            setCounter1.setImageResource(R.drawable.warwick)
            setCounter2.setImageResource(R.drawable.vayne)
            setCounter3.setImageResource(R.drawable.poppy)
            setCounter4.setImageResource(R.drawable.kayle)
            setCounter5.setImageResource(R.drawable.heimerdinger)
            setCounter6.setImageResource(R.drawable.briar)
            setCounter7.setImageResource(R.drawable.swain)
            setCounter8.setImageResource(R.drawable.gwen)
            setCounter9.setImageResource(R.drawable.mordekaiser)
            setCounter10.setImageResource(R.drawable.ksante)
        }
        if (championName == "Fizz") {
            setCounter1.setImageResource(R.drawable.garen)
            setCounter2.setImageResource(R.drawable.pantheon)
            setCounter3.setImageResource(R.drawable.gragas)
            setCounter4.setImageResource(R.drawable.galio)
            setCounter5.setImageResource(R.drawable.zoe)
            setCounter6.setImageResource(R.drawable.corki)
            setCounter7.setImageResource(R.drawable.swain)
            setCounter8.setImageResource(R.drawable.ziggs)
            setCounter9.setImageResource(R.drawable.aurelionsol)
            setCounter10.setImageResource(R.drawable.cassiopeia)
        }
        if (championName == "Galio") {
            setCounter1.setImageResource(R.drawable.naafiri)
            setCounter2.setImageResource(R.drawable.swain)
            setCounter3.setImageResource(R.drawable.rumble)
            setCounter4.setImageResource(R.drawable.neeko)
            setCounter5.setImageResource(R.drawable.tristana)
            setCounter6.setImageResource(R.drawable.lissandra)
            setCounter7.setImageResource(R.drawable.katarina)
            setCounter8.setImageResource(R.drawable.fizz)
            setCounter9.setImageResource(R.drawable.vladimir)
            setCounter10.setImageResource(R.drawable.annie)
        }
        if (championName == "Gangplank") {
            setCounter1.setImageResource(R.drawable.akshan)
            setCounter2.setImageResource(R.drawable.quinn)
            setCounter3.setImageResource(R.drawable.kled)
            setCounter4.setImageResource(R.drawable.kayle)
            setCounter5.setImageResource(R.drawable.heimerdinger)
            setCounter6.setImageResource(R.drawable.briar)
            setCounter7.setImageResource(R.drawable.cassiopeia)
            setCounter8.setImageResource(R.drawable.teemo)
            setCounter9.setImageResource(R.drawable.akali)
            setCounter10.setImageResource(R.drawable.singed)
        }
        if (championName == "Garen") {
            setCounter1.setImageResource(R.drawable.camille)
            setCounter2.setImageResource(R.drawable.quinn)
            setCounter3.setImageResource(R.drawable.kayle)
            setCounter4.setImageResource(R.drawable.vayne)
            setCounter5.setImageResource(R.drawable.cassiopeia)
            setCounter6.setImageResource(R.drawable.briar)
            setCounter7.setImageResource(R.drawable.gragas)
            setCounter8.setImageResource(R.drawable.jayce)
            setCounter9.setImageResource(R.drawable.irelia)
            setCounter10.setImageResource(R.drawable.ksante)
        }
        if (championName == "Gnar") {
            setCounter1.setImageResource(R.drawable.naafiri)
            setCounter2.setImageResource(R.drawable.urgot)
            setCounter3.setImageResource(R.drawable.malphite)
            setCounter4.setImageResource(R.drawable.maokai)
            setCounter5.setImageResource(R.drawable.rumble)
            setCounter6.setImageResource(R.drawable.briar)
            setCounter7.setImageResource(R.drawable.heimerdinger)
            setCounter8.setImageResource(R.drawable.udyr)
            setCounter9.setImageResource(R.drawable.wukong)
            setCounter10.setImageResource(R.drawable.kennen)
        }
        if (championName == "Gragas") {
            setCounter1.setImageResource(R.drawable.talon)
            setCounter2.setImageResource(R.drawable.reksai)
            setCounter3.setImageResource(R.drawable.diana)
            setCounter4.setImageResource(R.drawable.udyr)
            setCounter5.setImageResource(R.drawable.evelynn)
            setCounter6.setImageResource(R.drawable.naafiri)
            setCounter7.setImageResource(R.drawable.gwen)
            setCounter8.setImageResource(R.drawable.briar)
            setCounter9.setImageResource(R.drawable.warwick)
            setCounter10.setImageResource(R.drawable.hecarim)
        }
        if (championName == "Graves") {
            setCounter1.setImageResource(R.drawable.ivern)
            setCounter2.setImageResource(R.drawable.fiddlesticks)
            setCounter3.setImageResource(R.drawable.reksai)
            setCounter4.setImageResource(R.drawable.nidalee)
            setCounter5.setImageResource(R.drawable.trundle)
            setCounter6.setImageResource(R.drawable.briar)
            setCounter7.setImageResource(R.drawable.naafiri)
            setCounter8.setImageResource(R.drawable.gwen)
            setCounter9.setImageResource(R.drawable.wukong)
            setCounter10.setImageResource(R.drawable.vi)
        }
        if (championName == "Gwen") {
            setCounter1.setImageResource(R.drawable.kayle)
            setCounter2.setImageResource(R.drawable.heimerdinger)
            setCounter3.setImageResource(R.drawable.quinn)
            setCounter4.setImageResource(R.drawable.fiora)
            setCounter5.setImageResource(R.drawable.tryndamere)
            setCounter6.setImageResource(R.drawable.vladimir)
            setCounter7.setImageResource(R.drawable.drmundo)
            setCounter8.setImageResource(R.drawable.briar)
            setCounter9.setImageResource(R.drawable.sylas)
            setCounter10.setImageResource(R.drawable.swain)
        }
        if (championName == "Hecarim") {
            setCounter1.setImageResource(R.drawable.warwick)
            setCounter2.setImageResource(R.drawable.reksai)
            setCounter3.setImageResource(R.drawable.rammus)
            setCounter4.setImageResource(R.drawable.sylas)
            setCounter5.setImageResource(R.drawable.xinzhao)
            setCounter6.setImageResource(R.drawable.naafiri)
            setCounter7.setImageResource(R.drawable.briar)
            setCounter8.setImageResource(R.drawable.talon)
            setCounter9.setImageResource(R.drawable.gwen)
            setCounter10.setImageResource(R.drawable.poppy)
        }
        if (championName == "Heimerdinger") {
            setCounter1.setImageResource(R.drawable.taric)
            setCounter2.setImageResource(R.drawable.seraphine)
            setCounter3.setImageResource(R.drawable.rakan)
            setCounter4.setImageResource(R.drawable.rell)
            setCounter5.setImageResource(R.drawable.brand)
            setCounter6.setImageResource(R.drawable.twitch)
            setCounter7.setImageResource(R.drawable.renataglasc)
            setCounter8.setImageResource(R.drawable.lulu)
            setCounter9.setImageResource(R.drawable.zilean)
            setCounter10.setImageResource(R.drawable.pantheon)
        }
        if (championName == "Illaoi") {
            setCounter1.setImageResource(R.drawable.swain)
            setCounter2.setImageResource(R.drawable.teemo)
            setCounter3.setImageResource(R.drawable.kayle)
            setCounter4.setImageResource(R.drawable.mordekaiser)
            setCounter5.setImageResource(R.drawable.akshan)
            setCounter6.setImageResource(R.drawable.briar)
            setCounter7.setImageResource(R.drawable.sylas)
            setCounter8.setImageResource(R.drawable.renekton)
            setCounter9.setImageResource(R.drawable.trundle)
            setCounter10.setImageResource(R.drawable.akali)
        }
        if (championName == "Irelia") {
            setCounter1.setImageResource(R.drawable.rengar)
            setCounter2.setImageResource(R.drawable.garen)
            setCounter3.setImageResource(R.drawable.poppy)
            setCounter4.setImageResource(R.drawable.tryndamere)
            setCounter5.setImageResource(R.drawable.olaf)
            setCounter6.setImageResource(R.drawable.briar)
            setCounter7.setImageResource(R.drawable.yorick)
            setCounter8.setImageResource(R.drawable.cassiopeia)
            setCounter9.setImageResource(R.drawable.kennen)
            setCounter10.setImageResource(R.drawable.gnar)
        }
        if (championName == "Ivern") {
            setCounter1.setImageResource(R.drawable.fiddlesticks)
            setCounter2.setImageResource(R.drawable.skarner)
            setCounter3.setImageResource(R.drawable.nidalee)
            setCounter4.setImageResource(R.drawable.taliyah)
            setCounter5.setImageResource(R.drawable.belveth)
            setCounter6.setImageResource(R.drawable.amumu)
            setCounter7.setImageResource(R.drawable.sylas)
            setCounter8.setImageResource(R.drawable.rammus)
            setCounter9.setImageResource(R.drawable.wukong)
            setCounter10.setImageResource(R.drawable.udyr)
        }
        if (championName == "Janna") {
            setCounter1.setImageResource(R.drawable.amumu)
            setCounter2.setImageResource(R.drawable.fiddlesticks)
            setCounter3.setImageResource(R.drawable.neeko)
            setCounter4.setImageResource(R.drawable.renataglasc)
            setCounter5.setImageResource(R.drawable.senna)
            setCounter6.setImageResource(R.drawable.shaco)
            setCounter7.setImageResource(R.drawable.swain)
            setCounter8.setImageResource(R.drawable.poppy)
            setCounter9.setImageResource(R.drawable.zac)
            setCounter10.setImageResource(R.drawable.pantheon)
        }
        if (championName == "JarvanIV") {
            setCounter1.setImageResource(R.drawable.masteryi)
            setCounter2.setImageResource(R.drawable.karthus)
            setCounter3.setImageResource(R.drawable.reksai)
            setCounter4.setImageResource(R.drawable.fiddlesticks)
            setCounter5.setImageResource(R.drawable.poppy)
            setCounter6.setImageResource(R.drawable.briar)
            setCounter7.setImageResource(R.drawable.naafiri)
            setCounter8.setImageResource(R.drawable.volibear)
            setCounter9.setImageResource(R.drawable.rammus)
            setCounter10.setImageResource(R.drawable.maokai)
        }
        if (championName == "Jax") {
            setCounter1.setImageResource(R.drawable.cassiopeia)
            setCounter2.setImageResource(R.drawable.quinn)
            setCounter3.setImageResource(R.drawable.urgot)
            setCounter4.setImageResource(R.drawable.singed)
            setCounter5.setImageResource(R.drawable.zac)
            setCounter6.setImageResource(R.drawable.briar)
            setCounter7.setImageResource(R.drawable.trundle)
            setCounter8.setImageResource(R.drawable.irelia)
            setCounter9.setImageResource(R.drawable.gragas)
            setCounter10.setImageResource(R.drawable.gwen)
        }
        if (championName == "Jayce") {
            setCounter1.setImageResource(R.drawable.quinn)
            setCounter2.setImageResource(R.drawable.tahmkench)
            setCounter3.setImageResource(R.drawable.garen)
            setCounter4.setImageResource(R.drawable.nasus)
            setCounter5.setImageResource(R.drawable.urgot)
            setCounter6.setImageResource(R.drawable.briar)
            setCounter7.setImageResource(R.drawable.heimerdinger)
            setCounter8.setImageResource(R.drawable.singed)
            setCounter9.setImageResource(R.drawable.trundle)
            setCounter10.setImageResource(R.drawable.sylas)
        }
        if (championName == "Jhin") {
            setCounter1.setImageResource(R.drawable.karthus)
            setCounter2.setImageResource(R.drawable.vayne)
            setCounter3.setImageResource(R.drawable.seraphine)
            setCounter4.setImageResource(R.drawable.swain)
            setCounter5.setImageResource(R.drawable.kalista)
            setCounter6.setImageResource(R.drawable.veigar)
            setCounter7.setImageResource(R.drawable.kogmaw)
            setCounter8.setImageResource(R.drawable.varus)
            setCounter9.setImageResource(R.drawable.draven)
            setCounter10.setImageResource(R.drawable.missfortune)
        }
        if (championName == "Jinx") {
            setCounter1.setImageResource(R.drawable.swain)
            setCounter2.setImageResource(R.drawable.karthus)
            setCounter3.setImageResource(R.drawable.nilah)
            setCounter4.setImageResource(R.drawable.vayne)
            setCounter5.setImageResource(R.drawable.veigar)
            setCounter6.setImageResource(R.drawable.zeri)
            setCounter7.setImageResource(R.drawable.aphelios)
            setCounter8.setImageResource(R.drawable.tristana)
            setCounter9.setImageResource(R.drawable.varus)
        }
        if (championName == "KaiSa") {
            setCounter1.setImageResource(R.drawable.seraphine)
            setCounter2.setImageResource(R.drawable.swain)
            setCounter3.setImageResource(R.drawable.karthus)
            setCounter4.setImageResource(R.drawable.nilah)
            setCounter5.setImageResource(R.drawable.ashe)
            setCounter6.setImageResource(R.drawable.tristana)
            setCounter7.setImageResource(R.drawable.jinx)
            setCounter8.setImageResource(R.drawable.aphelios)
            setCounter9.setImageResource(R.drawable.varus)
            setCounter10.setImageResource(R.drawable.ziggs)
        }
        if (championName == "Kalista") {
            setCounter1.setImageResource(R.drawable.swain)
            setCounter2.setImageResource(R.drawable.ziggs)
            setCounter3.setImageResource(R.drawable.seraphine)
            setCounter4.setImageResource(R.drawable.yasuo)
            setCounter5.setImageResource(R.drawable.vayne)
            setCounter6.setImageResource(R.drawable.varus)
            setCounter7.setImageResource(R.drawable.draven)
            setCounter8.setImageResource(R.drawable.xayah)
            setCounter9.setImageResource(R.drawable.aphelios)
            setCounter10.setImageResource(R.drawable.sivir)
        }
        if (championName == "Karma") {
            setCounter1.setImageResource(R.drawable.amumu)
            setCounter2.setImageResource(R.drawable.poppy)
            setCounter3.setImageResource(R.drawable.tahmkench)
            setCounter4.setImageResource(R.drawable.blitzcrank)
            setCounter5.setImageResource(R.drawable.fiddlesticks)
            setCounter6.setImageResource(R.drawable.seraphine)
            setCounter7.setImageResource(R.drawable.neeko)
            setCounter8.setImageResource(R.drawable.zac)
            setCounter9.setImageResource(R.drawable.heimerdinger)
            setCounter10.setImageResource(R.drawable.morgana)
        }
        if (championName == "Karthus") {
            setCounter1.setImageResource(R.drawable.udyr)
            setCounter2.setImageResource(R.drawable.ivern)
            setCounter3.setImageResource(R.drawable.wukong)
            setCounter4.setImageResource(R.drawable.talon)
            setCounter5.setImageResource(R.drawable.shyvana)
            setCounter6.setImageResource(R.drawable.amumu)
            setCounter7.setImageResource(R.drawable.naafiri)
            setCounter8.setImageResource(R.drawable.briar)
            setCounter9.setImageResource(R.drawable.kindred)
            setCounter10.setImageResource(R.drawable.poppy)
        }
        if (championName == "Kassadin") {
            setCounter1.setImageResource(R.drawable.swain)
            setCounter2.setImageResource(R.drawable.singed)
            setCounter3.setImageResource(R.drawable.tryndamere)
            setCounter4.setImageResource(R.drawable.pantheon)
            setCounter5.setImageResource(R.drawable.rumble)
            setCounter6.setImageResource(R.drawable.ziggs)
            setCounter7.setImageResource(R.drawable.malphite)
            setCounter8.setImageResource(R.drawable.katarina)
            setCounter9.setImageResource(R.drawable.taliyah)
            setCounter10.setImageResource(R.drawable.velkoz)
        }
        if (championName == "Ksante") {
            setCounter1.setImageResource(R.drawable.akshan)
            setCounter2.setImageResource(R.drawable.sett)
            setCounter3.setImageResource(R.drawable.kayle)
            setCounter4.setImageResource(R.drawable.naafiri)
            setCounter5.setImageResource(R.drawable.heimerdinger)
            setCounter6.setImageResource(R.drawable.briar)
            setCounter7.setImageResource(R.drawable.zac)
            setCounter8.setImageResource(R.drawable.vladimir)
            setCounter9.setImageResource(R.drawable.sylas)
            setCounter10.setImageResource(R.drawable.teemo)
        }
        if (championName == "Katarina") {
            setCounter1.setImageResource(R.drawable.singed)
            setCounter2.setImageResource(R.drawable.renekton)
            setCounter3.setImageResource(R.drawable.garen)
            setCounter4.setImageResource(R.drawable.tryndamere)
            setCounter5.setImageResource(R.drawable.galio)
            setCounter6.setImageResource(R.drawable.ziggs)
            setCounter7.setImageResource(R.drawable.syndra)
            setCounter8.setImageResource(R.drawable.velkoz)
            setCounter9.setImageResource(R.drawable.aurelionsol)
            setCounter10.setImageResource(R.drawable.taliyah)
        }
        if (championName == "Kayle") {
            setCounter1.setImageResource(R.drawable.maokai)
            setCounter2.setImageResource(R.drawable.rengar)
            setCounter3.setImageResource(R.drawable.cassiopeia)
            setCounter4.setImageResource(R.drawable.tryndamere)
            setCounter5.setImageResource(R.drawable.udyr)
            setCounter6.setImageResource(R.drawable.gwen)
            setCounter7.setImageResource(R.drawable.ksante)
            setCounter8.setImageResource(R.drawable.heimerdinger)
            setCounter9.setImageResource(R.drawable.singed)
            setCounter10.setImageResource(R.drawable.gangplank)
        }
        if (championName == "Kayn") {
            setCounter1.setImageResource(R.drawable.fiddlesticks)
            setCounter2.setImageResource(R.drawable.wukong)
            setCounter3.setImageResource(R.drawable.reksai)
            setCounter4.setImageResource(R.drawable.ekko)
            setCounter5.setImageResource(R.drawable.lillia)
            setCounter6.setImageResource(R.drawable.naafiri)
            setCounter7.setImageResource(R.drawable.briar)
            setCounter8.setImageResource(R.drawable.gragas)
            setCounter9.setImageResource(R.drawable.zac)
            setCounter10.setImageResource(R.drawable.leesin)
        }
        if (championName == "Kennen") {
            setCounter1.setImageResource(R.drawable.wukong)
            setCounter2.setImageResource(R.drawable.nasus)
            setCounter3.setImageResource(R.drawable.tahmkench)
            setCounter4.setImageResource(R.drawable.yorick)
            setCounter5.setImageResource(R.drawable.quinn)
            setCounter6.setImageResource(R.drawable.swain)
            setCounter7.setImageResource(R.drawable.heimerdinger)
            setCounter8.setImageResource(R.drawable.rumble)
            setCounter9.setImageResource(R.drawable.warwick)
            setCounter10.setImageResource(R.drawable.vladimir)
        }
        if (championName == "KhaZix") {
            setCounter1.setImageResource(R.drawable.skarner)
            setCounter2.setImageResource(R.drawable.fiddlesticks)
            setCounter3.setImageResource(R.drawable.zac)
            setCounter4.setImageResource(R.drawable.reksai)
            setCounter5.setImageResource(R.drawable.maokai)
            setCounter6.setImageResource(R.drawable.naafiri)
            setCounter7.setImageResource(R.drawable.briar)
            setCounter8.setImageResource(R.drawable.gwen)
            setCounter9.setImageResource(R.drawable.wukong)
            setCounter10.setImageResource(R.drawable.masteryi)
        }
        if (championName == "Kindred") {
            setCounter1.setImageResource(R.drawable.shaco)
            setCounter2.setImageResource(R.drawable.wukong)
            setCounter3.setImageResource(R.drawable.masteryi)
            setCounter4.setImageResource(R.drawable.nidalee)
            setCounter5.setImageResource(R.drawable.fiddlesticks)
            setCounter6.setImageResource(R.drawable.warwick)
            setCounter7.setImageResource(R.drawable.vi)
            setCounter8.setImageResource(R.drawable.briar)
            setCounter9.setImageResource(R.drawable.taliyah)
            setCounter10.setImageResource(R.drawable.talon)
        }
        if (championName == "Kled") {
            setCounter1.setImageResource(R.drawable.vayne)
            setCounter2.setImageResource(R.drawable.gragas)
            setCounter3.setImageResource(R.drawable.singed)
            setCounter4.setImageResource(R.drawable.quinn)
            setCounter5.setImageResource(R.drawable.kennen)
            setCounter6.setImageResource(R.drawable.wukong)
            setCounter7.setImageResource(R.drawable.briar)
            setCounter8.setImageResource(R.drawable.akali)
            setCounter9.setImageResource(R.drawable.sylas)
            setCounter10.setImageResource(R.drawable.naafiri)
        }
        if (championName == "KogMaw") {
            setCounter1.setImageResource(R.drawable.seraphine)
            setCounter2.setImageResource(R.drawable.karthus)
            setCounter3.setImageResource(R.drawable.yasuo)
            setCounter4.setImageResource(R.drawable.jhin)
            setCounter5.setImageResource(R.drawable.lucian)
            setCounter6.setImageResource(R.drawable.veigar)
            setCounter7.setImageResource(R.drawable.swain)
            setCounter8.setImageResource(R.drawable.zeri)
            setCounter9.setImageResource(R.drawable.samira)
            setCounter10.setImageResource(R.drawable.tristana)
        }
        if (championName == "LeBlanc") {
            setCounter1.setImageResource(R.drawable.brand)
            setCounter2.setImageResource(R.drawable.akshan)
            setCounter3.setImageResource(R.drawable.naafiri)
            setCounter4.setImageResource(R.drawable.twistedfate)
            setCounter5.setImageResource(R.drawable.rumble)
            setCounter6.setImageResource(R.drawable.velkoz)
            setCounter7.setImageResource(R.drawable.garen)
            setCounter8.setImageResource(R.drawable.azir)
            setCounter9.setImageResource(R.drawable.singed)
            setCounter10.setImageResource(R.drawable.tryndamere)
        }
        if (championName == "LeeSin") {
            setCounter1.setImageResource(R.drawable.reksai)
            setCounter2.setImageResource(R.drawable.skarner)
            setCounter3.setImageResource(R.drawable.poppy)
            setCounter4.setImageResource(R.drawable.nocturne)
            setCounter5.setImageResource(R.drawable.fiddlesticks)
            setCounter6.setImageResource(R.drawable.naafiri)
            setCounter7.setImageResource(R.drawable.briar)
            setCounter8.setImageResource(R.drawable.trundle)
            setCounter9.setImageResource(R.drawable.masteryi)
            setCounter10.setImageResource(R.drawable.amumu)
        }
        if (championName == "Leona") {
            setCounter1.setImageResource(R.drawable.zac)
            setCounter2.setImageResource(R.drawable.maokai)
            setCounter3.setImageResource(R.drawable.taric)
            setCounter4.setImageResource(R.drawable.fiddlesticks)
            setCounter5.setImageResource(R.drawable.neeko)
            setCounter6.setImageResource(R.drawable.lissandra)
            setCounter7.setImageResource(R.drawable.amumu)
            setCounter8.setImageResource(R.drawable.twitch)
            setCounter9.setImageResource(R.drawable.yuumi)
            setCounter10.setImageResource(R.drawable.pantheon)
        }
        if (championName == "Lillia") {
            setCounter1.setImageResource(R.drawable.ivern)
            setCounter2.setImageResource(R.drawable.evelynn)
            setCounter3.setImageResource(R.drawable.reksai)
            setCounter4.setImageResource(R.drawable.fiddlesticks)
            setCounter5.setImageResource(R.drawable.rengar)
            setCounter6.setImageResource(R.drawable.sejuani)
            setCounter7.setImageResource(R.drawable.trundle)
            setCounter8.setImageResource(R.drawable.naafiri)
            setCounter9.setImageResource(R.drawable.rammus)
            setCounter10.setImageResource(R.drawable.poppy)
        }
        if (championName == "Lissandra") {
            setCounter1.setImageResource(R.drawable.renekton)
            setCounter2.setImageResource(R.drawable.tryndamere)
            setCounter3.setImageResource(R.drawable.galio)
            setCounter4.setImageResource(R.drawable.kayle)
            setCounter5.setImageResource(R.drawable.garen)
            setCounter6.setImageResource(R.drawable.malphite)
            setCounter7.setImageResource(R.drawable.corki)
            setCounter8.setImageResource(R.drawable.yasuo)
            setCounter9.setImageResource(R.drawable.rumble)
            setCounter10.setImageResource(R.drawable.gragas)
        }
        if (championName == "Lucian") {
            setCounter1.setImageResource(R.drawable.veigar)
            setCounter2.setImageResource(R.drawable.seraphine)
            setCounter3.setImageResource(R.drawable.yasuo)
            setCounter4.setImageResource(R.drawable.karthus)
            setCounter5.setImageResource(R.drawable.ashe)
            setCounter6.setImageResource(R.drawable.kogmaw)
            setCounter7.setImageResource(R.drawable.aphelios)
            setCounter8.setImageResource(R.drawable.zeri)
            setCounter9.setImageResource(R.drawable.jinx)
            setCounter10.setImageResource(R.drawable.tristana)
        }
        if (championName == "Lulu") {
            setCounter1.setImageResource(R.drawable.heimerdinger)
            setCounter2.setImageResource(R.drawable.neeko)
            setCounter3.setImageResource(R.drawable.zac)
            setCounter4.setImageResource(R.drawable.senna)
            setCounter5.setImageResource(R.drawable.blitzcrank)
            setCounter6.setImageResource(R.drawable.lissandra)
            setCounter7.setImageResource(R.drawable.shaco)
            setCounter8.setImageResource(R.drawable.morgana)
            setCounter9.setImageResource(R.drawable.pantheon)
            setCounter10.setImageResource(R.drawable.brand)
        }
        if (championName == "Lux") {
            setCounter1.setImageResource(R.drawable.amumu)
            setCounter2.setImageResource(R.drawable.zac)
            setCounter3.setImageResource(R.drawable.blitzcrank)
            setCounter4.setImageResource(R.drawable.zilean)
            setCounter5.setImageResource(R.drawable.pantheon)
            setCounter6.setImageResource(R.drawable.swain)
            setCounter7.setImageResource(R.drawable.yuumi)
            setCounter8.setImageResource(R.drawable.morgana)
            setCounter9.setImageResource(R.drawable.alistar)
            setCounter10.setImageResource(R.drawable.brand)
        }
        if (championName == "Malphite") {
            setCounter1.setImageResource(R.drawable.heimerdinger)
            setCounter2.setImageResource(R.drawable.maokai)
            setCounter3.setImageResource(R.drawable.drmundo)
            setCounter4.setImageResource(R.drawable.udyr)
            setCounter5.setImageResource(R.drawable.sion)
            setCounter6.setImageResource(R.drawable.briar)
            setCounter7.setImageResource(R.drawable.vayne)
            setCounter8.setImageResource(R.drawable.gnar)
            setCounter9.setImageResource(R.drawable.tryndamere)
            setCounter10.setImageResource(R.drawable.naafiri)
        }
        if (championName == "Malzahar") {
            setCounter1.setImageResource(R.drawable.rumble)
            setCounter2.setImageResource(R.drawable.tryndamere)
            setCounter3.setImageResource(R.drawable.singed)
            setCounter4.setImageResource(R.drawable.annie)
            setCounter5.setImageResource(R.drawable.talon)
            setCounter6.setImageResource(R.drawable.yasuo)
            setCounter7.setImageResource(R.drawable.malphite)
            setCounter8.setImageResource(R.drawable.vladimir)
            setCounter9.setImageResource(R.drawable.cassiopeia)
            setCounter10.setImageResource(R.drawable.ryze)
        }
        if (championName == "Maokai") {
            setCounter1.setImageResource(R.drawable.trundle)
            setCounter2.setImageResource(R.drawable.reksai)
            setCounter3.setImageResource(R.drawable.diana)
            setCounter4.setImageResource(R.drawable.rammus)
            setCounter5.setImageResource(R.drawable.jarvaniv)
            setCounter6.setImageResource(R.drawable.naafiri)
            setCounter7.setImageResource(R.drawable.vi)
            setCounter8.setImageResource(R.drawable.shyvana)
            setCounter9.setImageResource(R.drawable.volibear)
            setCounter10.setImageResource(R.drawable.skarner)
        }
        if (championName == "MasterYi") {
            setCounter1.setImageResource(R.drawable.reksai)
            setCounter2.setImageResource(R.drawable.skarner)
            setCounter3.setImageResource(R.drawable.shaco)
            setCounter4.setImageResource(R.drawable.ivern)
            setCounter5.setImageResource(R.drawable.evelynn)
            setCounter6.setImageResource(R.drawable.naafiri)
            setCounter7.setImageResource(R.drawable.briar)
            setCounter8.setImageResource(R.drawable.gwen)
            setCounter9.setImageResource(R.drawable.kindred)
            setCounter10.setImageResource(R.drawable.rengar)
        }
        if (championName == "MissFortune") {
            setCounter1.setImageResource(R.drawable.swain)
            setCounter2.setImageResource(R.drawable.seraphine)
            setCounter3.setImageResource(R.drawable.yasuo)
            setCounter4.setImageResource(R.drawable.ziggs)
            setCounter5.setImageResource(R.drawable.karthus)
            setCounter6.setImageResource(R.drawable.xayah)
            setCounter7.setImageResource(R.drawable.varus)
            setCounter8.setImageResource(R.drawable.samira)
            setCounter9.setImageResource(R.drawable.aphelios)
            setCounter10.setImageResource(R.drawable.jinx)
        }
        if (championName == "Mordekaiser") {
            setCounter1.setImageResource(R.drawable.rengar)
            setCounter2.setImageResource(R.drawable.singed)
            setCounter3.setImageResource(R.drawable.zed)
            setCounter4.setImageResource(R.drawable.heimerdinger)
            setCounter5.setImageResource(R.drawable.sylas)
            setCounter6.setImageResource(R.drawable.briar)
            setCounter7.setImageResource(R.drawable.teemo)
            setCounter8.setImageResource(R.drawable.wukong)
            setCounter9.setImageResource(R.drawable.sion)
            setCounter10.setImageResource(R.drawable.zac)
        }
        if (championName == "Milio") {
            setCounter1.setImageResource(R.drawable.amumu)
            setCounter2.setImageResource(R.drawable.senna)
            setCounter3.setImageResource(R.drawable.nautilus)
            setCounter4.setImageResource(R.drawable.zilean)
            setCounter5.setImageResource(R.drawable.maokai)
            setCounter6.setImageResource(R.drawable.shaco)
            setCounter7.setImageResource(R.drawable.zac)
            setCounter8.setImageResource(R.drawable.twitch)
            setCounter9.setImageResource(R.drawable.tahmkench)
            setCounter10.setImageResource(R.drawable.lissandra)
        }
        if (championName == "Morgana") {
            setCounter1.setImageResource(R.drawable.poppy)
            setCounter2.setImageResource(R.drawable.fiddlesticks)
            setCounter3.setImageResource(R.drawable.twitch)
            setCounter4.setImageResource(R.drawable.zac)
            setCounter5.setImageResource(R.drawable.sona)
            setCounter6.setImageResource(R.drawable.swain)
            setCounter7.setImageResource(R.drawable.braum)
            setCounter8.setImageResource(R.drawable.amumu)
            setCounter9.setImageResource(R.drawable.velkoz)
            setCounter10.setImageResource(R.drawable.neeko)
        }
        if (championName == "Nami") {
            setCounter1.setImageResource(R.drawable.fiddlesticks)
            setCounter2.setImageResource(R.drawable.zac)
            setCounter3.setImageResource(R.drawable.thresh)
            setCounter4.setImageResource(R.drawable.blitzcrank)
            setCounter5.setImageResource(R.drawable.soraka)
            setCounter6.setImageResource(R.drawable.lissandra)
            setCounter7.setImageResource(R.drawable.poppy)
            setCounter8.setImageResource(R.drawable.pantheon)
            setCounter9.setImageResource(R.drawable.yuumi)
            setCounter10.setImageResource(R.drawable.morgana)
        }
        if (championName == "Nasus") {
            setCounter1.setImageResource(R.drawable.poppy)
            setCounter2.setImageResource(R.drawable.rengar)
            setCounter3.setImageResource(R.drawable.heimerdinger)
            setCounter4.setImageResource(R.drawable.urgot)
            setCounter5.setImageResource(R.drawable.chogath)
            setCounter6.setImageResource(R.drawable.briar)
            setCounter7.setImageResource(R.drawable.kennen)
            setCounter8.setImageResource(R.drawable.jayce)
            setCounter9.setImageResource(R.drawable.udyr)
            setCounter10.setImageResource(R.drawable.akali)
        }
        if (championName == "Nautilus") {
            setCounter1.setImageResource(R.drawable.taric)
            setCounter2.setImageResource(R.drawable.renataglasc)
            setCounter3.setImageResource(R.drawable.rakan)
            setCounter4.setImageResource(R.drawable.rell)
            setCounter5.setImageResource(R.drawable.swain)
            setCounter6.setImageResource(R.drawable.yuumi)
            setCounter7.setImageResource(R.drawable.milio)
            setCounter8.setImageResource(R.drawable.lulu)
            setCounter9.setImageResource(R.drawable.karma)
            setCounter10.setImageResource(R.drawable.nami)
        }
        if (championName == "Neeko") {
            setCounter1.setImageResource(R.drawable.zac)
            setCounter2.setImageResource(R.drawable.twitch)
            setCounter3.setImageResource(R.drawable.bard)
            setCounter4.setImageResource(R.drawable.renataglasc)
            setCounter5.setImageResource(R.drawable.karma)
            setCounter6.setImageResource(R.drawable.tahmkench)
            setCounter7.setImageResource(R.drawable.lulu)
            setCounter8.setImageResource(R.drawable.brand)
            setCounter9.setImageResource(R.drawable.leona)
            setCounter10.setImageResource(R.drawable.pantheon)
        }
        if (championName == "Nidalee") {
            setCounter1.setImageResource(R.drawable.rammus)
            setCounter2.setImageResource(R.drawable.nocturne)
            setCounter3.setImageResource(R.drawable.reksai)
            setCounter4.setImageResource(R.drawable.zac)
            setCounter5.setImageResource(R.drawable.warwick)
            setCounter6.setImageResource(R.drawable.naafiri)
            setCounter7.setImageResource(R.drawable.wukong)
            setCounter8.setImageResource(R.drawable.volibear)
            setCounter9.setImageResource(R.drawable.kindred)
            setCounter10.setImageResource(R.drawable.gwen)
        }
        if (championName == "Nocturne") {
            setCounter1.setImageResource(R.drawable.rammus)
            setCounter2.setImageResource(R.drawable.ivern)
            setCounter3.setImageResource(R.drawable.zac)
            setCounter4.setImageResource(R.drawable.kindred)
            setCounter5.setImageResource(R.drawable.lillia)
            setCounter6.setImageResource(R.drawable.naafiri)
            setCounter7.setImageResource(R.drawable.briar)
            setCounter8.setImageResource(R.drawable.volibear)
            setCounter9.setImageResource(R.drawable.sejuani)
            setCounter10.setImageResource(R.drawable.rengar)
        }
        if (championName == "nunu") {
            setCounter1.setImageResource(R.drawable.skarner)
            setCounter2.setImageResource(R.drawable.poppy)
            setCounter3.setImageResource(R.drawable.reksai)
            setCounter4.setImageResource(R.drawable.fiddlesticks)
            setCounter5.setImageResource(R.drawable.udyr)
            setCounter6.setImageResource(R.drawable.naafiri)
            setCounter7.setImageResource(R.drawable.briar)
            setCounter8.setImageResource(R.drawable.wukong)
            setCounter9.setImageResource(R.drawable.talon)
            setCounter10.setImageResource(R.drawable.xinzhao)
        }
        if (championName == "Olaf") {
            setCounter1.setImageResource(R.drawable.swain)
            setCounter2.setImageResource(R.drawable.vayne)
            setCounter3.setImageResource(R.drawable.akshan)
            setCounter4.setImageResource(R.drawable.wukong)
            setCounter5.setImageResource(R.drawable.pantheon)
            setCounter6.setImageResource(R.drawable.briar)
            setCounter7.setImageResource(R.drawable.cassiopeia)
            setCounter8.setImageResource(R.drawable.yorick)
            setCounter9.setImageResource(R.drawable.vladimir)
            setCounter10.setImageResource(R.drawable.poppy)
        }
        if (championName == "Orianna") {
            setCounter1.setImageResource(R.drawable.velkoz)
            setCounter2.setImageResource(R.drawable.tryndamere)
            setCounter3.setImageResource(R.drawable.garen)
            setCounter4.setImageResource(R.drawable.chogath)
            setCounter5.setImageResource(R.drawable.renekton)
            setCounter6.setImageResource(R.drawable.gangplank)
            setCounter7.setImageResource(R.drawable.malphite)
            setCounter8.setImageResource(R.drawable.corki)
            setCounter9.setImageResource(R.drawable.vladimir)
            setCounter10.setImageResource(R.drawable.gragas)
        }
        if (championName == "Ornn") {
            setCounter1.setImageResource(R.drawable.rengar)
            setCounter2.setImageResource(R.drawable.vladimir)
            setCounter3.setImageResource(R.drawable.vayne)
            setCounter4.setImageResource(R.drawable.heimerdinger)
            setCounter5.setImageResource(R.drawable.kayle)
            setCounter6.setImageResource(R.drawable.briar)
            setCounter7.setImageResource(R.drawable.chogath)
            setCounter8.setImageResource(R.drawable.yorick)
            setCounter9.setImageResource(R.drawable.pantheon)
            setCounter10.setImageResource(R.drawable.kled)
        }
        if (championName == "Pantheon") {
            setCounter1.setImageResource(R.drawable.udyr)
            setCounter2.setImageResource(R.drawable.wukong)
            setCounter3.setImageResource(R.drawable.ornn)
            setCounter4.setImageResource(R.drawable.quinn)
            setCounter5.setImageResource(R.drawable.heimerdinger)
            setCounter6.setImageResource(R.drawable.briar)
            setCounter7.setImageResource(R.drawable.vladimir)
            setCounter8.setImageResource(R.drawable.vayne)
            setCounter9.setImageResource(R.drawable.shen)
            setCounter10.setImageResource(R.drawable.akali)
        }
        if (championName == "Poppy") {
            setCounter1.setImageResource(R.drawable.rammus)
            setCounter2.setImageResource(R.drawable.volibear)
            setCounter3.setImageResource(R.drawable.lillia)
            setCounter4.setImageResource(R.drawable.shyvana)
            setCounter5.setImageResource(R.drawable.reksai)
            setCounter6.setImageResource(R.drawable.naafiri)
            setCounter7.setImageResource(R.drawable.gwen)
            setCounter8.setImageResource(R.drawable.sejuani)
            setCounter9.setImageResource(R.drawable.skarner)
            setCounter10.setImageResource(R.drawable.amumu)
        }
        if (championName == "Pyke") {
            setCounter1.setImageResource(R.drawable.zac)
            setCounter2.setImageResource(R.drawable.poppy)
            setCounter3.setImageResource(R.drawable.maokai)
            setCounter4.setImageResource(R.drawable.taric)
            setCounter5.setImageResource(R.drawable.sona)
            setCounter6.setImageResource(R.drawable.twitch)
            setCounter7.setImageResource(R.drawable.yuumi)
            setCounter8.setImageResource(R.drawable.amumu)
            setCounter9.setImageResource(R.drawable.milio)
            setCounter10.setImageResource(R.drawable.pantheon)
        }
        if (championName == "Qiyana") {
            setCounter1.setImageResource(R.drawable.singed)
            setCounter2.setImageResource(R.drawable.vex)
            setCounter3.setImageResource(R.drawable.garen)
            setCounter4.setImageResource(R.drawable.diana)
            setCounter5.setImageResource(R.drawable.jayce)
            setCounter6.setImageResource(R.drawable.velkoz)
            setCounter7.setImageResource(R.drawable.renekton)
            setCounter8.setImageResource(R.drawable.gragas)
            setCounter9.setImageResource(R.drawable.ryze)
            setCounter10.setImageResource(R.drawable.ekko)
        }
        if (championName == "Quinn") {
            setCounter1.setImageResource(R.drawable.maokai)
            setCounter2.setImageResource(R.drawable.warwick)
            setCounter3.setImageResource(R.drawable.akshan)
            setCounter4.setImageResource(R.drawable.naafiri)
            setCounter5.setImageResource(R.drawable.drmundo)
            setCounter6.setImageResource(R.drawable.sylas)
            setCounter7.setImageResource(R.drawable.jax)
            setCounter8.setImageResource(R.drawable.trundle)
            setCounter9.setImageResource(R.drawable.briar)
            setCounter10.setImageResource(R.drawable.volibear)
        }
        if (championName == "Rakan") {
            setCounter1.setImageResource(R.drawable.senna)
            setCounter2.setImageResource(R.drawable.sona)
            setCounter3.setImageResource(R.drawable.bard)
            setCounter4.setImageResource(R.drawable.taric)
            setCounter5.setImageResource(R.drawable.poppy)
            setCounter6.setImageResource(R.drawable.amumu)
            setCounter7.setImageResource(R.drawable.twitch)
            setCounter8.setImageResource(R.drawable.yuumi)
            setCounter9.setImageResource(R.drawable.heimerdinger)
            setCounter10.setImageResource(R.drawable.pantheon)
        }
        if (championName == "Rammus") {
            setCounter1.setImageResource(R.drawable.ivern)
            setCounter2.setImageResource(R.drawable.zac)
            setCounter3.setImageResource(R.drawable.volibear)
            setCounter4.setImageResource(R.drawable.lillia)
            setCounter5.setImageResource(R.drawable.wukong)
            setCounter6.setImageResource(R.drawable.poppy)
            setCounter7.setImageResource(R.drawable.rengar)
            setCounter8.setImageResource(R.drawable.sejuani)
            setCounter9.setImageResource(R.drawable.naafiri)
            setCounter10.setImageResource(R.drawable.amumu)
        }
        if (championName == "RekSai") {
            setCounter1.setImageResource(R.drawable.ivern)
            setCounter2.setImageResource(R.drawable.trundle)
            setCounter3.setImageResource(R.drawable.karthus)
            setCounter4.setImageResource(R.drawable.zac)
            setCounter5.setImageResource(R.drawable.kindred)
            setCounter6.setImageResource(R.drawable.naafiri)
            setCounter7.setImageResource(R.drawable.briar)
            setCounter8.setImageResource(R.drawable.gwen)
            setCounter9.setImageResource(R.drawable.wukong)
            setCounter10.setImageResource(R.drawable.vi)
        }
        if (championName == "Rell") {
            setCounter1.setImageResource(R.drawable.sona)
            setCounter2.setImageResource(R.drawable.senna)
            setCounter3.setImageResource(R.drawable.alistar)
            setCounter4.setImageResource(R.drawable.twitch)
            setCounter5.setImageResource(R.drawable.renataglasc)
            setCounter6.setImageResource(R.drawable.pantheon)
            setCounter7.setImageResource(R.drawable.yuumi)
            setCounter8.setImageResource(R.drawable.fiddlesticks)
            setCounter9.setImageResource(R.drawable.amumu)
            setCounter10.setImageResource(R.drawable.lissandra)
        }
        if (championName == "Renekton") {
            setCounter1.setImageResource(R.drawable.quinn)
            setCounter2.setImageResource(R.drawable.illaoi)
            setCounter3.setImageResource(R.drawable.vayne)
            setCounter4.setImageResource(R.drawable.maokai)
            setCounter5.setImageResource(R.drawable.ornn)
            setCounter6.setImageResource(R.drawable.briar)
            setCounter7.setImageResource(R.drawable.yasuo)
            setCounter8.setImageResource(R.drawable.yorick)
            setCounter9.setImageResource(R.drawable.akali)
            setCounter10.setImageResource(R.drawable.naafiri)
        }
        if (championName == "Rengar") {
            setCounter1.setImageResource(R.drawable.trundle)
            setCounter2.setImageResource(R.drawable.ivern)
            setCounter3.setImageResource(R.drawable.rammus)
            setCounter4.setImageResource(R.drawable.reksai)
            setCounter5.setImageResource(R.drawable.zac)
            setCounter6.setImageResource(R.drawable.naafiri)
            setCounter7.setImageResource(R.drawable.maokai)
            setCounter8.setImageResource(R.drawable.wukong)
            setCounter9.setImageResource(R.drawable.sylas)
            setCounter10.setImageResource(R.drawable.lillia)
        }
        if (championName == "Riven") {
            setCounter1.setImageResource(R.drawable.cassiopeia)
            setCounter2.setImageResource(R.drawable.poppy)
            setCounter3.setImageResource(R.drawable.quinn)
            setCounter4.setImageResource(R.drawable.vayne)
            setCounter5.setImageResource(R.drawable.kennen)
            setCounter6.setImageResource(R.drawable.briar)
            setCounter7.setImageResource(R.drawable.heimerdinger)
            setCounter8.setImageResource(R.drawable.zed)
            setCounter9.setImageResource(R.drawable.naafiri)
            setCounter10.setImageResource(R.drawable.gwen)
        }
        if (championName == "Rumble") {
            setCounter1.setImageResource(R.drawable.zed)
            setCounter2.setImageResource(R.drawable.gragas)
            setCounter3.setImageResource(R.drawable.naafiri)
            setCounter4.setImageResource(R.drawable.kennen)
            setCounter5.setImageResource(R.drawable.urgot)
            setCounter6.setImageResource(R.drawable.briar)
            setCounter7.setImageResource(R.drawable.tahmkench)
            setCounter8.setImageResource(R.drawable.udyr)
            setCounter9.setImageResource(R.drawable.gnar)
            setCounter10.setImageResource(R.drawable.shen)
        }
        if (championName == "Ryze") {
            setCounter1.setImageResource(R.drawable.rumble)
            setCounter2.setImageResource(R.drawable.aurelionsol)
            setCounter3.setImageResource(R.drawable.annie)
            setCounter4.setImageResource(R.drawable.garen)
            setCounter5.setImageResource(R.drawable.neeko)
            setCounter6.setImageResource(R.drawable.gragas)
            setCounter7.setImageResource(R.drawable.corki)
            setCounter8.setImageResource(R.drawable.twistedfate)
            setCounter9.setImageResource(R.drawable.chogath)
            setCounter10.setImageResource(R.drawable.kennen)
        }
        if (championName == "Samira") {
            setCounter1.setImageResource(R.drawable.veigar)
            setCounter2.setImageResource(R.drawable.swain)
            setCounter3.setImageResource(R.drawable.karthus)
            setCounter4.setImageResource(R.drawable.kogmaw)
            setCounter5.setImageResource(R.drawable.nilah)
            setCounter6.setImageResource(R.drawable.aphelios)
            setCounter7.setImageResource(R.drawable.zeri)
            setCounter8.setImageResource(R.drawable.draven)
            setCounter9.setImageResource(R.drawable.kaisa)
            setCounter10.setImageResource(R.drawable.tristana)
        }
        if (championName == "Sejuani") {
            setCounter1.setImageResource(R.drawable.shyvana)
            setCounter2.setImageResource(R.drawable.lillia)
            setCounter3.setImageResource(R.drawable.udyr)
            setCounter4.setImageResource(R.drawable.rammus)
            setCounter5.setImageResource(R.drawable.poppy)
            setCounter6.setImageResource(R.drawable.naafiri)
            setCounter7.setImageResource(R.drawable.xinzhao)
            setCounter8.setImageResource(R.drawable.warwick)
            setCounter9.setImageResource(R.drawable.briar)
            setCounter10.setImageResource(R.drawable.rengar)
        }
        if (championName == "Senna") {
            setCounter1.setImageResource(R.drawable.zyra)
            setCounter2.setImageResource(R.drawable.twitch)
            setCounter3.setImageResource(R.drawable.amumu)
            setCounter4.setImageResource(R.drawable.blitzcrank)
            setCounter5.setImageResource(R.drawable.fiddlesticks)
            setCounter6.setImageResource(R.drawable.lissandra)
            setCounter7.setImageResource(R.drawable.morgana)
            setCounter8.setImageResource(R.drawable.tahmkench)
            setCounter9.setImageResource(R.drawable.shaco)
            setCounter10.setImageResource(R.drawable.lulu)
        }
        if (championName == "Seraphine") {
            setCounter1.setImageResource(R.drawable.tahmkench)
            setCounter2.setImageResource(R.drawable.amumu)
            setCounter3.setImageResource(R.drawable.maokai)
            setCounter4.setImageResource(R.drawable.bard)
            setCounter5.setImageResource(R.drawable.blitzcrank)
            setCounter6.setImageResource(R.drawable.heimerdinger)
            setCounter7.setImageResource(R.drawable.zac)
            setCounter8.setImageResource(R.drawable.shaco)
            setCounter9.setImageResource(R.drawable.poppy)
            setCounter10.setImageResource(R.drawable.lissandra)
        }
        if (championName == "Sett") {
            setCounter1.setImageResource(R.drawable.singed)
            setCounter2.setImageResource(R.drawable.zac)
            setCounter3.setImageResource(R.drawable.malphite)
            setCounter4.setImageResource(R.drawable.kled)
            setCounter5.setImageResource(R.drawable.sylas)
            setCounter6.setImageResource(R.drawable.briar)
            setCounter7.setImageResource(R.drawable.ksante)
            setCounter8.setImageResource(R.drawable.udyr)
            setCounter9.setImageResource(R.drawable.yasuo)
            setCounter10.setImageResource(R.drawable.rumble)
        }
        if (championName == "Shaco") {
            setCounter1.setImageResource(R.drawable.rammus)
            setCounter2.setImageResource(R.drawable.reksai)
            setCounter3.setImageResource(R.drawable.udyr)
            setCounter4.setImageResource(R.drawable.skarner)
            setCounter5.setImageResource(R.drawable.karthus)
            setCounter6.setImageResource(R.drawable.naafiri)
            setCounter7.setImageResource(R.drawable.kindred)
            setCounter8.setImageResource(R.drawable.gwen)
            setCounter9.setImageResource(R.drawable.briar)
            setCounter10.setImageResource(R.drawable.taliyah)
        }
        if (championName == "Shen") {
            setCounter1.setImageResource(R.drawable.zac)
            setCounter2.setImageResource(R.drawable.vladimir)
            setCounter3.setImageResource(R.drawable.akshan)
            setCounter4.setImageResource(R.drawable.pantheon)
            setCounter5.setImageResource(R.drawable.urgot)
            setCounter6.setImageResource(R.drawable.volibear)
            setCounter7.setImageResource(R.drawable.jayce)
            setCounter8.setImageResource(R.drawable.sylas)
            setCounter9.setImageResource(R.drawable.maokai)
            setCounter10.setImageResource(R.drawable.nasus)
        }
        if (championName == "Shyvana") {
            setCounter1.setImageResource(R.drawable.udyr)
            setCounter2.setImageResource(R.drawable.skarner)
            setCounter3.setImageResource(R.drawable.volibear)
            setCounter4.setImageResource(R.drawable.evelynn)
            setCounter5.setImageResource(R.drawable.taliyah)
            setCounter6.setImageResource(R.drawable.wukong)
            setCounter7.setImageResource(R.drawable.naafiri)
            setCounter8.setImageResource(R.drawable.sejuani)
            setCounter9.setImageResource(R.drawable.warwick)
            setCounter10.setImageResource(R.drawable.poppy)
        }
        if (championName == "Singed") {
            setCounter1.setImageResource(R.drawable.swain)
            setCounter2.setImageResource(R.drawable.heimerdinger)
            setCounter3.setImageResource(R.drawable.vayne)
            setCounter4.setImageResource(R.drawable.kayle)
            setCounter5.setImageResource(R.drawable.akshan)
            setCounter6.setImageResource(R.drawable.briar)
            setCounter7.setImageResource(R.drawable.poppy)
            setCounter8.setImageResource(R.drawable.ksante)
            setCounter9.setImageResource(R.drawable.sylas)
            setCounter10.setImageResource(R.drawable.maokai)
        }
        if (championName == "Sion") {
            setCounter1.setImageResource(R.drawable.quinn)
            setCounter2.setImageResource(R.drawable.udyr)
            setCounter3.setImageResource(R.drawable.gwen)
            setCounter4.setImageResource(R.drawable.chogath)
            setCounter5.setImageResource(R.drawable.singed)
            setCounter6.setImageResource(R.drawable.zed)
            setCounter7.setImageResource(R.drawable.heimerdinger)
            setCounter8.setImageResource(R.drawable.briar)
            setCounter9.setImageResource(R.drawable.akali)
            setCounter10.setImageResource(R.drawable.cassiopeia)
        }
        if (championName == "Sivir") {
            setCounter1.setImageResource(R.drawable.vayne)
            setCounter2.setImageResource(R.drawable.twitch)
            setCounter3.setImageResource(R.drawable.kalista)
            setCounter4.setImageResource(R.drawable.seraphine)
            setCounter5.setImageResource(R.drawable.ashe)
            setCounter6.setImageResource(R.drawable.veigar)
            setCounter7.setImageResource(R.drawable.jinx)
            setCounter8.setImageResource(R.drawable.swain)
            setCounter9.setImageResource(R.drawable.varus)
            setCounter10.setImageResource(R.drawable.caitlyn)
        }
        if (championName == "Skarner") {
            setCounter1.setImageResource(R.drawable.zac)
            setCounter2.setImageResource(R.drawable.poppy)
            setCounter3.setImageResource(R.drawable.fiddlesticks)
            setCounter4.setImageResource(R.drawable.maokai)
            setCounter5.setImageResource(R.drawable.trundle)
            setCounter6.setImageResource(R.drawable.nunuwillump)
            setCounter7.setImageResource(R.drawable.sylas)
            setCounter8.setImageResource(R.drawable.warwick)
            setCounter9.setImageResource(R.drawable.shyvana)
            setCounter10.setImageResource(R.drawable.gwen)
        }
        if (championName == "Sona") {
            setCounter1.setImageResource(R.drawable.poppy)
            setCounter2.setImageResource(R.drawable.amumu)
            setCounter3.setImageResource(R.drawable.zac)
            setCounter4.setImageResource(R.drawable.maokai)
            setCounter5.setImageResource(R.drawable.fiddlesticks)
            setCounter6.setImageResource(R.drawable.velkoz)
            setCounter7.setImageResource(R.drawable.morgana)
            setCounter8.setImageResource(R.drawable.twitch)
            setCounter9.setImageResource(R.drawable.shaco)
            setCounter10.setImageResource(R.drawable.pyke)
        }
        if (championName == "Soraka") {
            setCounter1.setImageResource(R.drawable.heimerdinger)
            setCounter2.setImageResource(R.drawable.blitzcrank)
            setCounter3.setImageResource(R.drawable.taric)
            setCounter4.setImageResource(R.drawable.senna)
            setCounter5.setImageResource(R.drawable.neeko)
            setCounter6.setImageResource(R.drawable.shaco)
            setCounter7.setImageResource(R.drawable.lissandra)
            setCounter8.setImageResource(R.drawable.pantheon)
            setCounter9.setImageResource(R.drawable.twitch)
            setCounter10.setImageResource(R.drawable.amumu)
        }
        if (championName == "Swain") {
            setCounter1.setImageResource(R.drawable.tahmkench)
            setCounter2.setImageResource(R.drawable.janna)
            setCounter3.setImageResource(R.drawable.renataglasc)
            setCounter4.setImageResource(R.drawable.zilean)
            setCounter5.setImageResource(R.drawable.zyra)
            setCounter6.setImageResource(R.drawable.amumu)
            setCounter7.setImageResource(R.drawable.lissandra)
            setCounter8.setImageResource(R.drawable.alistar)
            setCounter9.setImageResource(R.drawable.zac)
            setCounter10.setImageResource(R.drawable.nautilus)
        }
        if (championName == "Sylas") {
            setCounter1.setImageResource(R.drawable.garen)
            setCounter2.setImageResource(R.drawable.cassiopeia)
            setCounter3.setImageResource(R.drawable.malzahar)
            setCounter4.setImageResource(R.drawable.taliyah)
            setCounter5.setImageResource(R.drawable.pantheon)
            setCounter6.setImageResource(R.drawable.malphite)
            setCounter7.setImageResource(R.drawable.leblanc)
            setCounter8.setImageResource(R.drawable.ziggs)
            setCounter9.setImageResource(R.drawable.irelia)
            setCounter10.setImageResource(R.drawable.vladimir)
        }
        if (championName == "Syndra") {
            setCounter1.setImageResource(R.drawable.singed)
            setCounter2.setImageResource(R.drawable.katarina)
            setCounter3.setImageResource(R.drawable.tryndamere)
            setCounter4.setImageResource(R.drawable.akshan)
            setCounter5.setImageResource(R.drawable.rumble)
            setCounter6.setImageResource(R.drawable.corki)
            setCounter7.setImageResource(R.drawable.jayce)
            setCounter8.setImageResource(R.drawable.brand)
            setCounter9.setImageResource(R.drawable.kayle)
            setCounter10.setImageResource(R.drawable.galio)
        }
        if (championName == "TahmKench") {
            setCounter1.setImageResource(R.drawable.udyr)
            setCounter2.setImageResource(R.drawable.warwick)
            setCounter3.setImageResource(R.drawable.akshan)
            setCounter4.setImageResource(R.drawable.drmundo)
            setCounter5.setImageResource(R.drawable.naafiri)
            setCounter6.setImageResource(R.drawable.maokai)
            setCounter7.setImageResource(R.drawable.briar)
            setCounter8.setImageResource(R.drawable.zed)
            setCounter9.setImageResource(R.drawable.jayce)
            setCounter10.setImageResource(R.drawable.kennen)
        }
        if (championName == "Taliyah") {
            setCounter1.setImageResource(R.drawable.trundle)
            setCounter2.setImageResource(R.drawable.shaco)
            setCounter3.setImageResource(R.drawable.reksai)
            setCounter4.setImageResource(R.drawable.udyr)
            setCounter5.setImageResource(R.drawable.kindred)
            setCounter6.setImageResource(R.drawable.naafiri)
            setCounter7.setImageResource(R.drawable.briar)
            setCounter8.setImageResource(R.drawable.shyvana)
            setCounter9.setImageResource(R.drawable.rammus)
            setCounter10.setImageResource(R.drawable.gwen)
        }
        if (championName == "Talon") {
            setCounter1.setImageResource(R.drawable.swain)
            setCounter2.setImageResource(R.drawable.rumble)
            setCounter3.setImageResource(R.drawable.akshan)
            setCounter4.setImageResource(R.drawable.renekton)
            setCounter5.setImageResource(R.drawable.chogath)
            setCounter6.setImageResource(R.drawable.corki)
            setCounter7.setImageResource(R.drawable.malzahar)
            setCounter8.setImageResource(R.drawable.xerath)
            setCounter9.setImageResource(R.drawable.aurelionsol)
            setCounter10.setImageResource(R.drawable.jayce)
        }
        if (championName == "Taric") {
            setCounter1.setImageResource(R.drawable.senna)
            setCounter2.setImageResource(R.drawable.janna)
            setCounter3.setImageResource(R.drawable.velkoz)
            setCounter4.setImageResource(R.drawable.neeko)
            setCounter5.setImageResource(R.drawable.swain)
            setCounter6.setImageResource(R.drawable.twitch)
            setCounter7.setImageResource(R.drawable.poppy)
            setCounter8.setImageResource(R.drawable.yuumi)
            setCounter9.setImageResource(R.drawable.shaco)
            setCounter10.setImageResource(R.drawable.pantheon)
        }
        if (championName == "Teemo") {
            setCounter1.setImageResource(R.drawable.cassiopeia)
            setCounter2.setImageResource(R.drawable.akshan)
            setCounter3.setImageResource(R.drawable.mordekaiser)
            setCounter4.setImageResource(R.drawable.swain)
            setCounter5.setImageResource(R.drawable.yasuo)
            setCounter6.setImageResource(R.drawable.zac)
            setCounter7.setImageResource(R.drawable.briar)
            setCounter8.setImageResource(R.drawable.illaoi)
            setCounter9.setImageResource(R.drawable.udyr)
            setCounter10.setImageResource(R.drawable.darius)
        }
        if (championName == "Thresh") {
            setCounter1.setImageResource(R.drawable.taric)
            setCounter2.setImageResource(R.drawable.zyra)
            setCounter3.setImageResource(R.drawable.heimerdinger)
            setCounter4.setImageResource(R.drawable.fiddlesticks)
            setCounter5.setImageResource(R.drawable.poppy)
            setCounter6.setImageResource(R.drawable.yuumi)
            setCounter7.setImageResource(R.drawable.tahmkench)
            setCounter8.setImageResource(R.drawable.twitch)
            setCounter9.setImageResource(R.drawable.pantheon)
            setCounter10.setImageResource(R.drawable.lulu)
        }
        if (championName == "Tristana") {
            setCounter1.setImageResource(R.drawable.swain)
            setCounter2.setImageResource(R.drawable.yasuo)
            setCounter3.setImageResource(R.drawable.kogmaw)
            setCounter4.setImageResource(R.drawable.karthus)
            setCounter5.setImageResource(R.drawable.nilah)
            setCounter6.setImageResource(R.drawable.aphelios)
            setCounter7.setImageResource(R.drawable.veigar)
            setCounter8.setImageResource(R.drawable.zeri)
            setCounter9.setImageResource(R.drawable.seraphine)
            setCounter10.setImageResource(R.drawable.draven)
        }
        if (championName == "Trundle") {
            setCounter1.setImageResource(R.drawable.akshan)
            setCounter2.setImageResource(R.drawable.quinn)
            setCounter3.setImageResource(R.drawable.jax)
            setCounter4.setImageResource(R.drawable.udyr)
            setCounter5.setImageResource(R.drawable.warwick)
            setCounter6.setImageResource(R.drawable.briar)
            setCounter7.setImageResource(R.drawable.drmundo)
            setCounter8.setImageResource(R.drawable.yasuo)
            setCounter9.setImageResource(R.drawable.tahmkench)
            setCounter10.setImageResource(R.drawable.teemo)
        }
        if (championName == "Tryndamere") {
            setCounter1.setImageResource(R.drawable.zac)
            setCounter2.setImageResource(R.drawable.swain)
            setCounter3.setImageResource(R.drawable.malphite)
            setCounter4.setImageResource(R.drawable.quinn)
            setCounter5.setImageResource(R.drawable.warwick)
            setCounter6.setImageResource(R.drawable.briar)
            setCounter7.setImageResource(R.drawable.zed)
            setCounter8.setImageResource(R.drawable.chogath)
            setCounter9.setImageResource(R.drawable.kayle)
            setCounter10.setImageResource(R.drawable.yasuo)
        }
        if (championName == "TwistedFate") {
            setCounter1.setImageResource(R.drawable.diana)
            setCounter2.setImageResource(R.drawable.naafiri)
            setCounter3.setImageResource(R.drawable.ryze)
            setCounter4.setImageResource(R.drawable.rumble)
            setCounter5.setImageResource(R.drawable.akshan)
            setCounter6.setImageResource(R.drawable.corki)
            setCounter7.setImageResource(R.drawable.malphite)
            setCounter8.setImageResource(R.drawable.leblanc)
            setCounter9.setImageResource(R.drawable.gragas)
            setCounter10.setImageResource(R.drawable.brand)
        }
        if (championName == "Twitch") {
            setCounter1.setImageResource(R.drawable.seraphine)
            setCounter2.setImageResource(R.drawable.nilah)
            setCounter3.setImageResource(R.drawable.vayne)
            setCounter4.setImageResource(R.drawable.missfortune)
            setCounter5.setImageResource(R.drawable.yasuo)
            setCounter6.setImageResource(R.drawable.aphelios)
            setCounter7.setImageResource(R.drawable.veigar)
            setCounter8.setImageResource(R.drawable.varus)
            setCounter9.setImageResource(R.drawable.kalista)
            setCounter10.setImageResource(R.drawable.sivir)
        }
        if (championName == "Udyr") {
            setCounter1.setImageResource(R.drawable.ivern)
            setCounter2.setImageResource(R.drawable.talon)
            setCounter3.setImageResource(R.drawable.reksai)
            setCounter4.setImageResource(R.drawable.skarner)
            setCounter5.setImageResource(R.drawable.diana)
            setCounter6.setImageResource(R.drawable.naafiri)
            setCounter7.setImageResource(R.drawable.shyvana)
            setCounter8.setImageResource(R.drawable.sejuani)
            setCounter9.setImageResource(R.drawable.briar)
            setCounter10.setImageResource(R.drawable.karthus)
        }
        if (championName == "Urgot") {
            setCounter1.setImageResource(R.drawable.zac)
            setCounter2.setImageResource(R.drawable.akshan)
            setCounter3.setImageResource(R.drawable.drmundo)
            setCounter4.setImageResource(R.drawable.olaf)
            setCounter5.setImageResource(R.drawable.gragas)
            setCounter6.setImageResource(R.drawable.akali)
            setCounter7.setImageResource(R.drawable.briar)
            setCounter8.setImageResource(R.drawable.udyr)
            setCounter9.setImageResource(R.drawable.rumble)
            setCounter10.setImageResource(R.drawable.gnar)
        }
        if (championName == "Varus") {
            setCounter1.setImageResource(R.drawable.karthus)
            setCounter2.setImageResource(R.drawable.veigar)
            setCounter3.setImageResource(R.drawable.kalista)
            setCounter4.setImageResource(R.drawable.swain)
            setCounter5.setImageResource(R.drawable.yasuo)
            setCounter6.setImageResource(R.drawable.tristana)
            setCounter7.setImageResource(R.drawable.samira)
            setCounter8.setImageResource(R.drawable.aphelios)
            setCounter9.setImageResource(R.drawable.ezreal)
        }
        if (championName == "Vayne") {
            setCounter1.setImageResource(R.drawable.veigar)
            setCounter2.setImageResource(R.drawable.swain)
            setCounter3.setImageResource(R.drawable.ashe)
            setCounter4.setImageResource(R.drawable.nilah)
            setCounter5.setImageResource(R.drawable.missfortune)
            setCounter6.setImageResource(R.drawable.jinx)
            setCounter7.setImageResource(R.drawable.zeri)
            setCounter8.setImageResource(R.drawable.kalista)
            setCounter9.setImageResource(R.drawable.sivir)
            setCounter10.setImageResource(R.drawable.ziggs)
        }
        if (championName == "Veigar") {
            setCounter1.setImageResource(R.drawable.garen)
            setCounter2.setImageResource(R.drawable.velkoz)
            setCounter3.setImageResource(R.drawable.annie)
            setCounter4.setImageResource(R.drawable.akshan)
            setCounter5.setImageResource(R.drawable.zoe)
            setCounter6.setImageResource(R.drawable.chogath)
            setCounter7.setImageResource(R.drawable.yone)
            setCounter8.setImageResource(R.drawable.corki)
            setCounter9.setImageResource(R.drawable.akali)
            setCounter10.setImageResource(R.drawable.ryze)
        }
        if (championName == "VelKoz") {
            setCounter1.setImageResource(R.drawable.sona)
            setCounter2.setImageResource(R.drawable.poppy)
            setCounter3.setImageResource(R.drawable.zyra)
            setCounter4.setImageResource(R.drawable.brand)
            setCounter5.setImageResource(R.drawable.heimerdinger)
            setCounter6.setImageResource(R.drawable.fiddlesticks)
            setCounter7.setImageResource(R.drawable.lissandra)
            setCounter8.setImageResource(R.drawable.leona)
            setCounter9.setImageResource(R.drawable.taric)
            setCounter10.setImageResource(R.drawable.neeko)
        }
        if (championName == "Vi") {
            setCounter1.setImageResource(R.drawable.trundle)
            setCounter2.setImageResource(R.drawable.xinzhao)
            setCounter3.setImageResource(R.drawable.reksai)
            setCounter4.setImageResource(R.drawable.maokai)
            setCounter5.setImageResource(R.drawable.kindred)
            setCounter6.setImageResource(R.drawable.naafiri)
            setCounter7.setImageResource(R.drawable.briar)
            setCounter8.setImageResource(R.drawable.gwen)
            setCounter9.setImageResource(R.drawable.elise)
            setCounter10.setImageResource(R.drawable.wukong)
        }
        if (championName == "Viego") {
            setCounter1.setImageResource(R.drawable.volibear)
            setCounter2.setImageResource(R.drawable.amumu)
            setCounter3.setImageResource(R.drawable.reksai)
            setCounter4.setImageResource(R.drawable.evelynn)
            setCounter5.setImageResource(R.drawable.maokai)
            setCounter6.setImageResource(R.drawable.briar)
            setCounter7.setImageResource(R.drawable.vi)
            setCounter8.setImageResource(R.drawable.sejuani)
            setCounter9.setImageResource(R.drawable.gwen)
            setCounter10.setImageResource(R.drawable.shyvana)
        }
        if (championName == "Viktor") {
            setCounter1.setImageResource(R.drawable.rumble)
            setCounter2.setImageResource(R.drawable.singed)
            setCounter3.setImageResource(R.drawable.xerath)
            setCounter4.setImageResource(R.drawable.akshan)
            setCounter5.setImageResource(R.drawable.tryndamere)
            setCounter6.setImageResource(R.drawable.kennen)
            setCounter7.setImageResource(R.drawable.azir)
            setCounter8.setImageResource(R.drawable.veigar)
            setCounter9.setImageResource(R.drawable.garen)
            setCounter10.setImageResource(R.drawable.annie)
        }
        if (championName == "Vladimir") {
            setCounter1.setImageResource(R.drawable.swain)
            setCounter2.setImageResource(R.drawable.renekton)
            setCounter3.setImageResource(R.drawable.pantheon)
            setCounter4.setImageResource(R.drawable.taliyah)
            setCounter5.setImageResource(R.drawable.cassiopeia)
            setCounter6.setImageResource(R.drawable.malphite)
            setCounter7.setImageResource(R.drawable.leblanc)
            setCounter8.setImageResource(R.drawable.kennen)
            setCounter9.setImageResource(R.drawable.yasuo)
            setCounter10.setImageResource(R.drawable.zed)
        }
        if (championName == "Volibear") {
            setCounter1.setImageResource(R.drawable.quinn)
            setCounter2.setImageResource(R.drawable.rengar)
            setCounter3.setImageResource(R.drawable.singed)
            setCounter4.setImageResource(R.drawable.vayne)
            setCounter5.setImageResource(R.drawable.zed)
            setCounter6.setImageResource(R.drawable.briar)
            setCounter7.setImageResource(R.drawable.ksante)
            setCounter8.setImageResource(R.drawable.tryndamere)
            setCounter9.setImageResource(R.drawable.kennen)
            setCounter10.setImageResource(R.drawable.trundle)
        }
        if (championName == "Warwick") {
            setCounter1.setImageResource(R.drawable.skarner)
            setCounter2.setImageResource(R.drawable.shyvana)
            setCounter3.setImageResource(R.drawable.kindred)
            setCounter4.setImageResource(R.drawable.udyr)
            setCounter5.setImageResource(R.drawable.rammus)
            setCounter6.setImageResource(R.drawable.naafiri)
            setCounter7.setImageResource(R.drawable.gwen)
            setCounter8.setImageResource(R.drawable.briar)
            setCounter9.setImageResource(R.drawable.wukong)
            setCounter10.setImageResource(R.drawable.hecarim)
        }
        if (championName == "Wukong") {
            setCounter1.setImageResource(R.drawable.shyvana)
            setCounter2.setImageResource(R.drawable.trundle)
            setCounter3.setImageResource(R.drawable.ivern)
            setCounter4.setImageResource(R.drawable.volibear)
            setCounter5.setImageResource(R.drawable.evelynn)
            setCounter6.setImageResource(R.drawable.kindred)
            setCounter7.setImageResource(R.drawable.rammus)
            setCounter8.setImageResource(R.drawable.briar)
            setCounter9.setImageResource(R.drawable.karthus)
            setCounter10.setImageResource(R.drawable.kayn)
        }
        if (championName == "Xayah") {
            setCounter1.setImageResource(R.drawable.ziggs)
            setCounter2.setImageResource(R.drawable.seraphine)
            setCounter3.setImageResource(R.drawable.ashe)
            setCounter4.setImageResource(R.drawable.swain)
            setCounter5.setImageResource(R.drawable.veigar)
            setCounter6.setImageResource(R.drawable.nilah)
            setCounter7.setImageResource(R.drawable.samira)
            setCounter8.setImageResource(R.drawable.yasuo)
            setCounter9.setImageResource(R.drawable.aphelios)
            setCounter10.setImageResource(R.drawable.tristana)
        }
        if (championName == "Xerath") {
            setCounter1.setImageResource(R.drawable.taric)
            setCounter2.setImageResource(R.drawable.blitzcrank)
            setCounter3.setImageResource(R.drawable.maokai)
            setCounter4.setImageResource(R.drawable.pyke)
            setCounter5.setImageResource(R.drawable.rakan)
            setCounter6.setImageResource(R.drawable.tahmkench)
            setCounter7.setImageResource(R.drawable.swain)
            setCounter8.setImageResource(R.drawable.morgana)
            setCounter9.setImageResource(R.drawable.braum)
            setCounter10.setImageResource(R.drawable.brand)
        }
        if (championName == "XinZhao") {
            setCounter1.setImageResource(R.drawable.skarner)
            setCounter2.setImageResource(R.drawable.reksai)
            setCounter3.setImageResource(R.drawable.sejuani)
            setCounter4.setImageResource(R.drawable.lillia)
            setCounter5.setImageResource(R.drawable.evelynn)
            setCounter6.setImageResource(R.drawable.vi)
            setCounter7.setImageResource(R.drawable.amumu)
            setCounter8.setImageResource(R.drawable.naafiri)
            setCounter9.setImageResource(R.drawable.hecarim)
            setCounter10.setImageResource(R.drawable.diana)
        }
        if (championName == "Yasuo") {
            setCounter1.setImageResource(R.drawable.kennen)
            setCounter2.setImageResource(R.drawable.malzahar)
            setCounter3.setImageResource(R.drawable.aurelionsol)
            setCounter4.setImageResource(R.drawable.zoe)
            setCounter5.setImageResource(R.drawable.anivia)
            setCounter6.setImageResource(R.drawable.irelia)
            setCounter7.setImageResource(R.drawable.akshan)
            setCounter8.setImageResource(R.drawable.ziggs)
            setCounter9.setImageResource(R.drawable.ekko)
            setCounter10.setImageResource(R.drawable.diana)
        }
        if (championName == "Yone") {
            setCounter1.setImageResource(R.drawable.vex)
            setCounter2.setImageResource(R.drawable.veigar)
            setCounter3.setImageResource(R.drawable.akshan)
            setCounter4.setImageResource(R.drawable.kennen)
            setCounter5.setImageResource(R.drawable.rumble)
            setCounter6.setImageResource(R.drawable.ziggs)
            setCounter7.setImageResource(R.drawable.aurelionsol)
            setCounter8.setImageResource(R.drawable.kassadin)
            setCounter9.setImageResource(R.drawable.naafiri)
            setCounter10.setImageResource(R.drawable.diana)
        }
        if (championName == "Yorick") {
            setCounter1.setImageResource(R.drawable.zac)
            setCounter2.setImageResource(R.drawable.udyr)
            setCounter3.setImageResource(R.drawable.olaf)
            setCounter4.setImageResource(R.drawable.quinn)
            setCounter5.setImageResource(R.drawable.vayne)
            setCounter6.setImageResource(R.drawable.briar)
            setCounter7.setImageResource(R.drawable.kennen)
            setCounter8.setImageResource(R.drawable.chogath)
            setCounter9.setImageResource(R.drawable.rengar)
            setCounter10.setImageResource(R.drawable.sylas)
        }
        if (championName == "Yuumi") {
            setCounter1.setImageResource(R.drawable.taric)
            setCounter2.setImageResource(R.drawable.zac)
            setCounter3.setImageResource(R.drawable.rakan)
            setCounter4.setImageResource(R.drawable.thresh)
            setCounter5.setImageResource(R.drawable.blitzcrank)
            setCounter6.setImageResource(R.drawable.morgana)
            setCounter7.setImageResource(R.drawable.xerath)
            setCounter8.setImageResource(R.drawable.lissandra)
            setCounter9.setImageResource(R.drawable.shaco)
            setCounter10.setImageResource(R.drawable.swain)
        }
        if (championName == "Zac") {
            setCounter1.setImageResource(R.drawable.fiddlesticks)
            setCounter2.setImageResource(R.drawable.xinzhao)
            setCounter3.setImageResource(R.drawable.kayn)
            setCounter4.setImageResource(R.drawable.ivern)
            setCounter5.setImageResource(R.drawable.ekko)
            setCounter6.setImageResource(R.drawable.rammus)
            setCounter7.setImageResource(R.drawable.skarner)
            setCounter8.setImageResource(R.drawable.briar)
            setCounter9.setImageResource(R.drawable.rengar)
            setCounter10.setImageResource(R.drawable.sylas)
        }
        if (championName == "Zed") {
            setCounter1.setImageResource(R.drawable.rumble)
            setCounter2.setImageResource(R.drawable.garen)
            setCounter3.setImageResource(R.drawable.malphite)
            setCounter4.setImageResource(R.drawable.akshan)
            setCounter5.setImageResource(R.drawable.neeko)
            setCounter6.setImageResource(R.drawable.velkoz)
            setCounter7.setImageResource(R.drawable.corki)
            setCounter8.setImageResource(R.drawable.brand)
            setCounter9.setImageResource(R.drawable.tristana)
            setCounter10.setImageResource(R.drawable.aurelionsol)
        }
        if (championName == "Zeri") {
            setCounter1.setImageResource(R.drawable.kogmaw)
            setCounter2.setImageResource(R.drawable.veigar)
            setCounter3.setImageResource(R.drawable.seraphine)
            setCounter4.setImageResource(R.drawable.swain)
            setCounter5.setImageResource(R.drawable.vayne)
            setCounter6.setImageResource(R.drawable.varus)
            setCounter7.setImageResource(R.drawable.ziggs)
            setCounter8.setImageResource(R.drawable.aphelios)
        }
        if (championName == "Ziggs") {
            setCounter1.setImageResource(R.drawable.yasuo)
            setCounter2.setImageResource(R.drawable.vayne)
            setCounter3.setImageResource(R.drawable.lucian)
            setCounter4.setImageResource(R.drawable.zeri)
            setCounter5.setImageResource(R.drawable.kaisa)
            setCounter6.setImageResource(R.drawable.veigar)
            setCounter7.setImageResource(R.drawable.aphelios)
            setCounter8.setImageResource(R.drawable.xayah)
            setCounter9.setImageResource(R.drawable.kalista)
            setCounter10.setImageResource(R.drawable.swain)
        }
        if (championName == "Zilean") {
            setCounter1.setImageResource(R.drawable.fiddlesticks)
            setCounter2.setImageResource(R.drawable.zac)
            setCounter3.setImageResource(R.drawable.heimerdinger)
            setCounter4.setImageResource(R.drawable.rell)
            setCounter5.setImageResource(R.drawable.maokai)
            setCounter6.setImageResource(R.drawable.lissandra)
            setCounter7.setImageResource(R.drawable.swain)
            setCounter8.setImageResource(R.drawable.braum)
            setCounter9.setImageResource(R.drawable.renataglasc)
            setCounter10.setImageResource(R.drawable.brand)
        }
        if (championName == "Zoe") {
            setCounter1.setImageResource(R.drawable.gangplank)
            setCounter2.setImageResource(R.drawable.kayle)
            setCounter3.setImageResource(R.drawable.naafiri)
            setCounter4.setImageResource(R.drawable.swain)
            setCounter5.setImageResource(R.drawable.malzahar)
            setCounter6.setImageResource(R.drawable.cassiopeia)
            setCounter7.setImageResource(R.drawable.chogath)
            setCounter8.setImageResource(R.drawable.corki)
            setCounter9.setImageResource(R.drawable.taliyah)
            setCounter10.setImageResource(R.drawable.ziggs)
        }
        if (championName == "Zyra") {
            setCounter1.setImageResource(R.drawable.shaco)
            setCounter2.setImageResource(R.drawable.heimerdinger)
            setCounter3.setImageResource(R.drawable.tahmkench)
            setCounter4.setImageResource(R.drawable.alistar)
            setCounter5.setImageResource(R.drawable.maokai)
            setCounter6.setImageResource(R.drawable.lissandra)
            setCounter7.setImageResource(R.drawable.swain)
            setCounter8.setImageResource(R.drawable.velkoz)
            setCounter9.setImageResource(R.drawable.brand)
            setCounter10.setImageResource(R.drawable.lulu)
        }
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
