package com.ev.dictionaryapp.feature_dictionary.presentation

import com.ev.dictionaryapp.feature_dictionary.domain.models.WordInfo

data class WordInfoState(
    val wordInfoItems:List<WordInfo> = emptyList(),
    val isLoading:Boolean = false
)