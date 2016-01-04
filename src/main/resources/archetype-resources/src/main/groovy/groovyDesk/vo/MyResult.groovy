#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${artifactId}.vo

/**
 * Created by wb-zhangjinzhong on 2015/12/31.
 */
class MyResult<T> {

    boolean success
    T data
    String msg

}
