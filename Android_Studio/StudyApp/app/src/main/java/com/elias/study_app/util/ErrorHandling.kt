package com.elias.study_app.util

fun errorList(code: Int) : String? {
    val error = mapOf<Int, String>(
        1 to "Credentials don't match, try again",
        2 to "idk"
    )

    return error[code]
}