package com.elias.study_app.util

fun errorList(code: Int) : String? {
    val error = mapOf(
        1 to "Credentials don't match, try again",
        2 to "Please enter a title",
        3 to "Please choose a color"
    )

    return error[code]
}