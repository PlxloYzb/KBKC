package cn.iocoder.yudao.module.costanalysis.controller.admin.fiveindicatorcost;

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

import cn.iocoder.yudao.module.costanalysis.controller.admin.fiveindicatorcost.vo.*;
import cn.iocoder.yudao.module.costanalysis.dal.dataobject.fiveindicatorcost.FiveIndicatorCostDO;
import cn.iocoder.yudao.module.costanalysis.service.fiveindicatorcost.FiveIndicatorCostService;

@Tag(name = "管理后台 - 五项费用成本分析")
@RestController
@RequestMapping("/costanalysis/five-indicator-cost")
@Validated
public class FiveIndicatorCostController {

    @Resource
    private FiveIndicatorCostService fiveIndicatorCostService;

    @PostMapping("/create")
    @Operation(summary = "创建五项费用成本分析")
    @PreAuthorize("@ss.hasPermission('costanalysis:five-indicator-cost:create')")
    public CommonResult<Long> createFiveIndicatorCost(@Valid @RequestBody FiveIndicatorCostSaveReqVO createReqVO) {
        return success(fiveIndicatorCostService.createFiveIndicatorCost(createReqVO));
    }

    @PutMapping("/update")
    @Operation(summary = "更新五项费用成本分析")
    @PreAuthorize("@ss.hasPermission('costanalysis:five-indicator-cost:update')")
    public CommonResult<Boolean> updateFiveIndicatorCost(@Valid @RequestBody FiveIndicatorCostSaveReqVO updateReqVO) {
        fiveIndicatorCostService.updateFiveIndicatorCost(updateReqVO);
        return success(true);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "删除五项费用成本分析")
    @Parameter(name = "id", description = "编号", required = true)
    @PreAuthorize("@ss.hasPermission('costanalysis:five-indicator-cost:delete')")
    public CommonResult<Boolean> deleteFiveIndicatorCost(@RequestParam("id") Long id) {
        fiveIndicatorCostService.deleteFiveIndicatorCost(id);
        return success(true);
    }

    @GetMapping("/get")
    @Operation(summary = "获得五项费用成本分析")
    @Parameter(name = "id", description = "编号", required = true, example = "1024")
    @PreAuthorize("@ss.hasPermission('costanalysis:five-indicator-cost:query')")
    public CommonResult<FiveIndicatorCostRespVO> getFiveIndicatorCost(@RequestParam("id") Long id) {
        FiveIndicatorCostDO fiveIndicatorCost = fiveIndicatorCostService.getFiveIndicatorCost(id);
        return success(BeanUtils.toBean(fiveIndicatorCost, FiveIndicatorCostRespVO.class));
    }

    @GetMapping("/page")
    @Operation(summary = "获得五项费用成本分析分页")
    @PreAuthorize("@ss.hasPermission('costanalysis:five-indicator-cost:query')")
    public CommonResult<PageResult<FiveIndicatorCostRespVO>> getFiveIndicatorCostPage(@Valid FiveIndicatorCostPageReqVO pageReqVO) {
        PageResult<FiveIndicatorCostDO> pageResult = fiveIndicatorCostService.getFiveIndicatorCostPage(pageReqVO);
        return success(BeanUtils.toBean(pageResult, FiveIndicatorCostRespVO.class));
    }

    @GetMapping("/export-excel")
    @Operation(summary = "导出五项费用成本分析 Excel")
    @PreAuthorize("@ss.hasPermission('costanalysis:five-indicator-cost:export')")
    @ApiAccessLog(operateType = EXPORT)
    public void exportFiveIndicatorCostExcel(@Valid FiveIndicatorCostPageReqVO pageReqVO,
              HttpServletResponse response) throws IOException {
        pageReqVO.setPageSize(PageParam.PAGE_SIZE_NONE);
        List<FiveIndicatorCostDO> list = fiveIndicatorCostService.getFiveIndicatorCostPage(pageReqVO).getList();
        // 导出 Excel
        ExcelUtils.write(response, "五项费用成本分析.xls", "数据", FiveIndicatorCostRespVO.class,
                        BeanUtils.toBean(list, FiveIndicatorCostRespVO.class));
    }

}