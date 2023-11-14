package cn.esileme.mapper;

import cn.esileme.model.OrderFood;
import cn.esileme.model.OrderFoodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface OrderFoodMapper {
    @Select("select fo.*, s.sname, s.spic, s.dfee, f.fpic, f.fname, f.price from order_food fo " +
            "left join food f on f.fid = fo.fid " +
            "left join store s on f.sid = s.sid " +
            "where oid=#{oid}")
    List<OrderFood> getFoodList(int oid);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_food
     *
     * @mbggenerated Tue Dec 21 08:48:34 CST 2021
     */
    int countByExample(OrderFoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_food
     *
     * @mbggenerated Tue Dec 21 08:48:34 CST 2021
     */
    int deleteByExample(OrderFoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_food
     *
     * @mbggenerated Tue Dec 21 08:48:34 CST 2021
     */
    int deleteByPrimaryKey(Integer oFId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_food
     *
     * @mbggenerated Tue Dec 21 08:48:34 CST 2021
     */
    int insert(OrderFood record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_food
     *
     * @mbggenerated Tue Dec 21 08:48:34 CST 2021
     */
    int insertSelective(OrderFood record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_food
     *
     * @mbggenerated Tue Dec 21 08:48:34 CST 2021
     */
    List<OrderFood> selectByExample(OrderFoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_food
     *
     * @mbggenerated Tue Dec 21 08:48:34 CST 2021
     */
    OrderFood selectByPrimaryKey(Integer oFId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_food
     *
     * @mbggenerated Tue Dec 21 08:48:34 CST 2021
     */
    int updateByExampleSelective(@Param("record") OrderFood record, @Param("example") OrderFoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_food
     *
     * @mbggenerated Tue Dec 21 08:48:34 CST 2021
     */
    int updateByExample(@Param("record") OrderFood record, @Param("example") OrderFoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_food
     *
     * @mbggenerated Tue Dec 21 08:48:34 CST 2021
     */
    int updateByPrimaryKeySelective(OrderFood record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_food
     *
     * @mbggenerated Tue Dec 21 08:48:34 CST 2021
     */
    int updateByPrimaryKey(OrderFood record);
}