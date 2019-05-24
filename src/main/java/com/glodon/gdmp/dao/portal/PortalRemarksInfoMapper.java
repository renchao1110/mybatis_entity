package com.glodon.gdmp.dao.portal;

import com.glodon.gdmp.model.portal.PortalRemarksInfo;
import java.util.List;

public interface PortalRemarksInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table portal_remarks_info
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table portal_remarks_info
     *
     * @mbg.generated
     */
    int insert(PortalRemarksInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table portal_remarks_info
     *
     * @mbg.generated
     */
    PortalRemarksInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table portal_remarks_info
     *
     * @mbg.generated
     */
    List<PortalRemarksInfo> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table portal_remarks_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(PortalRemarksInfo record);
}