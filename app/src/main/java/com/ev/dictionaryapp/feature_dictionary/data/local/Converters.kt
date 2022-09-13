package com.ev.dictionaryapp.feature_dictionary.data.local

import androidx.room.ProvidedTypeConverter
import androidx.room.TypeConverter
import com.ev.dictionaryapp.feature_dictionary.data.util.JsonParser
import com.ev.dictionaryapp.feature_dictionary.domain.models.Meaning
import com.google.gson.reflect.TypeToken

@ProvidedTypeConverter
class Converters(
    private val jsonParson:JsonParser
){
    @TypeConverter
    fun fromMeaningsJson(json:String): List<Meaning> {
        return jsonParson.fromJson<ArrayList<Meaning>>(
            json,
            object: TypeToken<ArrayList<Meaning>>(){}.type
        ) ?: emptyList()
    }

    @TypeConverter
    fun toMeaningsJson(meanings:List<Meaning>) : String {
        return jsonParson.toJson(
            meanings,
            object: TypeToken<ArrayList<Meaning>>(){}.type
        ) ?:"[]"
    }
}