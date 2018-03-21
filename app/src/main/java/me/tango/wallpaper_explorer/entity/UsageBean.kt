package me.tango.wallpaper_explorer.entity

import com.google.gson.annotations.SerializedName

/**
 * Created by tang on 18-3-19.
 */
data class UsageBean(
        @SerializedName("month_count")
        var monthCount: Int = -1,
        @SerializedName("month_price")
        var monthPrice: Double = 0.0,
        @SerializedName("last_month_count")
        var lastMonthCount: Int = -1,
        @SerializedName("last_month_price")
        var lastMonthPrice: Double = 0.0
)