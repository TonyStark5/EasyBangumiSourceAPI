package com.heyanle.core

import com.heyanle.api.ISourceParser
import com.heyanle.api.ParserLoader
import com.heyanle.core.bimi.BimibimiParser
import com.heyanle.core.cycdm.CycdmParser
import com.heyanle.core.yhdm.YhdmParser
import com.heyanle.core.yhdmp.YhdmpParser

/**
 * Created by HeYanLe on 2023/2/1 15:55.
 * https://github.com/heyanLE
 */

val innerLoader = InnerLoader()

class InnerLoader: ParserLoader {

    override fun load(): List<ISourceParser> {
        return listOf(
            CycdmParser(),
            YhdmParser(),
            YhdmpParser(),
            BimibimiParser(),
        )
    }
}