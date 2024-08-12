package com.kanahia.composed

import android.content.Context
import com.google.gson.Gson
import com.kanahia.composed.models.Quote

object DataManager {

    var data = emptyArray<Quote>()

    fun loadAssetsFromFile(context: Context){
        val inputStream = context.assets.open("quotes.json")
        val size = inputStream.available()
        val buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        val json = String(buffer, Charsets.UTF_8)
        val gson = Gson()
        data = gson.fromJson(json, Array<Quote>::class.java)
    }
}