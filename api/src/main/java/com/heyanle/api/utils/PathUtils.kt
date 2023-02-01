package com.heyanle.api.utils

/**
 * Created by HeYanLe on 2023/2/1 14:25.
 * https://github.com/heyanLE
 */

lateinit var pathUtil: PathUtils

interface PathUtils {

    fun getCachePath(): String

}