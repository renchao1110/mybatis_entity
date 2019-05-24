package com.glodon.gdmp.model.app;

import java.io.Serializable;
import java.util.Date;

public class AffirmConclusion implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column affirm_conclusion.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column affirm_conclusion.uuid
     *
     * @mbg.generated
     */
    private String uuid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column affirm_conclusion.house_information_uuid
     *
     * @mbg.generated
     */
    private String houseInformationUuid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column affirm_conclusion.conclusion_message
     *
     * @mbg.generated
     */
    private String conclusionMessage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column affirm_conclusion.operator
     *
     * @mbg.generated
     */
    private String operator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column affirm_conclusion.operation_time
     *
     * @mbg.generated
     */
    private Date operationTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column affirm_conclusion.create_date
     *
     * @mbg.generated
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column affirm_conclusion.create_by
     *
     * @mbg.generated
     */
    private String createBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column affirm_conclusion.update_date
     *
     * @mbg.generated
     */
    private Date updateDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column affirm_conclusion.update_by
     *
     * @mbg.generated
     */
    private String updateBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column affirm_conclusion.is_delete
     *
     * @mbg.generated
     */
    private Integer isDelete;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table affirm_conclusion
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column affirm_conclusion.id
     *
     * @return the value of affirm_conclusion.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column affirm_conclusion.id
     *
     * @param id the value for affirm_conclusion.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column affirm_conclusion.uuid
     *
     * @return the value of affirm_conclusion.uuid
     *
     * @mbg.generated
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column affirm_conclusion.uuid
     *
     * @param uuid the value for affirm_conclusion.uuid
     *
     * @mbg.generated
     */
    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column affirm_conclusion.house_information_uuid
     *
     * @return the value of affirm_conclusion.house_information_uuid
     *
     * @mbg.generated
     */
    public String getHouseInformationUuid() {
        return houseInformationUuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column affirm_conclusion.house_information_uuid
     *
     * @param houseInformationUuid the value for affirm_conclusion.house_information_uuid
     *
     * @mbg.generated
     */
    public void setHouseInformationUuid(String houseInformationUuid) {
        this.houseInformationUuid = houseInformationUuid == null ? null : houseInformationUuid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column affirm_conclusion.conclusion_message
     *
     * @return the value of affirm_conclusion.conclusion_message
     *
     * @mbg.generated
     */
    public String getConclusionMessage() {
        return conclusionMessage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column affirm_conclusion.conclusion_message
     *
     * @param conclusionMessage the value for affirm_conclusion.conclusion_message
     *
     * @mbg.generated
     */
    public void setConclusionMessage(String conclusionMessage) {
        this.conclusionMessage = conclusionMessage == null ? null : conclusionMessage.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column affirm_conclusion.operator
     *
     * @return the value of affirm_conclusion.operator
     *
     * @mbg.generated
     */
    public String getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column affirm_conclusion.operator
     *
     * @param operator the value for affirm_conclusion.operator
     *
     * @mbg.generated
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column affirm_conclusion.operation_time
     *
     * @return the value of affirm_conclusion.operation_time
     *
     * @mbg.generated
     */
    public Date getOperationTime() {
        return operationTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column affirm_conclusion.operation_time
     *
     * @param operationTime the value for affirm_conclusion.operation_time
     *
     * @mbg.generated
     */
    public void setOperationTime(Date operationTime) {
        this.operationTime = operationTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column affirm_conclusion.create_date
     *
     * @return the value of affirm_conclusion.create_date
     *
     * @mbg.generated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column affirm_conclusion.create_date
     *
     * @param createDate the value for affirm_conclusion.create_date
     *
     * @mbg.generated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column affirm_conclusion.create_by
     *
     * @return the value of affirm_conclusion.create_by
     *
     * @mbg.generated
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column affirm_conclusion.create_by
     *
     * @param createBy the value for affirm_conclusion.create_by
     *
     * @mbg.generated
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column affirm_conclusion.update_date
     *
     * @return the value of affirm_conclusion.update_date
     *
     * @mbg.generated
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column affirm_conclusion.update_date
     *
     * @param updateDate the value for affirm_conclusion.update_date
     *
     * @mbg.generated
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column affirm_conclusion.update_by
     *
     * @return the value of affirm_conclusion.update_by
     *
     * @mbg.generated
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column affirm_conclusion.update_by
     *
     * @param updateBy the value for affirm_conclusion.update_by
     *
     * @mbg.generated
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column affirm_conclusion.is_delete
     *
     * @return the value of affirm_conclusion.is_delete
     *
     * @mbg.generated
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column affirm_conclusion.is_delete
     *
     * @param isDelete the value for affirm_conclusion.is_delete
     *
     * @mbg.generated
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table affirm_conclusion
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", uuid=").append(uuid);
        sb.append(", houseInformationUuid=").append(houseInformationUuid);
        sb.append(", conclusionMessage=").append(conclusionMessage);
        sb.append(", operator=").append(operator);
        sb.append(", operationTime=").append(operationTime);
        sb.append(", createDate=").append(createDate);
        sb.append(", createBy=").append(createBy);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}