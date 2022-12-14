package com.ev.dictionaryapp.feature_dictionary.data.remote.dto

import com.ev.dictionaryapp.feature_dictionary.domain.models.Definition

data class DefinitionDto(
    val antonyms: List<String>,
    val definition: String,
    val example:String?,
    val synonyms: List<Any>
) {
    fun toDefinition() : Definition {
        return Definition(
            antonyms = antonyms,
            definition = definition,
            example = example,
            synonyms = synonyms
        )
    }
}