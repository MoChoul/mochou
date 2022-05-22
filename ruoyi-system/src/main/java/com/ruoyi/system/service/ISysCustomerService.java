package com.ruoyi.system.service;

import com.ruoyi.system.domain.SysCustomer;

import java.util.List;

/**
 * 客户Service接口
 * 
 * @author qclsk
 * @date 2022-05-17
 */
public interface ISysCustomerService 
{
    /**
     * 查询客户
     * 
     * @param customerId 客户主键
     * @return 客户
     */
    public SysCustomer selectSysCustomerByCustomerId(Long customerId);

    /**
     * 查询客户列表
     * 
     * @param sysCustomer 客户
     * @return 客户集合
     */
    public List<SysCustomer> selectSysCustomerList(SysCustomer sysCustomer);

    /**
     * 新增客户
     * 
     * @param sysCustomer 客户
     * @return 结果
     */
    public int insertSysCustomer(SysCustomer sysCustomer);

    /**
     * 修改客户
     * 
     * @param sysCustomer 客户
     * @return 结果
     */
    public int updateSysCustomer(SysCustomer sysCustomer);

    /**
     * 批量删除客户
     * 
     * @param customerIds 需要删除的客户主键集合
     * @return 结果
     */
    public int deleteSysCustomerByCustomerIds(Long[] customerIds);

    /**
     * 删除客户信息
     * 
     * @param customerId 客户主键
     * @return 结果
     */
    public int deleteSysCustomerByCustomerId(Long customerId);
}
