package com.ev.dictionaryapp.feature_dictionary.domain.models

data class Meaning(
    val definitions:List<Definition>,
    val partOfSpeech:String
)
