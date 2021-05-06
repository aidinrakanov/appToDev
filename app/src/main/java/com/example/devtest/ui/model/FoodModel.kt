package com.example.devtest.ui.model

import java.io.Serializable

data class FoodModel(

    var image: Int,
    var spend_save: String,
    var foodName: String,
    var statusOpenClose: String,
    var rating: String,
    var reviewCount: String,
    var country: String,
    var foodType: String,
    var deliveryCost: String,
    var minimum: String,
    var time: String,
    var distance: String,
    var cornerBool:Boolean

) : Serializable