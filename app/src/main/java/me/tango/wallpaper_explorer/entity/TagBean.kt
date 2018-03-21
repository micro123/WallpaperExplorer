package me.tango.wallpaper_explorer.entity

import com.google.gson.annotations.SerializedName

/**
 * Created by tang on 18-3-19.
 */
data class TagBean(
        @SerializedName("id")
        var id: Int = -1,
        @SerializedName("name")
        var name: String = ""
)