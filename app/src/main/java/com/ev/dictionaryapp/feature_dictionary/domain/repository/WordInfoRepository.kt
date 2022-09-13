package com.ev.dictionaryapp.feature_dictionary.domain.repository

import com.ev.dictionaryapp.core.util.Resource
import com.ev.dictionaryapp.feature_dictionary.domain.models.WordInfo
import kotlinx.coroutines.flow.Flow

interface WordInfoRepository {

    fun getWordInfo(word:String):Flow<Resource<List<WordInfo>>>
}