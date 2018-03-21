package me.tango.wallpaper_explorer.net

import com.google.gson.annotations.SerializedName
import me.tango.wallpaper_explorer.entity.WallpaperBean

/**
 * Created by tang on 18-3-19.
 */
data class WallpapersResponse(
        @SerializedName("wallpapers")
        var wallpapers: List<WallpaperBean>? = null,
        @SerializedName("is_last")
        var isLast: Boolean = true
) : BaseResponse()