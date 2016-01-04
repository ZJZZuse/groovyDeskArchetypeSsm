#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${artifactId}.view;

import ${package}.${artifactId}.service.NdsChineseService;
import ${package}.${artifactId}.utils.MyContext;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * Created by wb-zhangjinzhong on 2016/1/4.
 */
public class MainConsole {

    public static void main(String[] args) {

        MyContext.initContext();

        NdsChineseService service = (NdsChineseService) MyContext.getApplicationContext().getBean("ndsChineseService");

        System.out.print(JSONArray.fromObject(service.acqNdsChineses()));

    }

}
