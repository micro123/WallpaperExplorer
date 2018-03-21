package me.tango.wallpaper_explorer

import me.tango.wallpaper_explorer.constant.Constant
import me.tango.wallpaper_explorer.net.QueryUtils
import me.tango.wallpaper_explorer.net.WallpaperService
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    companion object {
        lateinit var service: WallpaperService
        @BeforeClass
        @JvmStatic
        fun Init() {
            service = Retrofit.Builder()
                    .baseUrl(Constant.API_BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build()
                    .create(WallpaperService::class.java)
        }
    }


    @Volatile
    var pass: Int = 0

    @Before
    fun initField() {

        pass = 0
    }

    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun wallpapers_tests() {

        service.newest(QueryUtils.newest(1)).subscribe({ println(it.wallpapers?.size) }, { it.printStackTrace() }, { pass++ })
        service.highestRate(QueryUtils.highestRate(1)).subscribe({ println(it.wallpapers?.size) }, { it.printStackTrace() }, { pass++ })
        service.byFavorites(QueryUtils.byFavorites(1)).subscribe({ println(it.wallpapers?.size) }, { it.printStackTrace() }, { pass++ })
        service.byViews(QueryUtils.byViews(1)).subscribe({ println(it.wallpapers?.size) }, { it.printStackTrace() }, { pass++ })
        service.category(QueryUtils.category(3)).subscribe({ println(it.wallpapers?.size) }, { it.printStackTrace() }, { pass++ })
        service.subCategory(QueryUtils.subCategory(247734)).subscribe({ println(it.wallpapers?.size) }, { it.printStackTrace() }, { pass++ })
        service.popular(QueryUtils.popular(1)).subscribe({ println(it.wallpapers?.size) }, { it.printStackTrace() }, { pass++ })
        service.featured(QueryUtils.featured(1)).subscribe({ println(it.wallpapers?.size) }, { it.printStackTrace() }, { pass++ })
        service.tag(QueryUtils.tag(418)).subscribe({ println(it.wallpapers?.size) }, { it.printStackTrace() }, { pass++ })
        service.user(QueryUtils.user(18905)).subscribe({ println(it.wallpapers?.size) }, { it.printStackTrace() }, { pass++ })
        service.random(QueryUtils.random()).subscribe({ println(it.wallpapers?.size) }, { it.printStackTrace() }, { pass++ })


        while (pass < 1) {
        }
    }

    @Test
    fun wallpaper_count_test() {
        service.wallpaperCount(QueryUtils.wallpaperCount()).subscribe({ println(it.count) }, { it.printStackTrace() }, { pass++ })
        service.categoryCount(QueryUtils.categoryCount(3)).subscribe({ println(it.count) }, { it.printStackTrace() }, { pass++ })
        service.subCategoryCount(QueryUtils.subCategoryCount(247734)).subscribe({ println(it.count) }, { it.printStackTrace() }, { pass++ })
        service.popularCount(QueryUtils.popularCount()).subscribe({ println(it.count) }, { it.printStackTrace() }, { pass++ })
        service.featuredCount(QueryUtils.featuredCount()).subscribe({ println(it.count) }, { it.printStackTrace() }, { pass++ })
        service.tagCount(QueryUtils.tagCount(418)).subscribe({ println(it.count) }, { it.printStackTrace() }, { pass++ })
        service.userCount(QueryUtils.userCount(18905)).subscribe({ println(it.count) }, { it.printStackTrace() }, { pass++ })

        while (pass < 7) {
        }
    }

    @Test
    fun category_list_test() {
        service.categoryList(QueryUtils.categoryList()).subscribe({ it.categories?.forEach { println("${it.id} + ${it.name}") } }, { it.printStackTrace() }, { pass++ })
        while (pass < 1) {
        }
    }

    @Test
    fun sub_category_list_test() {
        service.subCategoryList(QueryUtils.subCategoryList(3)).subscribe({ it.subCategories?.forEach { println("${it.id} + ${it.name}") } }, { it.printStackTrace() }, { pass++ })
        while (pass < 1) {
        }
    }

    @Test
    fun query_count_test() {
        service.queryCount(QueryUtils.queryCount()).subscribe({ println(it.counts) }, { it.printStackTrace() }, { pass++ })
        while (pass < 1) {
        }
    }


    @Test
    fun search_test() {
        service.search(QueryUtils.search("Just Because")).subscribe({ println(it.totalMatch) }, { it.printStackTrace() }, { pass++ })
        while (pass < 1) {
        }
    }

    @Test
    fun wallpaper_info_test() {
        service.wallpaperInfo(QueryUtils.wallpaperInfo(43410)).subscribe({
            val info = it.wallpaperInfo!!
            println("${info.id} + ${info.name} + ${info.isFeatured}, ${info.width}x${info.height}")
            it.tags?.forEach { println("tag: ${it.id} + ${it.name}") }
        }, { it.printStackTrace() }, { pass++ })
    }
}

