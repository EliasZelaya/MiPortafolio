package com.elias.uca_life_v2.mvvm

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class LoginViewModel : ViewModel() {
    private val _username = MutableLiveData<String>()
    val username: LiveData<String> = _username

    private val _password = MutableLiveData<String>()
    val password: LiveData<String> = _password

    private val _checkDevice = MutableLiveData<Boolean>()
    val checked: LiveData<Boolean> = _checkDevice

    private val _enable = MutableLiveData<Boolean>()
    val enable: LiveData<Boolean> = _enablez

    fun onLoginField(userName: String, userPassword: String) {
        _username.value = userName
        _password.value = userPassword
    }

    fun checkDevice(checked: Boolean) {
        _checkDevice.value = !checked
    }

    private fun checkPassword(password: String): Boolean = password.length > 2
    private fun checkUsername(username: String): Boolean = username == "Yo"
}