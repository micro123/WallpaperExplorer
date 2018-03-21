package me.tango.wallpaper_explorer.net

import com.google.gson.annotations.SerializedName
import me.tango.wallpaper_explorer.entity.WallpaperBean

/**
 * Created by tang on 18-3-19.
 */
data class SearchResultResponse(
        @SerializedName("wallpapers")
        var wallpapers: List<WallpaperBean>? = null,
        @SerializedName("total_match")
        var totalMatch: Int = -1
) : BaseResponse()