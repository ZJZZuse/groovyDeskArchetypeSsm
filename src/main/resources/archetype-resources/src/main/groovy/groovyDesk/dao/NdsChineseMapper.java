#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${artifactId}.dao;

import ${package}.${artifactId}.po.NdsChinese;
import ${package}.${artifactId}.po.NdsChineseExample;
import java.util.List;

public interface NdsChineseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nds_chinese
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nds_chinese
     *
     * @mbggenerated
     */
    int insert(NdsChinese record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nds_chinese
     *
     * @mbggenerated
     */
    int insertSelective(NdsChinese record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nds_chinese
     *
     * @mbggenerated
     */
    List<NdsChinese> selectByExample(NdsChineseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nds_chinese
     *
     * @mbggenerated
     */
    NdsChinese selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nds_chinese
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(NdsChinese record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table nds_chinese
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(NdsChinese record);
}