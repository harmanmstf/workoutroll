package com.example.rollworkout.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.rollworkout.R

data class Abs(override val imageResourceID: Int, override val stringResourceId: Int):WorkoutType
data class Quads(override val imageResourceID: Int, override val stringResourceId: Int):WorkoutType
data class Glutes(override val imageResourceID: Int, override val stringResourceId: Int):WorkoutType
data class Triceps(override val imageResourceID: Int, override val stringResourceId: Int):WorkoutType
data class Biceps(override val imageResourceID: Int, override val stringResourceId: Int):WorkoutType
data class Back(override val imageResourceID: Int, override val stringResourceId: Int):WorkoutType
data class Chest(override val imageResourceID: Int, override val stringResourceId: Int):WorkoutType
interface WorkoutType{
    val imageResourceID: Int
    val stringResourceId: Int}

enum class WorkoutParts(@DrawableRes val imageResourceID: Int, @StringRes val stringResourceId: Int) {
    ABS(R.drawable.abs, R.string.abs),
    QUADS(R.drawable.quads, R.string.quads),
    GLUTES(R.drawable.glutes, R.string.glutes),
    TRICEPS(R.drawable.triceps, R.string.triceps),
    BICEPS(R.drawable.biceps, R.string.biceps),
    BACK(R.drawable.back, R.string.back),
    CHEST(R.drawable.chest, R.string.chest)
}