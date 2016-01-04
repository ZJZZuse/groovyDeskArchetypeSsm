#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${artifactId}.utils

import org.springframework.context.ApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext
import org.springframework.stereotype.Component

import javax.annotation.Resource

/**
 * Created by wb-zhangjinzhong on 2015/12/31.
 */

class MyContext {

    static ApplicationContext applicationContext;

    def static initContext() {

        applicationContext = new ClassPathXmlApplicationContext("springContext.xml");

    }

}
