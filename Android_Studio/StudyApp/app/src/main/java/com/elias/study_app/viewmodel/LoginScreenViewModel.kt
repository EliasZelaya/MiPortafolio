package com.elias.study_app.viewmodel

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.elias.study_app.data.UserDataLogin
import com.elias.study_app.data.usersDataList
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

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

    private val _enable = MutableLiveData<Boolean>()
    val enable: LiveData<Boolean> = _enable

    private val _changeActivity = MutableLiveData<Boolean?>()
    val changeActivity: LiveData<Boolean?> = _changeActivity

    fun onLoginField(name: String, password: String) {
        _username.value = name
        _password.value = password

        _enable.value = checkPassword(_password.value) && checkUsername(_username.value)
    }

    private val searchUsername: List<UserDataLogin> = usersDataList()

    @SuppressLint("SuspiciousIndentation")
    fun loginState() {
        _changeActivity.value = null
        viewModelScope.launch(Dispatchers.IO) {
            val valid = mutableStateOf(false)
            try {
                searchUsername.forEach {
                    if (it.username == _username.value && it.password == _password.value) {
                        _changeActivity.postValue(true)
                        valid.value = true
                        Log.d("Errores", "Cuando entre era: ${_changeActivity.value}")
                        return@forEach
                    }
                }
                if(!valid.value) _changeActivity.postValue(false)
            } catch (e: Exception) {
                Log.d("Errores", "$e")
            }
        }
    }


    private fun checkPassword(password: String?): Boolean = (password?.length ?: 0) > 2
    private fun checkUsername(username: String?): Boolean = username != null
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