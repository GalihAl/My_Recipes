package com.galih.myrecipes.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Recipe(
    var name: String = "",
    var detail: String = "",
    var photo: Int = 0,
    var time: Int = 0,
    var ingredientSum: Int = 0,
    var rating: Int = 0,
    var ingredient: String = "",
    var stepCook: String = "",
    var calorie: Int = 0
): Parcelable
