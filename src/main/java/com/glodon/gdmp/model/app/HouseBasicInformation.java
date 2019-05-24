package com.glodon.gdmp.model.app;

import java.io.Serializable;
import java.util.Date;

public class HouseBasicInformation implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house_basic_information.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house_basic_information.uuid
     *
     * @mbg.generated
     */
    private String uuid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house_basic_information.householder
     *
     * @mbg.generated
     */
    private String householder;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house_basic_information.id_number
     *
     * @mbg.generated
     */
    private String idNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house_basic_information.phone
     *
     * @mbg.generated
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house_basic_information.village
     *
     * @mbg.generated
     */
    private String village;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house_basic_information.address
     *
     * @mbg.generated
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house_basic_information.structural_style
     *
     * @mbg.generated
     */
    private String structuralStyle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house_basic_information.layer
     *
     * @mbg.generated
     */
    private String layer;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house_basic_information.apartment_number
     *
     * @mbg.generated
     */
    private Integer apartmentNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house_basic_information.area
     *
     * @mbg.generated
     */
    private Double area;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house_basic_information.is_delete
     *
     * @mbg.generated
     */
    private Integer isDelete;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house_basic_information.create_date
     *
     * @mbg.generated
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house_basic_information.create_by
     *
     * @mbg.generated
     */
    private String createBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house_basic_information.update_date
     *
     * @mbg.generated
     */
    private Date updateDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column house_basic_information.update_by
     *
     * @mbg.generated
     */
    private String updateBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table house_basic_information
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house_basic_information.id
     *
     * @return the value of house_basic_information.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house_basic_information.id
     *
     * @param id the value for house_basic_information.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house_basic_information.uuid
     *
     * @return the value of house_basic_information.uuid
     *
     * @mbg.generated
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house_basic_information.uuid
     *
     * @param uuid the value for house_basic_information.uuid
     *
     * @mbg.generated
     */
    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house_basic_information.householder
     *
     * @return the value of house_basic_information.householder
     *
     * @mbg.generated
     */
    public String getHouseholder() {
        return householder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house_basic_information.householder
     *
     * @param householder the value for house_basic_information.householder
     *
     * @mbg.generated
     */
    public void setHouseholder(String householder) {
        this.householder = householder == null ? null : householder.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house_basic_information.id_number
     *
     * @return the value of house_basic_information.id_number
     *
     * @mbg.generated
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house_basic_information.id_number
     *
     * @param idNumber the value for house_basic_information.id_number
     *
     * @mbg.generated
     */
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house_basic_information.phone
     *
     * @return the value of house_basic_information.phone
     *
     * @mbg.generated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house_basic_information.phone
     *
     * @param phone the value for house_basic_information.phone
     *
     * @mbg.generated
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house_basic_information.village
     *
     * @return the value of house_basic_information.village
     *
     * @mbg.generated
     */
    public String getVillage() {
        return village;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house_basic_information.village
     *
     * @param village the value for house_basic_information.village
     *
     * @mbg.generated
     */
    public void setVillage(String village) {
        this.village = village == null ? null : village.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house_basic_information.address
     *
     * @return the value of house_basic_information.address
     *
     * @mbg.generated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house_basic_information.address
     *
     * @param address the value for house_basic_information.address
     *
     * @mbg.generated
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house_basic_information.structural_style
     *
     * @return the value of house_basic_information.structural_style
     *
     * @mbg.generated
     */
    public String getStructuralStyle() {
        return structuralStyle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house_basic_information.structural_style
     *
     * @param structuralStyle the value for house_basic_information.structural_style
     *
     * @mbg.generated
     */
    public void setStructuralStyle(String structuralStyle) {
        this.structuralStyle = structuralStyle == null ? null : structuralStyle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house_basic_information.layer
     *
     * @return the value of house_basic_information.layer
     *
     * @mbg.generated
     */
    public String getLayer() {
        return layer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house_basic_information.layer
     *
     * @param layer the value for house_basic_information.layer
     *
     * @mbg.generated
     */
    public void setLayer(String layer) {
        this.layer = layer == null ? null : layer.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house_basic_information.apartment_number
     *
     * @return the value of house_basic_information.apartment_number
     *
     * @mbg.generated
     */
    public Integer getApartmentNumber() {
        return apartmentNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house_basic_information.apartment_number
     *
     * @param apartmentNumber the value for house_basic_information.apartment_number
     *
     * @mbg.generated
     */
    public void setApartmentNumber(Integer apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house_basic_information.area
     *
     * @return the value of house_basic_information.area
     *
     * @mbg.generated
     */
    public Double getArea() {
        return area;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house_basic_information.area
     *
     * @param area the value for house_basic_information.area
     *
     * @mbg.generated
     */
    public void setArea(Double area) {
        this.area = area;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house_basic_information.is_delete
     *
     * @return the value of house_basic_information.is_delete
     *
     * @mbg.generated
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house_basic_information.is_delete
     *
     * @param isDelete the value for house_basic_information.is_delete
     *
     * @mbg.generated
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house_basic_information.create_date
     *
     * @return the value of house_basic_information.create_date
     *
     * @mbg.generated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house_basic_information.create_date
     *
     * @param createDate the value for house_basic_information.create_date
     *
     * @mbg.generated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house_basic_information.create_by
     *
     * @return the value of house_basic_information.create_by
     *
     * @mbg.generated
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house_basic_information.create_by
     *
     * @param createBy the value for house_basic_information.create_by
     *
     * @mbg.generated
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house_basic_information.update_date
     *
     * @return the value of house_basic_information.update_date
     *
     * @mbg.generated
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house_basic_information.update_date
     *
     * @param updateDate the value for house_basic_information.update_date
     *
     * @mbg.generated
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column house_basic_information.update_by
     *
     * @return the value of house_basic_information.update_by
     *
     * @mbg.generated
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column house_basic_information.update_by
     *
     * @param updateBy the value for house_basic_information.update_by
     *
     * @mbg.generated
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table house_basic_information
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
        sb.append(", householder=").append(householder);
        sb.append(", idNumber=").append(idNumber);
        sb.append(", phone=").append(phone);
        sb.append(", village=").append(village);
        sb.append(", address=").append(address);
        sb.append(", structuralStyle=").append(structuralStyle);
        sb.append(", layer=").append(layer);
        sb.append(", apartmentNumber=").append(apartmentNumber);
        sb.append(", area=").append(area);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", createDate=").append(createDate);
        sb.append(", createBy=").append(createBy);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}