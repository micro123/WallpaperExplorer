package me.tango.wallpaper_explorer.net

import com.google.gson.annotations.SerializedName
import me.tango.wallpaper_explorer.entity.UsageBean

/**
 * Created by tang on 18-3-19.
 */
data class ApiUsageResponse(
        @SerializedName("counts")
        var counts: UsageBean? = null
) : BaseResponse()