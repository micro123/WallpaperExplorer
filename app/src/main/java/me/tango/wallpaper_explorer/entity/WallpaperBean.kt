package me.tango.wallpaper_explorer.entity

import com.google.gson.annotations.SerializedName

/**
 * Created by tang on 18-3-19.
 */
open class WallpaperBean(
        @SerializedName("id")
        var id: Int = -1,
        @SerializedName("width")
        var width: Int = -1,
        @SerializedName("height")
        var height: Int = -1,
        @SerializedName("file_type")
        var fileType: String = "",
        @SerializedName("file_size")
        var fileSize: Int = -1,
        @SerializedName("url_image")
        var urlImage: String = "",
        @SerializedName("url_thumb")
        var urlThumb: String = "",
        @SerializedName("url_page")
        var urlPage: String = "",
        @SerializedName("category")
        var category: String = "",
        @SerializedName("category_id")
        var categoryId: Int = -1,
        @SerializedName("sub_category")
        var subCategory: String = "",
        @SerializedName("sub_category_id")
        var subCategoryId: Int = -1,
        @SerializedName("user_name")
        var userName: String = "",
        @SerializedName("user_id")
        var userId: Int = -1
)