package me.tango.wallpaper_explorer.entity

import com.google.gson.annotations.SerializedName

/**
 * Created by tang on 18-3-19.
 */
data class WallpaperInfoBean(
        @SerializedName("name")
        var name: String? = null,
        @SerializedName("featured")
        var isFeatured: Boolean = false
) : WallpaperBean()