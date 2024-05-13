package com.elias.study_app.viewmodel

import androidx.lifecycle.ViewModel
import com.elias.study_app.R
import com.elias.study_app.components.createactivitycomponents.CardItem
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class NewActivityViewModel : ViewModel() {
    private val _itemList = MutableStateFlow<List<CardItem>>(emptyList())
    val itemList = _itemList.asStateFlow()

    private val _title = MutableStateFlow("")
    val title = _title.asStateFlow()

    private val _checkDate = MutableStateFlow(false)
    val checkDate = _checkDate.asStateFlow()

    private val _selectDate = MutableStateFlow("...")
    val selectDate = _selectDate.asStateFlow()

    private val _colorName = MutableStateFlow("...")
    val colorName = _colorName.asStateFlow()

    private val _expandDropMenu = MutableStateFlow(false)
    val expandDropMenu = _expandDropMenu.asStateFlow()

    private val _selectColor = MutableStateFlow(0)
    val selectColor = _selectColor.asStateFlow()

    fun setColor(color: Int, name: String) {
        _selectColor.value = color
        _colorName.value = name
    }

    fun setDate(date: String) {
        _selectDate.value = date
    }
    fun changeDateState() {
        _checkDate.value = !_checkDate.value
    }
    fun setTitle(title: String) {
        _title.value = title
    }

    fun changeExpand() {
        _expandDropMenu.value = !_expandDropMenu.value
    }

    fun createCard() {
        val newList = _itemList.value.toMutableList()
        val cardItem = CardItem(
            name = _title.value,
            color = _selectColor.value
        )
        newList.add(cardItem)
        _itemList.value = newList
        _title.value = ""
        _colorName.value = "..."
    }
}