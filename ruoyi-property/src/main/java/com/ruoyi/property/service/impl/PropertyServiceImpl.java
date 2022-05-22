package com.ruoyi.property.service.impl;

import com.ruoyi.property.domain.Property;
import com.ruoyi.property.mapper.PropertyMapper;
import com.ruoyi.property.service.IPropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 资产信息Service业务层处理
 * 
 * @author qclsk
 * @date 2022-05-21
 */
@Service
public class PropertyServiceImpl implements IPropertyService 
{
    @Autowired
    private PropertyMapper propertyMapper;

    /**
     * 查询资产信息
     * 
     * @param propertyId 资产信息主键
     * @return 资产信息
     */
    @Override
    public Property selectPropertyByPropertyId(Long propertyId)
    {
        return propertyMapper.selectPropertyByPropertyId(propertyId);
    }

    /**
     * 查询资产信息列表
     * 
     * @param property 资产信息
     * @return 资产信息
     */
    @Override
    public List<Property> selectPropertyList(Property property)
    {
        return propertyMapper.selectPropertyList(property);
    }

    /**
     * 新增资产信息
     * 
     * @param property 资产信息
     * @return 结果
     */
    @Override
    public int insertProperty(Property property)
    {
        return propertyMapper.insertProperty(property);
    }

    /**
     * 修改资产信息
     * 
     * @param property 资产信息
     * @return 结果
     */
    @Override
    public int updateProperty(Property property)
    {
        return propertyMapper.updateProperty(property);
    }

    /**
     * 批量删除资产信息
     * 
     * @param propertyIds 需要删除的资产信息主键
     * @return 结果
     */
    @Override
    public int deletePropertyByPropertyIds(Long[] propertyIds)
    {
        return propertyMapper.deletePropertyByPropertyIds(propertyIds);
    }

    /**
     * 删除资产信息信息
     * 
     * @param propertyId 资产信息主键
     * @return 结果
     */
    @Override
    public int deletePropertyByPropertyId(Long propertyId)
    {
        return propertyMapper.deletePropertyByPropertyId(propertyId);
    }
}
