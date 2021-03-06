package com.glodon.gdmp.model.portal;

import java.io.Serializable;
import java.util.Date;

public class PortalRemarksInfo implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column portal_remarks_info.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column portal_remarks_info.uuid
     *
     * @mbg.generated
     */
    private String uuid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column portal_remarks_info.defined_name
     *
     * @mbg.generated
     */
    private String definedName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column portal_remarks_info.file_name
     *
     * @mbg.generated
     */
    private String fileName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column portal_remarks_info.disk_file_name
     *
     * @mbg.generated
     */
    private String diskFileName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column portal_remarks_info.file_type
     *
     * @mbg.generated
     */
    private String fileType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column portal_remarks_info.file_path
     *
     * @mbg.generated
     */
    private String filePath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column portal_remarks_info.content_uuid
     *
     * @mbg.generated
     */
    private String contentUuid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column portal_remarks_info.upload_time
     *
     * @mbg.generated
     */
    private Date uploadTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column portal_remarks_info.create_by
     *
     * @mbg.generated
     */
    private String createBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column portal_remarks_info.create_date
     *
     * @mbg.generated
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column portal_remarks_info.update_by
     *
     * @mbg.generated
     */
    private String updateBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column portal_remarks_info.update_date
     *
     * @mbg.generated
     */
    private Date updateDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column portal_remarks_info.is_delete
     *
     * @mbg.generated
     */
    private Byte isDelete;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table portal_remarks_info
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column portal_remarks_info.id
     *
     * @return the value of portal_remarks_info.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column portal_remarks_info.id
     *
     * @param id the value for portal_remarks_info.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column portal_remarks_info.uuid
     *
     * @return the value of portal_remarks_info.uuid
     *
     * @mbg.generated
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column portal_remarks_info.uuid
     *
     * @param uuid the value for portal_remarks_info.uuid
     *
     * @mbg.generated
     */
    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column portal_remarks_info.defined_name
     *
     * @return the value of portal_remarks_info.defined_name
     *
     * @mbg.generated
     */
    public String getDefinedName() {
        return definedName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column portal_remarks_info.defined_name
     *
     * @param definedName the value for portal_remarks_info.defined_name
     *
     * @mbg.generated
     */
    public void setDefinedName(String definedName) {
        this.definedName = definedName == null ? null : definedName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column portal_remarks_info.file_name
     *
     * @return the value of portal_remarks_info.file_name
     *
     * @mbg.generated
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column portal_remarks_info.file_name
     *
     * @param fileName the value for portal_remarks_info.file_name
     *
     * @mbg.generated
     */
    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column portal_remarks_info.disk_file_name
     *
     * @return the value of portal_remarks_info.disk_file_name
     *
     * @mbg.generated
     */
    public String getDiskFileName() {
        return diskFileName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column portal_remarks_info.disk_file_name
     *
     * @param diskFileName the value for portal_remarks_info.disk_file_name
     *
     * @mbg.generated
     */
    public void setDiskFileName(String diskFileName) {
        this.diskFileName = diskFileName == null ? null : diskFileName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column portal_remarks_info.file_type
     *
     * @return the value of portal_remarks_info.file_type
     *
     * @mbg.generated
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column portal_remarks_info.file_type
     *
     * @param fileType the value for portal_remarks_info.file_type
     *
     * @mbg.generated
     */
    public void setFileType(String fileType) {
        this.fileType = fileType == null ? null : fileType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column portal_remarks_info.file_path
     *
     * @return the value of portal_remarks_info.file_path
     *
     * @mbg.generated
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column portal_remarks_info.file_path
     *
     * @param filePath the value for portal_remarks_info.file_path
     *
     * @mbg.generated
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column portal_remarks_info.content_uuid
     *
     * @return the value of portal_remarks_info.content_uuid
     *
     * @mbg.generated
     */
    public String getContentUuid() {
        return contentUuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column portal_remarks_info.content_uuid
     *
     * @param contentUuid the value for portal_remarks_info.content_uuid
     *
     * @mbg.generated
     */
    public void setContentUuid(String contentUuid) {
        this.contentUuid = contentUuid == null ? null : contentUuid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column portal_remarks_info.upload_time
     *
     * @return the value of portal_remarks_info.upload_time
     *
     * @mbg.generated
     */
    public Date getUploadTime() {
        return uploadTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column portal_remarks_info.upload_time
     *
     * @param uploadTime the value for portal_remarks_info.upload_time
     *
     * @mbg.generated
     */
    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column portal_remarks_info.create_by
     *
     * @return the value of portal_remarks_info.create_by
     *
     * @mbg.generated
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column portal_remarks_info.create_by
     *
     * @param createBy the value for portal_remarks_info.create_by
     *
     * @mbg.generated
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column portal_remarks_info.create_date
     *
     * @return the value of portal_remarks_info.create_date
     *
     * @mbg.generated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column portal_remarks_info.create_date
     *
     * @param createDate the value for portal_remarks_info.create_date
     *
     * @mbg.generated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column portal_remarks_info.update_by
     *
     * @return the value of portal_remarks_info.update_by
     *
     * @mbg.generated
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column portal_remarks_info.update_by
     *
     * @param updateBy the value for portal_remarks_info.update_by
     *
     * @mbg.generated
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column portal_remarks_info.update_date
     *
     * @return the value of portal_remarks_info.update_date
     *
     * @mbg.generated
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column portal_remarks_info.update_date
     *
     * @param updateDate the value for portal_remarks_info.update_date
     *
     * @mbg.generated
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column portal_remarks_info.is_delete
     *
     * @return the value of portal_remarks_info.is_delete
     *
     * @mbg.generated
     */
    public Byte getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column portal_remarks_info.is_delete
     *
     * @param isDelete the value for portal_remarks_info.is_delete
     *
     * @mbg.generated
     */
    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table portal_remarks_info
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
        sb.append(", definedName=").append(definedName);
        sb.append(", fileName=").append(fileName);
        sb.append(", diskFileName=").append(diskFileName);
        sb.append(", fileType=").append(fileType);
        sb.append(", filePath=").append(filePath);
        sb.append(", contentUuid=").append(contentUuid);
        sb.append(", uploadTime=").append(uploadTime);
        sb.append(", createBy=").append(createBy);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}