package com.ruoyi.property.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 资产分类根据长期收益对象 property_sort_by_ltime
 * 
 * @author qclsk
 * @date 2022-05-18
 */
public class PropertySortByLtime extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long propertySortId;

    /** 分类名称 */
    @Excel(name = "分类名称")
    private String propertySortName;

    public void setPropertySortId(Long propertySortId) 
    {
        this.propertySortId = propertySortId;
    }

    public Long getPropertySortId() 
    {
        return propertySortId;
    }
    public void setPropertySortName(String propertySortName) 
    {
        this.propertySortName = propertySortName;
    }

    public String getPropertySortName() 
    {
        return propertySortName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("propertySortId", getPropertySortId())
            .append("propertySortName", getPropertySortName())
            .toString();
    }
}
