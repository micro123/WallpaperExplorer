package me.tango.wallpaper_explorer.net

import me.tango.wallpaper_explorer.constant.Constant

/**
 * Created by tang on 18-3-19.
 */
object QueryUtils {

    fun newest(page: Int = 1): QueryMap {
        val map = QueryMap("newest")
        map.put("page", page)
        return map
    }

    fun highestRate(page: Int = 1): QueryMap {
        val map = QueryMap("highest_rated")
        map.put("page", page)
        return map
    }

    fun byViews(page: Int = 1): QueryMap {
        val map = QueryMap("by_views")
        map.put("page", page)
        return map
    }

    fun byFavorites(page: Int = 1): QueryMap {
        val map = QueryMap("by_favorites")
        map.put("page", page)
        return map
    }

    fun wallpaperCount(): QueryMap {
        return QueryMap("wallpaper_count")
    }

    fun categoryList(): QueryMap {
        return QueryMap("category_list")
    }

    fun categoryCount(categoryId: Int): QueryMap {
        val map = QueryMap("category_count")
        map.put("id", categoryId)
        return map
    }

    fun category(id: Int, page: Int = 1, sort: Sort = Sort.ByNewest): QueryMap {
        val map = QueryMap("category")
        map.put("id", id)
        map.put("page", page)
        map.put("sort", sort)
        return map
    }

    fun subCategoryList(categoryId: Int): QueryMap {
        val map = QueryMap("sub_category_list")
        map.put("id", categoryId)
        return map
    }

    fun subCategoryCount(subCategoryId: Int): QueryMap {
        val map = QueryMap("sub_category_count")
        map.put("id", subCategoryId)
        return map
    }

    fun subCategory(subCategoryId: Int, page: Int = 1, sort: Sort = Sort.ByNewest): QueryMap {
        val map = QueryMap("sub_category")
        map.put("id", subCategoryId)
        map.put("page", page)
        map.put("sort", sort)
        return map
    }

    fun popular(page: Int = 1, sort: Sort = Sort.ByNewest): QueryMap {
        val map = QueryMap("popular")
        map.put("page", page)
        map.put("sort", sort)
        return map
    }

    fun popularCount() = QueryMap("popular_count")

    fun featured(page: Int = 1, sort: Sort = Sort.ByNewest): QueryMap {
        val map = QueryMap("featured")
        map.put("page", page)
        map.put("sort", sort)
        return map
    }

    fun featuredCount() = QueryMap("featured_count")

    fun tag(id: Int, page: Int = 1, sort: Sort = Sort.ByNewest): QueryMap {
        val map = QueryMap("tag")
        map.put("id", id)
        map.put("page", page)
        map.put("sort", sort)
        return map
    }

    fun tagCount(id: Int) = QueryMap("tag_count").apply { put("id", id) }

    fun user(id: Int, page: Int = 1, sort: Sort = Sort.ByNewest): QueryMap {
        val map = QueryMap("user")
        map.put("id", id)
        map.put("page", page)
        map.put("sort", sort)
        return map
    }

    fun userCount(id: Int) = QueryMap("user_count").apply { put("id", id) }

    fun search(term: String, page: Int = 1, sort: Sort = Sort.ByNewest): QueryMap {
        val map = QueryMap("search")
        map.put("term", term)
        map.put("page", page)
        map.put("sort", sort)
        return map
    }

    fun wallpaperInfo(wallpaperId: Int): QueryMap {
        return QueryMap("wallpaper_info").apply { put("id", wallpaperId) }
    }

    fun random(count: Int = 30) = QueryMap("random").apply { put("count", count) }

    fun queryCount() = QueryMap("query_count")

    enum class Sort(name: String) {
        ByNewest("newest"),
        ByRating("rating"),
        ByViews("views"),
        ByFavorites("favorites");

        override fun toString(): String {
            return name
        }
    }

    class QueryMap(val method: String) : HashMap<String, String>() {

        init {
            this.apply {
                put("auth", Constant.API_APP_KEY)
                put("method", method)
                put("info_level", Constant.INFO_LEVEL)
                put("check_last", Constant.CHECK_LAST)
            }
        }

        fun put(key: String, value: Any): String? {
            if (value is String) {
                put(key, value)
            } else {
                put(key, value.toString())
            }
            return key
        }
    }

}