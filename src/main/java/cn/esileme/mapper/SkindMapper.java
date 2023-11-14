package cn.esileme.mapper;

import cn.esileme.model.Skind;
import cn.esileme.model.SkindExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkindMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skind
     *
     * @mbggenerated Fri Dec 17 15:08:45 CST 2021
     */
    int countByExample(SkindExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skind
     *
     * @mbggenerated Fri Dec 17 15:08:45 CST 2021
     */
    int deleteByExample(SkindExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skind
     *
     * @mbggenerated Fri Dec 17 15:08:45 CST 2021
     */
    int deleteByPrimaryKey(Integer kid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skind
     *
     * @mbggenerated Fri Dec 17 15:08:45 CST 2021
     */
    int insert(Skind record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skind
     *
     * @mbggenerated Fri Dec 17 15:08:45 CST 2021
     */
    int insertSelective(Skind record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skind
     *
     * @mbggenerated Fri Dec 17 15:08:45 CST 2021
     */
    List<Skind> selectByExample(SkindExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skind
     *
     * @mbggenerated Fri Dec 17 15:08:45 CST 2021
     */
    Skind selectByPrimaryKey(Integer kid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skind
     *
     * @mbggenerated Fri Dec 17 15:08:45 CST 2021
     */
    int updateByExampleSelective(@Param("record") Skind record, @Param("example") SkindExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skind
     *
     * @mbggenerated Fri Dec 17 15:08:45 CST 2021
     */
    int updateByExample(@Param("record") Skind record, @Param("example") SkindExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skind
     *
     * @mbggenerated Fri Dec 17 15:08:45 CST 2021
     */
    int updateByPrimaryKeySelective(Skind record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skind
     *
     * @mbggenerated Fri Dec 17 15:08:45 CST 2021
     */
    int updateByPrimaryKey(Skind record);
}