package com.elias.study_app.viewmodel

import android.service.autofill.UserData
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.elias.study_app.data.UserDataLogin
import com.elias.study_app.data.usersDataList
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class LoginScreenViewModel : ViewModel() {
    private val _userData = MutableStateFlow<List<UserDataLogin>>(emptyList())
    val userData = _userData.asStateFlow()

    private val _username = MutableStateFlow("")
    val username = _username

    private val _password = MutableStateFlow("")
    val password = _password

    /*private val _password = MutableLiveData<String>()
    val password: LiveData<String> = _password*/

    private val _visibility = MutableLiveData<ImageVector>()
    val visibility: LiveData<ImageVector> = _visibility

    private val _checkVisibility = MutableLiveData<Boolean>()
    val checkVisibility: LiveData<Boolean> = _checkVisibility

    private val _passwordKey = MutableLiveData<VisualTransformation>()
    val passwordKey: LiveData<VisualTransformation> = _passwordKey

    private val _enable = MutableStateFlow<Boolean>(false)
    val enable = _enable.asStateFlow()

    fun setEnable() {
        _enable.value = !_enable.value
    }
    /*private val _changeActivity = MutableStateFlow<Boolean?>(false)
    val changeActivity: MutableStateFlow<Boolean?> = _changeActivity*/


    fun onNameField(name: String) {
        _username.value = name
    }

    fun onPassField(password: String) {
        _password.value = password
    }

    fun checkFields() : Boolean{
        usersDataList().forEach {
            if (_username.value == it.username && _password.value == it.password)
                return false
        }
        return true
    }

    private val searchUsername: List<UserDataLogin> = usersDataList()

    /*@SuppressLint("SuspiciousIndentation")
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
    }*/


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