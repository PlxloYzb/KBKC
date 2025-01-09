package cn.iocoder.yudao.module.costanalysis.controller.admin.productionmetric;

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

import cn.iocoder.yudao.module.costanalysis.controller.admin.productionmetric.vo.*;
import cn.iocoder.yudao.module.costanalysis.dal.dataobject.productionmetric.ProductionMetricDO;
import cn.iocoder.yudao.module.costanalysis.service.productionmetric.ProductionMetricService;

@Tag(name = "管理后台 - 生产指标分析")
@RestController
@RequestMapping("/costanalysis/production-metric")
@Validated
public class ProductionMetricController {

    @Resource
    private ProductionMetricService productionMetricService;

    @PostMapping("/create")
    @Operation(summary = "创建生产指标分析")
    @PreAuthorize("@ss.hasPermission('costanalysis:production-metric:create')")
    public CommonResult<Long> createProductionMetric(@Valid @RequestBody ProductionMetricSaveReqVO createReqVO) {
        return success(productionMetricService.createProductionMetric(createReqVO));
    }

    @PutMapping("/update")
    @Operation(summary = "更新生产指标分析")
    @PreAuthorize("@ss.hasPermission('costanalysis:production-metric:update')")
    public CommonResult<Boolean> updateProductionMetric(@Valid @RequestBody ProductionMetricSaveReqVO updateReqVO) {
        productionMetricService.updateProductionMetric(updateReqVO);
        return success(true);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "删除生产指标分析")
    @Parameter(name = "id", description = "编号", required = true)
    @PreAuthorize("@ss.hasPermission('costanalysis:production-metric:delete')")
    public CommonResult<Boolean> deleteProductionMetric(@RequestParam("id") Long id) {
        productionMetricService.deleteProductionMetric(id);
        return success(true);
    }

    @GetMapping("/get")
    @Operation(summary = "获得生产指标分析")
    @Parameter(name = "id", description = "编号", required = true, example = "1024")
    @PreAuthorize("@ss.hasPermission('costanalysis:production-metric:query')")
    public CommonResult<ProductionMetricRespVO> getProductionMetric(@RequestParam("id") Long id) {
        ProductionMetricDO productionMetric = productionMetricService.getProductionMetric(id);
        return success(BeanUtils.toBean(productionMetric, ProductionMetricRespVO.class));
    }

    @GetMapping("/page")
    @Operation(summary = "获得生产指标分析分页")
    @PreAuthorize("@ss.hasPermission('costanalysis:production-metric:query')")
    public CommonResult<PageResult<ProductionMetricRespVO>> getProductionMetricPage(@Valid ProductionMetricPageReqVO pageReqVO) {
        PageResult<ProductionMetricDO> pageResult = productionMetricService.getProductionMetricPage(pageReqVO);
        return success(BeanUtils.toBean(pageResult, ProductionMetricRespVO.class));
    }

    @GetMapping("/export-excel")
    @Operation(summary = "导出生产指标分析 Excel")
    @PreAuthorize("@ss.hasPermission('costanalysis:production-metric:export')")
    @ApiAccessLog(operateType = EXPORT)
    public void exportProductionMetricExcel(@Valid ProductionMetricPageReqVO pageReqVO,
              HttpServletResponse response) throws IOException {
        pageReqVO.setPageSize(PageParam.PAGE_SIZE_NONE);
        List<ProductionMetricDO> list = productionMetricService.getProductionMetricPage(pageReqVO).getList();
        // 导出 Excel
        ExcelUtils.write(response, "生产指标分析.xls", "数据", ProductionMetricRespVO.class,
                        BeanUtils.toBean(list, ProductionMetricRespVO.class));
    }

}