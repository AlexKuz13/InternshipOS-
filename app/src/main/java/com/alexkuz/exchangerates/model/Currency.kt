package com.alexkuz.exchangerates.model

import com.google.gson.annotations.SerializedName

data class Currency(
    @SerializedName("ID")
    val id: String,
    @SerializedName("CharCode")
    val charCode: String,
    @SerializedName("Name")
    val name: String,
    @SerializedName("Value")
    val value: Double

)