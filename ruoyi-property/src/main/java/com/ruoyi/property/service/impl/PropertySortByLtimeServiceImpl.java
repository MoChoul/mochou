package com.ruoyi.property.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.property.mapper.PropertySortByLtimeMapper;
import com.ruoyi.property.domain.PropertySortByLtime;
import com.ruoyi.property.service.IPropertySortByLtimeService;

/**
 * 资产分类根据长期收益Service业务层处理
 * 
 * @author qclsk
 * @date 2022-05-18
 */
@Service
public class PropertySortByLtimeServiceImpl implements IPropertySortByLtimeService 
{
    @Autowired
    private PropertySortByLtimeMapper propertySortByLtimeMapper;

    /**
     * 查询资产分类根据长期收益
     * 
     * @param propertySortId 资产分类根据长期收益主键
     * @return 资产分类根据长期收益
     */
    @Override
    public PropertySortByLtime selectPropertySortByLtimeByPropertySortId(Long propertySortId)
    {
        return propertySortByLtimeMapper.selectPropertySortByLtimeByPropertySortId(propertySortId);
    }

    /**
     * 查询资产分类根据长期收益列表
     * 
     * @param propertySortByLtime 资产分类根据长期收益
     * @return 资产分类根据长期收益
     */
    @Override
    public List<PropertySortByLtime> selectPropertySortByLtimeList(PropertySortByLtime propertySortByLtime)
    {
        return propertySortByLtimeMapper.selectPropertySortByLtimeList(propertySortByLtime);
    }

    /**
     * 新增资产分类根据长期收益
     * 
     * @param propertySortByLtime 资产分类根据长期收益
     * @return 结果
     */
    @Override
    public int insertPropertySortByLtime(PropertySortByLtime propertySortByLtime)
    {
        return propertySortByLtimeMapper.insertPropertySortByLtime(propertySortByLtime);
    }

    /**
     * 修改资产分类根据长期收益
     * 
     * @param propertySortByLtime 资产分类根据长期收益
     * @return 结果
     */
    @Override
    public int updatePropertySortByLtime(PropertySortByLtime propertySortByLtime)
    {
        return propertySortByLtimeMapper.updatePropertySortByLtime(propertySortByLtime);
    }

    /**
     * 批量删除资产分类根据长期收益
     * 
     * @param propertySortIds 需要删除的资产分类根据长期收益主键
     * @return 结果
     */
    @Override
    public int deletePropertySortByLtimeByPropertySortIds(Long[] propertySortIds)
    {
        return propertySortByLtimeMapper.deletePropertySortByLtimeByPropertySortIds(propertySortIds);
    }

    /**
     * 删除资产分类根据长期收益信息
     * 
     * @param propertySortId 资产分类根据长期收益主键
     * @return 结果
     */
    @Override
    public int deletePropertySortByLtimeByPropertySortId(Long propertySortId)
    {
        return propertySortByLtimeMapper.deletePropertySortByLtimeByPropertySortId(propertySortId);
    }
}
