package com.example.gameworlds

data class worldScreen(
    val worldNum: Int,
    val worldName: String,
    val worldMapSelect: Int,
    val prevWorld: Int,
    val nextWorld: Int
)