package com.ruoyi.system.service.impl;

import com.ruoyi.system.domain.SysCustomer;
import com.ruoyi.system.mapper.SysCustomerMapper;
import com.ruoyi.system.service.ISysCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 客户Service业务层处理
 * 
 * @author qclsk
 * @date 2022-05-17
 */
@Service
public class SysCustomerServiceImpl implements ISysCustomerService 
{
    @Autowired
    private SysCustomerMapper sysCustomerMapper;

    /**
     * 查询客户
     * 
     * @param customerId 客户主键
     * @return 客户
     */
    @Override
    public SysCustomer selectSysCustomerByCustomerId(Long customerId)
    {
        return sysCustomerMapper.selectSysCustomerByCustomerId(customerId);
    }

    /**
     * 查询客户列表
     * 
     * @param sysCustomer 客户
     * @return 客户
     */
    @Override
    public List<SysCustomer> selectSysCustomerList(SysCustomer sysCustomer)
    {
        return sysCustomerMapper.selectSysCustomerList(sysCustomer);
    }

    /**
     * 新增客户
     * 
     * @param sysCustomer 客户
     * @return 结果
     */
    @Override
    public int insertSysCustomer(SysCustomer sysCustomer)
    {
        return sysCustomerMapper.insertSysCustomer(sysCustomer);
    }

    /**
     * 修改客户
     * 
     * @param sysCustomer 客户
     * @return 结果
     */
    @Override
    public int updateSysCustomer(SysCustomer sysCustomer)
    {
        return sysCustomerMapper.updateSysCustomer(sysCustomer);
    }

    /**
     * 批量删除客户
     * 
     * @param customerIds 需要删除的客户主键
     * @return 结果
     */
    @Override
    public int deleteSysCustomerByCustomerIds(Long[] customerIds)
    {
        return sysCustomerMapper.deleteSysCustomerByCustomerIds(customerIds);
    }

    /**
     * 删除客户信息
     * 
     * @param customerId 客户主键
     * @return 结果
     */
    @Override
    public int deleteSysCustomerByCustomerId(Long customerId)
    {
        return sysCustomerMapper.deleteSysCustomerByCustomerId(customerId);
    }
}
