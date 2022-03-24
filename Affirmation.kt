package com.dwisusanti.recycleviewdwisusanti.model
//template (model) data --> tipe data yang didefinisikan sendiri
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)
