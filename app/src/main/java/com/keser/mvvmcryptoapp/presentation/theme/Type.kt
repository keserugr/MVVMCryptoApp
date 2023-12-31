package com.keser.mvvmcryptoapp.presentation.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.keser.mvvmcryptoapp.R

val Roboto = FontFamily(
        Font(R.font.roboto_light, FontWeight.Light),
        Font(R.font.roboto_regular, FontWeight.Normal),
        Font(R.font.roboto_medium, FontWeight.Medium),
        Font(R.font.roboto_bold, FontWeight.Bold),
)

val RobotoCondensed = FontFamily(
        Font(R.font.roboto_condensed_light, FontWeight.Light),
        Font(R.font.roboto_condensed_regular, FontWeight.Normal),
)

// Set of Material typography styles to start with
val Typography = Typography(
        h1 = TextStyle(
                fontFamily = Roboto,
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
        ),
        h2 = TextStyle(
                fontFamily = Roboto,
                fontWeight = FontWeight.Medium,
                fontSize = 24.sp
        ),
        h3 = TextStyle(
                fontFamily = Roboto,
                fontWeight = FontWeight.Medium,
                fontSize = 20.sp
        ),
        h4 = TextStyle(
                fontFamily = Roboto,
                fontWeight = FontWeight.Light,
                fontSize = 16.sp
        ),
        body1 = TextStyle(
                fontFamily = Roboto,
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp
        ),
        body2 = TextStyle(
                fontWeight = FontWeight.Light,
                fontSize = 14.sp
        )
)