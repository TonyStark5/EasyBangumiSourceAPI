package com.heyanle.bangumi_source_api.core

import com.heyanle.bangumi_source_api.api.ISourceParser
import com.heyanle.bangumi_source_api.api.ParserLoader
import com.heyanle.bangumi_source_api.core.bimi.BimibimiParser
import com.heyanle.bangumi_source_api.core.cycdm.CycdmParser
import com.heyanle.bangumi_source_api.core.yhdm.YhdmParser
import com.heyanle.bangumi_source_api.core.yhdmp.YhdmpParser

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