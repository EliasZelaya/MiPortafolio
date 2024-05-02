package com.elias.study_app.viewmodel

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

@Suppress("UNREACHABLE_CODE")
class LoginScreenViewModel : ViewModel() {
    private val _username = MutableLiveData<String>()
    val username: LiveData<String> = _username

    private val _password = MutableLiveData<String>()
    val password: LiveData<String> = _password

    private val _visibility = MutableLiveData<ImageVector>()
    val visibility: LiveData<ImageVector> = _visibility

    private val _checkVisibility = MutableLiveData<Boolean>()
    val checkVisibility: LiveData<Boolean> = _checkVisibility

    private val _passwordKey = MutableLiveData<VisualTransformation>()
    val passwordKey: LiveData<VisualTransformation> = _passwordKey

    fun onLoginField(name: String, password: String) {
        _username.value = name
        _password.value = password
    }

    fun passVisibility(check: Boolean) {
        _checkVisibility.value = !check

        if (_checkVisibility.value == true) {
            _visibility.value = Icons.Default.Visibility
            _passwordKey.value = VisualTransformation.None
        } else {
            _visibility.value = Icons.Default.VisibilityOff
            _passwordKey.value = PasswordVisualTransformation()
        }
    }
}