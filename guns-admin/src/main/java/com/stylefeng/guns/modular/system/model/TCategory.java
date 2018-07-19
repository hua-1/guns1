package com.stylefeng.guns.modular.system.model;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 商品类别
 * </p>
 *
 * @author 梁华亭
 * @since 2018-07-19
 */
@TableName("t_category")
public class TCategory extends Model<TCategory> {

    private static final long serialVersionUID = 1L;

    /**
     * 标识
     */
    private Long id;
    /**
     * 名字
     */
    @TableField("c_name")
    private String cName;
    /**
     * 序列
     */
    private Integer sequence;
    /**
     * 子排序
     */
    @TableField("sub_sequence")
    private Integer subSequence;
    /**
     * 父id
     */
    @TableField("parent_id")
    private Long parentId;
    /**
     * 租户id
     */
    @TableField("tenant_id")
    private Long tenantId;
    /**
     * 归属人id
     */
    @TableField("owner_id")
    private Long ownerId;
    /**
     * 创建时间
     */
    @TableField("created_time")
    private Date createdTime;
    /**
     * 最后修改人
     */
    @TableField("last_modified_by")
    private String lastModifiedBy;
    /**
     * 最后修改时间
     */
    @TableField("last_modified_time")
    private Date lastModifiedTime;
    /**
     * 创建人
     */
    @TableField("created_by")
    private String createdBy;
    /**
     * 是否回显
     */
    private Integer valid;
    /**
     * 备注
     */
    private String remark;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public Integer getSubSequence() {
        return subSequence;
    }

    public void setSubSequence(Integer subSequence) {
        this.subSequence = subSequence;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Integer getValid() {
        return valid;
    }

    public void setValid(Integer valid) {
        this.valid = valid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "TCategory{" +
        "id=" + id +
        ", cName=" + cName +
        ", sequence=" + sequence +
        ", subSequence=" + subSequence +
        ", parentId=" + parentId +
        ", tenantId=" + tenantId +
        ", ownerId=" + ownerId +
        ", createdTime=" + createdTime +
        ", lastModifiedBy=" + lastModifiedBy +
        ", lastModifiedTime=" + lastModifiedTime +
        ", createdBy=" + createdBy +
        ", valid=" + valid +
        ", remark=" + remark +
        "}";
    }
}
