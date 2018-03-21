package me.tango.wallpaper_explorer.net

import io.reactivex.Flowable
import retrofit2.http.GET
import retrofit2.http.QueryMap

/**
 * Created by tang on 18-3-19.
 */
interface WallpaperService {

    // 返回壁纸列表的
    @GET("get.php")
    fun newest(@QueryMap parameters: QueryUtils.QueryMap): Flowable<WallpapersResponse>

    @GET("get.php")
    fun highestRate(@QueryMap parameters: QueryUtils.QueryMap): Flowable<WallpapersResponse>

    @GET("get.php")
    fun byViews(@QueryMap parameters: QueryUtils.QueryMap): Flowable<WallpapersResponse>

    @GET("get.php")
    fun byFavorites(@QueryMap parameters: QueryUtils.QueryMap): Flowable<WallpapersResponse>

    @GET("get.php")
    fun category(@QueryMap parameters: QueryUtils.QueryMap): Flowable<WallpapersResponse>

    @GET("get.php")
    fun subCategory(@QueryMap parameters: QueryUtils.QueryMap): Flowable<WallpapersResponse>

    @GET("get.php")
    fun tag(@QueryMap parameters: QueryUtils.QueryMap): Flowable<WallpapersResponse>

    @GET("get.php")
    fun user(@QueryMap parameters: QueryUtils.QueryMap): Flowable<WallpapersResponse>

    @GET("get.php")
    fun popular(@QueryMap parameters: QueryUtils.QueryMap): Flowable<WallpapersResponse>

    @GET("get.php")
    fun featured(@QueryMap parameters: QueryUtils.QueryMap): Flowable<WallpapersResponse>

    @GET("get.php")
    fun random(@QueryMap parameters: QueryUtils.QueryMap): Flowable<WallpapersResponse>

    // 返回壁纸数量的
    @GET("get.php")
    fun wallpaperCount(@QueryMap parameters: QueryUtils.QueryMap): Flowable<WallpaperCountResponse>

    @GET("get.php")
    fun categoryCount(@QueryMap parameters: QueryUtils.QueryMap): Flowable<WallpaperCountResponse>

    @GET("get.php")
    fun subCategoryCount(@QueryMap parameters: QueryUtils.QueryMap): Flowable<WallpaperCountResponse>

    @GET("get.php")
    fun popularCount(@QueryMap parameters: QueryUtils.QueryMap): Flowable<WallpaperCountResponse>

    @GET("get.php")
    fun featuredCount(@QueryMap parameters: QueryUtils.QueryMap): Flowable<WallpaperCountResponse>

    @GET("get.php")
    fun userCount(@QueryMap parameters: QueryUtils.QueryMap): Flowable<WallpaperCountResponse>

    @GET("get.php")
    fun tagCount(@QueryMap parameters: QueryUtils.QueryMap): Flowable<WallpaperCountResponse>

    // 搜索
    @GET("get.php")
    fun search(@QueryMap parameters: QueryUtils.QueryMap): Flowable<SearchResultResponse>

    // 壁纸详细信息
    @GET("get.php")
    fun wallpaperInfo(@QueryMap parameters: QueryUtils.QueryMap): Flowable<WallpaperInfoResponse>

    // 分类列表
    @GET("get.php")
    fun categoryList(@QueryMap parameters: QueryUtils.QueryMap): Flowable<CategoryListResponse>

    // 子类别列表
    @GET("get.php")
    fun subCategoryList(@QueryMap parameters: QueryUtils.QueryMap): Flowable<SubCategoryListResponse>

    // 调用次数统计
    @GET("get.php")
    fun queryCount(@QueryMap parameters: QueryUtils.QueryMap): Flowable<ApiUsageResponse>


}