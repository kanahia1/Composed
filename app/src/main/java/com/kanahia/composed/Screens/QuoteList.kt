package com.kanahia.composed.Screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.kanahia.composed.models.Quote

@Composable
fun QuoteList(data: Array<Quote>, onClick:()->Unit ) {

    LazyColumn(content = {
        items(data){
            QuoteListItem(quote = it) {
                onClick()
            }
        }
    })
}