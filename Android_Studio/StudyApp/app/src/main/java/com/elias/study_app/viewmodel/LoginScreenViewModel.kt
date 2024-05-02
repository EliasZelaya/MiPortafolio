package com.elias.study_app.viewmodel

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.widget.Toast
import androidx.compose.animation.scaleIn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavController
import com.elias.study_app.navigation.ScreenRoute
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.currentCoroutineContext
import kotlinx.coroutines.launch

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

    fun checkLogin(context: Context, activity: Class <*>) {
        viewModelScope.launch {
            if (checkPassword(_password.value) && _username.value == "bomdia") {
                context.startActivity(Intent(context, activity))
                (context as Activity).finish()
            }
        }
    }

    fun onLoginField(name: String, password: String) {
        _username.value = name
        _password.value = password

        _enable.value = checkPassword(_password.value) && checkUsername(_username.value)
    }

    private fun checkPassword(password: String?): Boolean = (password?.length ?: 0) > 4
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