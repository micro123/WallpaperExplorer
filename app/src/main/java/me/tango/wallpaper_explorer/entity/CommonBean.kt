package me.tango.wallpaper_explorer.entity

import com.google.gson.annotations.SerializedName

/**
 * Created by tang on 18-3-19.
 */
data class CommonBean(
        @SerializedName("id")
        var id: Int = -1,
        @SerializedName("name")
        var name: String = "",
        @SerializedName("count")
        var count: Int = -1,
        @SerializedName("url")
        var url: String = ""
)