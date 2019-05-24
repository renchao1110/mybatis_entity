package com.glodon.gdmp.dao.app;

import com.glodon.gdmp.model.app.HouseStatus;
import java.util.List;

public interface HouseStatusMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house_status
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house_status
     *
     * @mbg.generated
     */
    int insert(HouseStatus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house_status
     *
     * @mbg.generated
     */
    HouseStatus selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house_status
     *
     * @mbg.generated
     */
    List<HouseStatus> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house_status
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(HouseStatus record);
}