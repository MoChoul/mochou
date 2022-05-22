package com.ruoyi.property.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 资产信息对象 property
 * 
 * @author qclsk
 * @date 2022-05-21
 */
public class Property extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 资产编号 */
    private Long propertyId;

    /** 资产名称 */
    @Excel(name = "资产名称")
    private String propertyName;

    /** 资产原值 */
    @Excel(name = "资产原值")
    private Long propertyOv;

    /** 资产现值 */
    @Excel(name = "资产现值")
    private Long propertyPw;

    /** 资产分类 */
    @Excel(name = "资产分类")
    private String propertySortByTime;

    /** 资产编号 */
    @Excel(name = "资产编号")
    private String propertyCode;

    /** 资产描述 */
    @Excel(name = "资产描述")
    private String propertyDescribe;

    public void setPropertyId(Long propertyId) 
    {
        this.propertyId = propertyId;
    }

    public Long getPropertyId() 
    {
        return propertyId;
    }
    public void setPropertyName(String propertyName) 
    {
        this.propertyName = propertyName;
    }

    public String getPropertyName() 
    {
        return propertyName;
    }
    public void setPropertyOv(Long propertyOv) 
    {
        this.propertyOv = propertyOv;
    }

    public Long getPropertyOv() 
    {
        return propertyOv;
    }
    public void setPropertyPw(Long propertyPw) 
    {
        this.propertyPw = propertyPw;
    }

    public Long getPropertyPw() 
    {
        return propertyPw;
    }
    public void setPropertySortByTime(String propertySortByTime) 
    {
        this.propertySortByTime = propertySortByTime;
    }

    public String getPropertySortByTime() 
    {
        return propertySortByTime;
    }
    public void setPropertyCode(String propertyCode) 
    {
        this.propertyCode = propertyCode;
    }

    public String getPropertyCode() 
    {
        return propertyCode;
    }
    public void setPropertyDescribe(String propertyDescribe) 
    {
        this.propertyDescribe = propertyDescribe;
    }

    public String getPropertyDescribe() 
    {
        return propertyDescribe;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("propertyId", getPropertyId())
            .append("propertyName", getPropertyName())
            .append("propertyOv", getPropertyOv())
            .append("propertyPw", getPropertyPw())
            .append("propertySortByTime", getPropertySortByTime())
            .append("propertyCode", getPropertyCode())
            .append("propertyDescribe", getPropertyDescribe())
            .toString();
    }
}
