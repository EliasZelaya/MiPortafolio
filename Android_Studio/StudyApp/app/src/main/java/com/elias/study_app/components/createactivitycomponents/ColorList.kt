package com.elias.study_app.components.createactivitycomponents

import com.elias.study_app.R

data class ColorsOption(
    val color: Int,
    val colorName: String
)

fun colorList(): List<ColorsOption>{
    return listOf(
        ColorsOption(
            R.color.purple_200,
            "Purple"
    ),
        ColorsOption(
            R.color.teal_200,
            "LightBlue"
    ),
        ColorsOption(
            R.color.red_wine,
            "Red"
    ),
        ColorsOption(
            R.color.yellow,
            "Yellow"
    ),
    )
}