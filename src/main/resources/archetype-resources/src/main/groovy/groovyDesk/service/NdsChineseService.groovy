#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${artifactId}.service

import ${package}.${artifactId}.dao.NdsChineseMapper
import ${package}.${artifactId}.po.NdsChinese
import ${package}.${artifactId}.po.NdsChineseExample
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * Created by wb-zhangjinzhong on 2015/12/31.
 */

@Service("ndsChineseService")
class NdsChineseService {

    @Autowired
    NdsChineseMapper ndsChineseMapper

    List<NdsChinese> acqNdsChineses(){

        ndsChineseMapper.selectByExample(new NdsChineseExample())

    }

}
