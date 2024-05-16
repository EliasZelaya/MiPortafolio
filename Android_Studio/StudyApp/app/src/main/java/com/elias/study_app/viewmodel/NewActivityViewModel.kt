package com.elias.study_app.viewmodel

import android.util.Log
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

    private val _checkTime = MutableStateFlow(false)
    val checkTime = _checkTime.asStateFlow()

    private val _checkTimeLimit = MutableStateFlow(false)
    val checkTimeLimit = _checkTimeLimit.asStateFlow()

    private val _selectDate = MutableStateFlow("...")
    val selectDate = _selectDate.asStateFlow()

    private val _selectTime = MutableStateFlow("...")
    val selectTime = _selectTime.asStateFlow()

    private val _selectTimeLimit = MutableStateFlow("...")
    val selectTimeLimit  = _selectTimeLimit.asStateFlow()

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

    fun setTime(time: String) {
        if(_checkTime.value) {
            _selectTime.value = time
        }
        else {
            _selectTimeLimit.value = time
        }

        Log.d("Log", "Time:${time}, selected ${selectTime.value}")
    }

    /*fun setTimeLimit(time: String) {
        _selectTimeLimit.value = time
//        Log.d("Log", "Time:${time}, selected ${selectTime.value}")
    }*/

    fun changeDateState() {
        _checkDate.value = !_checkDate.value
    }

    fun changeTimeState() {
        _checkTime.value = !_checkTime.value
    }

    fun changeTimeStateLimit() {
        _checkTimeLimit.value = !_checkTimeLimit.value
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
            color = _selectColor.value,
            time = _selectTime.value,
            timeLimit = _selectTimeLimit.value
        )
        newList.add(cardItem)
        _itemList.value = newList
        _title.value = ""
        _colorName.value = "..."
        _selectColor.value = 0
        _selectTime.value = "..."
        _selectTimeLimit.value = "..."
    }
}