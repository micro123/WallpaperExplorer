package me.tango.wallpaper_explorer.net

import com.google.gson.annotations.SerializedName

/**
 * Created by tang on 18-3-19.
 */
open class BaseResponse(
        @SerializedName("success")
        var isSuccess: Boolean = false,
        @SerializedName("error")
        var error: String? = null
)