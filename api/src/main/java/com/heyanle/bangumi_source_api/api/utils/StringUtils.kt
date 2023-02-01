package com.heyanle.bangumi_source_api.api.utils

/**
 * Created by HeYanLe on 2023/2/1 14:28.
 * https://github.com/heyanLE
 */

lateinit var stringUtil: StringUtils

interface StringUtils {

    fun imeSnackBar(content: String)

    fun toast(content: String)

}