package com.kanahia.composed

import android.content.Context
import androidx.compose.runtime.mutableStateOf
import com.google.gson.Gson
import com.kanahia.composed.models.Quote

object DataManager {

    var data = emptyArray<Quote>()
    var isDataLoaded = mutableStateOf(false)
    var currentPage = mutableStateOf(PAGES.LISTING)

    fun loadAssetsFromFile(context: Context) {
        val inputStream = context.assets.open("quotes.json")
        val size = inputStream.available()
        val buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        val json = String(buffer, Charsets.UTF_8)
        val gson = Gson()
        data = gson.fromJson(json, Array<Quote>::class.java)
        isDataLoaded.value = true
    }

    fun switchPages() {
        if (currentPage.value == PAGES.LISTING) {
            currentPage.value = PAGES.DETAIL
        } else {
            currentPage.value = PAGES.LISTING
        }
    }
}