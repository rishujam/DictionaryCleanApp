package com.ev.dictionaryapp.feature_dictionary.data.remote.dto

import com.ev.dictionaryapp.feature_dictionary.domain.models.Meaning

data class MeaningDto(
    val antonyms: List<Any>,
    val definitions: List<DefinitionDto>,
    val partOfSpeech: String,
    val synonyms: List<Any>
) {
    fun toMeaning() :Meaning {
        return Meaning(
            definitions = definitions.map { it.toDefinition() },
            partOfSpeech = partOfSpeech
        )
    }
}