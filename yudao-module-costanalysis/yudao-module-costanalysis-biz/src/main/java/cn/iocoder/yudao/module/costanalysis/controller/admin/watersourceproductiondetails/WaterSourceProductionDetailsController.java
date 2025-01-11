package cn.iocoder.yudao.module.costanalysis.controller.admin.watersourceproductiondetails;

import org.springframework.web.bind.annotation.*;
import jakarta.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.security.access.prepost.PreAuthorize;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Operation;

import jakarta.validation.constraints.*;
import jakarta.validation.*;
import jakarta.servlet.http.*;
import java.util.*;
import java.io.IOException;

import cn.iocoder.yudao.framework.common.pojo.PageParam;
import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.framework.common.pojo.CommonResult;
import cn.iocoder.yudao.framework.common.util.object.BeanUtils;
import static cn.iocoder.yudao.framework.common.pojo.CommonResult.success;

import cn.iocoder.yudao.framework.excel.core.util.ExcelUtils;

import cn.iocoder.yudao.framework.apilog.core.annotation.ApiAccessLog;
import static cn.iocoder.yudao.framework.apilog.core.enums.OperateTypeEnum.*;

import cn.iocoder.yudao.module.costanalysis.controller.admin.watersourceproductiondetails.vo.*;
import cn.iocoder.yudao.module.costanalysis.dal.dataobject.watersourceproductiondetails.WaterSourceProductionDetailsDO;
import cn.iocoder.yudao.module.costanalysis.service.watersourceproductiondetails.WaterSourceProductionDetailsService;

@Tag(name = "管理后台 - 水源地生产分析")
@RestController
@RequestMapping("/costanalysis/water-source-production-details")
@Validated
public class WaterSourceProductionDetailsController {

    @Resource
    private WaterSourceProductionDetailsService waterSourceProductionDetailsService;

    @PostMapping("/create")
    @Operation(summary = "创建水源地生产分析")
    @PreAuthorize("@ss.hasPermission('costanalysis:water-source-production-details:create')")
    public CommonResult<Long> createWaterSourceProductionDetails(@Valid @RequestBody WaterSourceProductionDetailsSaveReqVO createReqVO) {
        return success(waterSourceProductionDetailsService.createWaterSourceProductionDetails(createReqVO));
    }

    @PutMapping("/update")
    @Operation(summary = "更新水源地生产分析")
    @PreAuthorize("@ss.hasPermission('costanalysis:water-source-production-details:update')")
    public CommonResult<Boolean> updateWaterSourceProductionDetails(@Valid @RequestBody WaterSourceProductionDetailsSaveReqVO updateReqVO) {
        waterSourceProductionDetailsService.updateWaterSourceProductionDetails(updateReqVO);
        return success(true);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "删除水源地生产分析")
    @Parameter(name = "id", description = "编号", required = true)
    @PreAuthorize("@ss.hasPermission('costanalysis:water-source-production-details:delete')")
    public CommonResult<Boolean> deleteWaterSourceProductionDetails(@RequestParam("id") Long id) {
        waterSourceProductionDetailsService.deleteWaterSourceProductionDetails(id);
        return success(true);
    }

    @GetMapping("/get")
    @Operation(summary = "获得水源地生产分析")
    @Parameter(name = "id", description = "编号", required = true, example = "1024")
    @PreAuthorize("@ss.hasPermission('costanalysis:water-source-production-details:query')")
    public CommonResult<WaterSourceProductionDetailsRespVO> getWaterSourceProductionDetails(@RequestParam("id") Long id) {
        WaterSourceProductionDetailsDO waterSourceProductionDetails = waterSourceProductionDetailsService.getWaterSourceProductionDetails(id);
        return success(BeanUtils.toBean(waterSourceProductionDetails, WaterSourceProductionDetailsRespVO.class));
    }

    @GetMapping("/page")
    @Operation(summary = "获得水源地生产分析分页")
    @PreAuthorize("@ss.hasPermission('costanalysis:water-source-production-details:query')")
    public CommonResult<PageResult<WaterSourceProductionDetailsRespVO>> getWaterSourceProductionDetailsPage(@Valid WaterSourceProductionDetailsPageReqVO pageReqVO) {
        PageResult<WaterSourceProductionDetailsDO> pageResult = waterSourceProductionDetailsService.getWaterSourceProductionDetailsPage(pageReqVO);
        return success(BeanUtils.toBean(pageResult, WaterSourceProductionDetailsRespVO.class));
    }

    @GetMapping("/export-excel")
    @Operation(summary = "导出水源地生产分析 Excel")
    @PreAuthorize("@ss.hasPermission('costanalysis:water-source-production-details:export')")
    @ApiAccessLog(operateType = EXPORT)
    public void exportWaterSourceProductionDetailsExcel(@Valid WaterSourceProductionDetailsPageReqVO pageReqVO,
              HttpServletResponse response) throws IOException {
        pageReqVO.setPageSize(PageParam.PAGE_SIZE_NONE);
        List<WaterSourceProductionDetailsDO> list = waterSourceProductionDetailsService.getWaterSourceProductionDetailsPage(pageReqVO).getList();
        // 导出 Excel
        ExcelUtils.write(response, "水源地生产分析.xls", "数据", WaterSourceProductionDetailsRespVO.class,
                        BeanUtils.toBean(list, WaterSourceProductionDetailsRespVO.class));
    }

}