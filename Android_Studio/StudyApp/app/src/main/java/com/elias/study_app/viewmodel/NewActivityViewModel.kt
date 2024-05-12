package com.elias.study_app.viewmodel

import androidx.lifecycle.ViewModel
import com.elias.study_app.R
import com.elias.study_app.components.activitycomponents.CardItem
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class NewActivityViewModel : ViewModel() {
    private val _itemList = MutableStateFlow<List<CardItem>>(emptyList())
    val itemList = _itemList.asStateFlow()

    private val _title = MutableStateFlow("")
    val title = _title.asStateFlow()

    fun setTitle(title: String) {
        _title.value = title
    }

    fun createCard() {
        val newList = _itemList.value.toMutableList()
        val cardItem = CardItem(
            name = _title.value,
            color = R.color.purple_200
        )
        newList.add(cardItem)
        _itemList.value = newList
        _title.value = ""
    }
}