package com.example.composition.domain.entity

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class GameSettings(
    val maxSumValue:Int,
    val minCountOfRightAnswers:Int,
    val minPercentOfRightAnswers:Int,
    val gameTimeSeconds:Int
): Parcelable
