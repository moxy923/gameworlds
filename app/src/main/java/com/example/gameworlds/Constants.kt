package com.example.gameworlds

object Constants {

    fun getWorlds(): ArrayList<World>{
        val worldList = ArrayList<World>()

        val nineIslandsWorld = World(
            0,
            R.drawable.the_nine_islands_v3,
            "Aletharia",
            "Felladun",
            "Kelanthis",
            "Rodahlia",
            "Sylvannas",
            "Volenthar",
            null,
            null,
            null,
            "Story of Nine-Islands"
            )
        worldList.add(nineIslandsWorld)
        return worldList


    }

    fun getWorldScreen(): ArrayList<worldScreen>{
        val worldScreenList = ArrayList<worldScreen>()

        val nineIslandsWorldScreen = worldScreen(
            0,
            "The Nine Islands",
            R.drawable.the_nine_islands_v3,
            0,
            1
        )
        worldScreenList.add(nineIslandsWorldScreen)

        val celaris5WorldScreen = worldScreen(
            1,
            "Celaris-5",
            R.drawable.worldmap_celaris5,
            0,
            2
        )
        worldScreenList.add(celaris5WorldScreen)
        return worldScreenList

    }

}