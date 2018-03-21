package me.tango.wallpaper_explorer.net

import com.google.gson.annotations.SerializedName

/**
 * Created by tang on 18-3-19.
 */
data class WallpaperCountResponse(
        @SerializedName("count")
        var count: Int = -1
) : BaseResponse()
