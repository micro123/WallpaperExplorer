package me.tango.wallpaper_explorer.net

import com.google.gson.annotations.SerializedName
import me.tango.wallpaper_explorer.entity.CommonBean

/**
 * Created by tang on 18-3-19.
 */
data class CategoryListResponse(
        @SerializedName("categories")
        var categories: List<CommonBean>? = null
) : BaseResponse()