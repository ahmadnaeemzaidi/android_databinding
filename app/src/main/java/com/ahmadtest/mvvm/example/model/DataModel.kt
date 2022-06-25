package com.ahmadtest.mvvm.example.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DataItem(
    var id: String,
    var price: Int,
    var title: String
): Parcelable