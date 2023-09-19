package me.ibrahimsn.smoothbottombar

data class ChampionBuild(val championName: String, val builds: List<List<Int>>)

// Create a list of ChampionBuild objects
val championBuilds = listOf(
    ChampionBuild("Aatrox", listOf(
        listOf(R.drawable.m6630, R.drawable.m3161, R.drawable.m3053),
        listOf(R.drawable.m6691, R.drawable.m6694, R.drawable.m3071),
        listOf(R.drawable.m6691, R.drawable.m3814, R.drawable.m6694)
    )),
    ChampionBuild("Ahri", listOf(
        listOf(R.drawable.m6656, R.drawable.m4645, R.drawable.m3157),
        listOf(R.drawable.m6656, R.drawable.m4645, R.drawable.m3089),
        listOf(R.drawable.m6655, R.drawable.m4645, R.drawable.m3089)
    )),
    ChampionBuild("Akali", listOf(
        listOf(R.drawable.m3152, R.drawable.m4645, R.drawable.m3157),
        listOf(R.drawable.m3152, R.drawable.m4645, R.drawable.m3089),
        listOf(R.drawable.m3152, R.drawable.m3157, R.drawable.m4645)
    )),
    // Add builds for other champions here
)