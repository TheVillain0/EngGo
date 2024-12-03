package com.example.enggo.model.dictionary

data class WordModel(
    val meanings: List<Meaning>? = emptyList(),
    val word: String = "",
    val wordsetId: String = ""
) {
    constructor() : this(emptyList(), "", "")
}