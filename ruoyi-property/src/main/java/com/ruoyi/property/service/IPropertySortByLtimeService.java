package com.ruoyi.property.service;

import java.util.List;
import com.ruoyi.property.domain.PropertySortByLtime;

/**
 * 资产分类根据长期收益Service接口
 * 
 * @author qclsk
 * @date 2022-05-18
 */
public interface IPropertySortByLtimeService 
{
    /**
     * 查询资产分类根据长期收益
     * 
     * @param propertySortId 资产分类根据长期收益主键
     * @return 资产分类根据长期收益
     */
    public PropertySortByLtime selectPropertySortByLtimeByPropertySortId(Long propertySortId);

    /**
     * 查询资产分类根据长期收益列表
     * 
     * @param propertySortByLtime 资产分类根据长期收益
     * @return 资产分类根据长期收益集合
     */
    public List<PropertySortByLtime> selectPropertySortByLtimeList(PropertySortByLtime propertySortByLtime);

    /**
     * 新增资产分类根据长期收益
     * 
     * @param propertySortByLtime 资产分类根据长期收益
     * @return 结果
     */
    public int insertPropertySortByLtime(PropertySortByLtime propertySortByLtime);

    /**
     * 修改资产分类根据长期收益
     * 
     * @param propertySortByLtime 资产分类根据长期收益
     * @return 结果
     */
    public int updatePropertySortByLtime(PropertySortByLtime propertySortByLtime);

    /**
     * 批量删除资产分类根据长期收益
     * 
     * @param propertySortIds 需要删除的资产分类根据长期收益主键集合
     * @return 结果
     */
    public int deletePropertySortByLtimeByPropertySortIds(Long[] propertySortIds);

    /**
     * 删除资产分类根据长期收益信息
     * 
     * @param propertySortId 资产分类根据长期收益主键
     * @return 结果
     */
    public int deletePropertySortByLtimeByPropertySortId(Long propertySortId);
}
