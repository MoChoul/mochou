package com.ruoyi.property.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.property.domain.Property;
import com.ruoyi.property.service.IPropertyService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 资产信息Controller
 * 
 * @author qclsk
 * @date 2022-05-21
 */
@RestController
@RequestMapping("/property/property")
public class PropertyController extends BaseController
{
    @Autowired
    private IPropertyService propertyService;

    /**
     * 查询资产信息列表
     */
    @PreAuthorize("@ss.hasPermi('property:property:list')")
    @GetMapping("/list")
    public TableDataInfo list(Property property)
    {
        startPage();
        List<Property> list = propertyService.selectPropertyList(property);
        return getDataTable(list);
    }

    /**
     * 导出资产信息列表
     */
    @PreAuthorize("@ss.hasPermi('property:property:export')")
    @Log(title = "资产信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Property property)
    {
        List<Property> list = propertyService.selectPropertyList(property);
        ExcelUtil<Property> util = new ExcelUtil<Property>(Property.class);
        util.exportExcel(response, list, "资产信息数据");
    }

    /**
     * 获取资产信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('property:property:query')")
    @GetMapping(value = "/{propertyId}")
    public AjaxResult getInfo(@PathVariable("propertyId") Long propertyId)
    {
        return AjaxResult.success(propertyService.selectPropertyByPropertyId(propertyId));
    }

    /**
     * 新增资产信息
     */
    @PreAuthorize("@ss.hasPermi('property:property:add')")
    @Log(title = "资产信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Property property)
    {
        return toAjax(propertyService.insertProperty(property));
    }

    /**
     * 修改资产信息
     */
    @PreAuthorize("@ss.hasPermi('property:property:edit')")
    @Log(title = "资产信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Property property)
    {
        return toAjax(propertyService.updateProperty(property));
    }

    /**
     * 删除资产信息
     */
    @PreAuthorize("@ss.hasPermi('property:property:remove')")
    @Log(title = "资产信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{propertyIds}")
    public AjaxResult remove(@PathVariable Long[] propertyIds)
    {
        return toAjax(propertyService.deletePropertyByPropertyIds(propertyIds));
    }
}
