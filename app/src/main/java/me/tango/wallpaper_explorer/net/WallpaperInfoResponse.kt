package me.tango.wallpaper_explorer.net

import com.google.gson.annotations.SerializedName
import me.tango.wallpaper_explorer.entity.TagBean
import me.tango.wallpaper_explorer.entity.WallpaperInfoBean

/**
 * Created by tang on 18-3-19.
 */
data class WallpaperInfoResponse(
        @SerializedName("wallpaper")
        var wallpaperInfo: WallpaperInfoBean? = null,
        @SerializedName("tags")
        var tags: List<TagBean>? = null
) : BaseResponse()