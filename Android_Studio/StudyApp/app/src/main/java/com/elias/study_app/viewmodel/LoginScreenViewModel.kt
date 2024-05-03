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
import androidx.lifecycle.viewModelScope
import com.elias.study_app.data.UserDataLogin
import com.elias.study_app.data.usersDataList
import kotlinx.coroutines.Dispatchers
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

    private val _changeActivity = MutableLiveData<Boolean>()

    fun onLoginField(name: String, password: String) {
        _username.value = name
        _password.value = password

        _enable.value = checkPassword(_password.value) && checkUsername(_username.value)
    }

    private val searchUsername: List<UserDataLogin> = usersDataList()

    fun loginState(): Boolean {
        _changeActivity.value = false
//        viewModelScope.launch(Dispatchers.Main) {
            try {
                searchUsername.forEach {
                    if (it.username == _username.value && it.password == _password.value) {
//                        withContext(Dispatchers.Main) {
                            _changeActivity.value = true
//                        }
                        return@forEach
                    }
                }
            } catch (e: Exception) {
            }
//        }

        return _changeActivity.value!!
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