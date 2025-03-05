package com.sunnyweather.android.logic.model

import com.google.gson.annotations.SerializedName

// 按照api格式，status是返回码，places是查询到的所有地址
data class PlaceResponse(val status: String, val places: List<Place>) {

}

data class Place(val name: String, val location: Location, @SerializedName("formatted_address") val address:String)

data class Location(val lng: String, val lat: String)