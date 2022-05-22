package com.ruoyi.property.controller;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.property.domain.PropertySortByLtime;
import com.ruoyi.property.service.IPropertySortByLtimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 资产分类根据长期收益Controller
 * 
 * @author qclsk
 * @date 2022-05-18
 */
@RestController
@RequestMapping("/property/ltime")
public class PropertySortByLtimeController extends BaseController
{
    @Autowired
    private IPropertySortByLtimeService propertySortByLtimeService;

    /**
     * 查询资产分类根据长期收益列表
     */
    @PreAuthorize("@ss.hasPermi('property:ltime:list')")
    @GetMapping("/list")
    public TableDataInfo list(PropertySortByLtime propertySortByLtime)
    {
        startPage();
        List<PropertySortByLtime> list = propertySortByLtimeService.selectPropertySortByLtimeList(propertySortByLtime);
        return getDataTable(list);
    }

    /**
     * 导出资产分类根据长期收益列表
     */
    @PreAuthorize("@ss.hasPermi('property:ltime:export')")
    @Log(title = "资产分类根据长期收益", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, PropertySortByLtime propertySortByLtime)
    {
        List<PropertySortByLtime> list = propertySortByLtimeService.selectPropertySortByLtimeList(propertySortByLtime);
        ExcelUtil<PropertySortByLtime> util = new ExcelUtil<PropertySortByLtime>(PropertySortByLtime.class);
        util.exportExcel(response, list, "资产分类根据长期收益数据");
    }

    /**
     * 获取资产分类根据长期收益详细信息
     */
    @PreAuthorize("@ss.hasPermi('property:ltime:query')")
    @GetMapping(value = "/{propertySortId}")
    public AjaxResult getInfo(@PathVariable("propertySortId") Long propertySortId)
    {
        return AjaxResult.success(propertySortByLtimeService.selectPropertySortByLtimeByPropertySortId(propertySortId));
    }

    /**
     * 新增资产分类根据长期收益
     */
    @PreAuthorize("@ss.hasPermi('property:ltime:add')")
    @Log(title = "资产分类根据长期收益", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody PropertySortByLtime propertySortByLtime)
    {
        return toAjax(propertySortByLtimeService.insertPropertySortByLtime(propertySortByLtime));
    }

    /**
     * 修改资产分类根据长期收益
     */
    @PreAuthorize("@ss.hasPermi('property:ltime:edit')")
    @Log(title = "资产分类根据长期收益", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody PropertySortByLtime propertySortByLtime)
    {
        return toAjax(propertySortByLtimeService.updatePropertySortByLtime(propertySortByLtime));
    }

    /**
     * 删除资产分类根据长期收益
     */
    @PreAuthorize("@ss.hasPermi('property:ltime:remove')")
    @Log(title = "资产分类根据长期收益", businessType = BusinessType.DELETE)
	@DeleteMapping("/{propertySortIds}")
    public AjaxResult remove(@PathVariable Long[] propertySortIds)
    {
        return toAjax(propertySortByLtimeService.deletePropertySortByLtimeByPropertySortIds(propertySortIds));
    }
}
