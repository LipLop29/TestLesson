package com.example.testlesson.domain.models


data class Films(
    val image: String,
    val originalTitle: String = "",
    val director: String = "",
    val description: String = "",
    val vehicles: List<String>?,
    val title: String = "",
    val rtScore: String = "",
    val people: List<String>?,
    val url: String = "",
    val releaseDate: String = "",
    val species: List<String>?,
    val originalTitleRomanised: String = "",
    val producer: String = "",
    val runningTime: String = "",
    val locations: List<String>?,
    val id: String = ""
)