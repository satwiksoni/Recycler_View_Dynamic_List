package com.satwik.list_view_sample

import kotlin.random.Random

data class Games (val game:String,val origine:String ,val price:Int){
    companion object
    {
        val GAME= arrayOf<String>(
            "Minecraft",
            "PUBG",
            "Apex Legends",
            "CSGO",
            "Skrillex",
            "TOD",
            "COD",
            "Getting Over It",
            "FAR CRY 4",
            "Max Payne 3"
        )
        val ORIGINE=arrayOf(
        "USA",
        "China",
        "India",
        "Australia",
        "Singapore",
        "Japan",
        "Russia",
        "Canada"
        )
        fun gen_games(n:Int):ArrayList<Games>
        {
            val games= arrayListOf<Games>()
            for(i in 1..n)
            {
                games.add(Games(
                    GAME[Random.nextInt(10)],
                    ORIGINE[Random.nextInt(8)],
                    Random.nextInt(10)*100
                ))
            }
                return games
        }
    }
}