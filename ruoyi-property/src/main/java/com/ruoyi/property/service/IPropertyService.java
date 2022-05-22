package com.ruoyi.property.service;

import com.ruoyi.property.domain.Property;

import java.util.List;

/**
 * 资产信息Service接口
 * 
 * @author qclsk
 * @date 2022-05-21
 */
public interface IPropertyService 
{
    /**
     * 查询资产信息
     * 
     * @param propertyId 资产信息主键
     * @return 资产信息
     */
    public Property selectPropertyByPropertyId(Long propertyId);

    /**
     * 查询资产信息列表
     * 
     * @param property 资产信息
     * @return 资产信息集合
     */
    public List<Property> selectPropertyList(Property property);

    /**
     * 新增资产信息
     * 
     * @param property 资产信息
     * @return 结果
     */
    public int insertProperty(Property property);

    /**
     * 修改资产信息
     * 
     * @param property 资产信息
     * @return 结果
     */
    public int updateProperty(Property property);

    /**
     * 批量删除资产信息
     * 
     * @param propertyIds 需要删除的资产信息主键集合
     * @return 结果
     */
    public int deletePropertyByPropertyIds(Long[] propertyIds);

    /**
     * 删除资产信息信息
     * 
     * @param propertyId 资产信息主键
     * @return 结果
     */
    public int deletePropertyByPropertyId(Long propertyId);
}
